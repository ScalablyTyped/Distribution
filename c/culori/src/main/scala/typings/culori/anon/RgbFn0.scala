package typings.culori.anon

import typings.culori.culoriStrings.mode
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbFn0 extends StObject {
  
  @JSName("rgb")
  var rgb_Original: Fn0
  @JSName("rgb")
  def rgb_mode[M /* <: typings.culori.srcCommonMod.Mode */](color: Omit[typings.culori.srcLrgbTypesMod.Lrgb, mode]): FindColorByMode[M, Color]
  @JSName("rgb")
  def rgb_mode[M /* <: typings.culori.srcCommonMod.Mode */](color: Omit[typings.culori.srcLrgbTypesMod.Lrgb, mode], mode: M): FindColorByMode[M, Color]
}
object RgbFn0 {
  
  inline def apply(rgb: Fn0): RgbFn0 = {
    val __obj = js.Dynamic.literal(rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbFn0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RgbFn0] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: Fn0): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
  }
}
