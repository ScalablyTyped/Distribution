package typings.cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAbsoluteUriMod {
  
  @JSImport("cesium/Source/Core/getAbsoluteUri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(relative: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(relative.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(relative: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(relative.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
}
