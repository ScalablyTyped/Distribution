package typings.chrome.chrome.debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debuggee extends js.Object {
  /**
    * Optional.
    * Since Chrome 27.
    * The id of the extension which you intend to debug. Attaching to an extension background page is only possible when 'silent-debugger-extension-api' flag is enabled on the target browser.
    */
  var extensionId: js.UndefOr[String] = js.undefined
  /** Optional. The id of the tab which you intend to debug.  */
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * Since Chrome 28.
    * The opaque id of the debug target.
    */
  var targetId: js.UndefOr[String] = js.undefined
}

object Debuggee {
  @scala.inline
  def apply(extensionId: String = null, tabId: Int | Double = null, targetId: String = null): Debuggee = {
    val __obj = js.Dynamic.literal()
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debuggee]
  }
}

