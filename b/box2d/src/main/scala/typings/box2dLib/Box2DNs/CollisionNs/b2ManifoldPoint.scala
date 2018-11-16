package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ManifoldPoint")
@js.native
class b2ManifoldPoint () extends js.Object {
  /**
  		* Contact ID.
  		**/
  var m_id: b2ContactID = js.native
  /**
  		* Local contact point.
  		**/
  var m_localpoint: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Normal impluse for this contact point.
  		**/
  var m_normalImpulse: scala.Double = js.native
  /**
  		* Tangent impulse for contact point.
  		**/
  var m_tangentImpulse: scala.Double = js.native
  /**
  		* Resets this manifold point.
  		**/
  def Reset(): scala.Unit = js.native
  /**
  		* Sets this manifold point from a manifold point.
  		* @param m The manifold point to copy values from.
  		**/
  def Set(m: b2ManifoldPoint): scala.Unit = js.native
}

