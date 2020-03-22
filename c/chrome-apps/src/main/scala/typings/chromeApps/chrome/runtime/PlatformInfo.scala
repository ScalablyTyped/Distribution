package typings.chromeApps.chrome.runtime

import typings.chromeApps.AnonANDROID
import typings.chromeApps.AnonARM
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.android
import typings.chromeApps.chromeAppsStrings.arm
import typings.chromeApps.chromeAppsStrings.cros
import typings.chromeApps.chromeAppsStrings.linux
import typings.chromeApps.chromeAppsStrings.mac
import typings.chromeApps.chromeAppsStrings.mips
import typings.chromeApps.chromeAppsStrings.mips64
import typings.chromeApps.chromeAppsStrings.openbsd
import typings.chromeApps.chromeAppsStrings.win
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing information about the current platform.
  * @since Chrome 36.
  */
trait PlatformInfo extends js.Object {
  /**
    * The machine's processor architecture.
    * @see enum PlatformArch
    */
  var arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]]
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @see enum PlatformNaclArch
    */
  var nacl_arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]]
  /**
    * The operating system chrome is running on.
    * @see enum PlatformOs
    */
  var os: ToStringLiteral[AnonANDROID, String, Exclude[String, linux | openbsd | android | win | cros | mac]]
}

object PlatformInfo {
  @scala.inline
  def apply(
    arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]],
    nacl_arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]],
    os: ToStringLiteral[AnonANDROID, String, Exclude[String, linux | openbsd | android | win | cros | mac]]
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlatformInfo]
  }
}

