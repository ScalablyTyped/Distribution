package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChecksTwoCodePointsAreValidEscapeMod {
  
  @JSImport("@csstools/css-tokenizer/dist/checks/two-code-points-are-valid-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIfTwoCodePointsAreAValidEscape(ctx: Context, reader: CodePointReader): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfTwoCodePointsAreAValidEscape")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
