package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvenColor extends StObject {
  
  var evenColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var oddColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var repeat: js.UndefOr[Property] = js.undefined
}
object EvenColor {
  
  inline def apply(): EvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvenColor]
  }
  
  extension [Self <: EvenColor](x: Self) {
    
    inline def setEvenColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "evenColor", value.asInstanceOf[js.Any])
    
    inline def setEvenColorUndefined: Self = StObject.set(x, "evenColor", js.undefined)
    
    inline def setOddColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "oddColor", value.asInstanceOf[js.Any])
    
    inline def setOddColorUndefined: Self = StObject.set(x, "oddColor", js.undefined)
    
    inline def setRepeat(value: Property): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
