package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import typings.chrome.chromeNs.ttsNs.TtsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngineNs {
  type TtsEngineSpeakEvent = Event[
    js.Function3[
      /* utterance */ String, 
      /* options */ SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ TtsEvent, Unit], 
      Unit
    ]
  ]
}
