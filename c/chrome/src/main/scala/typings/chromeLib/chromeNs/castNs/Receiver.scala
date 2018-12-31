package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Receiver")
@js.native
class Receiver protected () extends js.Object {
  /**
    * @param {string} label
    * @param {string} friendlyName
    * @param {Array<chrome.cast.Capability>=} opt_capabilities
    * @param {chrome.cast.Volume=} opt_volume
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Receiver
    */
  def this(label: java.lang.String, friendlyName: java.lang.String) = this()
  def this(label: java.lang.String, friendlyName: java.lang.String, capabilities: js.Array[Capability]) = this()
  def this(label: java.lang.String, friendlyName: java.lang.String, capabilities: js.Array[Capability], volume: Volume) = this()
  var capabilities: js.Array[Capability] = js.native
  var displayStatus: ReceiverDisplayStatus = js.native
  var friendlyName: java.lang.String = js.native
  var label: java.lang.String = js.native
  var receiverType: ReceiverType = js.native
  var volume: Volume = js.native
}

