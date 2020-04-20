package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.arm_
import typings.chromeApps.chromeAppsStrings.mips64_
import typings.chromeApps.chromeAppsStrings.mips_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonARM extends js.Object {
  var ARM: arm_
  var MIPS: mips_
  var MIPS64: mips64_
  var X86_32: `x86-32`
  var X86_64: `x86-64`
}

object AnonARM {
  @scala.inline
  def apply(ARM: arm_, MIPS: mips_, MIPS64: mips64_, X86_32: `x86-32`, X86_64: `x86-64`): AnonARM = {
    val __obj = js.Dynamic.literal(ARM = ARM.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS64 = MIPS64.asInstanceOf[js.Any], X86_32 = X86_32.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonARM]
  }
}

