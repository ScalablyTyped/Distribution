package typings.builderUtil.archMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Arch extends js.Object
@JSImport("builder-util/out/arch", "Arch")
@js.native
object Arch extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Arch with Double] = js.native
  
  @js.native
  sealed trait arm64 extends Arch
  /* 3 */ @js.native
  object arm64 extends TopLevel[arm64 with Double]
  
  @js.native
  sealed trait armv7l extends Arch
  /* 2 */ @js.native
  object armv7l extends TopLevel[armv7l with Double]
  
  @js.native
  sealed trait ia32 extends Arch
  /* 0 */ @js.native
  object ia32 extends TopLevel[ia32 with Double]
  
  @js.native
  sealed trait x64 extends Arch
  /* 1 */ @js.native
  object x64 extends TopLevel[x64 with Double]
}
