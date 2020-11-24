package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendModeEnumValues extends EmbindEnum {
  
  var Clear: BlendMode = js.native
  
  var Color: BlendMode = js.native
  
  var ColorBurn: BlendMode = js.native
  
  var ColorDodge: BlendMode = js.native
  
  var Darken: BlendMode = js.native
  
  var Difference: BlendMode = js.native
  
  var Dst: BlendMode = js.native
  
  var DstATop: BlendMode = js.native
  
  var DstIn: BlendMode = js.native
  
  var DstOut: BlendMode = js.native
  
  var DstOver: BlendMode = js.native
  
  var Exclusion: BlendMode = js.native
  
  var HardLight: BlendMode = js.native
  
  var Hue: BlendMode = js.native
  
  var Lighten: BlendMode = js.native
  
  var Luminosity: BlendMode = js.native
  
  var Modulate: BlendMode = js.native
  
  var Multiply: BlendMode = js.native
  
  var Overlay: BlendMode = js.native
  
  var Plus: BlendMode = js.native
  
  var Saturation: BlendMode = js.native
  
  var Screen: BlendMode = js.native
  
  var SoftLight: BlendMode = js.native
  
  var Src: BlendMode = js.native
  
  var SrcATop: BlendMode = js.native
  
  var SrcIn: BlendMode = js.native
  
  var SrcOut: BlendMode = js.native
  
  var SrcOver: BlendMode = js.native
  
  var Xor: BlendMode = js.native
}
object BlendModeEnumValues {
  
  @scala.inline
  def apply(
    Clear: BlendMode,
    Color: BlendMode,
    ColorBurn: BlendMode,
    ColorDodge: BlendMode,
    Darken: BlendMode,
    Difference: BlendMode,
    Dst: BlendMode,
    DstATop: BlendMode,
    DstIn: BlendMode,
    DstOut: BlendMode,
    DstOver: BlendMode,
    Exclusion: BlendMode,
    HardLight: BlendMode,
    Hue: BlendMode,
    Lighten: BlendMode,
    Luminosity: BlendMode,
    Modulate: BlendMode,
    Multiply: BlendMode,
    Overlay: BlendMode,
    Plus: BlendMode,
    Saturation: BlendMode,
    Screen: BlendMode,
    SoftLight: BlendMode,
    Src: BlendMode,
    SrcATop: BlendMode,
    SrcIn: BlendMode,
    SrcOut: BlendMode,
    SrcOver: BlendMode,
    Xor: BlendMode,
    values: js.Array[Double]
  ): BlendModeEnumValues = {
    val __obj = js.Dynamic.literal(Clear = Clear.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorBurn = ColorBurn.asInstanceOf[js.Any], ColorDodge = ColorDodge.asInstanceOf[js.Any], Darken = Darken.asInstanceOf[js.Any], Difference = Difference.asInstanceOf[js.Any], Dst = Dst.asInstanceOf[js.Any], DstATop = DstATop.asInstanceOf[js.Any], DstIn = DstIn.asInstanceOf[js.Any], DstOut = DstOut.asInstanceOf[js.Any], DstOver = DstOver.asInstanceOf[js.Any], Exclusion = Exclusion.asInstanceOf[js.Any], HardLight = HardLight.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Lighten = Lighten.asInstanceOf[js.Any], Luminosity = Luminosity.asInstanceOf[js.Any], Modulate = Modulate.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Overlay = Overlay.asInstanceOf[js.Any], Plus = Plus.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Screen = Screen.asInstanceOf[js.Any], SoftLight = SoftLight.asInstanceOf[js.Any], Src = Src.asInstanceOf[js.Any], SrcATop = SrcATop.asInstanceOf[js.Any], SrcIn = SrcIn.asInstanceOf[js.Any], SrcOut = SrcOut.asInstanceOf[js.Any], SrcOver = SrcOver.asInstanceOf[js.Any], Xor = Xor.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendModeEnumValues]
  }
  
  @scala.inline
  implicit class BlendModeEnumValuesOps[Self <: BlendModeEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: BlendMode): Self = this.set("Clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: BlendMode): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorBurn(value: BlendMode): Self = this.set("ColorBurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorDodge(value: BlendMode): Self = this.set("ColorDodge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarken(value: BlendMode): Self = this.set("Darken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifference(value: BlendMode): Self = this.set("Difference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDst(value: BlendMode): Self = this.set("Dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstATop(value: BlendMode): Self = this.set("DstATop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstIn(value: BlendMode): Self = this.set("DstIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstOut(value: BlendMode): Self = this.set("DstOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstOver(value: BlendMode): Self = this.set("DstOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusion(value: BlendMode): Self = this.set("Exclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardLight(value: BlendMode): Self = this.set("HardLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: BlendMode): Self = this.set("Hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighten(value: BlendMode): Self = this.set("Lighten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLuminosity(value: BlendMode): Self = this.set("Luminosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulate(value: BlendMode): Self = this.set("Modulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiply(value: BlendMode): Self = this.set("Multiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: BlendMode): Self = this.set("Overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlus(value: BlendMode): Self = this.set("Plus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: BlendMode): Self = this.set("Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: BlendMode): Self = this.set("Screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftLight(value: BlendMode): Self = this.set("SoftLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: BlendMode): Self = this.set("Src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcATop(value: BlendMode): Self = this.set("SrcATop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcIn(value: BlendMode): Self = this.set("SrcIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcOut(value: BlendMode): Self = this.set("SrcOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcOver(value: BlendMode): Self = this.set("SrcOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXor(value: BlendMode): Self = this.set("Xor", value.asInstanceOf[js.Any])
  }
}
