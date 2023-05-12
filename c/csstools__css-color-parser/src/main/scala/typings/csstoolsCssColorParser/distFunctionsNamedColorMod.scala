package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsNamedColorMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/named-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def namedColor(name: String): ColorData | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("namedColor")(name.asInstanceOf[js.Any]).asInstanceOf[ColorData | `false`]
}
