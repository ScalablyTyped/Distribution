package typings
package chromeLib.chromeNs.castNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.media.EditTracksInfoRequest")
@js.native
class EditTracksInfoRequest () extends js.Object {
  /**
           * @param {Array<number>=} opt_activeTrackIds
           * @param {chrome.cast.media.TextTrackStyle=} opt_textTrackStyle
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.EditTracksInfoRequest
           */
  def this(activeTrackIds: js.Array[scala.Double]) = this()
  /**
           * @param {Array<number>=} opt_activeTrackIds
           * @param {chrome.cast.media.TextTrackStyle=} opt_textTrackStyle
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.media.EditTracksInfoRequest
           */
  def this(activeTrackIds: js.Array[scala.Double], textTrackStyle: TextTrackStyle) = this()
  var activeTrackIds: js.Array[scala.Double] = js.native
  var textTrackStyle: TextTrackStyle = js.native
}

