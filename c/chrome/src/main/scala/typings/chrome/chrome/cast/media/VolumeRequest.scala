package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.VolumeRequest")
@js.native
class VolumeRequest protected () extends js.Object {
  /**
    * @param {!chrome.cast.Volume} volume
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.VolumeRequest
    */
  def this(volume: Volume) = this()
  var customData: js.Object = js.native
  var volume: Volume = js.native
}

