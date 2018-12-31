package typings
package box2dLib.Box2DNs.CollisionNs.ShapesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Shapes.b2CircleShape")
@js.native
/**
		* Creates a new circle shape.
		* @param radius Circle radius.
		**/
class b2CircleShape () extends b2Shape {
  def this(radius: scala.Double) = this()
  /**
  		* Get the local position of this circle in its parent body.
  		* @return This circle's local position.
  		**/
  def GetLocalPosition(): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Get the radius of the circle.
  		* @return This circle's radius.
  		**/
  def GetRadius(): scala.Double = js.native
  /**
  		* Set the circle shape values from another shape.
  		* @param other The other circle shape to copy values from.
  		**/
  def Set(other: b2CircleShape): scala.Unit = js.native
  /**
  		* Set the local position of this circle in its parent body.
  		* @param position The new local position of this circle.
  		**/
  def SetLocalPosition(position: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Unit = js.native
  /**
  		* Set the radius of the circle.
  		* @param radius The new radius of the circle.
  		**/
  def SetRadius(radius: scala.Double): scala.Unit = js.native
}

