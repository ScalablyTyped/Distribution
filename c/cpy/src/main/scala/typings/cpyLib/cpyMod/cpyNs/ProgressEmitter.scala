package typings
package cpyLib.cpyMod.cpyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProgressEmitter extends js.Object {
  @JSName("on")
  def on_progress(
    event: cpyLib.cpyLibStrings.progress,
    handler: js.Function1[/* progress */ ProgressData, scala.Unit]
  ): js.Promise[scala.Unit]
}

