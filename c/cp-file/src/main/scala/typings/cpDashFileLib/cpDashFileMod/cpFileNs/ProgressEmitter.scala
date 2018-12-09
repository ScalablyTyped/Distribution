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

