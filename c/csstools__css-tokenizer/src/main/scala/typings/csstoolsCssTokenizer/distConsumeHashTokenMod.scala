package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDelim
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeHashTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/hash-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeHashToken(ctx: Context, reader: CodePointReader): TokenDelim | TokenHash = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeHashToken")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenDelim | TokenHash]
}
