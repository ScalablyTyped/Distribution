package typings.chrome.anon

import typings.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typings.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typings.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typings.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typings.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typings.chrome.chrome.omnibox.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofomnibox extends js.Object {
  
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent = js.native
  
  var onInputCancelled: OmniboxInputCancelledEvent = js.native
  
  var onInputChanged: OmniboxInputChangedEvent = js.native
  
  var onInputEntered: OmniboxInputEnteredEvent = js.native
  
  var onInputStarted: OmniboxInputStartedEvent = js.native
  
  def setDefaultSuggestion(suggestion: Suggestion): Unit = js.native
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
    val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion.asInstanceOf[js.Any], onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any], setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
    __obj.asInstanceOf[Typeofomnibox]
  }
  
  @scala.inline
  implicit class TypeofomniboxOps[Self <: Typeofomnibox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnDeleteSuggestion(value: OmniboxSuggestionDeletedEvent): Self = this.set("onDeleteSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputCancelled(value: OmniboxInputCancelledEvent): Self = this.set("onInputCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputChanged(value: OmniboxInputChangedEvent): Self = this.set("onInputChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputEntered(value: OmniboxInputEnteredEvent): Self = this.set("onInputEntered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInputStarted(value: OmniboxInputStartedEvent): Self = this.set("onInputStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultSuggestion(value: Suggestion => Unit): Self = this.set("setDefaultSuggestion", js.Any.fromFunction1(value))
  }
}
