package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  def equals(other: Point): Boolean
  
  var lat: Double
  
  var lng: Double
}
object Point {
  
  @scala.inline
  def apply(equals_ : Point => Boolean, lat: Double, lng: Double): Point = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: Point => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
