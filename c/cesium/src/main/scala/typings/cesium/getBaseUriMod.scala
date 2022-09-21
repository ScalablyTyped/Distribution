package typings.cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBaseUriMod {
  
  @JSImport("cesium/Source/Core/getBaseUri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(uri: String, includeQuery: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uri.asInstanceOf[js.Any], includeQuery.asInstanceOf[js.Any])).asInstanceOf[String]
}
