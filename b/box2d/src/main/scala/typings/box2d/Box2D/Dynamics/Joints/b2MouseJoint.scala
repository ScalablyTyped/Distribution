package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
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
  def GetDampingRatio(): Double = js.native
  /**
  		* Gets the frequency.
  		* @return Frequency.
  		**/
  def GetFrequency(): Double = js.native
  /**
  		* Gets the max force.
  		* @return Max force.
  		**/
  def GetMaxForce(): Double = js.native
  /**
  		* Gets the target.
  		* @return Target.
  		**/
  def GetTarget(): b2Vec2 = js.native
  /**
  		* Sets the damping ratio.
  		* @param ratio New damping ratio.
  		**/
  def SetDampingRatio(ratio: Double): Unit = js.native
  /**
  		* Sets the frequency.
  		* @param hz New frequency (hertz).
  		**/
  def SetFrequency(hz: Double): Unit = js.native
  /**
  		* Sets the max force.
  		* @param maxForce New max force.
  		**/
  def SetMaxForce(maxForce: Double): Unit = js.native
  /**
  		* Use this to update the target point.
  		* @param target New target.
  		**/
  def SetTarget(target: b2Vec2): Unit = js.native
}

