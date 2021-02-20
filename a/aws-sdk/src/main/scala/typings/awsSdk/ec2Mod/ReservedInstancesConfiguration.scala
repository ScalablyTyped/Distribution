package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstancesConfiguration extends StObject {
  
  /**
    * The Availability Zone for the modified Reserved Instances.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The number of modified Reserved Instances.  This is a required field for a request. 
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The instance type for the modified Reserved Instances.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The network platform of the modified Reserved Instances, which is either EC2-Classic or EC2-VPC.
    */
  var Platform: js.UndefOr[String] = js.native
  
  /**
    * Whether the Reserved Instance is applied to instances in a Region or instances in a specific Availability Zone.
    */
  var Scope: js.UndefOr[scope] = js.native
}
object ReservedInstancesConfiguration {
  
  @scala.inline
  def apply(): ReservedInstancesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesConfiguration]
  }
  
  @scala.inline
  implicit class ReservedInstancesConfigurationMutableBuilder[Self <: ReservedInstancesConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setScope(value: scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
  }
}
