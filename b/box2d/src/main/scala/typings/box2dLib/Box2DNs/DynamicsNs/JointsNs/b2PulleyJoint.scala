package typings
package box2dLib.Box2DNs.DynamicsNs.JointsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2PulleyJoint")
@js.native
class b2PulleyJoint () extends b2Joint {
  /**
  		* Get the first ground anchor.
  		**/
  def GetGroundAnchorA(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the second ground anchor.
  		**/
  def GetGroundAnchorB(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the current length of the segment attached to body1.
  		**/
  def GetLength1(): scala.Double = js.native
  /**
  		* Get the current length of the segment attached to body2.
  		**/
  def GetLength2(): scala.Double = js.native
  /**
  		* Get the pulley ratio.
  		**/
  def GetRatio(): scala.Double = js.native
}

