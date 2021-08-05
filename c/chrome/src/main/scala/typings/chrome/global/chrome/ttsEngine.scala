package typings.chrome.global.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.ttsEngine.TtsEngineSpeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Text to Speech Engine
////////////////////
/**
  * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
  * Permissions:  "ttsEngine"
  * @since Chrome 14.
  */
object ttsEngine {
  
  @JSGlobal("chrome.ttsEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.ttsEngine.onPause")
  @js.native
  def onPause: Event[js.Function0[Unit]] = js.native
  inline def onPause_=(x: Event[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPause")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.ttsEngine.onResume")
  @js.native
  def onResume: Event[js.Function0[Unit]] = js.native
  inline def onResume_=(x: Event[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResume")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.ttsEngine.onSpeak")
  @js.native
  def onSpeak: TtsEngineSpeakEvent = js.native
  inline def onSpeak_=(x: TtsEngineSpeakEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSpeak")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.ttsEngine.onStop")
  @js.native
  def onStop: Event[js.Function0[Unit]] = js.native
  inline def onStop_=(x: Event[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStop")(x.asInstanceOf[js.Any])
}
