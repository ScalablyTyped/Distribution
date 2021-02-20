package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderDataPointOptions extends StObject {
  
  var fillOpacity: Double = js.native
  
  var radius: Double = js.native
  
  var strokeOpacity: Double = js.native
}
object RenderDataPointOptions {
  
  @scala.inline
  def apply(fillOpacity: Double, radius: Double, strokeOpacity: Double): RenderDataPointOptions = {
    val __obj = js.Dynamic.literal(fillOpacity = fillOpacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderDataPointOptions]
  }
  
  @scala.inline
  implicit class RenderDataPointOptionsMutableBuilder[Self <: RenderDataPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
  }
}
