package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreJSONInputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.DOCUMENT
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.LINES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _JSONInput extends js.Object {
  /**
    * <p>The type of JSON. Valid values: Document, Lines.</p>
    */
  var Type: js.UndefOr[DOCUMENT | LINES | String] = js.undefined
}

object _JSONInput {
  @scala.inline
  def apply(Type: DOCUMENT | LINES | String = null): _JSONInput = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_JSONInput]
  }
}

