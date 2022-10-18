package typings.contentstackUtils

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelperRegexMatchMod {
  
  @JSImport("@contentstack/utils/dist/types/helper/regex-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containsFigureTag(content: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsFigureTag")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def countFigureTags(content: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countFigureTags")(content.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def matchFigureTag(content: String): RegExpMatchArray = ^.asInstanceOf[js.Dynamic].applyDynamic("matchFigureTag")(content.asInstanceOf[js.Any]).asInstanceOf[RegExpMatchArray]
}
