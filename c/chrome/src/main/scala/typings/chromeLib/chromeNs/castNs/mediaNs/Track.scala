package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.Track")
@js.native
class Track protected () extends js.Object {
  /**
    * @param {number} trackId
    * @param {!chrome.cast.media.TrackType} trackType
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.Track
    */
  def this(trackId: scala.Double, trackType: TrackType) = this()
  var customData: js.Object = js.native
  var language: java.lang.String = js.native
  var name: java.lang.String = js.native
  var subtype: TextTrackType = js.native
  var trackContentId: java.lang.String = js.native
  var trackContentType: java.lang.String = js.native
  var trackId: scala.Double = js.native
  var `type`: TrackType = js.native
}

