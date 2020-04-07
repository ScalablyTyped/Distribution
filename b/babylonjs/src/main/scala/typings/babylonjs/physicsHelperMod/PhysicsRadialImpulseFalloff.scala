package typings.babylonjs.physicsHelperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhysicsRadialImpulseFalloff extends js.Object

@JSImport("babylonjs/Physics/physicsHelper", "PhysicsRadialImpulseFalloff")
@js.native
object PhysicsRadialImpulseFalloff extends js.Object {
  /** Defines that impulse is constant in strength across it's whole radius */
  @js.native
  sealed trait Constant extends PhysicsRadialImpulseFalloff
  
  /** Defines that impulse gets weaker if it's further from the origin */
  @js.native
  sealed trait Linear extends PhysicsRadialImpulseFalloff
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsRadialImpulseFalloff with Double] = js.native
  /* 0 */ @js.native
  object Constant extends TopLevel[Constant with Double]
  
  /* 1 */ @js.native
  object Linear extends TopLevel[Linear with Double]
  
}

