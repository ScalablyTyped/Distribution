package typings
package cpyLib.cpyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  @JSName("on")
  def on_progress(
    event: cpyLib.cpyLibStrings.progress,
    handler: js.Function1[/* progress */ ProgressData, scala.Unit]
  ): js.Promise[js.Array[java.lang.String]]
}

object ProgressEmitter {
  @scala.inline
  def apply(
    on_progress: (cpyLib.cpyLibStrings.progress, js.Function1[/* progress */ ProgressData, scala.Unit]) => js.Promise[js.Array[java.lang.String]]
  ): ProgressEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_progress))
    __obj.asInstanceOf[ProgressEmitter]
  }
}

