package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2Manifold")
@js.native
/**
  * Creates a new manifold.
  **/
class b2Manifold ()
  extends typings.box2d.Box2D.Collision.b2Manifold {
  /**
    * Not used for Type e_points
    **/
  /* CompleteClass */
  override var m_localPlaneNormal: b2Vec2 = js.native
  /**
    * Usage depends on manifold type
    **/
  /* CompleteClass */
  override var m_localPoint: b2Vec2 = js.native
  /**
    * The number of manifold points
    **/
  /* CompleteClass */
  override var m_pointCount: Double = js.native
  /**
    * The points of contact
    **/
  /* CompleteClass */
  override var m_points: js.Array[typings.box2d.Box2D.Collision.b2ManifoldPoint] = js.native
  /**
    * Manifold type.
    **/
  /* CompleteClass */
  override var m_type: Double = js.native
  /**
    * Copies the manifold.
    * @return Copy of this manifold.
    **/
  /* CompleteClass */
  override def Copy(): typings.box2d.Box2D.Collision.b2Manifold = js.native
  /**
    * Resets this manifold.
    **/
  /* CompleteClass */
  override def Reset(): Unit = js.native
  /**
    * Sets this manifold from another manifold.
    * @param m Manifold to copy values from.
    **/
  /* CompleteClass */
  override def Set(m: typings.box2d.Box2D.Collision.b2Manifold): Unit = js.native
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

