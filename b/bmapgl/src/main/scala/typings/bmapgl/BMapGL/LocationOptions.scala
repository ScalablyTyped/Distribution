package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationOptions extends StObject {
  
  var numPois: js.UndefOr[Double] = js.native
  
  var poiRadius: js.UndefOr[Double] = js.native
}
object LocationOptions {
  
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit class LocationOptionsMutableBuilder[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumPois(value: Double): Self = StObject.set(x, "numPois", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumPoisUndefined: Self = StObject.set(x, "numPois", js.undefined)
    
    @scala.inline
    def setPoiRadius(value: Double): Self = StObject.set(x, "poiRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoiRadiusUndefined: Self = StObject.set(x, "poiRadius", js.undefined)
  }
}
