package typings.box2d.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Transform")
@js.native
class b2Transform protected () extends js.Object {
  /**
  		* The default constructor does nothing (for performance).
  		* @param pos Position
  		* @param r Rotation
  		**/
  def this(pos: b2Vec2, r: b2Mat22) = this()
  /**
  		* Transform rotation.
  		**/
  var R: b2Mat22 = js.native
  /**
  		* Transform position.
  		**/
  var position: b2Vec2 = js.native
  /**
  		* Calculate the angle that the rotation matrix represents.
  		* @return Rotation matrix angle.
  		**/
  def GetAngle(): Double = js.native
  /**
  		* Initialize using a position vector and rotation matrix.
  		* @param pos Position
  		* @param r Rotation
  		**/
  def Initialize(pos: b2Vec2, r: b2Mat22): Unit = js.native
  /**
  		* Sets the transfrom from a transfrom.
  		* @param x Transform to copy values from.
  		**/
  def Set(x: b2Transform): Unit = js.native
  /**
  		* Set this to the identity transform.
  		**/
  def SetIdentity(): Unit = js.native
}

