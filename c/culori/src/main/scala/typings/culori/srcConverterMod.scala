package typings.culori

import typings.culori.culoriStrings.rgb
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConverterMod {
  
  @JSImport("culori/src/converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ConvertFn[rgb] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ConvertFn[rgb]]
  inline def default[M /* <: Mode */](target_mode: M): ConvertFn[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target_mode.asInstanceOf[js.Any]).asInstanceOf[ConvertFn[M]]
  
  @js.native
  trait ConvertFn[M /* <: Mode */] extends StObject {
    
    def apply(): js.UndefOr[FindColorByMode[M, Color]] = js.native
    def apply(color: String): js.UndefOr[FindColorByMode[M, Color]] = js.native
    def apply(color: String, target_mode: M): js.UndefOr[FindColorByMode[M, Color]] = js.native
    def apply(color: Unit, target_mode: M): js.UndefOr[FindColorByMode[M, Color]] = js.native
    def apply(color: Color): js.UndefOr[FindColorByMode[M, Color]] = js.native
    def apply(color: Color, target_mode: M): js.UndefOr[FindColorByMode[M, Color]] = js.native
  }
}
