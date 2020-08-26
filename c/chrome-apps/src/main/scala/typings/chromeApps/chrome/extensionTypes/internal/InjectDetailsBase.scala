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
@js.native
trait InjectDetailsBase extends js.Object {
  /**
    * If allFrames is true, implies that the JavaScript or CSS should be
    * injected into all frames of current page. By default, it's false
    * and is only injected into the top frame. If true and frameId is set,
    * then the code is inserted in the selected frame and all of its child frames.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  /**
    * The origin of the CSS to inject.
    * This may only be specified for CSS, not JavaScript.
    * @default 'author'
    * @since Chrome 66.
    */
  var cssOrigin: CSSOrigin = js.native
  /**
    * The frame where the script or CSS should be injected. Defaults to 0 (the top-level frame).
    * @see[frame ref]{@link https://developer.chrome.com/apps/webNavigation#frame_ids}
    * @since Chrome 50.
    */
  var frameId: js.UndefOr[integer] = js.native
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank
    * and about:srcdoc frames if your extension has access to its parent document.
    * Code cannot be inserted in top-level about:-frames. By default it is false.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  /**
    * The soonest that the JavaScript or CSS will be injected into the tab.
    * @default 'document_idle'
    */
  var runAt: RunAt = js.native
}

object InjectDetailsBase {
  @scala.inline
  def apply(cssOrigin: CSSOrigin, runAt: RunAt): InjectDetailsBase = {
    val __obj = js.Dynamic.literal(cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectDetailsBase]
  }
  @scala.inline
  implicit class InjectDetailsBaseOps[Self <: InjectDetailsBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCssOrigin(value: CSSOrigin): Self = this.set("cssOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunAt(value: RunAt): Self = this.set("runAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllFrames(value: Boolean): Self = this.set("allFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllFrames: Self = this.set("allFrames", js.undefined)
    @scala.inline
    def setFrameId(value: integer): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameId: Self = this.set("frameId", js.undefined)
    @scala.inline
    def setMatchAboutBlank(value: Boolean): Self = this.set("matchAboutBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchAboutBlank: Self = this.set("matchAboutBlank", js.undefined)
  }
  
}

