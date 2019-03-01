package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnPause extends js.Object {
  var onPause: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  var onResume: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  var onSpeak: chromeLib.chromeNs.ttsEngineNs.TtsEngineSpeakEvent
  var onStop: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}

object Anon_OnPause {
  @scala.inline
  def apply(
    onPause: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]],
    onResume: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]],
    onSpeak: chromeLib.chromeNs.ttsEngineNs.TtsEngineSpeakEvent,
    onStop: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  ): Anon_OnPause = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPause")(onPause)
    __obj.updateDynamic("onResume")(onResume)
    __obj.updateDynamic("onSpeak")(onSpeak)
    __obj.updateDynamic("onStop")(onStop)
    __obj.asInstanceOf[Anon_OnPause]
  }
}

