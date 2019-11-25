package typings.chrome

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.ttsEngine.TtsEngineSpeakEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofttsEngine extends js.Object {
  var onPause: Event[js.Function0[Unit]]
  var onResume: Event[js.Function0[Unit]]
  var onSpeak: TtsEngineSpeakEvent
  var onStop: Event[js.Function0[Unit]]
}

object TypeofttsEngine {
  @scala.inline
  def apply(
    onPause: Event[js.Function0[Unit]],
    onResume: Event[js.Function0[Unit]],
    onSpeak: TtsEngineSpeakEvent,
    onStop: Event[js.Function0[Unit]]
  ): TypeofttsEngine = {
    val __obj = js.Dynamic.literal(onPause = onPause.asInstanceOf[js.Any], onResume = onResume.asInstanceOf[js.Any], onSpeak = onSpeak.asInstanceOf[js.Any], onStop = onStop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofttsEngine]
  }
}

