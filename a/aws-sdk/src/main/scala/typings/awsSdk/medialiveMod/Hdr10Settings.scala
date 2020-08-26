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
  def apply(): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Settings]
  }
  @scala.inline
  implicit class Hdr10SettingsOps[Self <: Hdr10Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxCll(value: integerMin0Max32768): Self = this.set("MaxCll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCll: Self = this.set("MaxCll", js.undefined)
    @scala.inline
    def setMaxFall(value: integerMin0Max32768): Self = this.set("MaxFall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFall: Self = this.set("MaxFall", js.undefined)
  }
  
}

