package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateClusterRequest extends StObject {
  
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.undefined
  
  /**
    * The cluster ID of the cluster that you want to update, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typings.awsSdk.snowballMod.ClusterId
  
  /**
    * The updated description of this cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.undefined
  
  /**
    * The updated arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.undefined
  
  /**
    * The updated shipping option value of this cluster's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.undefined
}
object UpdateClusterRequest {
  
  inline def apply(ClusterId: ClusterId): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
  
  extension [Self <: UpdateClusterRequest](x: Self) {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    inline def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    inline def setResources(value: JobResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
  }
}
