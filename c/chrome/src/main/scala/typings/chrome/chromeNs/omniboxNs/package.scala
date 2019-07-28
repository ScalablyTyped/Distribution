package typings.chrome.chromeNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omniboxNs {
  type OmniboxInputCancelledEvent = Event[js.Function0[Unit]]
  type OmniboxInputChangedEvent = Event[
    js.Function2[
      /* text */ String, 
      /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
      Unit
    ]
  ]
  type OmniboxInputEnteredEvent = Event[
    js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
  ]
  type OmniboxInputStartedEvent = Event[js.Function0[Unit]]
  type OmniboxSuggestionDeletedEvent = Event[js.Function1[/* text */ String, Unit]]
}
