package typings.codemirrorState.mod

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorState.anon.Changes
import typings.codemirrorState.anon.Effects
import typings.codemirrorState.anon.PickTransactionSpeceffect
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
@JSImport("@codemirror/state", "EditorState")
@js.native
/* private */ open class EditorState () extends StObject {
  
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
    
    Examples of language data fields are...
    
    - [`"commentTokens"`](https://codemirror.net/6/docs/ref/#commands.CommentTokens) for specifying
    comment syntax.
    - [`"autocomplete"`](https://codemirror.net/6/docs/ref/#autocomplete.autocompletion^config.override)
    for providing language-specific completion sources.
    - [`"wordChars"`](https://codemirror.net/6/docs/ref/#state.EditorState.charCategorizer) for adding
    characters that should be considered part of words in this
    language.
    - [`"closeBrackets"`](https://codemirror.net/6/docs/ref/#autocomplete.CloseBracketConfig) controls
    bracket closing behavior.
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
object EditorState {
  
  @JSImport("@codemirror/state", "EditorState")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    A facet that, when enabled, causes the editor to allow multiple
    ranges to be selected. Be careful though, because by default the
    editor relies on the native DOM selection, which cannot handle
    multiple selections. An extension like
    [`drawSelection`](https://codemirror.net/6/docs/ref/#view.drawSelection) can be used to make
    secondary selections visible to the user.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.allowMultipleSelections")
  @js.native
  def allowMultipleSelections: Facet[Boolean, Boolean] = js.native
  inline def allowMultipleSelections_=(x: Facet[Boolean, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleSelections")(x.asInstanceOf[js.Any])
  
  /**
    Facet used to register change filters, which are called for each
    transaction (unless explicitly
    [disabled](https://codemirror.net/6/docs/ref/#state.TransactionSpec.filter)), and can suppress
    part of the transaction's changes.
    
    Such a function can return `true` to indicate that it doesn't
    want to do anything, `false` to completely stop the changes in
    the transaction, or a set of ranges in which changes should be
    suppressed. Such ranges are represented as an array of numbers,
    with each pair of two numbers indicating the start and end of a
    range. So for example `[10, 20, 100, 110]` suppresses changes
    between 10 and 20, and between 100 and 110.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.changeFilter")
  @js.native
  def changeFilter: Facet[
    js.Function1[/* tr */ Transaction, Boolean | js.Array[Double]], 
    js.Array[js.Function1[/* tr */ Transaction, Boolean | js.Array[Double]]]
  ] = js.native
  inline def changeFilter_=(
    x: Facet[
      js.Function1[/* tr */ Transaction, Boolean | js.Array[Double]], 
      js.Array[js.Function1[/* tr */ Transaction, Boolean | js.Array[Double]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changeFilter")(x.asInstanceOf[js.Any])
  
  /**
    Create a new state. You'll usually only need this when
    initializing an editor—updated states are created by applying
    transactions.
    */
  /* static member */
  inline def create(): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EditorState]
  inline def create(config: EditorStateConfig): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[EditorState]
  
  /**
    Deserialize a state from its JSON representation. When custom
    fields should be deserialized, pass the same object you passed
    to [`toJSON`](https://codemirror.net/6/docs/ref/#state.EditorState.toJSON) when serializing as
    third argument.
    */
  /* static member */
  inline def fromJSON(json: Any): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[EditorState]
  inline def fromJSON(json: Any, config: Unit, fields: StringDictionary[StateField[Any]]): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], config.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[EditorState]
  inline def fromJSON(json: Any, config: EditorStateConfig): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[EditorState]
  inline def fromJSON(json: Any, config: EditorStateConfig, fields: StringDictionary[StateField[Any]]): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], config.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[EditorState]
  
  /**
    A facet used to register [language
    data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) providers.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.languageData")
  @js.native
  def languageData: Facet[
    js.Function3[
      /* state */ EditorState, 
      /* pos */ Double, 
      /* side */ `0` | `1` | `-1`, 
      js.Array[StringDictionary[Any]]
    ], 
    js.Array[
      js.Function3[
        /* state */ EditorState, 
        /* pos */ Double, 
        /* side */ `0` | `1` | `-1`, 
        js.Array[StringDictionary[Any]]
      ]
    ]
  ] = js.native
  inline def languageData_=(
    x: Facet[
      js.Function3[
        /* state */ EditorState, 
        /* pos */ Double, 
        /* side */ `0` | `1` | `-1`, 
        js.Array[StringDictionary[Any]]
      ], 
      js.Array[
        js.Function3[
          /* state */ EditorState, 
          /* pos */ Double, 
          /* side */ `0` | `1` | `-1`, 
          js.Array[StringDictionary[Any]]
        ]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languageData")(x.asInstanceOf[js.Any])
  
  /**
    The line separator to use. By default, any of `"\n"`, `"\r\n"`
    and `"\r"` is treated as a separator when splitting lines, and
    lines are joined with `"\n"`.
    
    When you configure a value here, only that precise separator
    will be used, allowing you to round-trip documents through the
    editor without normalizing line separators.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.lineSeparator")
  @js.native
  def lineSeparator: Facet[String, js.UndefOr[String]] = js.native
  inline def lineSeparator_=(x: Facet[String, js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineSeparator")(x.asInstanceOf[js.Any])
  
  /**
    Registers translation phrases. The
    [`phrase`](https://codemirror.net/6/docs/ref/#state.EditorState.phrase) method will look through
    all objects registered with this facet to find translations for
    its argument.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.phrases")
  @js.native
  def phrases: Facet[StringDictionary[String], js.Array[StringDictionary[String]]] = js.native
  inline def phrases_=(x: Facet[StringDictionary[String], js.Array[StringDictionary[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phrases")(x.asInstanceOf[js.Any])
  
  /**
    This facet controls the value of the
    [`readOnly`](https://codemirror.net/6/docs/ref/#state.EditorState.readOnly) getter, which is
    consulted by commands and extensions that implement editing
    functionality to determine whether they should apply. It
    defaults to false, but when its highest-precedence value is
    `true`, such functionality disables itself.
    
    Not to be confused with
    [`EditorView.editable`](https://codemirror.net/6/docs/ref/#view.EditorView^editable), which
    controls whether the editor's DOM is set to be editable (and
    thus focusable).
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.readOnly")
  @js.native
  def readOnly: Facet[Boolean, Boolean] = js.native
  inline def readOnly_=(x: Facet[Boolean, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
  
  /**
    Configures the tab size to use in this state. The first
    (highest-precedence) value of the facet is used. If no value is
    given, this defaults to 4.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.tabSize")
  @js.native
  def tabSize: Facet[Double, Double] = js.native
  inline def tabSize_=(x: Facet[Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabSize")(x.asInstanceOf[js.Any])
  
  /**
    This is a more limited form of
    [`transactionFilter`](https://codemirror.net/6/docs/ref/#state.EditorState^transactionFilter),
    which can only add
    [annotations](https://codemirror.net/6/docs/ref/#state.TransactionSpec.annotations) and
    [effects](https://codemirror.net/6/docs/ref/#state.TransactionSpec.effects). _But_, this type
    of filter runs even if the transaction has disabled regular
    [filtering](https://codemirror.net/6/docs/ref/#state.TransactionSpec.filter), making it suitable
    for effects that don't need to touch the changes or selection,
    but do want to process every transaction.
    
    Extenders run _after_ filters, when both are present.
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.transactionExtender")
  @js.native
  def transactionExtender: Facet[
    js.Function1[/* tr */ Transaction, PickTransactionSpeceffect | Null], 
    js.Array[js.Function1[/* tr */ Transaction, PickTransactionSpeceffect | Null]]
  ] = js.native
  inline def transactionExtender_=(
    x: Facet[
      js.Function1[/* tr */ Transaction, PickTransactionSpeceffect | Null], 
      js.Array[js.Function1[/* tr */ Transaction, PickTransactionSpeceffect | Null]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transactionExtender")(x.asInstanceOf[js.Any])
  
  /**
    Facet used to register a hook that gets a chance to update or
    replace transaction specs before they are applied. This will
    only be applied for transactions that don't have
    [`filter`](https://codemirror.net/6/docs/ref/#state.TransactionSpec.filter) set to `false`. You
    can either return a single transaction spec (possibly the input
    transaction), or an array of specs (which will be combined in
    the same way as the arguments to
    [`EditorState.update`](https://codemirror.net/6/docs/ref/#state.EditorState.update)).
    
    When possible, it is recommended to avoid accessing
    [`Transaction.state`](https://codemirror.net/6/docs/ref/#state.Transaction.state) in a filter,
    since it will force creation of a state that will then be
    discarded again, if the transaction is actually filtered.
    
    (This functionality should be used with care. Indiscriminately
    modifying transaction is likely to break something or degrade
    the user experience.)
    */
  /* static member */
  @JSImport("@codemirror/state", "EditorState.transactionFilter")
  @js.native
  def transactionFilter: Facet[
    js.Function1[/* tr */ Transaction, TransactionSpec | js.Array[TransactionSpec]], 
    js.Array[js.Function1[/* tr */ Transaction, TransactionSpec | js.Array[TransactionSpec]]]
  ] = js.native
  inline def transactionFilter_=(
    x: Facet[
      js.Function1[/* tr */ Transaction, TransactionSpec | js.Array[TransactionSpec]], 
      js.Array[js.Function1[/* tr */ Transaction, TransactionSpec | js.Array[TransactionSpec]]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transactionFilter")(x.asInstanceOf[js.Any])
}
