package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupByCustomField extends js.Object {
  
  var groupByCustomField: js.UndefOr[String] = js.native
  
  var settlementDate: String = js.native
}
object GroupByCustomField {
  
  @scala.inline
  def apply(settlementDate: String): GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByCustomField]
  }
  
  @scala.inline
  implicit class GroupByCustomFieldOps[Self <: GroupByCustomField] (val x: Self) extends AnyVal {
    
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
    def setSettlementDate(value: String): Self = this.set("settlementDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByCustomField(value: String): Self = this.set("groupByCustomField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByCustomField: Self = this.set("groupByCustomField", js.undefined)
  }
}
