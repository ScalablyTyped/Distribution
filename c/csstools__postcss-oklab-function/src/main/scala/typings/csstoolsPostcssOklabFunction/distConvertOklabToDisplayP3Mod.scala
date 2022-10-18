package typings.csstoolsPostcssOklabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertOklabToDisplayP3Mod {
  
  @JSImport("@csstools/postcss-oklab-function/dist/convert-oklab-to-display-p3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oklabToDisplayP3(oklabRaw: color): js.Tuple2[color, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("oklabToDisplayP3")(oklabRaw.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[color, Boolean]]
  
  type color = js.Tuple3[Double, Double, Double]
}
