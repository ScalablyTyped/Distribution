package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumeNumberMod {
  
  @JSImport("@csstools/css-tokenizer/dist/consume/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def consumeNumber(ctx: Context, reader: CodePointReader): NumberType = (^.asInstanceOf[js.Dynamic].applyDynamic("consumeNumber")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[NumberType]
}
