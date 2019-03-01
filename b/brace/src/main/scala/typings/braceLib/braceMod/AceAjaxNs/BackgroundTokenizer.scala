package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundTokenizer extends js.Object {
  var states: js.Array[_]
  /**
    * Emits the `'update'` event. `firstRow` and `lastRow` are used to define the boundaries of the region to be updated.
    * @param firstRow The starting row region
    * @param lastRow The final row region
    **/
  def fireUpdateEvent(firstRow: scala.Double, lastRow: scala.Double): scala.Unit
  /**
    * [Returns the state of tokenization at the end of a row.]{: #BackgroundTokenizer.getState}
    * @param row The row to get state at
    **/
  def getState(row: scala.Double): java.lang.String
  /**
    * Gives list of tokens of the row. (tokens are cached)
    * @param row The row to get tokens at
    **/
  def getTokens(row: scala.Double): js.Array[TokenInfo]
  /**
    * Sets a new document to associate with this object.
    * @param doc The new document to associate with
    **/
  def setDocument(doc: Document): scala.Unit
  /**
    * Sets a new tokenizer for this object.
    * @param tokenizer The new tokenizer to use
    **/
  def setTokenizer(tokenizer: Tokenizer): scala.Unit
  /**
    * Starts tokenizing at the row indicated.
    * @param startRow The row to start at
    **/
  def start(startRow: scala.Double): scala.Unit
  /**
    * Stops tokenizing.
    **/
  def stop(): scala.Unit
}

object BackgroundTokenizer {
  @scala.inline
  def apply(
    fireUpdateEvent: js.Function2[scala.Double, scala.Double, scala.Unit],
    getState: js.Function1[scala.Double, java.lang.String],
    getTokens: js.Function1[scala.Double, js.Array[TokenInfo]],
    setDocument: js.Function1[Document, scala.Unit],
    setTokenizer: js.Function1[Tokenizer, scala.Unit],
    start: js.Function1[scala.Double, scala.Unit],
    states: js.Array[_],
    stop: js.Function0[scala.Unit]
  ): BackgroundTokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fireUpdateEvent")(fireUpdateEvent)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("getTokens")(getTokens)
    __obj.updateDynamic("setDocument")(setDocument)
    __obj.updateDynamic("setTokenizer")(setTokenizer)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("states")(states)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[BackgroundTokenizer]
  }
}

