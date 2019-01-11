package typings
package chromeLib.chromeNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.omnibox")
@js.native
object ^ extends js.Object {
  var onDeleteSuggestion: chromeLib.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent = js.native
  var onInputCancelled: chromeLib.chromeNs.omniboxNs.OmniboxInputCancelledEvent = js.native
  var onInputChanged: chromeLib.chromeNs.omniboxNs.OmniboxInputChangedEvent = js.native
  var onInputEntered: chromeLib.chromeNs.omniboxNs.OmniboxInputEnteredEvent = js.native
  var onInputStarted: chromeLib.chromeNs.omniboxNs.OmniboxInputStartedEvent = js.native
  def setDefaultSuggestion(suggestion: chromeLib.chromeNs.omniboxNs.Suggestion): scala.Unit = js.native
}

