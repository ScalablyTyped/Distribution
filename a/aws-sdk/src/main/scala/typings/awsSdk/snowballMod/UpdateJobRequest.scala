package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobRequest extends StObject {
  
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  
  /**
    * The updated description of this job's JobMetadata object.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The updated ID for the forwarding address for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  
  /**
    * The job ID of the job that you want to update, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId = js.native
  
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  
  /**
    * The updated JobResource object, or the updated JobResource object. 
    */
  var Resources: js.UndefOr[JobResource] = js.native
  
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the CreateRoleAWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  
  /**
    * The updated shipping option value of this job's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
  
  /**
    * The updated SnowballCapacityPreference of this job's JobMetadata object. The 50 TB Snowballs are only available in the US regions.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
}
object UpdateJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  
  @scala.inline
  implicit class UpdateJobRequestMutableBuilder[Self <: UpdateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    @scala.inline
    def setResources(value: JobResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
    
    @scala.inline
    def setSnowballCapacityPreference(value: SnowballCapacity): Self = StObject.set(x, "SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballCapacityPreferenceUndefined: Self = StObject.set(x, "SnowballCapacityPreference", js.undefined)
  }
}
