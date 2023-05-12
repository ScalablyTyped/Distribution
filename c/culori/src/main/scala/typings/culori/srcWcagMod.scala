package typings.culori

import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWcagMod {
  
  @JSImport("culori/src/wcag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contrast(colorA: String, colorB: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def contrast(colorA: String, colorB: Color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def contrast(colorA: Color, colorB: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def contrast(colorA: Color, colorB: Color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(colorA.asInstanceOf[js.Any], colorB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def luminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("luminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def luminance(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("luminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
}
