package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttsEngineNs {
  type TtsEngineSpeakEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* utterance */ java.lang.String, 
      /* options */ SpeakOptions, 
      /* sendTtsEvent */ js.Function1[/* event */ chromeLib.chromeNs.ttsNs.TtsEvent, scala.Unit], 
      scala.Unit
    ]
  ]
}
