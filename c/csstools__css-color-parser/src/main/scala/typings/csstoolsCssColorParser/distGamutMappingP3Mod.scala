package typings.csstoolsCssColorParser

import typings.csstoolsColorHelpers.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGamutMappingP3Mod {
  
  @JSImport("@csstools/css-color-parser/dist/gamut-mapping/p3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def XYZD50ToP3Gamut(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_P3_Gamut")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
}
