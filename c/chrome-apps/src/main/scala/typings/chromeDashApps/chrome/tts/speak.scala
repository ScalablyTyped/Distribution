package typings.chromeDashApps.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.speak")
@js.native
object speak extends js.Object {
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  def apply(utterance: String): Unit = js.native
  def apply(utterance: String, callback: js.Function): Unit = js.native
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param options The speech options.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  def apply(utterance: String, options: SpeakOptions): Unit = js.native
  def apply(utterance: String, options: SpeakOptions, callback: js.Function): Unit = js.native
}

