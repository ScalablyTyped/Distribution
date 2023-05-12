package typings.culori.anon

import typings.culori.srcOkhslTypesMod.Okhsl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Oklab extends StObject {
  
  def oklab(color: OmitOklabmode): Okhsl
  @JSName("oklab")
  var oklab_Original: js.Function1[/* color */ OmitOklabmode, Okhsl]
  
  def rgb(c: OmitRgbmode): Okhsl
}
object Oklab {
  
  inline def apply(oklab: /* color */ OmitOklabmode => Okhsl, rgb: OmitRgbmode => Okhsl): Oklab = {
    val __obj = js.Dynamic.literal(oklab = js.Any.fromFunction1(oklab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Oklab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oklab] (val x: Self) extends AnyVal {
    
    inline def setOklab(value: /* color */ OmitOklabmode => Okhsl): Self = StObject.set(x, "oklab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Okhsl): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
