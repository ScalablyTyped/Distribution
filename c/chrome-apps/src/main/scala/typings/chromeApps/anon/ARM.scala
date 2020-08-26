package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.arm_
import typings.chromeApps.chromeAppsStrings.mips64_
import typings.chromeApps.chromeAppsStrings.mips_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARM extends js.Object {
  var ARM: arm_ = js.native
  var MIPS: mips_ = js.native
  var MIPS64: mips64_ = js.native
  var X86_32: `x86-32` = js.native
  var X86_64: `x86-64` = js.native
}

object ARM {
  @scala.inline
  def apply(ARM: arm_, MIPS: mips_, MIPS64: mips64_, X86_32: `x86-32`, X86_64: `x86-64`): ARM = {
    val __obj = js.Dynamic.literal(ARM = ARM.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS64 = MIPS64.asInstanceOf[js.Any], X86_32 = X86_32.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARM]
  }
  @scala.inline
  implicit class ARMOps[Self <: ARM] (val x: Self) extends AnyVal {
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
    def setARM(value: arm_): Self = this.set("ARM", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIPS(value: mips_): Self = this.set("MIPS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIPS64(value: mips64_): Self = this.set("MIPS64", value.asInstanceOf[js.Any])
    @scala.inline
    def setX86_32(value: `x86-32`): Self = this.set("X86_32", value.asInstanceOf[js.Any])
    @scala.inline
    def setX86_64(value: `x86-64`): Self = this.set("X86_64", value.asInstanceOf[js.Any])
  }
  
}

