package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBillingGroupRequest extends js.Object {
  
  /**
    * The name you wish to give to the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.native
  
  /**
    * Metadata which can be used to manage the billing group.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateBillingGroupRequest {
  
  @scala.inline
  def apply(billingGroupName: BillingGroupName): CreateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupRequest]
  }
  
  @scala.inline
  implicit class CreateBillingGroupRequestOps[Self <: CreateBillingGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupProperties(value: BillingGroupProperties): Self = this.set("billingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingGroupProperties: Self = this.set("billingGroupProperties", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
