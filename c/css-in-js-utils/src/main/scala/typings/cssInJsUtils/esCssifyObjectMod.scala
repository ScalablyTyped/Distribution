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
