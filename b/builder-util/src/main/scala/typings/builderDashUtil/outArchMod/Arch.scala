package typings.builderDashUtil.outArchMod

import org.scalablytyped.runtime.TopLevel
import typings.builderDashUtil.outArchMod.Arch.arm64
import typings.builderDashUtil.outArchMod.Arch.armv7l
import typings.builderDashUtil.outArchMod.Arch.ia32
import typings.builderDashUtil.outArchMod.Arch.x64
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Arch with Double] = js.native
  /* 3 */ @js.native
  object arm64 extends TopLevel[arm64 with Double]
  
  /* 2 */ @js.native
  object armv7l extends TopLevel[armv7l with Double]
  
  /* 0 */ @js.native
  object ia32 extends TopLevel[ia32 with Double]
  
  /* 1 */ @js.native
  object x64 extends TopLevel[x64 with Double]
  
}

