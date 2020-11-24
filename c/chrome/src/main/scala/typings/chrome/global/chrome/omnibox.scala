package typings.chrome.global.chrome

import typings.chrome.chrome.omnibox.OmniboxInputCancelledEvent
import typings.chrome.chrome.omnibox.OmniboxInputChangedEvent
import typings.chrome.chrome.omnibox.OmniboxInputEnteredEvent
import typings.chrome.chrome.omnibox.OmniboxInputStartedEvent
import typings.chrome.chrome.omnibox.OmniboxSuggestionDeletedEvent
import typings.chrome.chrome.omnibox.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Omnibox
////////////////////
/**
  * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
  * Manifest:  "omnibox": {...}
  * @since Chrome 9.
  */
@JSGlobal("chrome.omnibox")
@js.native
object omnibox extends js.Object {
  
  var onDeleteSuggestion: OmniboxSuggestionDeletedEvent = js.native
  
  var onInputCancelled: OmniboxInputCancelledEvent = js.native
  
  var onInputChanged: OmniboxInputChangedEvent = js.native
  
  var onInputEntered: OmniboxInputEnteredEvent = js.native
  
  var onInputStarted: OmniboxInputStartedEvent = js.native
  
  def setDefaultSuggestion(suggestion: Suggestion): Unit = js.native
}
