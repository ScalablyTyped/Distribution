package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameCaptureSettings extends js.Object {
  /**
    * The frequency at which to capture frames for inclusion in the output. May be specified in either seconds or milliseconds, as specified by captureIntervalUnits.
    */
  var CaptureInterval: integerMin1Max3600000 = js.native
  /**
    * Unit for the frame capture interval.
    */
  var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit] = js.native
}

object FrameCaptureSettings {
  @scala.inline
  def apply(CaptureInterval: integerMin1Max3600000, CaptureIntervalUnits: FrameCaptureIntervalUnit = null): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal(CaptureInterval = CaptureInterval.asInstanceOf[js.Any])
    if (CaptureIntervalUnits != null) __obj.updateDynamic("CaptureIntervalUnits")(CaptureIntervalUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureSettings]
  }
}

