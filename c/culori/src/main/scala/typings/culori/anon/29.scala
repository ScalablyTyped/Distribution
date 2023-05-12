package typings.culori.anon

import typings.culori.srcOkhsvTypesMod.Okhsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  def oklab(color: OmitOklabmode): Okhsv
  @JSName("oklab")
  var oklab_Original: js.Function1[/* color */ OmitOklabmode, Okhsv]
  
  def rgb(color: OmitRgbmode): Okhsv
}
object `29` {
  
  inline def apply(oklab: /* color */ OmitOklabmode => Okhsv, rgb: OmitRgbmode => Okhsv): `29` = {
    val __obj = js.Dynamic.literal(oklab = js.Any.fromFunction1(oklab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setOklab(value: /* color */ OmitOklabmode => Okhsv): Self = StObject.set(x, "oklab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Okhsv): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
