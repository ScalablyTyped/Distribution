package typings.csstoolsCssCalc

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDimension
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenNumber
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenPercentage
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilGlobalsMod {
  
  @JSImport("@csstools/css-calc/dist/util/globals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenizeGlobals(): Globals = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeGlobals")().asInstanceOf[Globals]
  inline def tokenizeGlobals(x: GlobalsWithStrings): Globals = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizeGlobals")(x.asInstanceOf[js.Any]).asInstanceOf[Globals]
  
  type Globals = Map[String, TokenDimension | TokenNumber | TokenPercentage]
  
  type GlobalsWithStrings = Map[String, TokenDimension | TokenNumber | TokenPercentage | String]
}
