package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2Manifold")
@js.native
/**
		* Creates a new manifold.
		**/
class b2Manifold () extends js.Object {
  /**
  		* Not used for Type e_points
  		**/
  var m_localPlaneNormal: b2Vec2 = js.native
  /**
  		* Usage depends on manifold type
  		**/
  var m_localPoint: b2Vec2 = js.native
  /**
  		* The number of manifold points
  		**/
  var m_pointCount: Double = js.native
  /**
  		* The points of contact
  		**/
  var m_points: js.Array[b2ManifoldPoint] = js.native
  /**
  		* Manifold type.
  		**/
  var m_type: Double = js.native
  /**
  		* Copies the manifold.
  		* @return Copy of this manifold.
  		**/
  def Copy(): b2Manifold = js.native
  /**
  		* Resets this manifold.
  		**/
  def Reset(): Unit = js.native
  /**
  		* Sets this manifold from another manifold.
  		* @param m Manifold to copy values from.
  		**/
  def Set(m: b2Manifold): Unit = js.native
}

/* static members */
@JSGlobal("Box2D.Collision.b2Manifold")
@js.native
object b2Manifold extends js.Object {
  /**
  		* Circles
  		**/
  var e_circles: Double = js.native
  /**
  		* Face A
  		**/
  var e_faceA: Double = js.native
  /**
  		* Face B
  		**/
  var e_faceB: Double = js.native
}

