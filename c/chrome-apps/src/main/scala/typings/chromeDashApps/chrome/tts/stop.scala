package typings.chromeDashApps.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.stop")
@js.native
object stop extends js.Object {
  /** Stops any current speech and flushes the queue of any pending utterances. In addition, if speech was paused, it will now be un-paused for the next call to speak. */
  def apply(): Unit = js.native
}

