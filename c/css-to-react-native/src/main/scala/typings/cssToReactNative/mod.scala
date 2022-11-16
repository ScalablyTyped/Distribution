package typings.cssToReactNative

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-to-react-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(styleTuples: js.Array[StyleTuple]): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styleTuples.asInstanceOf[js.Any]).asInstanceOf[Style]
  inline def default(styleTuples: js.Array[StyleTuple], shorthandBlacklist: js.Array[String]): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styleTuples.asInstanceOf[js.Any], shorthandBlacklist.asInstanceOf[js.Any])).asInstanceOf[Style]
  
  inline def getPropertyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStylesForProperty(name: String, value: String): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("getStylesForProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Style]
  inline def getStylesForProperty(name: String, value: String, allowShorthand: Boolean): Style = (^.asInstanceOf[js.Dynamic].applyDynamic("getStylesForProperty")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allowShorthand.asInstanceOf[js.Any])).asInstanceOf[Style]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Style = {[key: string] : string | number | css-to-react-native.css-to-react-native.Style}
  }}}
  to avoid circular code involving: 
  - css-to-react-native.css-to-react-native.Style
  */
  trait Style
    extends StObject
       with /* key */ StringDictionary[String | Double | Style]
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
  }
  
  type StyleTuple = js.Tuple2[String, String]
}
