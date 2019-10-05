package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.Anon_ANDROID
import typings.chromeDashApps.Anon_ARM
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.`x86-32`
import typings.chromeDashApps.chromeDashAppsStrings.`x86-64`
import typings.chromeDashApps.chromeDashAppsStrings.android
import typings.chromeDashApps.chromeDashAppsStrings.arm
import typings.chromeDashApps.chromeDashAppsStrings.cros
import typings.chromeDashApps.chromeDashAppsStrings.linux
import typings.chromeDashApps.chromeDashAppsStrings.mac
import typings.chromeDashApps.chromeDashAppsStrings.mips
import typings.chromeDashApps.chromeDashAppsStrings.mips64
import typings.chromeDashApps.chromeDashAppsStrings.openbsd
import typings.chromeDashApps.chromeDashAppsStrings.win
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
  var arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]]
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @see enum PlatformNaclArch
    */
  var nacl_arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]]
  /**
    * The operating system chrome is running on.
    * @see enum PlatformOs
    */
  var os: ToStringLiteral[Anon_ANDROID, String, Exclude[String, mac | android | cros | win | linux | openbsd]]
}

object PlatformInfo {
  @scala.inline
  def apply(
    arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]],
    nacl_arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]],
    os: ToStringLiteral[Anon_ANDROID, String, Exclude[String, mac | android | cros | win | linux | openbsd]]
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlatformInfo]
  }
}

