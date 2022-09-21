package typings.codemirrorState.mod

import typings.codemirrorState.codemirrorStateNumbers.`-1`
import typings.codemirrorState.codemirrorStateNumbers.`0`
import typings.codemirrorState.codemirrorStateNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A single selection range. When
[`allowMultipleSelections`](https://codemirror.net/6/docs/ref/#state.EditorState^allowMultipleSelections)
is enabled, a [selection](https://codemirror.net/6/docs/ref/#state.EditorSelection) may hold
multiple ranges. By default, selections hold exactly one range.
*/
@JSImport("@codemirror/state", "SelectionRange")
@js.native
/* private */ open class SelectionRange () extends StObject {
  
  /**
    The anchor of the range—the side that doesn't move when you
    extend it.
    */
  def anchor: Double = js.native
  
  /**
    If this is a cursor that is explicitly associated with the
    character on one of its sides, this returns the side. -1 means
    the character before its position, 1 the character after, and 0
    means no association.
    */
  def assoc: `-1` | `0` | `1` = js.native
  
  /**
    The bidirectional text level associated with this cursor, if
    any.
    */
  def bidiLevel: Double | Null = js.native
  
  /**
    True when `anchor` and `head` are at the same position.
    */
  def empty: Boolean = js.native
  
  /**
    Compare this range to another range.
    */
  def eq(other: SelectionRange): Boolean = js.native
  
  /**
    Extend this range to cover at least `from` to `to`.
    */
  def extend(from: Double): SelectionRange = js.native
  def extend(from: Double, to: Double): SelectionRange = js.native
  
  /* private */ var flags: Any = js.native
  
  /**
    The lower boundary of the range.
    */
  val from: Double = js.native
  
  /**
    The goal column (stored vertical offset) associated with a
    cursor. This is used to preserve the vertical position when
    [moving](https://codemirror.net/6/docs/ref/#view.EditorView.moveVertically) across
    lines of different length.
    */
  def goalColumn: js.UndefOr[Double] = js.native
  
  /**
    The head of the range, which is moved when the range is
    [extended](https://codemirror.net/6/docs/ref/#state.SelectionRange.extend).
    */
  def head: Double = js.native
  
  /**
    Map this range through a change, producing a valid range in the
    updated document.
    */
  def map(change: ChangeDesc): SelectionRange = js.native
  def map(change: ChangeDesc, assoc: Double): SelectionRange = js.native
  
  /**
    The upper boundary of the range.
    */
  val to: Double = js.native
  
  /**
    Return a JSON-serializable object representing the range.
    */
  def toJSON(): Any = js.native
}
object SelectionRange {
  
  @JSImport("@codemirror/state", "SelectionRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Convert a JSON representation of a range to a `SelectionRange`
    instance.
    */
  /* static member */
  inline def fromJSON(json: Any): SelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SelectionRange]
}
