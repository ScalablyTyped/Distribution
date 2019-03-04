package typings
package chromeDashAppsLib.chromeNs.extensionTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectFileDetails
  extends chromeDashAppsLib.chromeNs.extensionTypesNs.underscoreInternalUnderscoreNs.InjectDetailsBase {
  /** JavaScript or CSS file to inject. */
  var file: java.lang.String
}

object InjectFileDetails {
  @scala.inline
  def apply(
    cssOrigin: CSSOrigin,
    file: java.lang.String,
    runAt: RunAt,
    allFrames: js.UndefOr[scala.Boolean] = js.undefined,
    frameId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined
  ): InjectFileDetails = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin, file = file, runAt = runAt)
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames)
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId)
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank)
    __obj.asInstanceOf[InjectFileDetails]
  }
}

