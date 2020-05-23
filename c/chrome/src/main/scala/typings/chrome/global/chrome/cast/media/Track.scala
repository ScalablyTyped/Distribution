package typings.chrome.global.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.Track")
@js.native
class Track protected ()
  extends typings.chrome.chrome.cast.media.Track {
  /**
    * @param {number} trackId
    * @param {!chrome.cast.media.TrackType} trackType
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Track
    */
  def this(trackId: Double, trackType: typings.chrome.chrome.cast.media.TrackType) = this()
  /* CompleteClass */
  override var customData: js.Object = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var subtype: typings.chrome.chrome.cast.media.TextTrackType = js.native
  /* CompleteClass */
  override var trackContentId: String = js.native
  /* CompleteClass */
  override var trackContentType: String = js.native
  /* CompleteClass */
  override var trackId: Double = js.native
  /* CompleteClass */
  override var `type`: typings.chrome.chrome.cast.media.TrackType = js.native
}

