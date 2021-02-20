package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaLabelOptions extends StObject {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Point] = js.native
}
object PanoramaLabelOptions {
  
  @scala.inline
  def apply(): PanoramaLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaLabelOptions]
  }
  
  @scala.inline
  implicit class PanoramaLabelOptionsMutableBuilder[Self <: PanoramaLabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
