package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.anon.Css
import typings.csstoolsCssTokenizer.anon.EndOfFile
import typings.csstoolsCssTokenizer.anon.OnParseError
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenizerMod {
  
  @JSImport("@csstools/css-tokenizer/dist/tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenize(input: Css): js.Array[CSSToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[CSSToken]]
  inline def tokenize(input: Css, options: OnParseError): js.Array[CSSToken] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[CSSToken]]
  
  inline def tokenizer(input: Css): EndOfFile = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any]).asInstanceOf[EndOfFile]
  inline def tokenizer(input: Css, options: OnParseError): EndOfFile = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndOfFile]
  
  trait Stringer extends StObject
}
