package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenBadString
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeStringTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/string-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeStringToken(ctx: Context, reader: CodePointReader): TokenBadString | TokenString = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeStringToken")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenBadString | TokenString]
}
