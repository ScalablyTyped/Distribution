package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhysicsUpdraftMode extends js.Object

@JSGlobal("BABYLON.PhysicsUpdraftMode")
@js.native
object PhysicsUpdraftMode extends js.Object {
  /** Defines that the upstream forces will pull towards the top center of the cylinder */
  @js.native
  sealed trait Center extends PhysicsUpdraftMode
  
  /** Defines that once a impostor is inside the cylinder, it will shoot out perpendicular from the ground of the cylinder */
  @js.native
  sealed trait Perpendicular extends PhysicsUpdraftMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhysicsUpdraftMode with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Perpendicular extends TopLevel[Perpendicular with Double]
  
}

