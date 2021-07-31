package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDefaultSubnetRequest extends StObject {
  
  /**
    * The Availability Zone in which to create the default subnet.
    */
  var AvailabilityZone: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object CreateDefaultSubnetRequest {
  
  @scala.inline
  def apply(AvailabilityZone: String): CreateDefaultSubnetRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDefaultSubnetRequest]
  }
  
  @scala.inline
  implicit class CreateDefaultSubnetRequestMutableBuilder[Self <: CreateDefaultSubnetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
