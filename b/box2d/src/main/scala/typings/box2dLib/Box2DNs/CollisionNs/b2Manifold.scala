package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2Manifold")
@js.native
class b2Manifold () extends js.Object {
  /**
  		* Not used for Type e_points
  		**/
  var m_localPlaneNormal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Usage depends on manifold type
  		**/
  var m_localPoint: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The number of manifold points
  		**/
  var m_pointCount: scala.Double = js.native
  /**
  		* The points of contact
  		**/
  var m_points: js.Array[b2ManifoldPoint] = js.native
  /**
  		* Manifold type.
  		**/
  var m_type: scala.Double = js.native
  /**
  		* Copies the manifold.
  		* @return Copy of this manifold.
  		**/
  def Copy(): b2Manifold = js.native
  /**
  		* Resets this manifold.
  		**/
  def Reset(): scala.Unit = js.native
  /**
  		* Sets this manifold from another manifold.
  		* @param m Manifold to copy values from.
  		**/
  def Set(m: b2Manifold): scala.Unit = js.native
}

@JSGlobal("Box2D.Collision.b2Manifold")
@js.native
object b2Manifold extends js.Object {
  /**
  		* Circles
  		**/
  var e_circles: scala.Double = js.native
  /**
  		* Face A
  		**/
  var e_faceA: scala.Double = js.native
  /**
  		* Face B
  		**/
  var e_faceB: scala.Double = js.native
}

