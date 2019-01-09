package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnDeleteSuggestion extends js.Object {
  var onDeleteSuggestion: chromeLib.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent
  var onInputCancelled: chromeLib.chromeNs.omniboxNs.OmniboxInputCancelledEvent
  var onInputChanged: chromeLib.chromeNs.omniboxNs.OmniboxInputChangedEvent
  var onInputEntered: chromeLib.chromeNs.omniboxNs.OmniboxInputEnteredEvent
  var onInputStarted: chromeLib.chromeNs.omniboxNs.OmniboxInputStartedEvent
  def setDefaultSuggestion(suggestion: chromeLib.chromeNs.omniboxNs.Suggestion): scala.Unit
}

