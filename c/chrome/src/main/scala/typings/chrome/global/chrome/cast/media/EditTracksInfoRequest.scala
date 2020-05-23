package typings.chrome.global.chrome.cast.media

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
class EditTracksInfoRequest ()
  extends typings.chrome.chrome.cast.media.EditTracksInfoRequest {
  def this(activeTrackIds: js.Array[Double]) = this()
  def this(activeTrackIds: js.Array[Double], textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle) = this()
  /* CompleteClass */
  override var activeTrackIds: js.Array[Double] = js.native
  /* CompleteClass */
  override var textTrackStyle: typings.chrome.chrome.cast.media.TextTrackStyle = js.native
}

