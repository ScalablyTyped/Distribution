package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2Segment extends js.Object {
  
  /**
    * Extends or clips the segment so that it's ends lie on the boundary of the AABB.
    * @param aabb AABB to extend/clip the segement.
    **/
  def Extend(aabb: b2AABB): Unit = js.native
  
  /**
    * See Extend, this works on the ending point.
    * @param aabb AABB to extend/clip the ending point.
    **/
  def ExtendBackward(aabb: b2AABB): Unit = js.native
  
  /**
    * See Extend, this works on the starting point.
    * @param aabb AABB to extend/clip the starting point.
    **/
  def ExtendForward(aabb: b2AABB): Unit = js.native
  
  /**
    * Ray cast against this segment with another segment.
    * @param lambda returns the hit fraction. You can use this to compute the contact point * p = (1 - lambda) * segment.p1 + lambda * segment.p2 * @normal Normal at the contact point.  If there is no intersection, the normal is not set.
    * @param segment Defines the begining and end point of the ray cast.
    * @param maxLambda a number typically in the range [0,1].
    * @return True if there is an intersection, otherwise false.
    **/
  def TestSegment(lambda: js.Array[Double], normal: b2Vec2, segment: b2Segment, maxLambda: Double): Boolean = js.native
  
  /**
    * The starting point.
    **/
  var p1: b2Vec2 = js.native
  
  /**
    * The ending point.
    **/
  var p2: b2Vec2 = js.native
}
object b2Segment {
  
  @scala.inline
  def apply(
    Extend: b2AABB => Unit,
    ExtendBackward: b2AABB => Unit,
    ExtendForward: b2AABB => Unit,
    TestSegment: (js.Array[Double], b2Vec2, b2Segment, Double) => Boolean,
    p1: b2Vec2,
    p2: b2Vec2
  ): b2Segment = {
    val __obj = js.Dynamic.literal(Extend = js.Any.fromFunction1(Extend), ExtendBackward = js.Any.fromFunction1(ExtendBackward), ExtendForward = js.Any.fromFunction1(ExtendForward), TestSegment = js.Any.fromFunction4(TestSegment), p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Segment]
  }
  
  @scala.inline
  implicit class b2SegmentOps[Self <: b2Segment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtend(value: b2AABB => Unit): Self = this.set("Extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendBackward(value: b2AABB => Unit): Self = this.set("ExtendBackward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendForward(value: b2AABB => Unit): Self = this.set("ExtendForward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTestSegment(value: (js.Array[Double], b2Vec2, b2Segment, Double) => Boolean): Self = this.set("TestSegment", js.Any.fromFunction4(value))
    
    @scala.inline
    def setP1(value: b2Vec2): Self = this.set("p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: b2Vec2): Self = this.set("p2", value.asInstanceOf[js.Any])
  }
}
