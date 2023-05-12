package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.anon.OnParseError
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseParseComponentValueMod {
  
  @JSImport("@csstools/css-parser-algorithms/dist/parse/parse-component-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseComponentValue(tokens: js.Array[CSSToken]): js.UndefOr[ComponentValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComponentValue")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ComponentValue]]
  inline def parseComponentValue(tokens: js.Array[CSSToken], options: OnParseError): js.UndefOr[ComponentValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponentValue")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ComponentValue]]
}
