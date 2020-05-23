package typings.chrome.global.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.ttsEngine.TtsEngineSpeakEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Text to Speech Engine
////////////////////
/**
  * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
  * Permissions:  "ttsEngine"
  * @since Chrome 14.
  */
@JSGlobal("chrome.ttsEngine")
@js.native
object ttsEngine extends js.Object {
  var onPause: Event[js.Function0[Unit]] = js.native
  var onResume: Event[js.Function0[Unit]] = js.native
  var onSpeak: TtsEngineSpeakEvent = js.native
  var onStop: Event[js.Function0[Unit]] = js.native
}

