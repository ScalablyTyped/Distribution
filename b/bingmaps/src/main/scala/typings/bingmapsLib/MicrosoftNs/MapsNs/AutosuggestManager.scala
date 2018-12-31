package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.AutosuggestManager")
@js.native
/**
  * @constructor
  * @requires The Microsoft.Maps.Autosuggest module.
  * @param options The options to use with the autosuggest manager.
  */
class AutosuggestManager () extends js.Object {
  def this(options: IAutosuggestOptions) = this()
  /**
    * Attaches the Autosuggest functionality to an input box.
    * @param suggestionBoxId The HTML element identifier of the input box.
    * @param suggestionContainerId The Id of container where suggestions will be displayed.
    * @param selectedSuggestionCallback A reference to a callback function that will be called when a user selects a suggestion from the Autosuggest UI.
    */
  def attachAutosuggest(
    suggestionBoxId: java.lang.String,
    suggestionContainerId: java.lang.String,
    selectedSuggestionCallback: js.Function1[/* result */ ISuggestionResult, scala.Unit]
  ): scala.Unit = js.native
  /** Detaches the autosuggest functionality from the input box, freeing any resources it has or events it has tied to. */
  def detachAutosuggest(): scala.Unit = js.native
  /** Disposes the Autosuggest object, freeing any resources it has or events it has tied to. */
  def dispose(): scala.Unit = js.native
  /**
    * Gets the options currently used by the autosuggest manager.
    * @returns The options currently used by the autosuggest manager.
    */
  def getOptions(): IAutosuggestOptions = js.native
  /**
    * Programmatically retrieves suggestions for queries without the need to attach a textbox to the AutosuggestManager.
    * @param query The text to get suggestions for.
    * @param callback The callback function to return the suggestions to.
    */
  def getSuggestions(
    query: java.lang.String,
    callback: js.Function2[
      /* suggestions */ js.Array[ISuggestionResult], 
      /* query */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Sets the options currently used by the autosuggest manager.
    * @param options The options to use with the autosuggest manager.
    */
  def setOptions(): scala.Unit = js.native
  def setOptions(options: IAutosuggestOptions): scala.Unit = js.native
}

