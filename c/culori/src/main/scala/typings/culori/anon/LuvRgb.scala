package typings.culori.anon

import typings.culori.srcLchuvTypesMod.Lchuv
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LuvRgb extends StObject {
  
  def luv(color: OmitLuvmode): Lchuv
  @JSName("luv")
  var luv_Original: js.Function1[/* color */ OmitLuvmode, Lchuv]
  
  @JSName("rgb")
  def rgb_0(
    c: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(rgb : culori.anon.OmitRgbmode): culori.culori/src/xyz50/types.Xyz50>[0] */ js.Any
  ): ReturnType[js.Function1[/* color */ OmitLuvmode, Lchuv]]
}
object LuvRgb {
  
  inline def apply(
    luv: /* color */ OmitLuvmode => Lchuv,
    rgb: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(rgb : culori.anon.OmitRgbmode): culori.culori/src/xyz50/types.Xyz50>[0] */ js.Any => ReturnType[js.Function1[/* color */ OmitLuvmode, Lchuv]]
  ): LuvRgb = {
    val __obj = js.Dynamic.literal(luv = js.Any.fromFunction1(luv), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[LuvRgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LuvRgb] (val x: Self) extends AnyVal {
    
    inline def setLuv(value: /* color */ OmitLuvmode => Lchuv): Self = StObject.set(x, "luv", js.Any.fromFunction1(value))
    
    inline def setRgb(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(rgb : culori.anon.OmitRgbmode): culori.culori/src/xyz50/types.Xyz50>[0] */ js.Any => ReturnType[js.Function1[/* color */ OmitLuvmode, Lchuv]]
    ): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
