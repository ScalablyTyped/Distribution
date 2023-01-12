package typings.colorConvert.routeMod

import typings.colorConvert.conversionsMod.ANSI16_
import typings.colorConvert.conversionsMod.ANSI256_
import typings.colorConvert.conversionsMod.APPLE_
import typings.colorConvert.conversionsMod.CMYK_
import typings.colorConvert.conversionsMod.GRAY_
import typings.colorConvert.conversionsMod.HCG_
import typings.colorConvert.conversionsMod.HEX_
import typings.colorConvert.conversionsMod.HSL_
import typings.colorConvert.conversionsMod.HSV_
import typings.colorConvert.conversionsMod.HWB_
import typings.colorConvert.conversionsMod.KEYWORD_
import typings.colorConvert.conversionsMod.LAB_
import typings.colorConvert.conversionsMod.LCH_
import typings.colorConvert.conversionsMod.RGB_
import typings.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait keyword extends StObject {
  
  def ansi16(from: KEYWORD_): ANSI16_
  
  def ansi256(from: KEYWORD_): ANSI256_
  
  def apple(from: KEYWORD_): APPLE_
  
  def cmyk(from: KEYWORD_): CMYK_
  
  def gray(from: KEYWORD_): GRAY_
  
  def hcg(from: KEYWORD_): HCG_
  
  def hex(from: KEYWORD_): HEX_
  
  def hsl(from: KEYWORD_): HSL_
  
  def hsv(from: KEYWORD_): HSV_
  
  def hwb(from: KEYWORD_): HWB_
  
  def lab(from: KEYWORD_): LAB_
  
  def lch(from: KEYWORD_): LCH_
  
  def rgb(from: KEYWORD_): RGB_
  
  def xyz(from: KEYWORD_): XYZ_
}
object keyword {
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyword] (val x: Self) extends AnyVal {
    
    inline def setAnsi16(value: KEYWORD_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    inline def setAnsi256(value: KEYWORD_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    inline def setApple(value: KEYWORD_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    inline def setCmyk(value: KEYWORD_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    inline def setGray(value: KEYWORD_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    inline def setHcg(value: KEYWORD_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    inline def setHex(value: KEYWORD_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    inline def setHsl(value: KEYWORD_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    inline def setHsv(value: KEYWORD_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    inline def setHwb(value: KEYWORD_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    inline def setLab(value: KEYWORD_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    inline def setLch(value: KEYWORD_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    inline def setRgb(value: KEYWORD_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz(value: KEYWORD_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
