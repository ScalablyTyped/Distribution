package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import typings.csstoolsCssTokenizer.distInterfacesContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChecksTwoCodePointsStartCommentMod {
  
  @JSImport("@csstools/css-tokenizer/dist/checks/two-code-points-start-comment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkIfTwoCodePointsStartAComment(ctx: Context, reader: CodePointReader): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfTwoCodePointsStartAComment")(ctx.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
