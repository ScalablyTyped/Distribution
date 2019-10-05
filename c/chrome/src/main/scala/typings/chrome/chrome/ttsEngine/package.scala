package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngine {
  import typings.chrome.chrome.events.Event
  import typings.chrome.chrome.tts.TtsEvent

  type TtsEngineSpeakEvent = Event[
    js.Function3[
      /* utterance */ String, 
      /* options */ SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ TtsEvent, Unit], 
      Unit
    ]
  ]
}
