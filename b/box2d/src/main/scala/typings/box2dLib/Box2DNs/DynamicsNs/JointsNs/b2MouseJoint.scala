package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2MouseJoint")
@js.native
class b2MouseJoint () extends b2Joint {
  /**
  		* Gets the damping ratio.
  		* @return Damping ratio.
  		**/
  def GetDampingRatio(): scala.Double = js.native
  /**
  		* Gets the frequency.
  		* @return Frequency.
  		**/
  def GetFrequency(): scala.Double = js.native
  /**
  		* Gets the max force.
  		* @return Max force.
  		**/
  def GetMaxForce(): scala.Double = js.native
  /**
  		* Gets the target.
  		* @return Target.
  		**/
  def GetTarget(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Sets the damping ratio.
  		* @param ratio New damping ratio.
  		**/
  def SetDampingRatio(ratio: scala.Double): scala.Unit = js.native
  /**
  		* Sets the frequency.
  		* @param hz New frequency (hertz).
  		**/
  def SetFrequency(hz: scala.Double): scala.Unit = js.native
  /**
  		* Sets the max force.
  		* @param maxForce New max force.
  		**/
  def SetMaxForce(maxForce: scala.Double): scala.Unit = js.native
  /**
  		* Use this to update the target point.
  		* @param target New target.
  		**/
  def SetTarget(target: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Unit = js.native
}

