package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2AABB")
@js.native
class b2AABB ()
  extends typings.box2d.Box2D.Collision.b2AABB {
  /**
    * Lower bound.
    **/
  /* CompleteClass */
  override var lowerBound: b2Vec2 = js.native
  /**
    * Upper bound.
    **/
  /* CompleteClass */
  override var upperBound: b2Vec2 = js.native
  /**
    * Combines two AABBs into one with max values for upper bound and min values for lower bound.  The result is stored in this AABB.
    * @param aabb1 First AABB to combine.
    * @param aabb2 Second AABB to combine.
    **/
  /* CompleteClass */
  override def Combine(aabb1: typings.box2d.Box2D.Collision.b2AABB, aabb2: typings.box2d.Box2D.Collision.b2AABB): Unit = js.native
  /**
    * Determines if an AABB is contained within this one.
    * @param aabb AABB to see if it is contained.
    * @return True if aabb is contained, otherwise false.
    **/
  /* CompleteClass */
  override def Contains(aabb: typings.box2d.Box2D.Collision.b2AABB): Boolean = js.native
  /**
    * Gets the center of the AABB.
    * @return Center of this AABB.
    **/
  /* CompleteClass */
  override def GetCenter(): b2Vec2 = js.native
  /**
    * Gets the extents of the AABB (half-widths).
    * @return Extents of this AABB.
    **/
  /* CompleteClass */
  override def GetExtents(): b2Vec2 = js.native
  /**
    * Verify that the bounds are sorted.
    * @return True if the bounds are sorted, otherwise false.
    **/
  /* CompleteClass */
  override def IsValid(): Boolean = js.native
  /**
    * Perform a precise raycast against this AABB.
    * @param output Ray cast output values.
    * @param input Ray cast input values.
    * @return True if the ray cast hits this AABB, otherwise false.
    **/
  /* CompleteClass */
  override def RayCast(
    output: typings.box2d.Box2D.Collision.b2RayCastOutput,
    input: typings.box2d.Box2D.Collision.b2RayCastInput
  ): Boolean = js.native
  /**
    * Tests if another AABB overlaps this AABB.
    * @param other Other AABB to test for overlap.
    * @return True if other overlaps this AABB, otherwise false.
    **/
  /* CompleteClass */
  override def TestOverlap(other: typings.box2d.Box2D.Collision.b2AABB): Boolean = js.native
}

/* static members */
@JSGlobal("Box2D.Collision.b2AABB")
@js.native
object b2AABB extends js.Object {
  /**
    * Combines two AABBs into one with max values for upper bound and min values for lower bound.
    * @param aabb1 First AABB to combine.
    * @param aabb2 Second AABB to combine.
    * @return New AABB with max values from aabb1 and aabb2.
    **/
  def Combine(aabb1: typings.box2d.Box2D.Collision.b2AABB, aabb2: typings.box2d.Box2D.Collision.b2AABB): typings.box2d.Box2D.Collision.b2AABB = js.native
}

