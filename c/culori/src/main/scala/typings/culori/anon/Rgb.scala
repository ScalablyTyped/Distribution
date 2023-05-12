package typings.culori.anon

import typings.culori.srcA98TypesMod.A98
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rgb extends StObject {
  
  def rgb(color: OmitRgbmode): A98
  
  def xyz65(color: OmitXyz65mode): A98
  @JSName("xyz65")
  var xyz65_Original: js.Function1[/* color */ OmitXyz65mode, A98]
}
object Rgb {
  
  inline def apply(rgb: OmitRgbmode => A98, xyz65: /* color */ OmitXyz65mode => A98): Rgb = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb), xyz65 = js.Any.fromFunction1(xyz65))
    __obj.asInstanceOf[Rgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rgb] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: OmitRgbmode => A98): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    inline def setXyz65(value: /* color */ OmitXyz65mode => A98): Self = StObject.set(x, "xyz65", js.Any.fromFunction1(value))
  }
}
