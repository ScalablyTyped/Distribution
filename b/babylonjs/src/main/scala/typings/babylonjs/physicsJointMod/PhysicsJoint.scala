package typings.babylonjs.physicsJointMod

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint")
@js.native
class PhysicsJoint protected () extends js.Object {
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
  var _physicsJoint: js.Any = js.native
  var _physicsPlugin: IPhysicsEnginePlugin = js.native
  /**
    * The data for the physics joint
    */
  var jointData: PhysicsJointData = js.native
  /**
    * The type of the physics joint
    */
  var `type`: Double = js.native
  /**
    * Execute a function that is physics-plugin specific.
    * @param {Function} func the function that will be executed.
    *                        It accepts two parameters: the physics world and the physics joint
    */
  def executeNativeFunction(func: js.Function2[/* world */ js.Any, /* physicsJoint */ js.Any, Unit]): Unit = js.native
  /**
    * Gets the physics joint
    */
  def physicsJoint: js.Any = js.native
  /**
    * Sets the physics joint
    */
  def physicsJoint(newJoint: js.Any): js.Any = js.native
  /**
    * Sets the physics plugin
    */
  def physicsPlugin(physicsPlugin: IPhysicsEnginePlugin): js.Any = js.native
}

/* static members */
@JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint")
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

