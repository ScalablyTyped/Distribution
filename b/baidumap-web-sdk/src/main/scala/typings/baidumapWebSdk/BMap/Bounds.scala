package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends StObject {
  
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
    equals_ : Bounds => Boolean,
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
    val __obj = js.Dynamic.literal(containsBounds = js.Any.fromFunction1(containsBounds), containsPoint = js.Any.fromFunction1(containsPoint), extend = js.Any.fromFunction1(extend), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction0(isEmpty), maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], toSpan = js.Any.fromFunction0(toSpan))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsBounds(value: Bounds => Boolean): Self = StObject.set(x, "containsBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsPoint(value: Point => Boolean): Self = StObject.set(x, "containsPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_(value: Bounds => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: Point => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenter(value: () => Point): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorthEast(value: () => Point): Self = StObject.set(x, "getNorthEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouthWest(value: () => Point): Self = StObject.set(x, "getSouthWest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersects(value: Bounds => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToSpan(value: () => Point): Self = StObject.set(x, "toSpan", js.Any.fromFunction0(value))
  }
}
