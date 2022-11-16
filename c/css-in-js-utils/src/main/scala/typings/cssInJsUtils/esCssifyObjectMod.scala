package typings.cssInJsUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCssifyObjectMod {
  
  @JSImport("css-in-js-utils/es/cssifyObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(style: StyleObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StyleObject = {[key: string] : string | number | css-in-js-utils.css-in-js-utils/es/cssifyObject.StyleObject | std.Array<string | number | css-in-js-utils.css-in-js-utils/es/cssifyObject.StyleObject>}
  }}}
  to avoid circular code involving: 
  - css-in-js-utils.css-in-js-utils/es/cssifyObject.StyleObject
  */
  trait StyleObject
    extends StObject
       with /* key */ StringDictionary[String | Double | StyleObject | (js.Array[String | Double | StyleObject])]
  object StyleObject {
    
    inline def apply(): StyleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleObject]
    }
  }
}
