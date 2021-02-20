package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcPeeringAuthorizationOutput extends StObject {
  
  /**
    * Details on the requested VPC peering authorization, including expiration.
    */
  var VpcPeeringAuthorization: js.UndefOr[typings.awsSdk.gameliftMod.VpcPeeringAuthorization] = js.native
}
object CreateVpcPeeringAuthorizationOutput {
  
  @scala.inline
  def apply(): CreateVpcPeeringAuthorizationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationOutput]
  }
  
  @scala.inline
  implicit class CreateVpcPeeringAuthorizationOutputMutableBuilder[Self <: CreateVpcPeeringAuthorizationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcPeeringAuthorization(value: VpcPeeringAuthorization): Self = StObject.set(x, "VpcPeeringAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringAuthorizationUndefined: Self = StObject.set(x, "VpcPeeringAuthorization", js.undefined)
  }
}
