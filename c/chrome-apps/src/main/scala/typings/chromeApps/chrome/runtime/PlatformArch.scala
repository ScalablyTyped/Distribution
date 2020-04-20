package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.arm_
import typings.chromeApps.chromeAppsStrings.mips64_
import typings.chromeApps.chromeAppsStrings.mips_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.PlatformArch")
@js.native
object PlatformArch extends js.Object {
  var ARM: arm_ = js.native
  var MIPS: mips_ = js.native
  var MIPS64: mips64_ = js.native
  var X86_32: `x86-32` = js.native
  var X86_64: `x86-64` = js.native
}

