package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Receiver")
@js.native
class Receiver protected ()
  extends typings.chrome.chrome.cast.Receiver {
  /**
    * @param {string} label
    * @param {string} friendlyName
    * @param {Array<chrome.cast.Capability>=} opt_capabilities
    * @param {chrome.cast.Volume=} opt_volume
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Receiver
    */
  def this(label: String, friendlyName: String) = this()
  def this(label: String, friendlyName: String, capabilities: js.Array[typings.chrome.chrome.cast.Capability]) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.UndefOr[scala.Nothing],
    volume: typings.chrome.chrome.cast.Volume
  ) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.Array[typings.chrome.chrome.cast.Capability],
    volume: typings.chrome.chrome.cast.Volume
  ) = this()
}

