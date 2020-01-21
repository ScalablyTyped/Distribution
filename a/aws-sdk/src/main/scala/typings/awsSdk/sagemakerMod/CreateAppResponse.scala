package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResponse extends js.Object {
  /**
    * The app's Amazon Resource Name (ARN).
    */
  var AppArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppArn] = js.native
}

object CreateAppResponse {
  @scala.inline
  def apply(AppArn: AppArn = null): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    if (AppArn != null) __obj.updateDynamic("AppArn")(AppArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResponse]
  }
}

