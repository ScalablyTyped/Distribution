package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Utils")
@js.native
class Utils ()
  extends StObject
     with typings.cannon.CANNON.Utils
/* static members */
object Utils {
  
  @JSImport("cannon", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[js.Any]
  inline def defaults(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def defaults(options: js.Any, defaults: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def defaults(options: Unit, defaults: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
