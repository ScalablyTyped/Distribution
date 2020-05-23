package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hdr10Settings extends js.Object {
  /**
    * Maximum Content Light Level
  An integer metadata value defining the maximum light level, in nits,
  of any single pixel within an encoded HDR video stream or file.
    */
  var MaxCll: js.UndefOr[integerMin0Max32768] = js.native
  /**
    * Maximum Frame Average Light Level
  An integer metadata value defining the maximum average light level, in nits,
  for any single frame within an encoded HDR video stream or file.
    */
  var MaxFall: js.UndefOr[integerMin0Max32768] = js.native
}

object Hdr10Settings {
  @scala.inline
  def apply(
    MaxCll: js.UndefOr[integerMin0Max32768] = js.undefined,
    MaxFall: js.UndefOr[integerMin0Max32768] = js.undefined
  ): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxCll)) __obj.updateDynamic("MaxCll")(MaxCll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxFall)) __obj.updateDynamic("MaxFall")(MaxFall.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hdr10Settings]
  }
}

