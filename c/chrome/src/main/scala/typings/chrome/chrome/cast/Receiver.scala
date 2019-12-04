package typings.chrome.chrome.cast

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
  def this(label: String, friendlyName: String) = this()
  def this(label: String, friendlyName: String, capabilities: js.Array[Capability]) = this()
  def this(label: String, friendlyName: String, capabilities: js.Array[Capability], volume: Volume) = this()
  var capabilities: js.Array[Capability] = js.native
  var displayStatus: ReceiverDisplayStatus = js.native
  var friendlyName: String = js.native
  var label: String = js.native
  var receiverType: ReceiverType = js.native
  var volume: Volume = js.native
}

