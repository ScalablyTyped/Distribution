package typings.csstoolsColorHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConversionsSrgbToLuminanceMod {
  
  @JSImport("@csstools/color-helpers/dist/conversions/srgb-to-luminance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sRGBToLuminance(
    RGB: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGB_to_luminance")(RGB.asInstanceOf[js.Any]).asInstanceOf[Double]
}
