package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRoutingProfileResponse extends StObject {
  
  /**
    * The routing profile.
    */
  var RoutingProfile: js.UndefOr[typings.awsSdk.connectMod.RoutingProfile] = js.native
}
object DescribeRoutingProfileResponse {
  
  @scala.inline
  def apply(): DescribeRoutingProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRoutingProfileResponse]
  }
  
  @scala.inline
  implicit class DescribeRoutingProfileResponseMutableBuilder[Self <: DescribeRoutingProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoutingProfile(value: RoutingProfile): Self = StObject.set(x, "RoutingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileUndefined: Self = StObject.set(x, "RoutingProfile", js.undefined)
  }
}
