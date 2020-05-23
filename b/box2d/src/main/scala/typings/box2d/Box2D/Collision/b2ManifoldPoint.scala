package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ManifoldPoint extends js.Object {
  /**
    * Contact ID.
    **/
  var m_id: b2ContactID
  /**
    * Local contact point.
    **/
  var m_localpoint: b2Vec2
  /**
    * Normal impluse for this contact point.
    **/
  var m_normalImpulse: Double
  /**
    * Tangent impulse for contact point.
    **/
  var m_tangentImpulse: Double
  /**
    * Resets this manifold point.
    **/
  def Reset(): Unit
  /**
    * Sets this manifold point from a manifold point.
    * @param m The manifold point to copy values from.
    **/
  def Set(m: b2ManifoldPoint): Unit
}

object b2ManifoldPoint {
  @scala.inline
  def apply(
    Reset: () => Unit,
    Set: b2ManifoldPoint => Unit,
    m_id: b2ContactID,
    m_localpoint: b2Vec2,
    m_normalImpulse: Double,
    m_tangentImpulse: Double
  ): b2ManifoldPoint = {
    val __obj = js.Dynamic.literal(Reset = js.Any.fromFunction0(Reset), Set = js.Any.fromFunction1(Set), m_id = m_id.asInstanceOf[js.Any], m_localpoint = m_localpoint.asInstanceOf[js.Any], m_normalImpulse = m_normalImpulse.asInstanceOf[js.Any], m_tangentImpulse = m_tangentImpulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ManifoldPoint]
  }
}

