package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.NonNullableBoxSides
import typings.ckeditorCkeditor5Engine.anon.Value
import typings.ckeditorCkeditor5Engine.srcViewStylesmapMod.BoxSides
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewStylesUtilsMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/styles/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoxSidesShorthandValue(styleShorthand: NonNullableBoxSides): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesShorthandValue")(styleShorthand.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBoxSidesValueReducer(styleShorthand: String): js.Function1[
    /* notation */ Record[String, js.UndefOr[String]], 
    js.Array[js.Tuple2[String, String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesValueReducer")(styleShorthand.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* notation */ Record[String, js.UndefOr[String]], 
    js.Array[js.Tuple2[String, String]]
  ]]
  
  inline def getBoxSidesValues(): BoxSides = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesValues")().asInstanceOf[BoxSides]
  inline def getBoxSidesValues(value: String): BoxSides = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxSidesValues")(value.asInstanceOf[js.Any]).asInstanceOf[BoxSides]
  
  inline def getPositionShorthandNormalizer(shorthand: String): js.Function1[/* value */ String, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositionShorthandNormalizer")(shorthand.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ String, Value]]
  
  inline def getShorthandValues(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShorthandValues")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isAttachment(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttachment")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isColor(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColor")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLength(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLineStyle(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineStyle")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPercentage(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentage")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPosition(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPosition")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRepeat(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeat")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isURL(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
