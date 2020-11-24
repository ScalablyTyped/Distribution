package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateReturnModel extends js.Object {
  
  var columns: js.Array[StateReturnModelColumns] = js.native
  
  var length: Double = js.native
  
  var order: js.Array[js.Array[String | Double]] = js.native
  
  var search: SearchSettings = js.native
  
  var start: Double = js.native
  
  var time: Double = js.native
}
object StateReturnModel {
  
  @scala.inline
  def apply(
    columns: js.Array[StateReturnModelColumns],
    length: Double,
    order: js.Array[js.Array[String | Double]],
    search: SearchSettings,
    start: Double,
    time: Double
  ): StateReturnModel = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateReturnModel]
  }
  
  @scala.inline
  implicit class StateReturnModelOps[Self <: StateReturnModel] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: StateReturnModelColumns*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[StateReturnModelColumns]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderVarargs(value: (js.Array[String | Double])*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[js.Array[String | Double]]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: SearchSettings): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
