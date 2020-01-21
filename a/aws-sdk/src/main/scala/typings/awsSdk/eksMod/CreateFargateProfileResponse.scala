package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFargateProfileResponse extends js.Object {
  /**
    * The full description of your new Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.native
}

object CreateFargateProfileResponse {
  @scala.inline
  def apply(fargateProfile: FargateProfile = null): CreateFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (fargateProfile != null) __obj.updateDynamic("fargateProfile")(fargateProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFargateProfileResponse]
  }
}

