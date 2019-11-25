package typings.chromeDashApps.chrome.extensionTypes

import typings.chromeDashApps.chrome.extensionTypes._internal_.InjectDetailsBase
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
    frameId: Int | Double = null,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  ): InjectFileDetails = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames.asInstanceOf[js.Any])
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectFileDetails]
  }
}

