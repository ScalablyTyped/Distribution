package typings.cordovaPluginsDiagnostic.anon

import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64
import typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARMv6 extends js.Object {
  var ARMv6: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6 = js.native
  var ARMv7: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7 = js.native
  var ARMv8: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8 = js.native
  // Android only
  var MIPS: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS = js.native
  var MIPS_64: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64 = js.native
  // Both iOS and Android
  var UNKNOWN: unknown = js.native
  var X86: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86 = js.native
  var X86_64: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64 = js.native
}

object ARMv6 {
  @scala.inline
  def apply(
    ARMv6: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6,
    ARMv7: ARMv7,
    ARMv8: ARMv8,
    MIPS: MIPS,
    MIPS_64: MIPS_64,
    UNKNOWN: unknown,
    X86: X86,
    X86_64: X86_64
  ): ARMv6 = {
    val __obj = js.Dynamic.literal(ARMv6 = ARMv6.asInstanceOf[js.Any], ARMv7 = ARMv7.asInstanceOf[js.Any], ARMv8 = ARMv8.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS_64 = MIPS_64.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], X86 = X86.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARMv6]
  }
  @scala.inline
  implicit class ARMv6Ops[Self <: ARMv6] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setARMv6(value: typings.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6): Self = this.set("ARMv6", value.asInstanceOf[js.Any])
    @scala.inline
    def setARMv7(value: ARMv7): Self = this.set("ARMv7", value.asInstanceOf[js.Any])
    @scala.inline
    def setARMv8(value: ARMv8): Self = this.set("ARMv8", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIPS(value: MIPS): Self = this.set("MIPS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMIPS_64(value: MIPS_64): Self = this.set("MIPS_64", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNKNOWN(value: unknown): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setX86(value: X86): Self = this.set("X86", value.asInstanceOf[js.Any])
    @scala.inline
    def setX86_64(value: X86_64): Self = this.set("X86_64", value.asInstanceOf[js.Any])
  }
  
}

