package typings.chromeDashApps.chromeNs.extensionTypesNs

import typings.chromeDashApps.chromeNs.extensionTypesNs.underscoreInternalUnderscoreNs.InjectDetailsBase
import typings.chromeDashApps.chromeNs.integer
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
    frameId: js.UndefOr[integer] = js.undefined,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  ): InjectCodeDetails = {
    val __obj = js.Dynamic.literal(code = code, cssOrigin = cssOrigin, runAt = runAt)
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames)
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId)
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank)
    __obj.asInstanceOf[InjectCodeDetails]
  }
}

