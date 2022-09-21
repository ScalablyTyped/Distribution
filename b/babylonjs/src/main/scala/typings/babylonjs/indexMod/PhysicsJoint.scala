package typings.babylonjs.indexMod

import typings.babylonjs.physicsJointMod.PhysicsJointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PhysicsJoint")
@js.native
open class PhysicsJoint protected ()
  extends typings.babylonjs.physicsIndexMod.PhysicsJoint {
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
object PhysicsJoint {
  
  @JSImport("babylonjs/index", "PhysicsJoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Ball-and-Socket joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.BallAndSocketJoint")
  @js.native
  def BallAndSocketJoint: Double = js.native
  inline def BallAndSocketJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BallAndSocketJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Distance-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.DistanceJoint")
  @js.native
  def DistanceJoint: Double = js.native
  inline def DistanceJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DistanceJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Hinge-Joint 2 type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.Hinge2Joint")
  @js.native
  def Hinge2Joint: Double = js.native
  inline def Hinge2Joint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hinge2Joint")(x.asInstanceOf[js.Any])
  
  /**
    * Hinge-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.HingeJoint")
  @js.native
  def HingeJoint: Double = js.native
  inline def HingeJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HingeJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Lock-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.LockJoint")
  @js.native
  def LockJoint: Double = js.native
  inline def LockJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LockJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
    */
  @JSImport("babylonjs/index", "PhysicsJoint.PointToPointJoint")
  @js.native
  def PointToPointJoint: Double = js.native
  inline def PointToPointJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointToPointJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Prismatic-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.PrismaticJoint")
  @js.native
  def PrismaticJoint: Double = js.native
  inline def PrismaticJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrismaticJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Slider-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.SliderJoint")
  @js.native
  def SliderJoint: Double = js.native
  inline def SliderJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Spring-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.SpringJoint")
  @js.native
  def SpringJoint: Double = js.native
  inline def SpringJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpringJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Universal-Joint type
    * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
    */
  @JSImport("babylonjs/index", "PhysicsJoint.UniversalJoint")
  @js.native
  def UniversalJoint: Double = js.native
  inline def UniversalJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniversalJoint")(x.asInstanceOf[js.Any])
  
  /**
    * Wheel-Joint type
    */
  @JSImport("babylonjs/index", "PhysicsJoint.WheelJoint")
  @js.native
  def WheelJoint: Double = js.native
  inline def WheelJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelJoint")(x.asInstanceOf[js.Any])
}
