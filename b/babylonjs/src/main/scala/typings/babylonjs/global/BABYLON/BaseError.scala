package typings.babylonjs.global.BABYLON

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BaseError")
@js.native
abstract class BaseError ()
  extends StObject
     with Error {
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
/* static members */
object BaseError {
  
  @JSGlobal("BABYLON.BaseError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _setPrototypeOf(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_setPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def _setPrototypeOf(o: js.Any, proto: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
