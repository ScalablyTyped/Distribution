package typings.box2d.global.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2GearJoint")
@js.native
class b2GearJoint ()
  extends typings.box2d.Box2D.Dynamics.Joints.b2GearJoint {
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
  override def GetBodyA(): b2Body = js.native
  /**
    * Get the second body attached to this joint.
    * @return Body B.
    **/
  /* CompleteClass */
  override def GetBodyB(): b2Body = js.native
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
  override def GetUserData(): js.Any = js.native
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
  override def SetUserData(data: js.Any): Unit = js.native
}

