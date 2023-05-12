package typings.chartJs

import typings.chartJs.anon.A
import typings.kurkleColor.mod.Color
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotcolorMod {
  
  @JSImport("chart.js/dist/helpers/helpers.color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def color(value: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: js.Tuple3[Double, Double, Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: js.Tuple4[Double, Double, Double, Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: A): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def color(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def color(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def getHoverColor(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getHoverColor(value: CanvasGradient): CanvasGradient = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasGradient]
  inline def getHoverColor(value: CanvasPattern): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("getHoverColor")(value.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  inline def isPatternOrGradient(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPatternOrGradient")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
