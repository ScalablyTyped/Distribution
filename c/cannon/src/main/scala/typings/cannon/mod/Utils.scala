package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Utils")
@js.native
open class Utils ()
  extends StObject
     with typings.cannon.CANNON.Utils
/* static members */
object Utils {
  
  @JSImport("cannon", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Any]
  inline def defaults(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def defaults(options: Any, defaults: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def defaults(options: Unit, defaults: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Any]
}
