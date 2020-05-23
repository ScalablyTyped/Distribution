package typings.babylonjs.BABYLON

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
  
}

