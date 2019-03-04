package typings
package chromeDashAppsLib.chromeNs.extensionTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectCodeDetails
  extends chromeDashAppsLib.chromeNs.extensionTypesNs.underscoreInternalUnderscoreNs.InjectDetailsBase {
  /**
    * JavaScript or CSS code to inject.
    * **⚠ Warning**
    * Be careful using the code parameter.
    * Incorrect use of it may open your app
    * to cross site scripting attacks.
    * @see[More information]{@link https://en.wikipedia.org/wiki/Cross-site_scripting}
    */
  var code: java.lang.String
}

object InjectCodeDetails {
  @scala.inline
  def apply(
    code: java.lang.String,
    cssOrigin: CSSOrigin,
    runAt: RunAt,
    allFrames: js.UndefOr[scala.Boolean] = js.undefined,
    frameId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined
  ): InjectCodeDetails = {
    val __obj = js.Dynamic.literal(code = code, cssOrigin = cssOrigin, runAt = runAt)
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames)
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId)
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank)
    __obj.asInstanceOf[InjectCodeDetails]
  }
}

