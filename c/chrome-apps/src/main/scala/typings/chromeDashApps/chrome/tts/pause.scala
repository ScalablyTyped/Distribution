package typings.chromeDashApps.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.pause")
@js.native
object pause extends js.Object {
  /**
    * Pauses speech synthesis, potentially in the middle of an utterance. A call to resume or stop will un-pause speech.
    * @since Chrome 29.
    */
  def apply(): Unit = js.native
}

