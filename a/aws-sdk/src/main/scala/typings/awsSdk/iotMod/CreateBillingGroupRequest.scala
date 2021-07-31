package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBillingGroupRequest extends StObject {
  
  /**
    * The name you wish to give to the billing group.
    */
  var billingGroupName: BillingGroupName
  
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
  
  /**
    * Metadata which can be used to manage the billing group.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateBillingGroupRequest {
  
  @scala.inline
  def apply(billingGroupName: BillingGroupName): CreateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupRequest]
  }
  
  @scala.inline
  implicit class CreateBillingGroupRequestMutableBuilder[Self <: CreateBillingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupProperties(value: BillingGroupProperties): Self = StObject.set(x, "billingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupPropertiesUndefined: Self = StObject.set(x, "billingGroupProperties", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
