package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.`x86-32`
import typings.chromeDashApps.chromeDashAppsStrings.`x86-64`
import typings.chromeDashApps.chromeDashAppsStrings.arm
import typings.chromeDashApps.chromeDashAppsStrings.mips
import typings.chromeDashApps.chromeDashAppsStrings.mips64
import typings.chromeDashApps.chromeNs.ToStringLiteral
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

trait Anon_Arm extends js.Object {
  var nacl_arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]]
  var sub_package_path: String
}

object Anon_ARM {
  @scala.inline
  def apply(ARM: arm, MIPS: mips, MIPS64: mips64, X86_32: `x86-32`, X86_64: `x86-64`): Anon_ARM = {
    val __obj = js.Dynamic.literal(ARM = ARM, MIPS = MIPS, MIPS64 = MIPS64, X86_32 = X86_32, X86_64 = X86_64)
  
    __obj.asInstanceOf[Anon_ARM]
  }
}

object Anon_Arm {
  @scala.inline
  def apply(
    nacl_arch: ToStringLiteral[Anon_ARM, String, Exclude[String, mips | arm | `x86-64` | `x86-32` | mips64]],
    sub_package_path: String
  ): Anon_Arm = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path)
  
    __obj.asInstanceOf[Anon_Arm]
  }
}

