package typings.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
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
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFILTERSVarargs(value: QueryFilter*): Self = this.set("FILTERS", js.Array(value :_*))
    
    @scala.inline
    def setFILTERS(value: js.Array[QueryFilter]): Self = this.set("FILTERS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFILTERS: Self = this.set("FILTERS", js.undefined)
    
    @scala.inline
    def setPAGENUM(value: Double): Self = this.set("PAGENUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePAGENUM: Self = this.set("PAGENUM", js.undefined)
    
    @scala.inline
    def setPAGESIZE(value: Double): Self = this.set("PAGESIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePAGESIZE: Self = this.set("PAGESIZE", js.undefined)
    
    @scala.inline
    def setSELECTCOLUMNSVarargs(value: String*): Self = this.set("SELECTCOLUMNS", js.Array(value :_*))
    
    @scala.inline
    def setSELECTCOLUMNS(value: js.Array[String]): Self = this.set("SELECTCOLUMNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSELECTCOLUMNS: Self = this.set("SELECTCOLUMNS", js.undefined)
    
    @scala.inline
    def setSORT(value: QuerySortDirections): Self = this.set("SORT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSORT: Self = this.set("SORT", js.undefined)
  }
}
