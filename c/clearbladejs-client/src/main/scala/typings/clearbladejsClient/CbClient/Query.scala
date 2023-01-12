package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var FILTERS: js.UndefOr[js.Array[QueryFilter]] = js.undefined
  
  var PAGENUM: js.UndefOr[Double] = js.undefined
  
  var PAGESIZE: js.UndefOr[Double] = js.undefined
  
  var SELECTCOLUMNS: js.UndefOr[js.Array[String]] = js.undefined
  
  var SORT: js.UndefOr[QuerySortDirections] = js.undefined
}
object Query {
  
  inline def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    inline def setFILTERS(value: js.Array[QueryFilter]): Self = StObject.set(x, "FILTERS", value.asInstanceOf[js.Any])
    
    inline def setFILTERSUndefined: Self = StObject.set(x, "FILTERS", js.undefined)
    
    inline def setFILTERSVarargs(value: QueryFilter*): Self = StObject.set(x, "FILTERS", js.Array(value*))
    
    inline def setPAGENUM(value: Double): Self = StObject.set(x, "PAGENUM", value.asInstanceOf[js.Any])
    
    inline def setPAGENUMUndefined: Self = StObject.set(x, "PAGENUM", js.undefined)
    
    inline def setPAGESIZE(value: Double): Self = StObject.set(x, "PAGESIZE", value.asInstanceOf[js.Any])
    
    inline def setPAGESIZEUndefined: Self = StObject.set(x, "PAGESIZE", js.undefined)
    
    inline def setSELECTCOLUMNS(value: js.Array[String]): Self = StObject.set(x, "SELECTCOLUMNS", value.asInstanceOf[js.Any])
    
    inline def setSELECTCOLUMNSUndefined: Self = StObject.set(x, "SELECTCOLUMNS", js.undefined)
    
    inline def setSELECTCOLUMNSVarargs(value: String*): Self = StObject.set(x, "SELECTCOLUMNS", js.Array(value*))
    
    inline def setSORT(value: QuerySortDirections): Self = StObject.set(x, "SORT", value.asInstanceOf[js.Any])
    
    inline def setSORTUndefined: Self = StObject.set(x, "SORT", js.undefined)
  }
}
