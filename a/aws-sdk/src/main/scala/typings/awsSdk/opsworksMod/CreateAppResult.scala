package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResult extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.native
}

object CreateAppResult {
  @scala.inline
  def apply(AppId: String = null): CreateAppResult = {
    val __obj = js.Dynamic.literal()
    if (AppId != null) __obj.updateDynamic("AppId")(AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResult]
  }
}

