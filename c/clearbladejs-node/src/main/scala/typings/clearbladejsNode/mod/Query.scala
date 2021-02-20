package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  var FILTERS: js.UndefOr[js.Array[QueryFilter]] = js.native
  
  var PAGENUM: js.UndefOr[Double] = js.native
  
  var PAGESIZE: js.UndefOr[Double] = js.native
  
  var SELECTCOLUMNS: js.UndefOr[js.Array[String]] = js.native
  
  var SORT: js.UndefOr[QuerySortDirections] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFILTERS(value: js.Array[QueryFilter]): Self = StObject.set(x, "FILTERS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFILTERSUndefined: Self = StObject.set(x, "FILTERS", js.undefined)
    
    @scala.inline
    def setFILTERSVarargs(value: QueryFilter*): Self = StObject.set(x, "FILTERS", js.Array(value :_*))
    
    @scala.inline
    def setPAGENUM(value: Double): Self = StObject.set(x, "PAGENUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGENUMUndefined: Self = StObject.set(x, "PAGENUM", js.undefined)
    
    @scala.inline
    def setPAGESIZE(value: Double): Self = StObject.set(x, "PAGESIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPAGESIZEUndefined: Self = StObject.set(x, "PAGESIZE", js.undefined)
    
    @scala.inline
    def setSELECTCOLUMNS(value: js.Array[String]): Self = StObject.set(x, "SELECTCOLUMNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECTCOLUMNSUndefined: Self = StObject.set(x, "SELECTCOLUMNS", js.undefined)
    
    @scala.inline
    def setSELECTCOLUMNSVarargs(value: String*): Self = StObject.set(x, "SELECTCOLUMNS", js.Array(value :_*))
    
    @scala.inline
    def setSORT(value: QuerySortDirections): Self = StObject.set(x, "SORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSORTUndefined: Self = StObject.set(x, "SORT", js.undefined)
  }
}
