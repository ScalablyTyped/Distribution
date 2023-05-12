package typings.culori.anon

import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbFn1 extends StObject {
  
  def rgb[M /* <: typings.culori.srcCommonMod.Mode */](color: OmitLrgbmode): FindColorByMode[M, Color]
  def rgb[M /* <: typings.culori.srcCommonMod.Mode */](color: OmitLrgbmode, mode: M): FindColorByMode[M, Color]
  @JSName("rgb")
  var rgb_Original: Fn1
}
object RgbFn1 {
  
  inline def apply(rgb: Fn1): RgbFn1 = {
    val __obj = js.Dynamic.literal(rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbFn1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RgbFn1] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: Fn1): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
  }
}
