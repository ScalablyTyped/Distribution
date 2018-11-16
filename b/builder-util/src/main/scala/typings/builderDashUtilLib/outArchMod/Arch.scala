package typings
package builderDashUtilLib.outArchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Arch extends js.Object

@JSImport("builder-util/out/arch", "Arch")
@js.native
object Arch extends js.Object {
  @js.native
  sealed trait arm64
    extends builderDashUtilLib.outArchMod.Arch
  
  @js.native
  sealed trait armv7l
    extends builderDashUtilLib.outArchMod.Arch
  
  @js.native
  sealed trait ia32
    extends builderDashUtilLib.outArchMod.Arch
  
  @js.native
  sealed trait x64
    extends builderDashUtilLib.outArchMod.Arch
  
  /* 3 */ val arm64: arm64 with scala.Double = js.native
  /* 2 */ val armv7l: armv7l with scala.Double = js.native
  /* 0 */ val ia32: ia32 with scala.Double = js.native
  /* 1 */ val x64: x64 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[builderDashUtilLib.outArchMod.Arch with scala.Double] = js.native
}

