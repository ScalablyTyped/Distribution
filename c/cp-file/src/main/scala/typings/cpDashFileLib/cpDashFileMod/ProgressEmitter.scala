package typings
package cpDashFileLib.cpDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  /**
  	 * For empty files, the `progress` event is emitted only once.
  	 */
  @JSName("on")
  def on_progress(
    event: cpDashFileLib.cpDashFileLibStrings.progress,
    handler: js.Function1[/* data */ ProgressData, scala.Unit]
  ): js.Promise[scala.Unit]
}

object ProgressEmitter {
  @scala.inline
  def apply(
    on_progress: (cpDashFileLib.cpDashFileLibStrings.progress, js.Function1[/* data */ ProgressData, scala.Unit]) => js.Promise[scala.Unit]
  ): ProgressEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_progress))
    __obj.asInstanceOf[ProgressEmitter]
  }
}

