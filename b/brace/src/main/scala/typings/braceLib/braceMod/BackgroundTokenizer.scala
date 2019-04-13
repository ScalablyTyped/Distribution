package typings
package braceLib.braceMod

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

@JSImport("brace", "BackgroundTokenizer")
@js.native
class BackgroundTokenizerCls protected () extends BackgroundTokenizer {
  /**
    * Creates a new `BackgroundTokenizer` object.
    * @param tokenizer The tokenizer to use
    * @param editor The editor to associate with
    **/
  def this(tokenizer: Tokenizer, editor: Editor) = this()
  /* CompleteClass */
  override var states: js.Array[_] = js.native
  /**
    * Emits the `'update'` event. `firstRow` and `lastRow` are used to define the boundaries of the region to be updated.
    * @param firstRow The starting row region
    * @param lastRow The final row region
    **/
  /* CompleteClass */
  override def fireUpdateEvent(firstRow: scala.Double, lastRow: scala.Double): scala.Unit = js.native
  /**
    * [Returns the state of tokenization at the end of a row.]{: #BackgroundTokenizer.getState}
    * @param row The row to get state at
    **/
  /* CompleteClass */
  override def getState(row: scala.Double): java.lang.String = js.native
  /**
    * Gives list of tokens of the row. (tokens are cached)
    * @param row The row to get tokens at
    **/
  /* CompleteClass */
  override def getTokens(row: scala.Double): js.Array[TokenInfo] = js.native
  /**
    * Sets a new document to associate with this object.
    * @param doc The new document to associate with
    **/
  /* CompleteClass */
  override def setDocument(doc: Document): scala.Unit = js.native
  /**
    * Sets a new tokenizer for this object.
    * @param tokenizer The new tokenizer to use
    **/
  /* CompleteClass */
  override def setTokenizer(tokenizer: Tokenizer): scala.Unit = js.native
  /**
    * Starts tokenizing at the row indicated.
    * @param startRow The row to start at
    **/
  /* CompleteClass */
  override def start(startRow: scala.Double): scala.Unit = js.native
  /**
    * Stops tokenizing.
    **/
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
}

@JSImport("brace", "BackgroundTokenizer")
@js.native
object BackgroundTokenizer
  extends /**
  * Creates a new `BackgroundTokenizer` object.
  * @param tokenizer The tokenizer to use
  * @param editor The editor to associate with
  **/
org.scalablytyped.runtime.Instantiable2[/* tokenizer */ Tokenizer, /* editor */ Editor, BackgroundTokenizer]

