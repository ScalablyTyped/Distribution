package typings.datatablesNetRowgroup.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticFunctions extends js.Object {
  
  var RowGroup: RowGroupStaticFunctions = js.native
}
object StaticFunctions {
  
  @scala.inline
  def apply(RowGroup: RowGroupStaticFunctions): StaticFunctions = {
    val __obj = js.Dynamic.literal(RowGroup = RowGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticFunctions]
  }
  
  @scala.inline
  implicit class StaticFunctionsOps[Self <: StaticFunctions] (val x: Self) extends AnyVal {
    
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
    def setRowGroup(value: RowGroupStaticFunctions): Self = this.set("RowGroup", value.asInstanceOf[js.Any])
  }
}
