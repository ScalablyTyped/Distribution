package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ARM extends js.Object {
  var ARM: chromeDashAppsLib.chromeDashAppsLibStrings.arm
  var MIPS: chromeDashAppsLib.chromeDashAppsLibStrings.mips
  var MIPS64: chromeDashAppsLib.chromeDashAppsLibStrings.mips64
  var X86_32: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32`
  var X86_64: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64`
}

object Anon_ARM {
  @scala.inline
  def apply(
    ARM: chromeDashAppsLib.chromeDashAppsLibStrings.arm,
    MIPS: chromeDashAppsLib.chromeDashAppsLibStrings.mips,
    MIPS64: chromeDashAppsLib.chromeDashAppsLibStrings.mips64,
    X86_32: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32`,
    X86_64: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64`
  ): Anon_ARM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ARM")(ARM)
    __obj.updateDynamic("MIPS")(MIPS)
    __obj.updateDynamic("MIPS64")(MIPS64)
    __obj.updateDynamic("X86_32")(X86_32)
    __obj.updateDynamic("X86_64")(X86_64)
    __obj.asInstanceOf[Anon_ARM]
  }
}

