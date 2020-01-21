package typings.chromeApps.chrome.app

import typings.chromeApps.chromeAppsStrings.none_
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
  var alphaEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Frame type: none or chrome (defaults to chrome).
    *
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    */
  var `type`: none_
}

object FrameOptions {
  @scala.inline
  def apply(`type`: none_, alphaEnabled: js.UndefOr[Boolean] = js.undefined): FrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaEnabled)) __obj.updateDynamic("alphaEnabled")(alphaEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptions]
  }
}

