package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.SessionRequest")
@js.native
class SessionRequest protected ()
  extends typings.chrome.chrome.cast.SessionRequest {
  /**
    * @param {string} appId
    * @param {!Array<chrome.cast.Capability>=} opt_capabilities
    * @param {number=} opt_timeout
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.SessionRequest
    */
  def this(appId: String) = this()
  def this(appId: String, capabilities: js.Array[typings.chrome.chrome.cast.Capability]) = this()
  def this(appId: String, capabilities: js.UndefOr[scala.Nothing], timeout: Double) = this()
  def this(appId: String, capabilities: js.Array[typings.chrome.chrome.cast.Capability], timeout: Double) = this()
}

