package typings.chrome.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.speak")
@js.native
object speak extends js.Object {
  def apply(utterance: String): Unit = js.native
  def apply(utterance: String, callback: js.Function): Unit = js.native
  def apply(utterance: String, options: SpeakOptions): Unit = js.native
  def apply(utterance: String, options: SpeakOptions, callback: js.Function): Unit = js.native
}

