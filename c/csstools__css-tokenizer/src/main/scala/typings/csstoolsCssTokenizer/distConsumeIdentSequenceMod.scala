package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeIdentSequenceMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/ident-sequence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeIdentSequence(ctx: Context, reader: CodePointReader): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeIdentSequence")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
