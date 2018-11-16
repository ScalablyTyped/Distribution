package typings
package chromeLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omniboxNs {
  type OmniboxInputCancelledEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  type OmniboxInputChangedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], scala.Unit], 
      scala.Unit
    ]
  ]
  type OmniboxInputEnteredEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* text */ java.lang.String, scala.Unit]]
  type OmniboxInputStartedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
}
