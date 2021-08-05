package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  def containsBounds(bounds: Bounds): Boolean
  
  def containsPoint(point: Point): Boolean
  
  def equals(other: Bounds): Boolean
  
  def extend(point: Point): Unit
  
  def getCenter(): Point
  
  def getNorthEast(): Point
  
  def getSouthWest(): Point
  
  def intersects(other: Bounds): Boolean
  
  def isEmpty(): Boolean
  
  var maxX: Double
  
  var maxY: Double
  
  var minX: Double
  
  var minY: Double
  
  def toSpan(): Point
}
object Bounds {
  
  inline def apply(
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
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setContainsBounds(value: Bounds => Boolean): Self = StObject.set(x, "containsBounds", js.Any.fromFunction1(value))
    
    inline def setContainsPoint(value: Point => Boolean): Self = StObject.set(x, "containsPoint", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: Bounds => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtend(value: Point => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setGetCenter(value: () => Point): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    inline def setGetNorthEast(value: () => Point): Self = StObject.set(x, "getNorthEast", js.Any.fromFunction0(value))
    
    inline def setGetSouthWest(value: () => Point): Self = StObject.set(x, "getSouthWest", js.Any.fromFunction0(value))
    
    inline def setIntersects(value: Bounds => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    inline def setToSpan(value: () => Point): Self = StObject.set(x, "toSpan", js.Any.fromFunction0(value))
  }
}
