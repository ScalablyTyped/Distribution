package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MxfSettings extends js.Object {
  /**
    * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
    */
  var AfdSignaling: js.UndefOr[MxfAfdSignaling] = js.native
}

object MxfSettings {
  @scala.inline
  def apply(AfdSignaling: MxfAfdSignaling = null): MxfSettings = {
    val __obj = js.Dynamic.literal()
    if (AfdSignaling != null) __obj.updateDynamic("AfdSignaling")(AfdSignaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[MxfSettings]
  }
}

