package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jab extends StObject {
  
  def jab(color: OmitJchmode): typings.culori.srcJabTypesMod.Jab
  @JSName("jab")
  var jab_Original: js.Function1[/* color */ OmitJchmode, typings.culori.srcJabTypesMod.Jab]
  
  def rgb(c: OmitJchmode): typings.culori.srcRgbTypesMod.Rgb
}
object Jab {
  
  inline def apply(
    jab: /* color */ OmitJchmode => typings.culori.srcJabTypesMod.Jab,
    rgb: OmitJchmode => typings.culori.srcRgbTypesMod.Rgb
  ): Jab = {
    val __obj = js.Dynamic.literal(jab = js.Any.fromFunction1(jab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Jab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jab] (val x: Self) extends AnyVal {
    
    inline def setJab(value: /* color */ OmitJchmode => typings.culori.srcJabTypesMod.Jab): Self = StObject.set(x, "jab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitJchmode => typings.culori.srcRgbTypesMod.Rgb): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
