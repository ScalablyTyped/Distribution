package typings.babylonjs.physicsIndexMod

import typings.babylonjs.physicsJointMod.PhysicsJointData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/index", "PhysicsJoint")
@js.native
class PhysicsJoint protected ()
  extends typings.babylonjs.physicsJointMod.PhysicsJoint {
  /**
    * Initializes the physics joint
    * @param type The type of the physics joint
    * @param jointData The data for the physics joint
    */
  def this(
    /**
    * The type of the physics joint
    */
  `type`: Double,
    /**
    * The data for the physics joint
    */
  jointData: PhysicsJointData
  ) = this()
}

/* static members */
@JSImport("babylonjs/Physics/index", "PhysicsJoint")
@js.native
object PhysicsJoint extends js.Object {
  /**
    * Ball-and-Socket joint type
    */
  var BallAndSocketJoint: Double = js.native
  /**
    * Distance-Joint type
    */
  var DistanceJoint: Double = js.native
  /**
    * Hinge-Joint 2 type
    */
  var Hinge2Joint: Double = js.native
  /**
    * Hinge-Joint type
    */
  var HingeJoint: Double = js.native
  /**
    * Lock-Joint type
    */
  var LockJoint: Double = js.native
  /**
    * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
    */
  var PointToPointJoint: Double = js.native
  /**
    * Prismatic-Joint type
    */
  var PrismaticJoint: Double = js.native
  /**
    * Slider-Joint type
    */
  var SliderJoint: Double = js.native
  /**
    * Spring-Joint type
    */
  var SpringJoint: Double = js.native
  /**
    * Universal-Joint type
    * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
    */
  var UniversalJoint: Double = js.native
  /**
    * Wheel-Joint type
    */
  var WheelJoint: Double = js.native
}

