package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.SessionRequest")
@js.native
class SessionRequest protected () extends js.Object {
  /**
    * @param {string} appId
    * @param {!Array<chrome.cast.Capability>=} opt_capabilities
    * @param {number=} opt_timeout
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.SessionRequest
    */
  def this(appId: java.lang.String) = this()
  def this(appId: java.lang.String, capabilities: js.Array[Capability]) = this()
  def this(appId: java.lang.String, capabilities: js.Array[Capability], timeout: scala.Double) = this()
  var appId: java.lang.String = js.native
  var capabilities: js.Array[Capability] = js.native
  var language: js.UndefOr[java.lang.String] = js.native
  var requestSessionTimeout: scala.Double = js.native
}

