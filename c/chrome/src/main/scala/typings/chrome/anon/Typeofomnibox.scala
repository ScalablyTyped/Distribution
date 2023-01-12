package typings.chrome.anon

import typings.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typings.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typings.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typings.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typings.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typings.chrome.chrome.omnibox.Suggestion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofomnibox extends StObject {
  
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent
  
  var onInputCancelled: OmniboxInputCancelledEvent
  
  var onInputChanged: OmniboxInputChangedEvent
  
  var onInputEntered: OmniboxInputEnteredEvent
  
  var onInputStarted: OmniboxInputStartedEvent
  
  def setDefaultSuggestion(suggestion: Suggestion): Unit
}
object Typeofomnibox {
  
  inline def apply(
    onDeleteSuggestion: OmniboxSuggestionDeletedEvent,
    onInputCancelled: OmniboxInputCancelledEvent,
    onInputChanged: OmniboxInputChangedEvent,
    onInputEntered: OmniboxInputEnteredEvent,
    onInputStarted: OmniboxInputStartedEvent,
    setDefaultSuggestion: Suggestion => Unit
  ): Typeofomnibox = {
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion.asInstanceOf[js.Any], onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any], setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
    __obj.asInstanceOf[Typeofomnibox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofomnibox] (val x: Self) extends AnyVal {
    
    inline def setOnDeleteSuggestion(value: OmniboxSuggestionDeletedEvent): Self = StObject.set(x, "onDeleteSuggestion", value.asInstanceOf[js.Any])
    
    inline def setOnInputCancelled(value: OmniboxInputCancelledEvent): Self = StObject.set(x, "onInputCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnInputChanged(value: OmniboxInputChangedEvent): Self = StObject.set(x, "onInputChanged", value.asInstanceOf[js.Any])
    
    inline def setOnInputEntered(value: OmniboxInputEnteredEvent): Self = StObject.set(x, "onInputEntered", value.asInstanceOf[js.Any])
    
    inline def setOnInputStarted(value: OmniboxInputStartedEvent): Self = StObject.set(x, "onInputStarted", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultSuggestion(value: Suggestion => Unit): Self = StObject.set(x, "setDefaultSuggestion", js.Any.fromFunction1(value))
  }
}
