package typings.brace.braceMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoManager extends js.Object {
  /**
    * Provides a means for implementing your own undo manager. `options` has one property, `args`, an [[Array `Array`]], with two elements:
    * - `args[0]` is an array of deltas
    * - `args[1]` is the document to associate with
    * @param options Contains additional properties
    **/
  def execute(options: js.Any): Unit = js.native
  /**
    * Returns `true` if there are redo operations left to perform.
    **/
  def hasRedo(): Boolean = js.native
  /**
    * Returns `true` if there are undo operations left to perform.
    **/
  def hasUndo(): Boolean = js.native
  /**
    * Returns `true` if the dirty counter is 0
    **/
  def isClean(): Boolean = js.native
  /**
    * Sets dirty counter to 0
    **/
  def markClean(): Unit = js.native
  /**
    * [Perform a redo operation on the document, reimplementing the last change.]{: #UndoManager.redo}
    * @param dontSelect {:dontSelect}
    **/
  def redo(dontSelect: Boolean): Unit = js.native
  /**
    * Destroys the stack of undo and redo redo operations.
    **/
  def reset(): Unit = js.native
  /**
    * [Perform an undo operation on the document, reverting the last change.]{: #UndoManager.undo}
    * @param dontSelect {:dontSelect}
    **/
  def undo(): Range = js.native
  def undo(dontSelect: Boolean): Range = js.native
}

@JSImport("brace", "UndoManager")
@js.native
object UndoManager
  extends /**
  * Resets the current undo state and creates a new `UndoManager`.
  **/
Instantiable0[UndoManager]

