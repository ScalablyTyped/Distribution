package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseProvisionedCapacityOutput extends js.Object {
  
  /**
    * The ID that identifies the provisioned capacity unit.
    */
  var capacityId: js.UndefOr[String] = js.native
}
object PurchaseProvisionedCapacityOutput {
  
  @scala.inline
  def apply(): PurchaseProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
  }
  
  @scala.inline
  implicit class PurchaseProvisionedCapacityOutputOps[Self <: PurchaseProvisionedCapacityOutput] (val x: Self) extends AnyVal {
    
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
    def setCapacityId(value: String): Self = this.set("capacityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityId: Self = this.set("capacityId", js.undefined)
  }
}
