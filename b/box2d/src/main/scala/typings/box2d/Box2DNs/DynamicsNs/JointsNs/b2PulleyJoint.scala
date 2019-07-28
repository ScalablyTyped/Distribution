package typings.box2d.Box2DNs.DynamicsNs.JointsNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PulleyJoint")
@js.native
class b2PulleyJoint () extends b2Joint {
  /**
  		* Get the first ground anchor.
  		**/
  def GetGroundAnchorA(): b2Vec2 = js.native
  /**
  		* Get the second ground anchor.
  		**/
  def GetGroundAnchorB(): b2Vec2 = js.native
  /**
  		* Get the current length of the segment attached to body1.
  		**/
  def GetLength1(): Double = js.native
  /**
  		* Get the current length of the segment attached to body2.
  		**/
  def GetLength2(): Double = js.native
  /**
  		* Get the pulley ratio.
  		**/
  def GetRatio(): Double = js.native
}

