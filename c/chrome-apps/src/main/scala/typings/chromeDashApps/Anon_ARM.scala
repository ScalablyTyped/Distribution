package typings.chromeDashApps

import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.`x86-32`
import typings.chromeDashApps.chromeDashAppsStrings.`x86-64`
import typings.chromeDashApps.chromeDashAppsStrings.arm
import typings.chromeDashApps.chromeDashAppsStrings.mips
import typings.chromeDashApps.chromeDashAppsStrings.mips64
import typings.std.Exclude
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

trait Anon_Arm extends js.Object {
  var nacl_arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]]
  var sub_package_path: String
}

object Anon_Arm {
  @scala.inline
  def apply(
    nacl_arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]],
    sub_package_path: String
  ): Anon_Arm = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Arm]
  }
}

