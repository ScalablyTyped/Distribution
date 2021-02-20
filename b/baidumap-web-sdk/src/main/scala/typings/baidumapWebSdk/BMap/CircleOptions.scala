package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleOptions extends StObject {
  
  var enableClicking: js.UndefOr[Boolean] = js.native
  
  var enableEditing: js.UndefOr[Boolean] = js.native
  
  var enableMassClear: js.UndefOr[Boolean] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
  
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  var strokeStyle: js.UndefOr[String] = js.native
  
  var strokeWeight: js.UndefOr[Double] = js.native
}
object CircleOptions {
  
  @scala.inline
  def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleOptions]
  }
  
  @scala.inline
  implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableClicking(value: Boolean): Self = StObject.set(x, "enableClicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableClickingUndefined: Self = StObject.set(x, "enableClicking", js.undefined)
    
    @scala.inline
    def setEnableEditing(value: Boolean): Self = StObject.set(x, "enableEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEditingUndefined: Self = StObject.set(x, "enableEditing", js.undefined)
    
    @scala.inline
    def setEnableMassClear(value: Boolean): Self = StObject.set(x, "enableMassClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMassClearUndefined: Self = StObject.set(x, "enableMassClear", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
