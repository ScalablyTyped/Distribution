package typings.builderDashUtil.outArchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Arch extends js.Object

@JSImport("builder-util/out/arch", "Arch")
@js.native
object Arch extends js.Object {
  @js.native
  sealed trait arm64 extends Arch
  
  @js.native
  sealed trait armv7l extends Arch
  
  @js.native
  sealed trait ia32 extends Arch
  
  @js.native
  sealed trait x64 extends Arch
  
  /* 3 */ val arm64: typings.builderDashUtil.outArchMod.Arch.arm64 with Double = js.native
  /* 2 */ val armv7l: typings.builderDashUtil.outArchMod.Arch.armv7l with Double = js.native
  /* 0 */ val ia32: typings.builderDashUtil.outArchMod.Arch.ia32 with Double = js.native
  /* 1 */ val x64: typings.builderDashUtil.outArchMod.Arch.x64 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Arch with Double] = js.native
}

