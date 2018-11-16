package typings
package chromeLib.chromeNs.underscoreDebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Debuggee extends js.Object {
  /**
               * Optional.
               * Since Chrome 27.
               * The id of the extension which you intend to debug. Attaching to an extension background page is only possible when 'silent-debugger-extension-api' flag is enabled on the target browser.
               */
  var extensionId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The id of the tab which you intend to debug.  */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /**
               * Optional.
               * Since Chrome 28.
               * The opaque id of the debug target.
               */
  var targetId: js.UndefOr[java.lang.String] = js.undefined
}

