package typings.createRequire

import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-require", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(filename: URL_): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
}
