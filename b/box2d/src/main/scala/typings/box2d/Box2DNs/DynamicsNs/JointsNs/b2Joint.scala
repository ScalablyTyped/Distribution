package typings.box2d.Box2DNs.DynamicsNs.JointsNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import typings.box2d.Box2DNs.DynamicsNs.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2Joint")
@js.native
class b2Joint () extends js.Object {
  /**
  		* Get the anchor point on bodyA in world coordinates.
  		* @return Anchor A point.
  		**/
  def GetAnchorA(): b2Vec2 = js.native
  /**
  		* Get the anchor point on bodyB in world coordinates.
  		* @return Anchor B point.
  		**/
  def GetAnchorB(): b2Vec2 = js.native
  /**
  		* Get the first body attached to this joint.
  		* @return Body A.
  		**/
  def GetBodyA(): b2Body = js.native
  /**
  		* Get the second body attached to this joint.
  		* @return Body B.
  		**/
  def GetBodyB(): b2Body = js.native
  /**
  		* Get the next joint the world joint list.
  		* @return Next joint.
  		**/
  def GetNext(): b2Joint = js.native
  /**
  		* Get the reaction force on body2 at the joint anchor in Newtons.
  		* @param inv_dt
  		* @return Reaction force (N)
  		**/
  def GetReactionForce(inv_dt: Double): b2Vec2 = js.native
  /**
  		* Get the reaction torque on body2 in N.
  		* @param inv_dt
  		* @return Reaction torque (N).
  		**/
  def GetReactionTorque(inv_dt: Double): Double = js.native
  /**
  		* Get the type of the concrete joint.
  		* @return Joint type.
  		**/
  def GetType(): Double = js.native
  /**
  		* Get the user data pointer.
  		* @return User data.  Cast to your data type.
  		**/
  def GetUserData(): js.Any = js.native
  /**
  		* Short-cut function to determine if either body is inactive.
  		* @return True if active, otherwise false.
  		**/
  def IsActive(): Boolean = js.native
  /**
  		* Set the user data pointer.
  		* @param data Your custom data.
  		**/
  def SetUserData(data: js.Any): Unit = js.native
}

