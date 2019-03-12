package typings
package chromeDashAppsLib.chromeNs.ttsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts")
@js.native
object ^ extends js.Object {
  /** Gets an array of all available voices. */
  def getVoices(): scala.Unit = js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], scala.Unit]): scala.Unit = js.native
  /** Checks whether the engine is currently speaking. On Mac OS X, the result is true whenever the system speech engine is speaking, even if the speech wasn't initiated by Chrome. */
  def isSpeaking(): scala.Unit = js.native
  def isSpeaking(callback: js.Function1[/* speaking */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Pauses speech synthesis, potentially in the middle of an utterance. A call to resume or stop will un-pause speech.
    * @since Chrome 29.
    */
  def pause(): scala.Unit = js.native
  /**
    * If speech was paused, resumes speaking where it left off.
    * @since Chrome 29.
    */
  def resume(): scala.Unit = js.native
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  def speak(utterance: java.lang.String): scala.Unit = js.native
  def speak(utterance: java.lang.String, callback: js.Function): scala.Unit = js.native
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param options The speech options.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  def speak(utterance: java.lang.String, options: SpeakOptions): scala.Unit = js.native
  def speak(utterance: java.lang.String, options: SpeakOptions, callback: js.Function): scala.Unit = js.native
  /** Stops any current speech and flushes the queue of any pending utterances. In addition, if speech was paused, it will now be un-paused for the next call to speak. */
  def stop(): scala.Unit = js.native
}

