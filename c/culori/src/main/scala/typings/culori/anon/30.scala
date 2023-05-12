package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  def oklab(color: OmitOkhsvmode): typings.culori.srcOklabTypesMod.Oklab
  @JSName("oklab")
  var oklab_Original: js.Function1[/* color */ OmitOkhsvmode, typings.culori.srcOklabTypesMod.Oklab]
  
  def rgb(color: OmitOkhsvmode): typings.culori.srcRgbTypesMod.Rgb
}
object `30` {
  
  inline def apply(
    oklab: /* color */ OmitOkhsvmode => typings.culori.srcOklabTypesMod.Oklab,
    rgb: OmitOkhsvmode => typings.culori.srcRgbTypesMod.Rgb
  ): `30` = {
    val __obj = js.Dynamic.literal(oklab = js.Any.fromFunction1(oklab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setOklab(value: /* color */ OmitOkhsvmode => typings.culori.srcOklabTypesMod.Oklab): Self = StObject.set(x, "oklab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitOkhsvmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
