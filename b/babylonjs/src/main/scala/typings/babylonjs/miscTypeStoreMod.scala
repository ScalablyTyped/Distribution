package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscTypeStoreMod {
  
  @JSImport("babylonjs/Misc/typeStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetClass(fqdn: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClass")(fqdn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RegisterClass(className: String, `type`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClass")(className.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
