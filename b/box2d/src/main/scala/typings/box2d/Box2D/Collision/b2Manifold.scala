package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Manifold extends js.Object {
  /**
    * Not used for Type e_points
    **/
  var m_localPlaneNormal: b2Vec2
  /**
    * Usage depends on manifold type
    **/
  var m_localPoint: b2Vec2
  /**
    * The number of manifold points
    **/
  var m_pointCount: Double
  /**
    * The points of contact
    **/
  var m_points: js.Array[b2ManifoldPoint]
  /**
    * Manifold type.
    **/
  var m_type: Double
  /**
    * Copies the manifold.
    * @return Copy of this manifold.
    **/
  def Copy(): b2Manifold
  /**
    * Resets this manifold.
    **/
  def Reset(): Unit
  /**
    * Sets this manifold from another manifold.
    * @param m Manifold to copy values from.
    **/
  def Set(m: b2Manifold): Unit
}

object b2Manifold {
  @scala.inline
  def apply(
    Copy: () => b2Manifold,
    Reset: () => Unit,
    Set: b2Manifold => Unit,
    m_localPlaneNormal: b2Vec2,
    m_localPoint: b2Vec2,
    m_pointCount: Double,
    m_points: js.Array[b2ManifoldPoint],
    m_type: Double
  ): b2Manifold = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), Reset = js.Any.fromFunction0(Reset), Set = js.Any.fromFunction1(Set), m_localPlaneNormal = m_localPlaneNormal.asInstanceOf[js.Any], m_localPoint = m_localPoint.asInstanceOf[js.Any], m_pointCount = m_pointCount.asInstanceOf[js.Any], m_points = m_points.asInstanceOf[js.Any], m_type = m_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Manifold]
  }
}

