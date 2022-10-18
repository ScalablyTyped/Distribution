package typings.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGetPropertyByPathMod {
  
  @JSImport("cosmiconfig/dist/getPropertyByPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPropertyByPath(source: StringDictionary[Any], path: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyByPath")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPropertyByPath(source: StringDictionary[Any], path: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyByPath")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
}
