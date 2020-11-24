package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcPeeringAuthorizationOutput extends js.Object {
  
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
  implicit class CreateVpcPeeringAuthorizationOutputOps[Self <: CreateVpcPeeringAuthorizationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVpcPeeringAuthorization(value: VpcPeeringAuthorization): Self = this.set("VpcPeeringAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringAuthorization: Self = this.set("VpcPeeringAuthorization", js.undefined)
  }
}
