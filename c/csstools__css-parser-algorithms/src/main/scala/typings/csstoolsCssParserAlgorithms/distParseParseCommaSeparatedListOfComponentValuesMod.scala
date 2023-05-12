package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.anon.OnParseError
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseParseCommaSeparatedListOfComponentValuesMod {
  
  @JSImport("@csstools/css-parser-algorithms/dist/parse/parse-comma-separated-list-of-component-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCommaSeparatedListOfComponentValues(tokens: js.Array[CSSToken]): js.Array[js.Array[ComponentValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCommaSeparatedListOfComponentValues")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[ComponentValue]]]
  inline def parseCommaSeparatedListOfComponentValues(tokens: js.Array[CSSToken], options: OnParseError): js.Array[js.Array[ComponentValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCommaSeparatedListOfComponentValues")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[ComponentValue]]]
}
