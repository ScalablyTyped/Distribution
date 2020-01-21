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
  def apply(MaxCll: Int | Double = null, MaxFall: Int | Double = null): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    if (MaxCll != null) __obj.updateDynamic("MaxCll")(MaxCll.asInstanceOf[js.Any])
    if (MaxFall != null) __obj.updateDynamic("MaxFall")(MaxFall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hdr10Settings]
  }
}

