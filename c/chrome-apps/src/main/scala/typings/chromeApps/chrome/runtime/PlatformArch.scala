package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.arm
import typings.chromeApps.chromeAppsStrings.mips
import typings.chromeApps.chromeAppsStrings.mips64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.PlatformArch")
@js.native
object PlatformArch extends js.Object {
  var ARM: arm = js.native
  var MIPS: mips = js.native
  var MIPS64: mips64 = js.native
  var X86_32: `x86-32` = js.native
  var X86_64: `x86-64` = js.native
}

