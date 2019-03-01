package typings
package chromeDashAppsLib.chromeNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameOptions extends js.Object {
  /**
    * @requires(dev) Chrome dev only
    * @requires Permissions: 'app.window.alpha'
    * @description
    * Enable alpha on frame 'none'
    */
  var alphaEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Frame type: none or chrome (defaults to chrome).
    *
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    */
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.none
}

object FrameOptions {
  @scala.inline
  def apply(
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.none,
    alphaEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): FrameOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (!js.isUndefined(alphaEnabled)) __obj.updateDynamic("alphaEnabled")(alphaEnabled)
    __obj.asInstanceOf[FrameOptions]
  }
}

