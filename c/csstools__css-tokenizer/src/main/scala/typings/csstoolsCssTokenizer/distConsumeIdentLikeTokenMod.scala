package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenBadURL
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenFunction
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenIdent
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeIdentLikeTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/ident-like-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeIdentLikeToken(ctx: Context, reader: CodePointReader): TokenIdent | TokenFunction | TokenURL | TokenBadURL = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeIdentLikeToken")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenIdent | TokenFunction | TokenURL | TokenBadURL]
}
