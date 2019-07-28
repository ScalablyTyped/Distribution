package typings.chrome

import typings.chrome.chromeNs.omniboxNs.OmniboxInputCancelledEvent
import typings.chrome.chromeNs.omniboxNs.OmniboxInputChangedEvent
import typings.chrome.chromeNs.omniboxNs.OmniboxInputEnteredEvent
import typings.chrome.chromeNs.omniboxNs.OmniboxInputStartedEvent
import typings.chrome.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent
import typings.chrome.chromeNs.omniboxNs.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofomnibox extends js.Object {
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent
  var onInputCancelled: OmniboxInputCancelledEvent
  var onInputChanged: OmniboxInputChangedEvent
  var onInputEntered: OmniboxInputEnteredEvent
  var onInputStarted: OmniboxInputStartedEvent
  def setDefaultSuggestion(suggestion: Suggestion): Unit
}

object Typeofomnibox {
  @scala.inline
  def apply(
    onDeleteSuggestion: OmniboxSuggestionDeletedEvent,
    onInputCancelled: OmniboxInputCancelledEvent,
    onInputChanged: OmniboxInputChangedEvent,
    onInputEntered: OmniboxInputEnteredEvent,
    onInputStarted: OmniboxInputStartedEvent,
    setDefaultSuggestion: Suggestion => Unit
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion, onInputCancelled = onInputCancelled, onInputChanged = onInputChanged, onInputEntered = onInputEntered, onInputStarted = onInputStarted, setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
  
    __obj.asInstanceOf[Typeofomnibox]
  }
}

