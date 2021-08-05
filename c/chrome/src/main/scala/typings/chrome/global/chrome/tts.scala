package typings.chrome.global.chrome

import typings.chrome.chrome.tts.SpeakOptions
import typings.chrome.chrome.tts.TtsVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSGlobal("chrome.tts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVoices(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getVoices")().asInstanceOf[Unit]
  inline def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getVoices")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isSpeaking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpeaking")().asInstanceOf[Unit]
  inline def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpeaking")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pause(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[Unit]
  
  inline def resume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[Unit]
  
  inline def speak(utterance: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def speak(utterance: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def speak(utterance: String, options: SpeakOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def speak(utterance: String, options: SpeakOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("speak")(utterance.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
}
