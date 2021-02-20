package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWeightEnumValues extends EmbindEnum {
  
  var Black: FontWeight = js.native
  
  var Bold: FontWeight = js.native
  
  var ExtraBlack: FontWeight = js.native
  
  var ExtraBold: FontWeight = js.native
  
  var ExtraLight: FontWeight = js.native
  
  var Invisible: FontWeight = js.native
  
  var Light: FontWeight = js.native
  
  var Medium: FontWeight = js.native
  
  var Normal: FontWeight = js.native
  
  var SemiBold: FontWeight = js.native
  
  var Thin: FontWeight = js.native
}
object FontWeightEnumValues {
  
  @scala.inline
  def apply(
    Black: FontWeight,
    Bold: FontWeight,
    ExtraBlack: FontWeight,
    ExtraBold: FontWeight,
    ExtraLight: FontWeight,
    Invisible: FontWeight,
    Light: FontWeight,
    Medium: FontWeight,
    Normal: FontWeight,
    SemiBold: FontWeight,
    Thin: FontWeight,
    values: js.Array[Double]
  ): FontWeightEnumValues = {
    val __obj = js.Dynamic.literal(Black = Black.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], ExtraBlack = ExtraBlack.asInstanceOf[js.Any], ExtraBold = ExtraBold.asInstanceOf[js.Any], ExtraLight = ExtraLight.asInstanceOf[js.Any], Invisible = Invisible.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], SemiBold = SemiBold.asInstanceOf[js.Any], Thin = Thin.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightEnumValues]
  }
  
  @scala.inline
  implicit class FontWeightEnumValuesMutableBuilder[Self <: FontWeightEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlack(value: FontWeight): Self = StObject.set(x, "Black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: FontWeight): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraBlack(value: FontWeight): Self = StObject.set(x, "ExtraBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraBold(value: FontWeight): Self = StObject.set(x, "ExtraBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraLight(value: FontWeight): Self = StObject.set(x, "ExtraLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisible(value: FontWeight): Self = StObject.set(x, "Invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: FontWeight): Self = StObject.set(x, "Light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: FontWeight): Self = StObject.set(x, "Medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: FontWeight): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiBold(value: FontWeight): Self = StObject.set(x, "SemiBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThin(value: FontWeight): Self = StObject.set(x, "Thin", value.asInstanceOf[js.Any])
  }
}
