package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Transform extends js.Object {
  /**
    * Transform rotation.
    **/
  var R: b2Mat22
  /**
    * Transform position.
    **/
  var position: b2Vec2
  /**
    * Calculate the angle that the rotation matrix represents.
    * @return Rotation matrix angle.
    **/
  def GetAngle(): Double
  /**
    * Initialize using a position vector and rotation matrix.
    * @param pos Position
    * @param r Rotation
    **/
  def Initialize(pos: b2Vec2, r: b2Mat22): Unit
  /**
    * Sets the transfrom from a transfrom.
    * @param x Transform to copy values from.
    **/
  def Set(x: b2Transform): Unit
  /**
    * Set this to the identity transform.
    **/
  def SetIdentity(): Unit
}

object b2Transform {
  @scala.inline
  def apply(
    GetAngle: () => Double,
    Initialize: (b2Vec2, b2Mat22) => Unit,
    R: b2Mat22,
    Set: b2Transform => Unit,
    SetIdentity: () => Unit,
    position: b2Vec2
  ): b2Transform = {
    val __obj = js.Dynamic.literal(GetAngle = js.Any.fromFunction0(GetAngle), Initialize = js.Any.fromFunction2(Initialize), R = R.asInstanceOf[js.Any], Set = js.Any.fromFunction1(Set), SetIdentity = js.Any.fromFunction0(SetIdentity), position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Transform]
  }
}

