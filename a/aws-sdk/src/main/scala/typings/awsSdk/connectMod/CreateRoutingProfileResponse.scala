package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoutingProfileResponse extends StObject {
  
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
  implicit class CreateRoutingProfileResponseMutableBuilder[Self <: CreateRoutingProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoutingProfileArn(value: ARN): Self = StObject.set(x, "RoutingProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileArnUndefined: Self = StObject.set(x, "RoutingProfileArn", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileIdUndefined: Self = StObject.set(x, "RoutingProfileId", js.undefined)
  }
}
