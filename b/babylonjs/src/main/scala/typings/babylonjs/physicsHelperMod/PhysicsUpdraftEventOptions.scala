package typings.babylonjs.physicsHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/physicsHelper", "PhysicsUpdraftEventOptions")
@js.native
class PhysicsUpdraftEventOptions () extends js.Object {
  /**
    * The height of the cylinder for the updraft.
    */
  var height: Double = js.native
  /**
    * The radius of the cylinder for the vortex
    */
  var radius: Double = js.native
  /**
    * The strenth of the updraft.
    */
  var strength: Double = js.native
  /**
    * The mode for the the updraft.
    */
  var updraftMode: PhysicsUpdraftMode = js.native
}

