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

object Anon_OnDeleteSuggestion {
  @scala.inline
  def apply(
    onDeleteSuggestion: chromeLib.chromeNs.omniboxNs.OmniboxSuggestionDeletedEvent,
    onInputCancelled: chromeLib.chromeNs.omniboxNs.OmniboxInputCancelledEvent,
    onInputChanged: chromeLib.chromeNs.omniboxNs.OmniboxInputChangedEvent,
    onInputEntered: chromeLib.chromeNs.omniboxNs.OmniboxInputEnteredEvent,
    onInputStarted: chromeLib.chromeNs.omniboxNs.OmniboxInputStartedEvent,
    setDefaultSuggestion: js.Function1[chromeLib.chromeNs.omniboxNs.Suggestion, scala.Unit]
  ): Anon_OnDeleteSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDeleteSuggestion")(onDeleteSuggestion)
    __obj.updateDynamic("onInputCancelled")(onInputCancelled)
    __obj.updateDynamic("onInputChanged")(onInputChanged)
    __obj.updateDynamic("onInputEntered")(onInputEntered)
    __obj.updateDynamic("onInputStarted")(onInputStarted)
    __obj.updateDynamic("setDefaultSuggestion")(setDefaultSuggestion)
    __obj.asInstanceOf[Anon_OnDeleteSuggestion]
  }
}

