package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateHostsRequest extends StObject {
  
  /**
    * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see  Understanding Instance Placement and Host Affinity in the Amazon EC2 User Guide for Linux Instances. Default: on 
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.ec2Mod.AutoPlacement] = js.native
  
  /**
    * The Availability Zone in which to allocate the Dedicated Host.
    */
  var AvailabilityZone: String = js.native
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide. Default: off 
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.ec2Mod.HostRecovery] = js.native
  
  /**
    * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  
  /**
    * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only. If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The number of Dedicated Hosts to allocate to your account with these parameters.
    */
  var Quantity: Integer = js.native
  
  /**
    * The tags to apply to the Dedicated Host during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object AllocateHostsRequest {
  
  @scala.inline
  def apply(AvailabilityZone: String, Quantity: Integer): AllocateHostsRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostsRequest]
  }
  
  @scala.inline
  implicit class AllocateHostsRequestMutableBuilder[Self <: AllocateHostsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPlacement(value: AutoPlacement): Self = StObject.set(x, "AutoPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlacementUndefined: Self = StObject.set(x, "AutoPlacement", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setHostRecovery(value: HostRecovery): Self = StObject.set(x, "HostRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostRecoveryUndefined: Self = StObject.set(x, "HostRecovery", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setQuantity(value: Integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
