package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chrome.extensionTypes.internal.InjectDetailsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectCodeDetails extends InjectDetailsBase {
  /**
    * JavaScript or CSS code to inject.
    * **⚠ Warning**
    * Be careful using the code parameter.
    * Incorrect use of it may open your app
    * to cross site scripting attacks.
    * @see[More information]{@link https://en.wikipedia.org/wiki/Cross-site_scripting}
    */
  var code: String
}

object InjectCodeDetails {
  @scala.inline
  def apply(
    code: String,
    cssOrigin: CSSOrigin,
    runAt: RunAt,
    allFrames: js.UndefOr[Boolean] = js.undefined,
    frameId: Int | Double = null,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  ): InjectCodeDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames.asInstanceOf[js.Any])
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectCodeDetails]
  }
}

