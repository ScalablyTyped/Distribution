package typings.csscolorparserTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csscolorparser-ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCSSColor(css_str: String): RGBA | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCSSColor")(css_str.asInstanceOf[js.Any]).asInstanceOf[RGBA | Null]
  
  type RGBA = js.Tuple4[Double, Double, Double, Double]
}
