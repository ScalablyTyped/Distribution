package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingGroupProperties extends js.Object {
  
  /**
    * The description of the billing group.
    */
  var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.native
}
object BillingGroupProperties {
  
  @scala.inline
  def apply(): BillingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupProperties]
  }
  
  @scala.inline
  implicit class BillingGroupPropertiesOps[Self <: BillingGroupProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBillingGroupDescription(value: BillingGroupDescription): Self = this.set("billingGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupDescription: Self = this.set("billingGroupDescription", js.undefined)
  }
}
