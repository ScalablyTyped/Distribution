package typings.babylonjs

import typings.babylonjs.iphysicsengineMod.IPhysicsEnginePlugin
import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsJointMod {
  
  @JSImport("babylonjs/Physics/physicsJoint", "DistanceJoint")
  @js.native
  class DistanceJoint protected () extends PhysicsJoint {
    /**
      *
      * @param jointData The data for the Distance-Joint
      */
    def this(jointData: DistanceJointData) = this()
    
    /**
      * Update the predefined distance.
      * @param maxDistance The maximum preferred distance
      * @param minDistance The minimum preferred distance
      */
    def updateDistance(maxDistance: Double): Unit = js.native
    def updateDistance(maxDistance: Double, minDistance: Double): Unit = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsJoint", "Hinge2Joint")
  @js.native
  class Hinge2Joint protected () extends MotorEnabledJoint {
    /**
      * Initializes the Hinge2-Joint
      * @param jointData The joint data for the Hinge2-Joint
      */
    def this(jointData: PhysicsJointData) = this()
  }
  
  @JSImport("babylonjs/Physics/physicsJoint", "HingeJoint")
  @js.native
  class HingeJoint protected () extends MotorEnabledJoint {
    /**
      * Initializes the Hinge-Joint
      * @param jointData The joint data for the Hinge-Joint
      */
    def this(jointData: PhysicsJointData) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.physicsJointMod.IMotorEnabledJoint because var conflicts: physicsJoint. Inlined setMotor, setMotor, setMotor, setMotor, setMotor, setMotor, setMotor, setMotor, setLimit, setLimit, setLimit, setLimit */ @JSImport("babylonjs/Physics/physicsJoint", "MotorEnabledJoint")
  @js.native
  class MotorEnabledJoint protected () extends PhysicsJoint {
    /**
      * Initializes the Motor-Enabled Joint
      * @param type The type of the joint
      * @param jointData The physica joint data for the joint
      */
    def this(`type`: Double, jointData: PhysicsJointData) = this()
    
    /**
      * Set the motor's limits.
      * Attention, this function is plugin specific. Engines won't react 100% the same.
      * @param upperLimit The upper limit of the motor
      * @param lowerLimit The lower limit of the motor
      */
    /**
      * Sets the limit of the motor
      * @param upperLimit The upper limit of the motor
      * @param lowerLimit The lower limit of the motor
      * @param motorIndex The index of the motor
      */
    def setLimit(upperLimit: Double): Unit = js.native
    def setLimit(upperLimit: Double, lowerLimit: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setLimit(upperLimit: Double, lowerLimit: Double): Unit = js.native
    def setLimit(upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
    
    /**
      * Set the motor values.
      * Attention, this function is plugin specific. Engines won't react 100% the same.
      * @param force the force to apply
      * @param maxForce max force for this motor.
      */
    /**
      * Sets the motor of the motor-enabled joint
      * @param force The force of the motor
      * @param maxForce The maximum force of the motor
      * @param motorIndex The index of the motor
      */
    def setMotor(): Unit = js.native
    def setMotor(force: js.UndefOr[scala.Nothing], maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setMotor(force: js.UndefOr[scala.Nothing], maxForce: Double): Unit = js.native
    def setMotor(force: js.UndefOr[scala.Nothing], maxForce: Double, motorIndex: Double): Unit = js.native
    def setMotor(force: Double): Unit = js.native
    def setMotor(force: Double, maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setMotor(force: Double, maxForce: Double): Unit = js.native
    def setMotor(force: Double, maxForce: Double, motorIndex: Double): Unit = js.native
  }
  
  @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint")
  @js.native
  class PhysicsJoint protected () extends StObject {
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
      * Execute a function that is physics-plugin specific.
      * @param {Function} func the function that will be executed.
      *                        It accepts two parameters: the physics world and the physics joint
      */
    def executeNativeFunction(func: js.Function2[/* world */ js.Any, /* physicsJoint */ js.Any, Unit]): Unit = js.native
    
    /**
      * The data for the physics joint
      */
    var jointData: PhysicsJointData = js.native
    
    /**
      * Gets the physics joint
      */
    def physicsJoint: js.Any = js.native
    /**
      * Sets the physics joint
      */
    def physicsJoint_=(newJoint: js.Any): Unit = js.native
    
    /**
      * Sets the physics plugin
      */
    def physicsPlugin_=(physicsPlugin: IPhysicsEnginePlugin): Unit = js.native
    
    /**
      * The type of the physics joint
      */
    var `type`: Double = js.native
  }
  /* static members */
  object PhysicsJoint {
    
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Ball-and-Socket joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.BallAndSocketJoint")
    @js.native
    def BallAndSocketJoint: Double = js.native
    @scala.inline
    def BallAndSocketJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BallAndSocketJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Distance-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.DistanceJoint")
    @js.native
    def DistanceJoint: Double = js.native
    @scala.inline
    def DistanceJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DistanceJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Hinge-Joint 2 type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.Hinge2Joint")
    @js.native
    def Hinge2Joint: Double = js.native
    @scala.inline
    def Hinge2Joint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hinge2Joint")(x.asInstanceOf[js.Any])
    
    /**
      * Hinge-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.HingeJoint")
    @js.native
    def HingeJoint: Double = js.native
    @scala.inline
    def HingeJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HingeJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Lock-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.LockJoint")
    @js.native
    def LockJoint: Double = js.native
    @scala.inline
    def LockJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LockJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Point to Point Joint type.  Similar to a Ball-Joint.  Different in parameters
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.PointToPointJoint")
    @js.native
    def PointToPointJoint: Double = js.native
    @scala.inline
    def PointToPointJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PointToPointJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Prismatic-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.PrismaticJoint")
    @js.native
    def PrismaticJoint: Double = js.native
    @scala.inline
    def PrismaticJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrismaticJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Slider-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.SliderJoint")
    @js.native
    def SliderJoint: Double = js.native
    @scala.inline
    def SliderJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Spring-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.SpringJoint")
    @js.native
    def SpringJoint: Double = js.native
    @scala.inline
    def SpringJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpringJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Universal-Joint type
      * ENERGY FTW! (compare with this - @see http://ode-wiki.org/wiki/index.php?title=Manual:_Joint_Types_and_Functions)
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.UniversalJoint")
    @js.native
    def UniversalJoint: Double = js.native
    @scala.inline
    def UniversalJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniversalJoint")(x.asInstanceOf[js.Any])
    
    /**
      * Wheel-Joint type
      */
    @JSImport("babylonjs/Physics/physicsJoint", "PhysicsJoint.WheelJoint")
    @js.native
    def WheelJoint: Double = js.native
    @scala.inline
    def WheelJoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelJoint")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DistanceJointData extends PhysicsJointData {
    
    /**
      * Max distance the 2 joint objects can be apart
      */
    var maxDistance: Double = js.native
  }
  object DistanceJointData {
    
    @scala.inline
    def apply(maxDistance: Double): DistanceJointData = {
      val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceJointData]
    }
    
    @scala.inline
    implicit class DistanceJointDataMutableBuilder[Self <: DistanceJointData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMotorEnabledJoint extends StObject {
    
    /**
      * Physics joint
      */
    var physicsJoint: js.Any = js.native
    
    /**
      * Sets the limit of the motor
      * @param upperLimit The upper limit of the motor
      * @param lowerLimit The lower limit of the motor
      * @param motorIndex The index of the motor
      */
    def setLimit(upperLimit: Double): Unit = js.native
    def setLimit(upperLimit: Double, lowerLimit: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setLimit(upperLimit: Double, lowerLimit: Double): Unit = js.native
    def setLimit(upperLimit: Double, lowerLimit: Double, motorIndex: Double): Unit = js.native
    
    /**
      * Sets the motor of the motor-enabled joint
      * @param force The force of the motor
      * @param maxForce The maximum force of the motor
      * @param motorIndex The index of the motor
      */
    def setMotor(): Unit = js.native
    def setMotor(force: js.UndefOr[scala.Nothing], maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setMotor(force: js.UndefOr[scala.Nothing], maxForce: Double): Unit = js.native
    def setMotor(force: js.UndefOr[scala.Nothing], maxForce: Double, motorIndex: Double): Unit = js.native
    def setMotor(force: Double): Unit = js.native
    def setMotor(force: Double, maxForce: js.UndefOr[scala.Nothing], motorIndex: Double): Unit = js.native
    def setMotor(force: Double, maxForce: Double): Unit = js.native
    def setMotor(force: Double, maxForce: Double, motorIndex: Double): Unit = js.native
  }
  
  @js.native
  trait PhysicsJointData extends StObject {
    
    /**
      * The collision of the joint
      */
    var collision: js.UndefOr[Boolean] = js.native
    
    /**
      * The connected axis of the joint
      */
    var connectedAxis: js.UndefOr[Vector3] = js.native
    
    /**
      * The connected pivot of the joint
      */
    var connectedPivot: js.UndefOr[Vector3] = js.native
    
    /**
      * The main axis of the joint
      */
    var mainAxis: js.UndefOr[Vector3] = js.native
    
    /**
      * The main pivot of the joint
      */
    var mainPivot: js.UndefOr[Vector3] = js.native
    
    /**
      * Native Oimo/Cannon/Energy data
      */
    var nativeParams: js.UndefOr[js.Any] = js.native
  }
  object PhysicsJointData {
    
    @scala.inline
    def apply(): PhysicsJointData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhysicsJointData]
    }
    
    @scala.inline
    implicit class PhysicsJointDataMutableBuilder[Self <: PhysicsJointData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollision(value: Boolean): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
      
      @scala.inline
      def setConnectedAxis(value: Vector3): Self = StObject.set(x, "connectedAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectedAxisUndefined: Self = StObject.set(x, "connectedAxis", js.undefined)
      
      @scala.inline
      def setConnectedPivot(value: Vector3): Self = StObject.set(x, "connectedPivot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectedPivotUndefined: Self = StObject.set(x, "connectedPivot", js.undefined)
      
      @scala.inline
      def setMainAxis(value: Vector3): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
      
      @scala.inline
      def setMainPivot(value: Vector3): Self = StObject.set(x, "mainPivot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainPivotUndefined: Self = StObject.set(x, "mainPivot", js.undefined)
      
      @scala.inline
      def setNativeParams(value: js.Any): Self = StObject.set(x, "nativeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeParamsUndefined: Self = StObject.set(x, "nativeParams", js.undefined)
    }
  }
  
  @js.native
  trait SpringJointData extends PhysicsJointData {
    
    /**
      * Damping of the spring
      */
    var damping: Double = js.native
    
    /** this callback will be called when applying the force to the impostors. */
    def forceApplicationCallback(): Unit = js.native
    
    /**
      * Length of the spring
      */
    var length: Double = js.native
    
    /**
      * Stiffness of the spring
      */
    var stiffness: Double = js.native
  }
  object SpringJointData {
    
    @scala.inline
    def apply(damping: Double, forceApplicationCallback: () => Unit, length: Double, stiffness: Double): SpringJointData = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], forceApplicationCallback = js.Any.fromFunction0(forceApplicationCallback), length = length.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringJointData]
    }
    
    @scala.inline
    implicit class SpringJointDataMutableBuilder[Self <: SpringJointData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceApplicationCallback(value: () => Unit): Self = StObject.set(x, "forceApplicationCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    }
  }
}
