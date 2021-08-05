package typings.cosmiconfigTomlLoader

import typings.iarnaToml.mod.JsonMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cosmiconfig-toml-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadToml(filepath: String, content: String): JsonMap = (^.asInstanceOf[js.Dynamic].applyDynamic("loadToml")(filepath.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[JsonMap]
}
