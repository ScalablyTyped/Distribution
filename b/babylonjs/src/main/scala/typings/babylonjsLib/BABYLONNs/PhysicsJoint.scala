package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a holder class for the physics joint created by the physics plugin
  * It holds a set of functions to control the underlying joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
@JSGlobal("BABYLON.PhysicsJoint")
@js.native
class PhysicsJoint protected () extends js.Object {
  /**
    * Initializes the physics joint
    * @param type The type of the physics joint
    * @param jointData The data for the physics joint
    */
  def this(/**
    * The type of the physics joint
    */
  `type`: scala.Double, /**
    * The data for the physics joint
    */
  jointData: PhysicsJointData) = this()
  var _physicsJoint: js.Any = js.native
  var _physicsPlugin: IPhysicsEnginePlugin = js.native
  /**
    * The data for the physics joint
    */
  var jointData: PhysicsJointData = js.native
  /**
    * Gets the physics joint
    */
  /**
    * Sets the physics joint
    */
  var physicsJoint: js.Any = js.native
  /**
    * Sets the physics plugin
    */
  var physicsPlugin: IPhysicsEnginePlugin = js.native
  /**
    * The type of the physics joint
    */
  var `type`: scala.Double = js.native
  /**
    * Execute a function that is physics-plugin specific.
    * @param {Function} func the function that will be executed.
    *                        It accepts two parameters: the physics world and the physics joint
    */
  def executeNativeFunction(func: js.Function2[/* world */ js.Any, /* physicsJoint */ js.Any, scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.PhysicsJoint")
@js.native
object PhysicsJoint extends js.Object {
  /**
    * Ball-and-Socket joint type
    */
  var BallAndSocketJoint: scala.Double = js.native
  /**
    * Distance-Joint type
    */
  var DistanceJoint: scala.Double = js.native
  /**
    * Hinge-Joint 2 type
    */
  var Hinge2Joint: scala.Double = js.native
  /**
    * Hinge-Joint type
    */
  var HingeJoint: scala.Double = js.native
  /**
    * Lock-Joint type
    */
  var LockJoint: scala.Double = js.native
  /**
    * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
    */
  var PointToPointJoint: scala.Double = js.native
  /**
    * Prismatic-Joint type
    */
  var PrismaticJoint: scala.Double = js.native
  /**
    * Slider-Joint type
    */
  var SliderJoint: scala.Double = js.native
  /**
    * Spring-Joint type
    */
  var SpringJoint: scala.Double = js.native
  /**
    * Universal-Joint type
    * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
    */
  var UniversalJoint: scala.Double = js.native
  /**
    * Wheel-Joint type
    */
  var WheelJoint: scala.Double = js.native
}

