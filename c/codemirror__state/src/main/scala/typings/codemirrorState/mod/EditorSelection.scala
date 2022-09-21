package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
An editor selection holds one or more selection ranges.
*/
@JSImport("@codemirror/state", "EditorSelection")
@js.native
/* private */ open class EditorSelection () extends StObject {
  
  /**
    Extend this selection with an extra range.
    */
  def addRange(range: SelectionRange): EditorSelection = js.native
  def addRange(range: SelectionRange, main: Boolean): EditorSelection = js.native
  
  /**
    Make sure the selection only has one range. Returns a selection
    holding only the main range from this selection.
    */
  def asSingle(): EditorSelection = js.native
  
  /**
    Compare this selection to another selection.
    */
  def eq(other: EditorSelection): Boolean = js.native
  
  /**
    Get the primary selection range. Usually, you should make sure
    your code applies to _all_ ranges, by using methods like
    [`changeByRange`](https://codemirror.net/6/docs/ref/#state.EditorState.changeByRange).
    */
  def main: SelectionRange = js.native
  
  /**
    The index of the _main_ range in the selection (which is
    usually the range that was added last).
    */
  val mainIndex: Double = js.native
  
  /**
    Map a selection through a change. Used to adjust the selection
    position for changes.
    */
  def map(change: ChangeDesc): EditorSelection = js.native
  def map(change: ChangeDesc, assoc: Double): EditorSelection = js.native
  
  /**
    The ranges in the selection, sorted by position. Ranges cannot
    overlap (but they may touch, if they aren't empty).
    */
  val ranges: js.Array[SelectionRange] = js.native
  
  /**
    Replace a given range with another range, and then normalize the
    selection to merge and sort ranges if necessary.
    */
  def replaceRange(range: SelectionRange): EditorSelection = js.native
  def replaceRange(range: SelectionRange, which: Double): EditorSelection = js.native
  
  /**
    Convert this selection to an object that can be serialized to
    JSON.
    */
  def toJSON(): Any = js.native
}
object EditorSelection {
  
  @JSImport("@codemirror/state", "EditorSelection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Sort and merge the given set of ranges, creating a valid
    selection.
    */
  /* static member */
  inline def create(ranges: js.Array[SelectionRange]): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(ranges.asInstanceOf[js.Any]).asInstanceOf[EditorSelection]
  inline def create(ranges: js.Array[SelectionRange], mainIndex: Double): EditorSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(ranges.asInstanceOf[js.Any], mainIndex.asInstanceOf[js.Any])).asInstanceOf[EditorSelection]
  
  /**
    Create a cursor selection range at the given position. You can
    safely ignore the optional arguments in most situations.
    */
  /* static member */
  inline def cursor(pos: Double): SelectionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any]).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Double, bidiLevel: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any], bidiLevel.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Double, bidiLevel: Double, goalColumn: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any], bidiLevel.asInstanceOf[js.Any], goalColumn.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Double, bidiLevel: Unit, goalColumn: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any], bidiLevel.asInstanceOf[js.Any], goalColumn.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Unit, bidiLevel: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any], bidiLevel.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Unit, bidiLevel: Double, goalColumn: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any], bidiLevel.asInstanceOf[js.Any], goalColumn.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def cursor(pos: Double, assoc: Unit, bidiLevel: Unit, goalColumn: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("cursor")(pos.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any], bidiLevel.asInstanceOf[js.Any], goalColumn.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  
  /**
    Create a selection from a JSON representation.
    */
  /* static member */
  inline def fromJSON(json: Any): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[EditorSelection]
  
  /**
    Create a selection range.
    */
  /* static member */
  inline def range(anchor: Double, head: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(anchor.asInstanceOf[js.Any], head.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  inline def range(anchor: Double, head: Double, goalColumn: Double): SelectionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(anchor.asInstanceOf[js.Any], head.asInstanceOf[js.Any], goalColumn.asInstanceOf[js.Any])).asInstanceOf[SelectionRange]
  
  /**
    Create a selection holding a single range.
    */
  /* static member */
  inline def single(anchor: Double): EditorSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(anchor.asInstanceOf[js.Any]).asInstanceOf[EditorSelection]
  inline def single(anchor: Double, head: Double): EditorSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("single")(anchor.asInstanceOf[js.Any], head.asInstanceOf[js.Any])).asInstanceOf[EditorSelection]
}
