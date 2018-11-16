package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.MediaInfo")
@js.native
class MediaInfo protected () extends js.Object {
  /**
           * @param {string} contentId
           * @param {string} contentType
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.MediaInfo
           */
  def this(contentId: java.lang.String, contentType: java.lang.String) = this()
  var contentId: java.lang.String = js.native
  var contentType: java.lang.String = js.native
  var customData: js.Object = js.native
  var duration: scala.Double = js.native
  var metadata: js.Object = js.native
  var streamType: StreamType = js.native
  var textTrackStyle: TextTrackStyle = js.native
  var tracks: js.Array[Track] = js.native
}

