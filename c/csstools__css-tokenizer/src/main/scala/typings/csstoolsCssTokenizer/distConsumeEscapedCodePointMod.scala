package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeEscapedCodePointMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/escaped-code-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeEscapedCodePoint(ctx: Context, reader: CodePointReader): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeEscapedCodePoint")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Double]
}
