package typings
package chosenDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def chosen(): JQuery = js.native
  def chosen(options: chosenDashJsLib.ChosenNs.Options): JQuery = js.native
  @JSName("chosen")
  def chosen_destroy(options: chosenDashJsLib.chosenDashJsLibStrings.destroy): JQuery = js.native
  /**
       * * `chosen:ready` Triggered after Chosen has been fully instantiated.
       * * `chosen:maxselected` Triggered if max_selected_options is set and that total is broken.
       * * `chosen:showing_dropdown` Triggered when Chosen’s dropdown is opened.
       * * `chosen:hiding_dropdown` Triggered when Chosen’s dropdown is closed.
       * * `chosen:no_results` Triggered when a search returns no matching results.
       */
  def on(
    events: chosenDashJsLib.ChosenNs.OnEvent,
    handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]
  ): JQuery = js.native
  /**
       * Chosen triggers the standard DOM event whenever a selection is made (it also sends a selected or deselected parameter that tells you which option was changed).
       */
  @JSName("on")
  def on_change(
    events: chosenDashJsLib.chosenDashJsLibStrings.change,
    handler: js.Function2[
      /* eventObject */ jqueryLib.JQueryEventObject, 
      /* args */ chosenDashJsLib.ChosenNs.SelectedData, 
      _
    ]
  ): JQuery = js.native
  /**
       * * `chosen:updated` This event should be triggered whenever Chosen’s underlying select element changes (such as a change in selected options).
       * * `chosen:activate` This is the equivalant of focusing a standard HTML select field. When activated, Chosen will capure keypress events as if you had clicked the field directly.
       * * `chosen:open` This event activates Chosen and also displays the search results.
       * * `chosen:close` This event deactivates Chosen and hides the search results.
       */
  def trigger(eventType: chosenDashJsLib.ChosenNs.TriggerEvent): JQuery = js.native
}

