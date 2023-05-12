package typings.culori

import typings.culori.culoriStrings.rgb
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import typings.culori.srcRgbTypesMod.Rgb
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRandomMod {
  
  @JSImport("culori/src/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Rgb = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Rgb]
  inline def default[M /* <: Mode */](mode: M): FindColorByMode[M, Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mode.asInstanceOf[js.Any]).asInstanceOf[FindColorByMode[M, Color]]
  inline def default[M /* <: Mode */](mode: M, constraints: Constraints[M]): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mode.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
  
  inline def default_rgb(mode: Unit, constraints: Constraints[rgb]): Rgb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mode.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[Rgb]
  
  type Constraints[M /* <: Mode */] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof culori.culori/src/common.TakeColorChannels<M> ]: culori.culori/src/random.NumberOrRange} */ js.Any
  ]
  
  type NumberOrRange = Double | (js.Tuple2[Double, Double])
}
