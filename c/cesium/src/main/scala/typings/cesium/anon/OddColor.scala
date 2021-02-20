package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OddColor extends StObject {
  
  var evenColor: js.UndefOr[Property] = js.native
  
  var oddColor: js.UndefOr[Property] = js.native
  
  var offset: js.UndefOr[Property] = js.native
  
  var orientation: js.UndefOr[Property] = js.native
  
  var repeat: js.UndefOr[Property] = js.native
}
object OddColor {
  
  @scala.inline
  def apply(): OddColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OddColor]
  }
  
  @scala.inline
  implicit class OddColorMutableBuilder[Self <: OddColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvenColor(value: Property): Self = StObject.set(x, "evenColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenColorUndefined: Self = StObject.set(x, "evenColor", js.undefined)
    
    @scala.inline
    def setOddColor(value: Property): Self = StObject.set(x, "oddColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddColorUndefined: Self = StObject.set(x, "oddColor", js.undefined)
    
    @scala.inline
    def setOffset(value: Property): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrientation(value: Property): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setRepeat(value: Property): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
