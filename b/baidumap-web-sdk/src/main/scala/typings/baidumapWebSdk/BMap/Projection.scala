package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends StObject {
  
  def lngLatToPoint(lngLat: Point): Pixel = js.native
  
  def pointToLngLat(point: Pixel): Point = js.native
}
object Projection {
  
  @scala.inline
  def apply(lngLatToPoint: Point => Pixel, pointToLngLat: Pixel => Point): Projection = {
    val __obj = js.Dynamic.literal(lngLatToPoint = js.Any.fromFunction1(lngLatToPoint), pointToLngLat = js.Any.fromFunction1(pointToLngLat))
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLngLatToPoint(value: Point => Pixel): Self = StObject.set(x, "lngLatToPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointToLngLat(value: Pixel => Point): Self = StObject.set(x, "pointToLngLat", js.Any.fromFunction1(value))
  }
}
