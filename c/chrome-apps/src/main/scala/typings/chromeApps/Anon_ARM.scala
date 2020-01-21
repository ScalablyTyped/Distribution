package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.arm
import typings.chromeApps.chromeAppsStrings.mips
import typings.chromeApps.chromeAppsStrings.mips64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ARM extends js.Object {
  var ARM: arm
  var MIPS: mips
  var MIPS64: mips64
  var X86_32: `x86-32`
  var X86_64: `x86-64`
}

object Anon_ARM {
  @scala.inline
  def apply(ARM: arm, MIPS: mips, MIPS64: mips64, X86_32: `x86-32`, X86_64: `x86-64`): Anon_ARM = {
    val __obj = js.Dynamic.literal(ARM = ARM.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS64 = MIPS64.asInstanceOf[js.Any], X86_32 = X86_32.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ARM]
  }
}

