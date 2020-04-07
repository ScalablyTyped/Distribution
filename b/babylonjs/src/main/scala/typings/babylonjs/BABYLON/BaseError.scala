package typings.babylonjs.BABYLON

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.BaseError")
@js.native
abstract class BaseError () extends Error {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

/* static members */
@JSGlobal("BABYLON.BaseError")
@js.native
object BaseError extends js.Object {
  /* protected */ def _setPrototypeOf(o: js.Any): js.Any = js.native
  /* protected */ def _setPrototypeOf(o: js.Any, proto: js.Object): js.Any = js.native
}

