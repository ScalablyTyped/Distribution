package typings.cesium.anon

import typings.cesium.mod.Property
import typings.cesium.mod.StripeOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OddColor extends StObject {
  
  var evenColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var oddColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var offset: js.UndefOr[Property | Double] = js.undefined
  
  var orientation: js.UndefOr[Property | StripeOrientation] = js.undefined
  
  var repeat: js.UndefOr[Property | Double] = js.undefined
}
object OddColor {
  
  inline def apply(): OddColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OddColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OddColor] (val x: Self) extends AnyVal {
    
    inline def setEvenColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "evenColor", value.asInstanceOf[js.Any])
    
    inline def setEvenColorUndefined: Self = StObject.set(x, "evenColor", js.undefined)
    
    inline def setOddColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "oddColor", value.asInstanceOf[js.Any])
    
    inline def setOddColorUndefined: Self = StObject.set(x, "oddColor", js.undefined)
    
    inline def setOffset(value: Property | Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrientation(value: Property | StripeOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRepeat(value: Property | Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
