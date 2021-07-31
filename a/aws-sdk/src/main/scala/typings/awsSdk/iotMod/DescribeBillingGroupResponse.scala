package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBillingGroupResponse extends StObject {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
  
  /**
    * Additional information about the billing group.
    */
  var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
  
  /**
    * The version of the billing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object DescribeBillingGroupResponse {
  
  @scala.inline
  def apply(): DescribeBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBillingGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeBillingGroupResponseMutableBuilder[Self <: DescribeBillingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "billingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupArnUndefined: Self = StObject.set(x, "billingGroupArn", js.undefined)
    
    @scala.inline
    def setBillingGroupId(value: BillingGroupId): Self = StObject.set(x, "billingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupIdUndefined: Self = StObject.set(x, "billingGroupId", js.undefined)
    
    @scala.inline
    def setBillingGroupMetadata(value: BillingGroupMetadata): Self = StObject.set(x, "billingGroupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupMetadataUndefined: Self = StObject.set(x, "billingGroupMetadata", js.undefined)
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    @scala.inline
    def setBillingGroupProperties(value: BillingGroupProperties): Self = StObject.set(x, "billingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupPropertiesUndefined: Self = StObject.set(x, "billingGroupProperties", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
