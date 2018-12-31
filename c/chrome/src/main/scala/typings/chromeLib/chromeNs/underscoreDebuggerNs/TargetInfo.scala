package typings
package chromeLib.chromeNs.underscoreDebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetInfo extends js.Object {
  /** True if debugger is already attached. */
  var attached: scala.Boolean
  /**
    * Optional.
    * Since Chrome 30.
    * The extension id, defined if type = 'background_page'.
    */
  var extensionId: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Target favicon URL.  */
  var faviconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Target id. */
  var id: java.lang.String
  /**
    * Optional.
    * Since Chrome 30.
    * The tab id, defined if type == 'page'.
    */
  var tabId: js.UndefOr[scala.Double] = js.undefined
  /** Target page title. */
  var title: java.lang.String
  /** Target type. */
  var `type`: java.lang.String
  /** Target URL. */
  var url: java.lang.String
}

