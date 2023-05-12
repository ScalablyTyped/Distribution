package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChecksThreeCodePointsWouldStartIdentSequenceMod {
  
  @JSImport("@csstools/css-tokenizer/dist/checks/three-code-points-would-start-ident-sequence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIfThreeCodePointsWouldStartAnIdentSequence(ctx: Context, reader: CodePointReader): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfThreeCodePointsWouldStartAnIdentSequence")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
