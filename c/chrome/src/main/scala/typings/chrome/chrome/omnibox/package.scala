package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omnibox {
  type OmniboxInputCancelledEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type OmniboxInputChangedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* suggest */ js.Function1[
        /* suggestResults */ js.Array[typings.chrome.chrome.omnibox.SuggestResult], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type OmniboxInputEnteredEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* disposition */ typings.chrome.chrome.omnibox.OnInputEnteredDisposition, 
      scala.Unit
    ]
  ]
  type OmniboxInputStartedEvent = typings.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type OmniboxSuggestionDeletedEvent = typings.chrome.chrome.events.Event[js.Function1[/* text */ java.lang.String, scala.Unit]]
}
