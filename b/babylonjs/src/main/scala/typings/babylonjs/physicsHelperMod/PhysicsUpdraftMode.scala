package typings.babylonjs.physicsHelperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsUpdraftMode extends js.Object
@JSImport("babylonjs/Physics/physicsHelper", "PhysicsUpdraftMode")
@js.native
object PhysicsUpdraftMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsUpdraftMode with Double] = js.native
  
  /** Defines that the upstream forces will pull towards the top center of the cylinder */
  @js.native
  sealed trait Center extends PhysicsUpdraftMode
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /** Defines that once a impostor is inside the cylinder, it will shoot out perpendicular from the ground of the cylinder */
  @js.native
  sealed trait Perpendicular extends PhysicsUpdraftMode
  /* 1 */ @js.native
  object Perpendicular extends TopLevel[Perpendicular with Double]
}
