package typings.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPropertyByPathMod {
  
  @JSImport("cosmiconfig/dist/getPropertyByPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPropertyByPath(source: StringDictionary[js.Any], path: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyByPath")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getPropertyByPath(source: StringDictionary[js.Any], path: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyByPath")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
