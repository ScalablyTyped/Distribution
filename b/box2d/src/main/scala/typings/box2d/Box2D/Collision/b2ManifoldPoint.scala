package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ManifoldPoint")
@js.native
/**
		* Creates a new manifold point.
		**/
class b2ManifoldPoint () extends js.Object {
  /**
  		* Contact ID.
  		**/
  var m_id: b2ContactID = js.native
  /**
  		* Local contact point.
  		**/
  var m_localpoint: b2Vec2 = js.native
  /**
  		* Normal impluse for this contact point.
  		**/
  var m_normalImpulse: Double = js.native
  /**
  		* Tangent impulse for contact point.
  		**/
  var m_tangentImpulse: Double = js.native
  /**
  		* Resets this manifold point.
  		**/
  def Reset(): Unit = js.native
  /**
  		* Sets this manifold point from a manifold point.
  		* @param m The manifold point to copy values from.
  		**/
  def Set(m: b2ManifoldPoint): Unit = js.native
}

