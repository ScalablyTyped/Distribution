package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUnicodeMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/unicode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCombiningMark(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCombiningMark")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHighSurrogateHalf(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHighSurrogateHalf")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInsideCombinedSymbol(string: String, offset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInsideCombinedSymbol")(string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInsideEmojiSequence(string: String, offset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInsideEmojiSequence")(string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInsideSurrogatePair(string: String, offset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInsideSurrogatePair")(string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isLowSurrogateHalf(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowSurrogateHalf")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
