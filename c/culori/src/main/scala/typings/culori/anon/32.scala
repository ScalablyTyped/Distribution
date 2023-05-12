package typings.culori.anon

import typings.culori.srcOklchTypesMod.Oklch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  def oklab(c: OmitOklabmode): Oklch
  
  def rgb(c: OmitRgbmode): Oklch
}
object `32` {
  
  inline def apply(oklab: OmitOklabmode => Oklch, rgb: OmitRgbmode => Oklch): `32` = {
    val __obj = js.Dynamic.literal(oklab = js.Any.fromFunction1(oklab), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`] (val x: Self) extends AnyVal {
    
    inline def setOklab(value: OmitOklabmode => Oklch): Self = StObject.set(x, "oklab", js.Any.fromFunction1(value))
    
    inline def setRgb(value: OmitRgbmode => Oklch): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
