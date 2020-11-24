package typings.chartmogulNode.mod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeID extends js.Object {
  
  var customer_uuid: js.UndefOr[String] = js.native
  
  var external_id: js.UndefOr[String] = js.native
}
object MergeID {
  
  @scala.inline
  def apply(): MergeID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeID]
  }
  
  @scala.inline
  implicit class MergeIDOps[Self <: MergeID] (val x: Self) extends AnyVal {
    
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
    def setCustomer_uuid(value: String): Self = this.set("customer_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_uuid: Self = this.set("customer_uuid", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
  }
}
