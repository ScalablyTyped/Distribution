package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InjectDetails extends js.Object {
  /**
           * Optional.
           * If allFrames is true, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's false and is only injected into the top frame.
           */
  var allFrames: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. JavaScript or CSS code to inject.
           * Warning: Be careful using the code parameter. Incorrect use of it may open your extension to cross site scripting attacks.
           */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional. The origin of the CSS to inject. This may only be specified for CSS, not JavaScript. Defaults to "author".
           * One of: "author", or "user"
           * @since Chrome 66.
           */
  var cssOrigin: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. JavaScript or CSS file to inject. */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Optional.
           * The frame where the script or CSS should be injected. Defaults to 0 (the top-level frame).
           * @since Chrome 39.
           */
  var frameId: js.UndefOr[scala.Double] = js.undefined
  /**
           * Optional.
           * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is false.
           * @since Chrome 39.
           */
  var matchAboutBlank: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional. The soonest that the JavaScript or CSS will be injected into the tab.
           * One of: "document_start", "document_end", or "document_idle"
           * @since Chrome 20.
           */
  var runAt: js.UndefOr[java.lang.String] = js.undefined
}

