package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenBadURL
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeUrlTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/url-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeUrlToken(ctx: Context, reader: CodePointReader): TokenURL | TokenBadURL = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeUrlToken")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenURL | TokenBadURL]
}
