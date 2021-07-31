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
  
  @scala.inline
  def apply(): EvenColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvenColor]
  }
  
  @scala.inline
  implicit class EvenColorMutableBuilder[Self <: EvenColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvenColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "evenColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenColorUndefined: Self = StObject.set(x, "evenColor", js.undefined)
    
    @scala.inline
    def setOddColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "oddColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddColorUndefined: Self = StObject.set(x, "oddColor", js.undefined)
    
    @scala.inline
    def setRepeat(value: Property): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
