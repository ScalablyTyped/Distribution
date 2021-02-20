package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.tts.SpeakOptions
import typings.chromeApps.chrome.tts.TtsVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.system.*
// #region chrome.tts
////////////////////
// Text to Speech //
////////////////////
/**
  * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
  * Permissions:  'tts'
  * @since Chrome 14.
  */
object tts {
  
  /** Gets an array of all available voices. */
  @JSGlobal("chrome.tts.getVoices")
  @js.native
  def getVoices(): Unit = js.native
  @JSGlobal("chrome.tts.getVoices")
  @js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = js.native
  
  /** Checks whether the engine is currently speaking. On Mac OS X, the result is true whenever the system speech engine is speaking, even if the speech wasn't initiated by Chrome. */
  @JSGlobal("chrome.tts.isSpeaking")
  @js.native
  def isSpeaking(): Unit = js.native
  @JSGlobal("chrome.tts.isSpeaking")
  @js.native
  def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = js.native
  
  /**
    * Pauses speech synthesis, potentially in the middle of an utterance. A call to resume or stop will un-pause speech.
    * @since Chrome 29.
    */
  @JSGlobal("chrome.tts.pause")
  @js.native
  def pause(): Unit = js.native
  
  /**
    * If speech was paused, resumes speaking where it left off.
    * @since Chrome 29.
    */
  @JSGlobal("chrome.tts.resume")
  @js.native
  def resume(): Unit = js.native
  
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String): Unit = js.native
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String, callback: js.Function): Unit = js.native
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param options The speech options.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String, options: SpeakOptions): Unit = js.native
  @JSGlobal("chrome.tts.speak")
  @js.native
  def speak(utterance: String, options: SpeakOptions, callback: js.Function): Unit = js.native
  
  /** Stops any current speech and flushes the queue of any pending utterances. In addition, if speech was paused, it will now be un-paused for the next call to speak. */
  @JSGlobal("chrome.tts.stop")
  @js.native
  def stop(): Unit = js.native
}
