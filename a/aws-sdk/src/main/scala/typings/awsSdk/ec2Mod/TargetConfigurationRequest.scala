package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetConfigurationRequest extends StObject {
  
  /**
    * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Convertible Reserved Instance offering ID.
    */
  var OfferingId: ReservedInstancesOfferingId = js.native
}
object TargetConfigurationRequest {
  
  @scala.inline
  def apply(OfferingId: ReservedInstancesOfferingId): TargetConfigurationRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfigurationRequest]
  }
  
  @scala.inline
  implicit class TargetConfigurationRequestMutableBuilder[Self <: TargetConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setOfferingId(value: ReservedInstancesOfferingId): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
  }
}
