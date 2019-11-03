package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugSetting extends js.Object {
  /**
    * Specifies the type of information to log for debugging. The permitted values are none,
    * requestContent, responseContent, or both requestContent and responseContent separated by a
    * comma. The default is none. When setting this value, carefully consider the type of
    * information you are passing in during deployment. By logging information about the request or
    * response, you could potentially expose sensitive data that is retrieved through the deployment
    * operations.
    */
  var detailLevel: js.UndefOr[String] = js.undefined
}

object DebugSetting {
  @scala.inline
  def apply(detailLevel: String = null): DebugSetting = {
    val __obj = js.Dynamic.literal()
    if (detailLevel != null) __obj.updateDynamic("detailLevel")(detailLevel)
    __obj.asInstanceOf[DebugSetting]
  }
}

