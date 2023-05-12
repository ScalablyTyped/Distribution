package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenWhitespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeWhitespaceTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/whitespace-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeWhiteSpace(ctx: Context, reader: CodePointReader): TokenWhitespace = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeWhiteSpace")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenWhitespace]
}
