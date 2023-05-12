package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeCommentMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/comment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeComment(ctx: Context, reader: CodePointReader): TokenComment = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeComment")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TokenComment]
}
