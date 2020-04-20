package typings.chromeApps

import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.ARM
import typings.chromeApps.chromeAppsStrings.MIPS
import typings.chromeApps.chromeAppsStrings.MIPS64
import typings.chromeApps.chromeAppsStrings.X86_32
import typings.chromeApps.chromeAppsStrings.X86_64
import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.arm_
import typings.chromeApps.chromeAppsStrings.mips64_
import typings.chromeApps.chromeAppsStrings.mips_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNaclarch extends js.Object {
  var nacl_arch: ToStringLiteral[
    AnonARM, 
    ARM | X86_32 | X86_64 | MIPS | MIPS64, 
    Exclude[
      ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      mips64_ | arm_ | `x86-64` | `x86-32` | mips_
    ]
  ]
  var sub_package_path: String
}

object AnonNaclarch {
  @scala.inline
  def apply(
    nacl_arch: ToStringLiteral[
      AnonARM, 
      ARM | X86_32 | X86_64 | MIPS | MIPS64, 
      Exclude[
        ARM | X86_32 | X86_64 | MIPS | MIPS64, 
        mips64_ | arm_ | `x86-64` | `x86-32` | mips_
      ]
    ],
    sub_package_path: String
  ): AnonNaclarch = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNaclarch]
  }
}

