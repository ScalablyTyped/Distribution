package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSubSourceSettings extends js.Object {
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[integerMin1Max2147483647] = js.native
}

object DvbSubSourceSettings {
  @scala.inline
  def apply(Pid: js.UndefOr[integerMin1Max2147483647] = js.undefined): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pid)) __obj.updateDynamic("Pid")(Pid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
}

