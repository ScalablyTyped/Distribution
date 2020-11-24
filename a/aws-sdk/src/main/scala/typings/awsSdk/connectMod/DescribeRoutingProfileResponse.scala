package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRoutingProfileResponse extends js.Object {
  
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
  implicit class DescribeRoutingProfileResponseOps[Self <: DescribeRoutingProfileResponse] (val x: Self) extends AnyVal {
    
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
    def setRoutingProfile(value: RoutingProfile): Self = this.set("RoutingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfile: Self = this.set("RoutingProfile", js.undefined)
  }
}
