package typings.codemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorState.anon.Changes
import typings.codemirrorState.anon.Effects
import typings.codemirrorState.codemirrorStateBooleans.`false`
import typings.codemirrorState.codemirrorStateInts.`-1`
import typings.codemirrorState.codemirrorStateInts.`0`
import typings.codemirrorState.codemirrorStateInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
The editor state class is a persistent (immutable) data structure.
To update a state, you [create](https://codemirror.net/6/docs/ref/#state.EditorState.update) a
[transaction](https://codemirror.net/6/docs/ref/#state.Transaction), which produces a _new_ state
instance, without modifying the original object.
As such, _never_ mutate properties of a state directly. That'll
just break things.
*/
@js.native
trait EditorState extends StObject {
  
  /**
    Create a set of changes and a new selection by running the given
    function for each range in the active selection. The function
    can return an optional set of changes (in the coordinate space
    of the start document), plus an updated range (in the coordinate
    space of the document produced by the call's own changes). This
    method will merge all the changes and ranges into a single
    changeset and selection, and return it as a [transaction
    spec](https://codemirror.net/6/docs/ref/#state.TransactionSpec), which can be passed to
    [`update`](https://codemirror.net/6/docs/ref/#state.EditorState.update).
    */
  def changeByRange(f: js.Function1[/* range */ SelectionRange, Changes]): Effects = js.native
  
  /**
    Create a [change set](https://codemirror.net/6/docs/ref/#state.ChangeSet) from the given change
    description, taking the state's document length and line
    separator into account.
    */
  def changes(): ChangeSet = js.native
  def changes(spec: ChangeSpec): ChangeSet = js.native
  
  /**
    Return a function that can categorize strings (expected to
    represent a single [grapheme cluster](https://codemirror.net/6/docs/ref/#state.findClusterBreak))
    into one of:
    
    - Word (contains an alphanumeric character or a character
    explicitly listed in the local language's `"wordChars"`
    language data, which should be a string)
    - Space (contains only whitespace)
    - Other (anything else)
    */
  def charCategorizer(at: Double): js.Function1[/* char */ String, CharCategory] = js.native
  
  /**
    The current document.
    */
  val doc: Text = js.native
  
  /**
    Get the value of a state [facet](https://codemirror.net/6/docs/ref/#state.Facet).
    */
  def facet[Output](facet: Facet[Any, Output]): Output = js.native
  
  /**
    Retrieve the value of a [state field](https://codemirror.net/6/docs/ref/#state.StateField). Throws
    an error when the state doesn't have that field, unless you pass
    `false` as second parameter.
    */
  def field[T](field: StateField[T]): T = js.native
  @JSName("field")
  def field_false[T](field: StateField[T], require: `false`): js.UndefOr[T] = js.native
  
  /**
    Find the values for a given language data field, provided by the
    the [`languageData`](https://codemirror.net/6/docs/ref/#state.EditorState^languageData) facet.
    */
  def languageDataAt[T](name: String, pos: Double): js.Array[T] = js.native
  def languageDataAt[T](name: String, pos: Double, side: `-1` | `0` | `1`): js.Array[T] = js.native
  
  /**
    Get the proper [line-break](https://codemirror.net/6/docs/ref/#state.EditorState^lineSeparator)
    string for this state.
    */
  def lineBreak: String = js.native
  
  /**
    Look up a translation for the given phrase (via the
    [`phrases`](https://codemirror.net/6/docs/ref/#state.EditorState^phrases) facet), or return the
    original string if no translation is found.
    
    If additional arguments are passed, they will be inserted in
    place of markers like `$1` (for the first value) and `$2`, etc.
    A single `$` is equivalent to `$1`, and `$$` will produce a
    literal dollar sign.
    */
  def phrase(phrase: String, insert: Any*): String = js.native
  
  /**
    Returns true when the editor is
    [configured](https://codemirror.net/6/docs/ref/#state.EditorState^readOnly) to be read-only.
    */
  def readOnly: Boolean = js.native
  
  /**
    Create a [transaction spec](https://codemirror.net/6/docs/ref/#state.TransactionSpec) that
    replaces every selection range with the given content.
    */
  def replaceSelection(text: String): TransactionSpec = js.native
  def replaceSelection(text: Text): TransactionSpec = js.native
  
  /**
    The current selection.
    */
  val selection: EditorSelection = js.native
  
  /**
    Return the given range of the document as a string.
    */
  def sliceDoc(): String = js.native
  def sliceDoc(from: Double): String = js.native
  def sliceDoc(from: Double, to: Double): String = js.native
  def sliceDoc(from: Unit, to: Double): String = js.native
  
  /**
    The size (in columns) of a tab in the document, determined by
    the [`tabSize`](https://codemirror.net/6/docs/ref/#state.EditorState^tabSize) facet.
    */
  def tabSize: Double = js.native
  
  /**
    Convert this state to a JSON-serializable object. When custom
    fields should be serialized, you can pass them in as an object
    mapping property names (in the resulting object, which should
    not use `doc` or `selection`) to fields.
    */
  def toJSON(): Any = js.native
  def toJSON(fields: StringDictionary[StateField[Any]]): Any = js.native
  
  /**
    Using the state's [line
    separator](https://codemirror.net/6/docs/ref/#state.EditorState^lineSeparator), create a
    [`Text`](https://codemirror.net/6/docs/ref/#state.Text) instance from the given string.
    */
  def toText(string: String): Text = js.native
  
  /**
    Create a [transaction](https://codemirror.net/6/docs/ref/#state.Transaction) that updates this
    state. Any number of [transaction specs](https://codemirror.net/6/docs/ref/#state.TransactionSpec)
    can be passed. Unless
    [`sequential`](https://codemirror.net/6/docs/ref/#state.TransactionSpec.sequential) is set, the
    [changes](https://codemirror.net/6/docs/ref/#state.TransactionSpec.changes) (if any) of each spec
    are assumed to start in the _current_ document (not the document
    produced by previous specs), and its
    [selection](https://codemirror.net/6/docs/ref/#state.TransactionSpec.selection) and
    [effects](https://codemirror.net/6/docs/ref/#state.TransactionSpec.effects) are assumed to refer
    to the document created by its _own_ changes. The resulting
    transaction contains the combined effect of all the different
    specs. For [selection](https://codemirror.net/6/docs/ref/#state.TransactionSpec.selection), later
    specs take precedence over earlier ones.
    */
  def update(specs: TransactionSpec*): Transaction = js.native
  
  /**
    Find the word at the given position, meaning the range
    containing all [word](https://codemirror.net/6/docs/ref/#state.CharCategory.Word) characters
    around it. If no word characters are adjacent to the position,
    this returns null.
    */
  def wordAt(pos: Double): SelectionRange | Null = js.native
}
