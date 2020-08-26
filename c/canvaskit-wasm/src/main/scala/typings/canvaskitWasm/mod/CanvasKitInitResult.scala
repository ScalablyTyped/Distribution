package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasKitInitResult extends js.Object {
  def ready(): js.Promise[CanvasKit] = js.native
}

object CanvasKitInitResult {
  @scala.inline
  def apply(ready: () => js.Promise[CanvasKit]): CanvasKitInitResult = {
    val __obj = js.Dynamic.literal(ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[CanvasKitInitResult]
  }
  @scala.inline
  implicit class CanvasKitInitResultOps[Self <: CanvasKitInitResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReady(value: () => js.Promise[CanvasKit]): Self = this.set("ready", js.Any.fromFunction0(value))
  }
  
}

