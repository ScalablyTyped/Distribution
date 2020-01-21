package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasKitInitResult extends js.Object {
  def ready(): js.Promise[CanvasKit]
}

object CanvasKitInitResult {
  @scala.inline
  def apply(ready: () => js.Promise[CanvasKit]): CanvasKitInitResult = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready))
  
    __obj.asInstanceOf[CanvasKitInitResult]
  }
}

