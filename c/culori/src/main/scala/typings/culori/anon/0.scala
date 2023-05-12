package typings.culori.anon

import typings.culori.srcCubehelixTypesMod.Cubehelix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def rgb(color: OmitRgbmode): Cubehelix
  @JSName("rgb")
  var rgb_Original: js.Function1[/* color */ OmitRgbmode, Cubehelix]
}
object `0` {
  
  inline def apply(rgb: /* color */ OmitRgbmode => Cubehelix): `0` = {
    val __obj = js.Dynamic.literal(rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setRgb(value: /* color */ OmitRgbmode => Cubehelix): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
