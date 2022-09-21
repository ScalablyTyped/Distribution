package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Joints {
  
  @JSGlobal("Box2D.Dynamics.Joints.b2DistanceJoint")
  @js.native
  open class b2DistanceJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2DistanceJoint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Gets the damping ratio.
      * @return Damping ratio.
      **/
    /* CompleteClass */
    override def GetDampingRatio(): Double = js.native
    
    /**
      * Gets the frequency.
      * @return Frequency.
      **/
    /* CompleteClass */
    override def GetFrequency(): Double = js.native
    
    /**
      * Gets the length of distance between the two bodies.
      * @return Length.
      **/
    /* CompleteClass */
    override def GetLength(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Sets the damping ratio.
      * @param ratio New damping ratio.
      **/
    /* CompleteClass */
    override def SetDampingRatio(ratio: Double): Unit = js.native
    
    /**
      * Sets the frequency.
      * @param hz New frequency (hertz).
      **/
    /* CompleteClass */
    override def SetFrequency(hz: Double): Unit = js.native
    
    /**
      * Sets the length of distance between the two bodies.
      * @param length New length.
      **/
    /* CompleteClass */
    override def SetLength(length: Double): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2DistanceJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2DistanceJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2DistanceJointDef {
    
    /**
      * Initialize the bodies, anchors, and length using the world anchors.
      * @param bA Body A.
      * @param bB Body B.
      * @param anchorA Anchor A.
      * @param anchorB Anchor B.
      **/
    /* CompleteClass */
    override def Initialize(
      bA: typings.box2d.Box2D.Dynamics.b2Body,
      bB: typings.box2d.Box2D.Dynamics.b2Body,
      anchorA: b2Vec2,
      anchorB: b2Vec2
    ): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The damping ratio. 0 = no damping, 1 = critical damping.
      **/
    /* CompleteClass */
    var dampingRatio: Double = js.native
    
    /**
      * The mass-spring-damper frequency in Hertz.
      **/
    /* CompleteClass */
    var frequencyHz: Double = js.native
    
    /**
      * The natural length between the anchor points.
      **/
    /* CompleteClass */
    var length: Double = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2FrictionJoint")
  @js.native
  open class b2FrictionJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2FrictionJoint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Gets the max force.
      * @return Max force.
      **/
    /* CompleteClass */
    override def GetMaxForce(): Double = js.native
    
    /**
      * Gets the max torque.
      * @return Max torque.
      **/
    /* CompleteClass */
    override def GetMaxTorque(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Sets the max force.
      * @param force New max force.
      **/
    /* CompleteClass */
    override def SetMaxForce(force: Double): Unit = js.native
    
    /**
      * Sets the max torque.
      * @param torque New max torque.
      **/
    /* CompleteClass */
    override def SetMaxTorque(torque: Double): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
    
    /**
      * Angular mass.
      **/
    /* CompleteClass */
    var m_angularMass: Double = js.native
    
    /**
      * Linear mass.
      **/
    /* CompleteClass */
    var m_linearMass: b2Mat22 = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2FrictionJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2FrictionJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2FrictionJointDef {
    
    /**
      * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
      * @param bA Body A.
      * @param bB Body B.
      * @param anchor World anchor.
      **/
    /* CompleteClass */
    override def Initialize(bA: typings.box2d.Box2D.Dynamics.b2Body, bB: typings.box2d.Box2D.Dynamics.b2Body, anchor: b2Vec2): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The maximum force in N.
      **/
    /* CompleteClass */
    var maxForce: Double = js.native
    
    /**
      * The maximum friction torque in N-m.
      **/
    /* CompleteClass */
    var maxTorque: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2GearJoint")
  @js.native
  open class b2GearJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2GearJoint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the gear ratio.
      * @return Gear ratio.
      **/
    /* CompleteClass */
    override def GetRatio(): Double = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Set the gear ratio.
      * @param force New gear ratio.
      **/
    /* CompleteClass */
    override def SetRatio(ratio: Double): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2GearJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2GearJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2GearJointDef {
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The first revolute/prismatic joint attached to the gear joint.
      **/
    /* CompleteClass */
    var joint1: typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * The second revolute/prismatic joint attached to the gear joint.
      **/
    /* CompleteClass */
    var joint2: typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * The gear ratio.
      **/
    /* CompleteClass */
    var ratio: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2Joint")
  @js.native
  open class b2Joint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2Joint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2JointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2JointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2JointDef {
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2JointEdge")
  @js.native
  open class b2JointEdge ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2JointEdge {
    
    /**
      * The joint.
      **/
    /* CompleteClass */
    var joint: typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * The next joint edge in the body's joint list.
      **/
    /* CompleteClass */
    var next: typings.box2d.Box2D.Dynamics.Joints.b2JointEdge = js.native
    
    /**
      * Provides quick access to the other body attached.
      **/
    /* CompleteClass */
    var other: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The previous joint edge in the body's joint list.
      **/
    /* CompleteClass */
    var prev: typings.box2d.Box2D.Dynamics.Joints.b2JointEdge = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2LineJoint")
  @js.native
  open class b2LineJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2LineJoint {
    
    /**
      * Enable/disable the joint limit.
      * @param flag True to enable, false to disable limits
      **/
    /* CompleteClass */
    override def EnableLimit(flag: Boolean): Unit = js.native
    
    /**
      * Enable/disable the joint motor.
      * @param flag True to enable, false to disable the motor.
      **/
    /* CompleteClass */
    override def EnableMotor(flag: Boolean): Unit = js.native
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the current joint translation speed, usually in meters per second.
      * @return Joint speed.
      **/
    /* CompleteClass */
    override def GetJointSpeed(): Double = js.native
    
    /**
      * Get the current joint translation, usually in meters.
      * @return Joint translation.
      **/
    /* CompleteClass */
    override def GetJointTranslation(): Double = js.native
    
    /**
      * Get the lower joint limit, usually in meters.
      * @return Lower limit.
      **/
    /* CompleteClass */
    override def GetLowerLimit(): Double = js.native
    
    /**
      * Get the maximum motor force, usually in N.
      * @return Max motor force.
      **/
    /* CompleteClass */
    override def GetMaxMotorForce(): Double = js.native
    
    /**
      * Get the current motor force, usually in N.
      * @return Motor force.
      **/
    /* CompleteClass */
    override def GetMotorForce(): Double = js.native
    
    /**
      * Get the motor speed, usually in meters per second.
      * @return Motor speed.
      **/
    /* CompleteClass */
    override def GetMotorSpeed(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the upper joint limit, usually in meters.
      * @return Upper limit.
      **/
    /* CompleteClass */
    override def GetUpperLimit(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Is the joint limit enabled?
      * @return True if enabled otherwise false.
      **/
    /* CompleteClass */
    override def IsLimitEnabled(): Boolean = js.native
    
    /**
      * Is the joint motor enabled?
      * @return True if enabled, otherwise false.
      **/
    /* CompleteClass */
    override def IsMotorEnabled(): Boolean = js.native
    
    /**
      * Set the joint limits, usually in meters.
      * @param lower Lower limit.
      * @param upper Upper limit.
      **/
    /* CompleteClass */
    override def SetLimits(lower: Double, upper: Double): Unit = js.native
    
    /**
      * Set the maximum motor force, usually in N.
      * @param force New max motor force.
      **/
    /* CompleteClass */
    override def SetMaxMotorForce(force: Double): Unit = js.native
    
    /**
      * Set the motor speed, usually in meters per second.
      * @param speed New motor speed.
      **/
    /* CompleteClass */
    override def SetMotorSpeed(speed: Double): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2LineJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2LineJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2LineJointDef {
    
    /**
      * Initialize the bodies, anchors, and length using the world anchors.
      * @param bA Body A.
      * @param bB Body B.
      * @param anchor Anchor.
      * @param axis Axis.
      **/
    /* CompleteClass */
    override def Initialize(
      bA: typings.box2d.Box2D.Dynamics.b2Body,
      bB: typings.box2d.Box2D.Dynamics.b2Body,
      anchor: b2Vec2,
      axis: b2Vec2
    ): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * Enable/disable the joint limit.
      **/
    /* CompleteClass */
    var enableLimit: Boolean = js.native
    
    /**
      * Enable/disable the joint motor.
      **/
    /* CompleteClass */
    var enableMotor: Boolean = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The local translation axis in bodyA.
      **/
    /* CompleteClass */
    var localAxisA: b2Vec2 = js.native
    
    /**
      * The lower translation limit, usually in meters.
      **/
    /* CompleteClass */
    var lowerTranslation: Double = js.native
    
    /**
      * The maximum motor torque, usually in N-m.
      **/
    /* CompleteClass */
    var maxMotorForce: Double = js.native
    
    /**
      * The desired motor speed in radians per second.
      **/
    /* CompleteClass */
    var motorSpeed: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The upper translation limit, usually in meters.
      **/
    /* CompleteClass */
    var upperTranslation: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2MouseJoint")
  @js.native
  open class b2MouseJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2MouseJoint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Gets the damping ratio.
      * @return Damping ratio.
      **/
    /* CompleteClass */
    override def GetDampingRatio(): Double = js.native
    
    /**
      * Gets the frequency.
      * @return Frequency.
      **/
    /* CompleteClass */
    override def GetFrequency(): Double = js.native
    
    /**
      * Gets the max force.
      * @return Max force.
      **/
    /* CompleteClass */
    override def GetMaxForce(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Gets the target.
      * @return Target.
      **/
    /* CompleteClass */
    override def GetTarget(): b2Vec2 = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Sets the damping ratio.
      * @param ratio New damping ratio.
      **/
    /* CompleteClass */
    override def SetDampingRatio(ratio: Double): Unit = js.native
    
    /**
      * Sets the frequency.
      * @param hz New frequency (hertz).
      **/
    /* CompleteClass */
    override def SetFrequency(hz: Double): Unit = js.native
    
    /**
      * Sets the max force.
      * @param maxForce New max force.
      **/
    /* CompleteClass */
    override def SetMaxForce(maxForce: Double): Unit = js.native
    
    /**
      * Use this to update the target point.
      * @param target New target.
      **/
    /* CompleteClass */
    override def SetTarget(target: b2Vec2): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2MouseJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2MouseJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2MouseJointDef {
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The damping ratio. 0 = no damping, 1 = critical damping.
      **/
    /* CompleteClass */
    var dampingRatio: Double = js.native
    
    /**
      * The response speed.
      **/
    /* CompleteClass */
    var frequencyHz: Double = js.native
    
    /**
      * The maximum constraint force that can be exerted to move the candidate body.
      **/
    /* CompleteClass */
    var maxForce: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2PrismaticJoint")
  @js.native
  open class b2PrismaticJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2PrismaticJoint {
    
    /**
      * Enable/disable the joint limit.
      * @param flag True to enable, false to disable.
      **/
    /* CompleteClass */
    override def EnableLimit(flag: Boolean): Unit = js.native
    
    /**
      * Enable/disable the joint motor.
      * @param flag True to enable, false to disable.
      **/
    /* CompleteClass */
    override def EnableMotor(flag: Boolean): Unit = js.native
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the current joint translation speed, usually in meters per second.
      * @return Joint speed.
      **/
    /* CompleteClass */
    override def GetJointSpeed(): Double = js.native
    
    /**
      * Get the current joint translation, usually in meters.
      * @return Joint translation.
      **/
    /* CompleteClass */
    override def GetJointTranslation(): Double = js.native
    
    /**
      * Get the lower joint limit, usually in meters.
      * @return Lower limit.
      **/
    /* CompleteClass */
    override def GetLowerLimit(): Double = js.native
    
    /**
      * Get the current motor force, usually in N.
      * @return Motor force.
      **/
    /* CompleteClass */
    override def GetMotorForce(): Double = js.native
    
    /**
      * Get the motor speed, usually in meters per second.
      * @return Motor speed.
      **/
    /* CompleteClass */
    override def GetMotorSpeed(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the upper joint limit, usually in meters.
      * @return Upper limit.
      **/
    /* CompleteClass */
    override def GetUpperLimit(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Is the joint limit enabled?
      * @return True if enabled otherwise false.
      **/
    /* CompleteClass */
    override def IsLimitEnabled(): Boolean = js.native
    
    /**
      * Is the joint motor enabled?
      * @return True if enabled, otherwise false.
      **/
    /* CompleteClass */
    override def IsMotorEnabled(): Boolean = js.native
    
    /**
      * Set the joint limits, usually in meters.
      * @param lower Lower limit.
      * @param upper Upper limit.
      **/
    /* CompleteClass */
    override def SetLimits(lower: Double, upper: Double): Unit = js.native
    
    /**
      * Set the maximum motor force, usually in N.
      * @param force New max force.
      **/
    /* CompleteClass */
    override def SetMaxMotorForce(force: Double): Unit = js.native
    
    /**
      * Set the motor speed, usually in meters per second.
      * @param speed New motor speed.
      **/
    /* CompleteClass */
    override def SetMotorSpeed(speed: Double): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2PrismaticJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2PrismaticJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2PrismaticJointDef {
    
    /**
      * Initialize the joint.
      * @param bA Body A.
      * @param bB Body B.
      * @param anchor Anchor.
      * @param axis Axis.
      **/
    /* CompleteClass */
    override def Initialize(
      bA: typings.box2d.Box2D.Dynamics.b2Body,
      bB: typings.box2d.Box2D.Dynamics.b2Body,
      anchor: b2Vec2,
      axis: b2Vec2
    ): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * Enable/disable the joint limit.
      **/
    /* CompleteClass */
    var enableLimit: Boolean = js.native
    
    /**
      * Enable/disable the joint motor.
      **/
    /* CompleteClass */
    var enableMotor: Boolean = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The local translation axis in body1.
      **/
    /* CompleteClass */
    var localAxisA: b2Vec2 = js.native
    
    /**
      * The lower translation limit, usually in meters.
      **/
    /* CompleteClass */
    var lowerTranslation: Double = js.native
    
    /**
      * The maximum motor torque, usually in N-m.
      **/
    /* CompleteClass */
    var maxMotorForce: Double = js.native
    
    /**
      * The desired motor speed in radians per second.
      **/
    /* CompleteClass */
    var motorSpeed: Double = js.native
    
    /**
      * The constrained angle between the bodies: bodyB_angle - bodyA_angle.
      **/
    /* CompleteClass */
    var referenceAngle: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The upper translation limit, usually in meters.
      **/
    /* CompleteClass */
    var upperTranslation: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2PulleyJoint")
  @js.native
  open class b2PulleyJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2PulleyJoint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the first ground anchor.
      **/
    /* CompleteClass */
    override def GetGroundAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the second ground anchor.
      **/
    /* CompleteClass */
    override def GetGroundAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the current length of the segment attached to body1.
      **/
    /* CompleteClass */
    override def GetLength1(): Double = js.native
    
    /**
      * Get the current length of the segment attached to body2.
      **/
    /* CompleteClass */
    override def GetLength2(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the pulley ratio.
      **/
    /* CompleteClass */
    override def GetRatio(): Double = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2PulleyJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2PulleyJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2PulleyJointDef {
    
    /**
      * Initialize the bodies, anchors, and length using the world anchors.
      * @param bA Body A.
      * @param bB Body B.
      * @param gaA Ground anchor A.
      * @param gaB Ground anchor B.
      * @param anchorA Anchor A.
      * @param anchorB Anchor B.
      **/
    /* CompleteClass */
    override def Initialize(
      bA: typings.box2d.Box2D.Dynamics.b2Body,
      bB: typings.box2d.Box2D.Dynamics.b2Body,
      gaA: b2Vec2,
      gaB: b2Vec2,
      anchorA: b2Vec2,
      anchorB: b2Vec2
    ): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The first ground anchor in world coordinates. This point never moves.
      **/
    /* CompleteClass */
    var groundAnchorA: b2Vec2 = js.native
    
    /**
      * The second ground anchor in world coordinates. This point never moves.
      **/
    /* CompleteClass */
    var groundAnchorB: b2Vec2 = js.native
    
    /**
      * The a reference length for the segment attached to bodyA.
      **/
    /* CompleteClass */
    var lengthA: Double = js.native
    
    /**
      * The a reference length for the segment attached to bodyB.
      **/
    /* CompleteClass */
    var lengthB: Double = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The maximum length of the segment attached to bodyA.
      **/
    /* CompleteClass */
    var maxLengthA: Double = js.native
    
    /**
      * The maximum length of the segment attached to bodyB.
      **/
    /* CompleteClass */
    var maxLengthB: Double = js.native
    
    /**
      * The pulley ratio, used to simulate a block-and-tackle.
      **/
    /* CompleteClass */
    var ratio: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2RevoluteJoint")
  @js.native
  open class b2RevoluteJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2RevoluteJoint {
    
    /**
      * Enable/disable the joint limit.
      * @param flag True to enable, false to disable.
      **/
    /* CompleteClass */
    override def EnableLimit(flag: Boolean): Unit = js.native
    
    /**
      * Enable/disable the joint motor.
      * @param flag True to enable, false to diasable.
      **/
    /* CompleteClass */
    override def EnableMotor(flag: Boolean): Unit = js.native
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the current joint angle in radians.
      * @return Joint angle.
      **/
    /* CompleteClass */
    override def GetJointAngle(): Double = js.native
    
    /**
      * Get the current joint angle speed in radians per second.
      * @return Joint speed.
      **/
    /* CompleteClass */
    override def GetJointSpeed(): Double = js.native
    
    /**
      * Get the lower joint limit in radians.
      * @return Lower limit.
      **/
    /* CompleteClass */
    override def GetLowerLimit(): Double = js.native
    
    /**
      * Get the motor speed in radians per second.
      * @return Motor speed.
      **/
    /* CompleteClass */
    override def GetMotorSpeed(): Double = js.native
    
    /**
      * Get the current motor torque, usually in N-m.
      * @return Motor torque.
      **/
    /* CompleteClass */
    override def GetMotorTorque(): Double = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the upper joint limit in radians.
      * @return Upper limit.
      **/
    /* CompleteClass */
    override def GetUpperLimit(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Is the joint limit enabled?
      * @return True if enabled, false if disabled.
      **/
    /* CompleteClass */
    override def IsLimitEnabled(): Boolean = js.native
    
    /**
      * Is the joint motor enabled?
      * @return True if enabled, false if disabled.
      **/
    /* CompleteClass */
    override def IsMotorEnabled(): Boolean = js.native
    
    /**
      * Set the joint limits in radians.
      * @param lower New lower limit.
      * @param upper New upper limit.
      **/
    /* CompleteClass */
    override def SetLimits(lower: Double, upper: Double): Unit = js.native
    
    /**
      * Set the maximum motor torque, usually in N-m.
      * @param torque New max torque.
      **/
    /* CompleteClass */
    override def SetMaxMotorTorque(torque: Double): Unit = js.native
    
    /**
      * Set the motor speed in radians per second.
      * @param speed New motor speed.
      **/
    /* CompleteClass */
    override def SetMotorSpeed(speed: Double): Unit = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2RevoluteJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2RevoluteJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2RevoluteJointDef {
    
    /**
      * Initialize the bodies, achors, and reference angle using the world anchor.
      * @param bA Body A.
      * @param bB Body B.
      * @param anchor Anchor.
      **/
    /* CompleteClass */
    override def Initialize(bA: typings.box2d.Box2D.Dynamics.b2Body, bB: typings.box2d.Box2D.Dynamics.b2Body, anchor: b2Vec2): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * A flag to enable joint limits.
      **/
    /* CompleteClass */
    var enableLimit: Boolean = js.native
    
    /**
      * A flag to enable the joint motor.
      **/
    /* CompleteClass */
    var enableMotor: Boolean = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The lower angle for the joint limit (radians).
      **/
    /* CompleteClass */
    var lowerAngle: Double = js.native
    
    /**
      * The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
      **/
    /* CompleteClass */
    var maxMotorTorque: Double = js.native
    
    /**
      * The desired motor speed. Usually in radians per second.
      **/
    /* CompleteClass */
    var motorSpeed: Double = js.native
    
    /**
      * The bodyB angle minus bodyA angle in the reference state (radians).
      **/
    /* CompleteClass */
    var referenceAngle: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The upper angle for the joint limit (radians).
      **/
    /* CompleteClass */
    var upperAngle: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2WeldJoint")
  @js.native
  open class b2WeldJoint ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2WeldJoint {
    
    /**
      * Get the anchor point on bodyA in world coordinates.
      * @return Anchor A point.
      **/
    /* CompleteClass */
    override def GetAnchorA(): b2Vec2 = js.native
    
    /**
      * Get the anchor point on bodyB in world coordinates.
      * @return Anchor B point.
      **/
    /* CompleteClass */
    override def GetAnchorB(): b2Vec2 = js.native
    
    /**
      * Get the first body attached to this joint.
      * @return Body A.
      **/
    /* CompleteClass */
    override def GetBodyA(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the second body attached to this joint.
      * @return Body B.
      **/
    /* CompleteClass */
    override def GetBodyB(): typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Get the next joint the world joint list.
      * @return Next joint.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Joints.b2Joint = js.native
    
    /**
      * Get the reaction force on body2 at the joint anchor in Newtons.
      * @param inv_dt
      * @return Reaction force (N)
      **/
    /* CompleteClass */
    override def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
    
    /**
      * Get the reaction torque on body2 in N.
      * @param inv_dt
      * @return Reaction torque (N).
      **/
    /* CompleteClass */
    override def GetReactionTorque(inv_dt: Double): Double = js.native
    
    /**
      * Get the type of the concrete joint.
      * @return Joint type.
      **/
    /* CompleteClass */
    override def GetType(): Double = js.native
    
    /**
      * Get the user data pointer.
      * @return User data.  Cast to your data type.
      **/
    /* CompleteClass */
    override def GetUserData(): Any = js.native
    
    /**
      * Short-cut function to determine if either body is inactive.
      * @return True if active, otherwise false.
      **/
    /* CompleteClass */
    override def IsActive(): Boolean = js.native
    
    /**
      * Set the user data pointer.
      * @param data Your custom data.
      **/
    /* CompleteClass */
    override def SetUserData(data: Any): Unit = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Joints.b2WeldJointDef")
  @js.native
  /**
    * Constructor.
    **/
  open class b2WeldJointDef ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Joints.b2WeldJointDef {
    
    /**
      * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
      * @param bA Body A.
      * @param bB Body B.
      * @param anchor Anchor.
      **/
    /* CompleteClass */
    override def Initialize(bA: typings.box2d.Box2D.Dynamics.b2Body, bB: typings.box2d.Box2D.Dynamics.b2Body, anchor: b2Vec2): Unit = js.native
    
    /**
      * The first attached body.
      **/
    /* CompleteClass */
    var bodyA: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * The second attached body.
      **/
    /* CompleteClass */
    var bodyB: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Set this flag to true if the attached bodies should collide.
      **/
    /* CompleteClass */
    var collideConnected: Boolean = js.native
    
    /**
      * The local anchor point relative to body1's origin.
      **/
    /* CompleteClass */
    var localAnchorA: b2Vec2 = js.native
    
    /**
      * The local anchor point relative to body2's origin.
      **/
    /* CompleteClass */
    var localAnchorB: b2Vec2 = js.native
    
    /**
      * The body2 angle minus body1 angle in the reference state (radians).
      **/
    /* CompleteClass */
    var referenceAngle: Double = js.native
    
    /**
      * The joint type is set automatically for concrete joint types.
      **/
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * Use this to attach application specific data to your joints.
      **/
    /* CompleteClass */
    var userData: Any = js.native
  }
}
