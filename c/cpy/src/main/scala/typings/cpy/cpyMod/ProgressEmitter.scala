package typings.cpy.cpyMod

import typings.cpy.cpyStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  @JSName("on")
  def on_progress(event: progress, handler: js.Function1[/* progress */ ProgressData, Unit]): js.Promise[js.Array[String]]
}

object ProgressEmitter {
  @scala.inline
  def apply(
    on_progress: (progress, js.Function1[/* progress */ ProgressData, Unit]) => js.Promise[js.Array[String]]
  ): ProgressEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_progress))
    __obj.asInstanceOf[ProgressEmitter]
  }
}

