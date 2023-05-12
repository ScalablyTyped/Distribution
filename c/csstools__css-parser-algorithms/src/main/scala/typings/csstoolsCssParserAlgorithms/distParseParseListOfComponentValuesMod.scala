package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.anon.OnParseError
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseParseListOfComponentValuesMod {
  
  @JSImport("@csstools/css-parser-algorithms/dist/parse/parse-list-of-component-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseListOfComponentValues(tokens: js.Array[CSSToken]): js.Array[ComponentValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseListOfComponentValues")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[ComponentValue]]
  inline def parseListOfComponentValues(tokens: js.Array[CSSToken], options: OnParseError): js.Array[ComponentValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseListOfComponentValues")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentValue]]
}
