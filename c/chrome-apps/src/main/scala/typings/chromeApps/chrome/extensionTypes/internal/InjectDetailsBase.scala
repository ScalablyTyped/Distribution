package typings.chromeApps.chrome.extensionTypes.internal

import typings.chromeApps.chrome.extensionTypes.CSSOrigin
import typings.chromeApps.chrome.extensionTypes.RunAt
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Partial, use these interfaces instead:
  * @see InjectCodeDetails
  * @see InjectFileDetails
  */
trait InjectDetailsBase extends js.Object {
  /**
    * If allFrames is true, implies that the JavaScript or CSS should be
    * injected into all frames of current page. By default, it's false
    * and is only injected into the top frame. If true and frameId is set,
    * then the code is inserted in the selected frame and all of its child frames.
    */
  var allFrames: js.UndefOr[Boolean] = js.undefined
  /**
    * The origin of the CSS to inject.
    * This may only be specified for CSS, not JavaScript.
    * @default 'author'
    * @since Chrome 66.
    */
  var cssOrigin: CSSOrigin
  /**
    * The frame where the script or CSS should be injected. Defaults to 0 (the top-level frame).
    * @see[frame ref]{@link https://developer.chrome.com/apps/webNavigation#frame_ids}
    * @since Chrome 50.
    */
  var frameId: js.UndefOr[integer] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank
    * and about:srcdoc frames if your extension has access to its parent document.
    * Code cannot be inserted in top-level about:-frames. By default it is false.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    * @default 'document_idle'
    */
  var runAt: RunAt
}

object InjectDetailsBase {
  @scala.inline
  def apply(
    cssOrigin: CSSOrigin,
    runAt: RunAt,
    allFrames: js.UndefOr[Boolean] = js.undefined,
    frameId: Int | Double = null,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  ): InjectDetailsBase = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames.asInstanceOf[js.Any])
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectDetailsBase]
  }
}

