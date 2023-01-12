package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvenColor extends StObject {
  
  var evenColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var oddColor: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var repeat: js.UndefOr[Property | Cartesian2] = js.undefined
}
object EvenColor {
  
  inline def apply(): EvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvenColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvenColor] (val x: Self) extends AnyVal {
    
    inline def setEvenColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "evenColor", value.asInstanceOf[js.Any])
    
    inline def setEvenColorUndefined: Self = StObject.set(x, "evenColor", js.undefined)
    
    inline def setOddColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "oddColor", value.asInstanceOf[js.Any])
    
    inline def setOddColorUndefined: Self = StObject.set(x, "oddColor", js.undefined)
    
    inline def setRepeat(value: Property | Cartesian2): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
