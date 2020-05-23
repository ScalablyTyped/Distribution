package typings.chrome.global.chrome

import typings.chrome.chrome.tts.SpeakOptions
import typings.chrome.chrome.tts.TtsVoice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Text to Speech
////////////////////
/**
  * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
  * Permissions:  "tts"
  * @since Chrome 14.
  */
@JSGlobal("chrome.tts")
@js.native
object tts extends js.Object {
  def getVoices(): Unit = js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = js.native
  def isSpeaking(): Unit = js.native
  def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def speak(utterance: String): Unit = js.native
  def speak(utterance: String, callback: js.Function): Unit = js.native
  def speak(utterance: String, options: SpeakOptions): Unit = js.native
  def speak(utterance: String, options: SpeakOptions, callback: js.Function): Unit = js.native
  def stop(): Unit = js.native
}

