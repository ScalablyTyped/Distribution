package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.tts.SpeakOptions
import typings.chromeApps.chrome.tts.TtsVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSGlobal("chrome.tts")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets an array of all available voices. */
  @scala.inline
  def getVoices(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getVoices")().asInstanceOf[Unit]
  @scala.inline
  def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getVoices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Checks whether the engine is currently speaking. On Mac OS X, the result is true whenever the system speech engine is speaking, even if the speech wasn't initiated by Chrome. */
  @scala.inline
  def isSpeaking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpeaking")().asInstanceOf[Unit]
  @scala.inline
  def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpeaking")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Pauses speech synthesis, potentially in the middle of an utterance. A call to resume or stop will un-pause speech.
    * @since Chrome 29.
    */
  @scala.inline
  def pause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[Unit]
  
  /**
    * If speech was paused, resumes speaking where it left off.
    * @since Chrome 29.
    */
  @scala.inline
  def resume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[Unit]
  
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  @scala.inline
  def speak(utterance: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def speak(utterance: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Speaks text using a text-to-speech engine.
    * @param utterance The text to speak, either plain text or a complete, well-formed SSML document. Speech engines that do not support SSML will strip away the tags and speak the text. The maximum length of the text is 32,768 characters.
    * @param options The speech options.
    * @param callback Called right away, before speech finishes. Check chrome.runtime.lastError to make sure there were no errors. Use options.onEvent to get more detailed feedback.
    */
  @scala.inline
  def speak(utterance: String, options: SpeakOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def speak(utterance: String, options: SpeakOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Stops any current speech and flushes the queue of any pending utterances. In addition, if speech was paused, it will now be un-paused for the next call to speak. */
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
}
