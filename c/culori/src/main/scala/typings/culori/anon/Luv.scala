package typings.culori.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Luv extends StObject {
  
  def luv(color: OmitLchuvmode): typings.culori.srcLuvTypesMod.Luv
  @JSName("luv")
  var luv_Original: js.Function1[/* color */ OmitLchuvmode, typings.culori.srcLuvTypesMod.Luv]
  
  @JSName("rgb")
  def rgb_0(
    c: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(color : culori.anon.OmitLchuvmode): culori.culori/src/luv/types.Luv>[0] */ js.Any
  ): ReturnType[js.Function1[/* color */ OmitXyz50mode, typings.culori.srcRgbTypesMod.Rgb]]
}
object Luv {
  
  inline def apply(
    luv: /* color */ OmitLchuvmode => typings.culori.srcLuvTypesMod.Luv,
    rgb: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(color : culori.anon.OmitLchuvmode): culori.culori/src/luv/types.Luv>[0] */ js.Any => ReturnType[js.Function1[/* color */ OmitXyz50mode, typings.culori.srcRgbTypesMod.Rgb]]
  ): Luv = {
    val __obj = js.Dynamic.literal(luv = js.Any.fromFunction1(luv), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[Luv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Luv] (val x: Self) extends AnyVal {
    
    inline def setLuv(value: /* color */ OmitLchuvmode => typings.culori.srcLuvTypesMod.Luv): Self = StObject.set(x, "luv", js.Any.fromFunction1(value))
    
    inline def setRgb(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(color : culori.anon.OmitLchuvmode): culori.culori/src/luv/types.Luv>[0] */ js.Any => ReturnType[js.Function1[/* color */ OmitXyz50mode, typings.culori.srcRgbTypesMod.Rgb]]
    ): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
  }
}
