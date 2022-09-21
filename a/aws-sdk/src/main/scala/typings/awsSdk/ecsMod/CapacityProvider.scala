package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityProvider extends StObject {
  
  /**
    * The Auto Scaling group settings for the capacity provider.
    */
  var autoScalingGroupProvider: js.UndefOr[AutoScalingGroupProvider] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the capacity provider.
    */
  var capacityProviderArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the capacity provider.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the capacity provider. Only capacity providers in an ACTIVE state can be used in a cluster. When a capacity provider is successfully deleted, it has an INACTIVE status.
    */
  var status: js.UndefOr[CapacityProviderStatus] = js.undefined
  
  /**
    * The metadata that you apply to the capacity provider to help you categorize and organize it. Each tag consists of a key and an optional value. You define both. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The update status of the capacity provider. The following are the possible states that is returned.  DELETE_IN_PROGRESS  The capacity provider is in the process of being deleted.  DELETE_COMPLETE  The capacity provider was successfully deleted and has an INACTIVE status.  DELETE_FAILED  The capacity provider can't be deleted. The update status reason provides further details about why the delete failed.  
    */
  var updateStatus: js.UndefOr[CapacityProviderUpdateStatus] = js.undefined
  
  /**
    * The update status reason. This provides further details about the update status for the capacity provider.
    */
  var updateStatusReason: js.UndefOr[String] = js.undefined
}
object CapacityProvider {
  
  inline def apply(): CapacityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityProvider]
  }
  
  extension [Self <: CapacityProvider](x: Self) {
    
    inline def setAutoScalingGroupProvider(value: AutoScalingGroupProvider): Self = StObject.set(x, "autoScalingGroupProvider", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupProviderUndefined: Self = StObject.set(x, "autoScalingGroupProvider", js.undefined)
    
    inline def setCapacityProviderArn(value: String): Self = StObject.set(x, "capacityProviderArn", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderArnUndefined: Self = StObject.set(x, "capacityProviderArn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: CapacityProviderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUpdateStatus(value: CapacityProviderUpdateStatus): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusReason(value: String): Self = StObject.set(x, "updateStatusReason", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusReasonUndefined: Self = StObject.set(x, "updateStatusReason", js.undefined)
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "updateStatus", js.undefined)
  }
}
