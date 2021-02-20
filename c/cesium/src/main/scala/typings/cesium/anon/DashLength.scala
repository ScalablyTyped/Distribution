package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashLength extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var dashLength: js.UndefOr[Property] = js.native
  
  var dashPattern: js.UndefOr[Property] = js.native
  
  var gapColor: js.UndefOr[typings.cesium.mod.Color] = js.native
}
object DashLength {
  
  @scala.inline
  def apply(): DashLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashLength]
  }
  
  @scala.inline
  implicit class DashLengthMutableBuilder[Self <: DashLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDashLength(value: Property): Self = StObject.set(x, "dashLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashLengthUndefined: Self = StObject.set(x, "dashLength", js.undefined)
    
    @scala.inline
    def setDashPattern(value: Property): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPatternUndefined: Self = StObject.set(x, "dashPattern", js.undefined)
    
    @scala.inline
    def setGapColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "gapColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapColorUndefined: Self = StObject.set(x, "gapColor", js.undefined)
  }
}
