package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends js.Object {
  
  def containsBounds(bounds: Bounds): Boolean = js.native
  
  def containsPoint(point: Point): Boolean = js.native
  
  def equals(other: Bounds): Boolean = js.native
  
  def extend(point: Point): Unit = js.native
  
  def getCenter(): Point = js.native
  
  def getNorthEast(): Point = js.native
  
  def getSouthWest(): Point = js.native
  
  def intersects(other: Bounds): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  var maxX: Double = js.native
  
  var maxY: Double = js.native
  
  var minX: Double = js.native
  
  var minY: Double = js.native
  
  def toSpan(): Point = js.native
}
object Bounds {
  
  @scala.inline
  def apply(
    containsBounds: Bounds => Boolean,
    containsPoint: Point => Boolean,
    equals: Bounds => Boolean,
    extend: Point => Unit,
    getCenter: () => Point,
    getNorthEast: () => Point,
    getSouthWest: () => Point,
    intersects: Bounds => Boolean,
    isEmpty: () => Boolean,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    toSpan: () => Point
  ): Bounds = {
    val __obj = js.Dynamic.literal(containsBounds = js.Any.fromFunction1(containsBounds), containsPoint = js.Any.fromFunction1(containsPoint), equals = js.Any.fromFunction1(equals), extend = js.Any.fromFunction1(extend), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], toSpan = js.Any.fromFunction0(toSpan))
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    
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
    def setContainsBounds(value: Bounds => Boolean): Self = this.set("containsBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsPoint(value: Point => Boolean): Self = this.set("containsPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: Bounds => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: Point => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenter(value: () => Point): Self = this.set("getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorthEast(value: () => Point): Self = this.set("getNorthEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouthWest(value: () => Point): Self = this.set("getSouthWest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersects(value: Bounds => Boolean): Self = this.set("intersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToSpan(value: () => Point): Self = this.set("toSpan", js.Any.fromFunction0(value))
  }
}
