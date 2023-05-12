package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDimension
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenNumber
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenPercentage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeNumericTokenMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/numeric-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeNumericToken(ctx: Context, reader: CodePointReader): TokenPercentage | TokenNumber | TokenDimension = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeNumericToken")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenPercentage | TokenNumber | TokenDimension]
}
