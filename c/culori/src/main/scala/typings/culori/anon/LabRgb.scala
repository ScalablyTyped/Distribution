package typings.culori.anon

import typings.culori.culoriStrings.dlch
import typings.culori.culoriStrings.lch
import typings.culori.culoriStrings.lch65
import typings.culori.culoriStrings.mode
import typings.culori.culoriStrings.oklch
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcLchTypesMod.Lch
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabRgb extends StObject {
  
  @JSName("lab")
  var lab_Original: FnCallColorMode
  @JSName("lab")
  def lab_mode[M /* <: dlch | lch65 | oklch | lch */](color: Omit[typings.culori.srcLabTypesMod.Lab, mode]): FindColorByMode[M, Color]
  @JSName("lab")
  def lab_mode[M /* <: dlch | lch65 | oklch | lch */](color: Omit[typings.culori.srcLabTypesMod.Lab, mode], mode: M): FindColorByMode[M, Color]
  
  def rgb(c: OmitRgbmode): Lch
}
object LabRgb {
  
  inline def apply(lab: FnCallColorMode, rgb: OmitRgbmode => Lch): LabRgb = {
    val __obj = js.Dynamic.literal(lab = lab.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[LabRgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabRgb] (val x: Self) extends AnyVal {
    
    inline def setLab(value: FnCallColorMode): Self = StObject.set(x, "lab", value.asInstanceOf[js.Any])
    
    inline def setRgb(value: OmitRgbmode => Lch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
