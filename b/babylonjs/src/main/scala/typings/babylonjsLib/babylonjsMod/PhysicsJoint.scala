package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This is a holder class for the physics joint created by the physics plugin
     * It holds a set of functions to control the underlying joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsJoint")
@js.native
class PhysicsJoint protected ()
  extends babylonjsLib.BABYLONNs.PhysicsJoint {
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
  jointData: babylonjsLib.BABYLONNs.PhysicsJointData) = this()
}

/**
     * This is a holder class for the physics joint created by the physics plugin
     * It holds a set of functions to control the underlying joint
     * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
     */
@JSImport("babylonjs", "PhysicsJoint")
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

