package typings.chromeDashApps.chromeNs.extensionTypesNs

import typings.chromeDashApps.chromeNs.extensionTypesNs.underscoreInternalUnderscoreNs.InjectDetailsBase
import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectFileDetails extends InjectDetailsBase {
  /** JavaScript or CSS file to inject. */
  var file: String
}

object InjectFileDetails {
  @scala.inline
  def apply(
    cssOrigin: CSSOrigin,
    file: String,
    runAt: RunAt,
    allFrames: js.UndefOr[Boolean] = js.undefined,
    frameId: js.UndefOr[integer] = js.undefined,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  ): InjectFileDetails = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin, file = file, runAt = runAt)
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames)
    if (!js.isUndefined(frameId)) __obj.updateDynamic("frameId")(frameId)
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank)
    __obj.asInstanceOf[InjectFileDetails]
  }
}

