package typings.chrome.global.chrome

import typings.chrome.chrome.tts.SpeakOptions
import typings.chrome.chrome.tts.TtsVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Text to Speech
////////////////////
/**
  * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
  * Permissions:  "tts"
  * @since Chrome 14.
  */
object tts {
  
  @JSGlobal("chrome.tts.getVoices")
  @js.native
  def getVoices(): Unit = js.native
  @JSGlobal("chrome.tts.getVoices")
  @js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = js.native
  
  @JSGlobal("chrome.tts.isSpeaking")
  @js.native
  def isSpeaking(): Unit = js.native
  @JSGlobal("chrome.tts.isSpeaking")
  @js.native
  def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("chrome.tts.pause")
  @js.native
  def pause(): Unit = js.native
  
  @JSGlobal("chrome.tts.resume")
  @js.native
  def resume(): Unit = js.native
  
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String): Unit = js.native
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String, callback: js.Function): Unit = js.native
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String, options: SpeakOptions): Unit = js.native
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String, options: SpeakOptions, callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.tts.stop")
  @js.native
  def stop(): Unit = js.native
}
