package typings
package cpDashFileLib.cpDashFileMod.cpFileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  @JSName("on")
  def on_progress(
    event: cpDashFileLib.cpDashFileLibStrings.progress,
    handler: js.Function1[/* data */ ProgressData, scala.Unit]
  ): js.Promise[scala.Unit]
}

object ProgressEmitter {
  @scala.inline
  def apply(
    on_progress: js.Function2[
      cpDashFileLib.cpDashFileLibStrings.progress, 
      js.Function1[/* data */ ProgressData, scala.Unit], 
      js.Promise[scala.Unit]
    ]
  ): ProgressEmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(on_progress)
    __obj.asInstanceOf[ProgressEmitter]
  }
}

