package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2Segment")
@js.native
class b2Segment ()
  extends typings.box2d.Box2D.Collision.b2Segment {
  /**
    * The starting point.
    **/
  /* CompleteClass */
  override var p1: b2Vec2 = js.native
  /**
    * The ending point.
    **/
  /* CompleteClass */
  override var p2: b2Vec2 = js.native
  /**
    * Extends or clips the segment so that it's ends lie on the boundary of the AABB.
    * @param aabb AABB to extend/clip the segement.
    **/
  /* CompleteClass */
  override def Extend(aabb: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
  /**
    * See Extend, this works on the ending point.
    * @param aabb AABB to extend/clip the ending point.
    **/
  /* CompleteClass */
  override def ExtendBackward(aabb: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
  /**
    * See Extend, this works on the starting point.
    * @param aabb AABB to extend/clip the starting point.
    **/
  /* CompleteClass */
  override def ExtendForward(aabb: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
  /**
    * Ray cast against this segment with another segment.
    * @param lambda returns the hit fraction. You can use this to compute the contact point * p = (1 - lambda) * segment.p1 + lambda * segment.p2 * @normal Normal at the contact point.  If there is no intersection, the normal is not set.
    * @param segment Defines the begining and end point of the ray cast.
    * @param maxLambda a number typically in the range [0,1].
    * @return True if there is an intersection, otherwise false.
    **/
  /* CompleteClass */
  override def TestSegment(
    lambda: js.Array[Double],
    normal: b2Vec2,
    segment: typings.box2d.Box2D.Collision.b2Segment,
    maxLambda: Double
  ): Boolean = js.native
}

