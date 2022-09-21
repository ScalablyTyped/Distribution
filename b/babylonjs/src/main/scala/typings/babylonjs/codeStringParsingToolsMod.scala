package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeStringParsingToolsMod {
  
  @JSImport("babylonjs/Misc/codeStringParsingTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EscapeRegExp(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("EscapeRegExp")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ExtractBetweenMarkers(markerOpen: String, markerClose: String, block: String, startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractBetweenMarkers")(markerOpen.asInstanceOf[js.Any], markerClose.asInstanceOf[js.Any], block.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def FindBackward(s: String, index: Double, c: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FindBackward")(s.asInstanceOf[js.Any], index.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def IsIdentifierChar(c: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentifierChar")(c.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def RemoveComments(block: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveComments")(block.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def SkipWhitespaces(s: String, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SkipWhitespaces")(s.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
}
