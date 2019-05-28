package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofomnibox extends js.Object {
  var onDeleteSuggestion: chromeLib.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent
  var onInputCancelled: chromeLib.chromeNs.omniboxNs.OmniboxInputCancelledEvent
  var onInputChanged: chromeLib.chromeNs.omniboxNs.OmniboxInputChangedEvent
  var onInputEntered: chromeLib.chromeNs.omniboxNs.OmniboxInputEnteredEvent
  var onInputStarted: chromeLib.chromeNs.omniboxNs.OmniboxInputStartedEvent
  def setDefaultSuggestion(suggestion: chromeLib.chromeNs.omniboxNs.Suggestion): scala.Unit
}

object Typeofomnibox {
  @scala.inline
  def apply(
    onDeleteSuggestion: chromeLib.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent,
    onInputCancelled: chromeLib.chromeNs.omniboxNs.OmniboxInputCancelledEvent,
    onInputChanged: chromeLib.chromeNs.omniboxNs.OmniboxInputChangedEvent,
    onInputEntered: chromeLib.chromeNs.omniboxNs.OmniboxInputEnteredEvent,
    onInputStarted: chromeLib.chromeNs.omniboxNs.OmniboxInputStartedEvent,
    setDefaultSuggestion: chromeLib.chromeNs.omniboxNs.Suggestion => scala.Unit
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion, onInputCancelled = onInputCancelled, onInputChanged = onInputChanged, onInputEntered = onInputEntered, onInputStarted = onInputStarted, setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
  
    __obj.asInstanceOf[Typeofomnibox]
  }
}

