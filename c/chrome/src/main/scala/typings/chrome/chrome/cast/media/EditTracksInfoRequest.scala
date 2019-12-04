package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.EditTracksInfoRequest")
@js.native
/**
  * @param {Array<number>=} opt_activeTrackIds
  * @param {chrome.cast.media.TextTrackStyle=} opt_textTrackStyle
  * @constructor
  * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.EditTracksInfoRequest
  */
class EditTracksInfoRequest () extends js.Object {
  def this(activeTrackIds: js.Array[Double]) = this()
  def this(activeTrackIds: js.Array[Double], textTrackStyle: TextTrackStyle) = this()
  var activeTrackIds: js.Array[Double] = js.native
  var textTrackStyle: TextTrackStyle = js.native
}

