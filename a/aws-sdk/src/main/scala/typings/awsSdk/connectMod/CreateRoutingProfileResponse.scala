package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoutingProfileResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var RoutingProfileArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileId] = js.native
}
object CreateRoutingProfileResponse {
  
  @scala.inline
  def apply(): CreateRoutingProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoutingProfileResponse]
  }
  
  @scala.inline
  implicit class CreateRoutingProfileResponseOps[Self <: CreateRoutingProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoutingProfileArn(value: ARN): Self = this.set("RoutingProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfileArn: Self = this.set("RoutingProfileArn", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfileId: Self = this.set("RoutingProfileId", js.undefined)
  }
}
