package typings.codemirrorAutocomplete

import typings.codemirrorAutocomplete.anon.Class
import typings.codemirrorAutocomplete.anon.Dispatch
import typings.codemirrorAutocomplete.anon.From
import typings.codemirrorAutocomplete.anon.Position
import typings.codemirrorAutocomplete.anon.Text
import typings.codemirrorAutocomplete.codemirrorAutocompleteStrings.abort
import typings.codemirrorAutocomplete.codemirrorAutocompleteStrings.active
import typings.codemirrorAutocomplete.codemirrorAutocompleteStrings.option
import typings.codemirrorAutocomplete.codemirrorAutocompleteStrings.page
import typings.codemirrorAutocomplete.codemirrorAutocompleteStrings.pending
import typings.codemirrorState.mod.AnnotationType
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.Facet
import typings.codemirrorState.mod.StateCommand
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorState.mod.Transaction
import typings.codemirrorState.mod.TransactionSpec
import typings.codemirrorView.mod.Command
import typings.codemirrorView.mod.EditorView
import typings.codemirrorView.mod.KeyBinding
import typings.codemirrorView.mod.Rect
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  An instance of this is passed to completion source functions.
  */
  @JSImport("@codemirror/autocomplete", "CompletionContext")
  @js.native
  open class CompletionContext protected () extends StObject {
    /**
      Create a new completion context. (Mostly useful for testing
      completion sources—in the editor, the extension will create
      these for you.)
      */
    def this(
      /**
      The editor state that the completion happens in.
      */
    state: EditorState,
      /**
      The position at which the completion is happening.
      */
    pos: Double,
      /**
      Indicates whether completion was activated explicitly, or
      implicitly by typing. The usual way to respond to this is to
      only return completions when either there is part of a
      completable entity before the cursor, or `explicit` is true.
      */
    explicit: Boolean
    ) = this()
    
    /**
      Yields true when the query has been aborted. Can be useful in
      asynchronous queries to avoid doing work that will be ignored.
      */
    def aborted: Boolean = js.native
    
    /**
      Allows you to register abort handlers, which will be called when
      the query is
      [aborted](https://codemirror.net/6/docs/ref/#autocomplete.CompletionContext.aborted).
      */
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
    
    /**
      Indicates whether completion was activated explicitly, or
      implicitly by typing. The usual way to respond to this is to
      only return completions when either there is part of a
      completable entity before the cursor, or `explicit` is true.
      */
    val explicit: Boolean = js.native
    
    /**
      Get the match of the given expression directly before the
      cursor.
      */
    def matchBefore(expr: js.RegExp): Text | Null = js.native
    
    /**
      The position at which the completion is happening.
      */
    val pos: Double = js.native
    
    /**
      The editor state that the completion happens in.
      */
    val state: EditorState = js.native
    
    /**
      Get the extent, content, and (if there is a token) type of the
      token before `this.pos`.
      */
    def tokenBefore(types: js.Array[String]): From | Null = js.native
  }
  
  /**
  Accept the current completion.
  */
  @JSImport("@codemirror/autocomplete", "acceptCompletion")
  @js.native
  val acceptCompletion: Command = js.native
  
  /**
  Returns an extension that enables autocompletion.
  */
  inline def autocompletion(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("autocompletion")().asInstanceOf[Extension]
  inline def autocompletion(config: CompletionConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("autocompletion")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  A command that clears the active snippet, if any.
  */
  @JSImport("@codemirror/autocomplete", "clearSnippet")
  @js.native
  val clearSnippet: StateCommand = js.native
  
  /**
  Extension to enable bracket-closing behavior. When a closeable
  bracket is typed, its closing bracket is immediately inserted
  after the cursor. When closing a bracket directly in front of a
  closing bracket inserted by the extension, the cursor moves over
  that bracket.
  */
  inline def closeBrackets(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("closeBrackets")().asInstanceOf[Extension]
  
  /**
  Close-brackets related key bindings. Binds Backspace to
  [`deleteBracketPair`](https://codemirror.net/6/docs/ref/#autocomplete.deleteBracketPair).
  */
  @JSImport("@codemirror/autocomplete", "closeBracketsKeymap")
  @js.native
  val closeBracketsKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Close the currently active completion.
  */
  @JSImport("@codemirror/autocomplete", "closeCompletion")
  @js.native
  val closeCompletion: Command = js.native
  
  /**
  A completion source that will scan the document for words (using a
  [character categorizer](https://codemirror.net/6/docs/ref/#state.EditorState.charCategorizer)), and
  return those as completions.
  */
  @JSImport("@codemirror/autocomplete", "completeAnyWord")
  @js.native
  val completeAnyWord: CompletionSource = js.native
  
  /**
  Given a a fixed array of options, return an autocompleter that
  completes them.
  */
  inline def completeFromList(list: js.Array[String | Completion]): CompletionSource = ^.asInstanceOf[js.Dynamic].applyDynamic("completeFromList")(list.asInstanceOf[js.Any]).asInstanceOf[CompletionSource]
  
  /**
  Basic keybindings for autocompletion.
    - Ctrl-Space: [`startCompletion`](https://codemirror.net/6/docs/ref/#autocomplete.startCompletion)
    - Escape: [`closeCompletion`](https://codemirror.net/6/docs/ref/#autocomplete.closeCompletion)
    - ArrowDown: [`moveCompletionSelection`](https://codemirror.net/6/docs/ref/#autocomplete.moveCompletionSelection)`(true)`
    - ArrowUp: [`moveCompletionSelection`](https://codemirror.net/6/docs/ref/#autocomplete.moveCompletionSelection)`(false)`
    - PageDown: [`moveCompletionSelection`](https://codemirror.net/6/docs/ref/#autocomplete.moveCompletionSelection)`(true, "page")`
    - PageDown: [`moveCompletionSelection`](https://codemirror.net/6/docs/ref/#autocomplete.moveCompletionSelection)`(true, "page")`
    - Enter: [`acceptCompletion`](https://codemirror.net/6/docs/ref/#autocomplete.acceptCompletion)
  */
  @JSImport("@codemirror/autocomplete", "completionKeymap")
  @js.native
  val completionKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Get the current completion status. When completions are available,
  this will return `"active"`. When completions are pending (in the
  process of being queried), this returns `"pending"`. Otherwise, it
  returns `null`.
  */
  inline def completionStatus(state: EditorState): Null | active | pending = ^.asInstanceOf[js.Dynamic].applyDynamic("completionStatus")(state.asInstanceOf[js.Any]).asInstanceOf[Null | active | pending]
  
  /**
  Returns the available completions as an array.
  */
  inline def currentCompletions(state: EditorState): js.Array[Completion] = ^.asInstanceOf[js.Dynamic].applyDynamic("currentCompletions")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[Completion]]
  
  /**
  Command that implements deleting a pair of matching brackets when
  the cursor is between them.
  */
  @JSImport("@codemirror/autocomplete", "deleteBracketPair")
  @js.native
  val deleteBracketPair: StateCommand = js.native
  
  /**
  Check if there is an active snippet with a next field for
  `nextSnippetField` to move to.
  */
  inline def hasNextSnippetField(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNextSnippetField")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
  Returns true if there is an active snippet and a previous field
  for `prevSnippetField` to move to.
  */
  inline def hasPrevSnippetField(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrevSnippetField")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
  Wrap the given completion source so that it will only fire when the
  cursor is in a syntax node with one of the given names.
  */
  inline def ifIn(nodes: js.Array[String], source: CompletionSource): CompletionSource = (^.asInstanceOf[js.Dynamic].applyDynamic("ifIn")(nodes.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[CompletionSource]
  
  /**
  Wrap the given completion source so that it will not fire when the
  cursor is in a syntax node with one of the given names.
  */
  inline def ifNotIn(nodes: js.Array[String], source: CompletionSource): CompletionSource = (^.asInstanceOf[js.Dynamic].applyDynamic("ifNotIn")(nodes.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[CompletionSource]
  
  /**
  Implements the extension's behavior on text insertion. If the
  given string counts as a bracket in the language around the
  selection, and replacing the selection with it requires custom
  behavior (inserting a closing version or skipping past a
  previously-closed bracket), this function returns a transaction
  representing that custom behavior. (You only need this if you want
  to programmatically insert brackets—the
  [`closeBrackets`](https://codemirror.net/6/docs/ref/#autocomplete.closeBrackets) extension will
  take care of running this for user input.)
  */
  inline def insertBracket(state: EditorState, bracket: String): Transaction | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBracket")(state.asInstanceOf[js.Any], bracket.asInstanceOf[js.Any])).asInstanceOf[Transaction | Null]
  
  /**
  Helper function that returns a transaction spec which inserts a
  completion's text in the main selection range, and any other
  selection range that has the same text in front of it.
  */
  inline def insertCompletionText(state: EditorState, text: String, from: Double, to: Double): TransactionSpec = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCompletionText")(state.asInstanceOf[js.Any], text.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[TransactionSpec]
  
  /**
  Returns a command that moves the completion selection forward or
  backward by the given amount.
  */
  inline def moveCompletionSelection(forward: Boolean): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("moveCompletionSelection")(forward.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def moveCompletionSelection(forward: Boolean, by: option | page): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCompletionSelection")(forward.asInstanceOf[js.Any], by.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
  Move to the next snippet field, if available.
  */
  @JSImport("@codemirror/autocomplete", "nextSnippetField")
  @js.native
  val nextSnippetField: StateCommand = js.native
  
  /**
  This annotation is added to transactions that are produced by
  picking a completion.
  */
  @JSImport("@codemirror/autocomplete", "pickedCompletion")
  @js.native
  val pickedCompletion: AnnotationType[Completion] = js.native
  
  /**
  Move to the previous snippet field, if available.
  */
  @JSImport("@codemirror/autocomplete", "prevSnippetField")
  @js.native
  val prevSnippetField: StateCommand = js.native
  
  /**
  Return the currently selected completion, if any.
  */
  inline def selectedCompletion(state: EditorState): Completion | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("selectedCompletion")(state.asInstanceOf[js.Any]).asInstanceOf[Completion | Null]
  
  /**
  Returns the currently selected position in the active completion
  list, or null if no completions are active.
  */
  inline def selectedCompletionIndex(state: EditorState): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("selectedCompletionIndex")(state.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  /**
  Create an effect that can be attached to a transaction to change
  the currently selected completion.
  */
  inline def setSelectedCompletion(index: Double): StateEffect[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectedCompletion")(index.asInstanceOf[js.Any]).asInstanceOf[StateEffect[Any]]
  
  /**
  Convert a snippet template to a function that can
  [apply](https://codemirror.net/6/docs/ref/#autocomplete.Completion.apply) it. Snippets are written
  using syntax like this:
    "for (let ${index} = 0; ${index} < ${end}; ${index}++) {\n\t${}\n}"
  Each `${}` placeholder (you may also use `#{}`) indicates a field
  that the user can fill in. Its name, if any, will be the default
  content for the field.
  When the snippet is activated by calling the returned function,
  the code is inserted at the given position. Newlines in the
  template are indented by the indentation of the start line, plus
  one [indent unit](https://codemirror.net/6/docs/ref/#language.indentUnit) per tab character after
  the newline.
  On activation, (all instances of) the first field are selected.
  The user can move between fields with Tab and Shift-Tab as long as
  the fields are active. Moving to the last field or moving the
  cursor out of the current field deactivates the fields.
  The order of fields defaults to textual order, but you can add
  numbers to placeholders (`${1}` or `${1:defaultText}`) to provide
  a custom order.
  To include a literal `{` or `}` in your template, put a backslash
  in front of it. This will be removed and the brace will not be
  interpreted as indicating a placeholder.
  */
  inline def snippet(template: String): js.Function4[
    /* editor */ Dispatch, 
    /* completion */ Completion | Null, 
    /* from */ Double, 
    /* to */ Double, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("snippet")(template.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* editor */ Dispatch, 
    /* completion */ Completion | Null, 
    /* from */ Double, 
    /* to */ Double, 
    Unit
  ]]
  
  /**
  Create a completion from a snippet. Returns an object with the
  properties from `completion`, plus an `apply` function that
  applies the snippet.
  */
  inline def snippetCompletion(template: String, completion: Completion): Completion = (^.asInstanceOf[js.Dynamic].applyDynamic("snippetCompletion")(template.asInstanceOf[js.Any], completion.asInstanceOf[js.Any])).asInstanceOf[Completion]
  
  /**
  A facet that can be used to configure the key bindings used by
  snippets. The default binds Tab to
  [`nextSnippetField`](https://codemirror.net/6/docs/ref/#autocomplete.nextSnippetField), Shift-Tab to
  [`prevSnippetField`](https://codemirror.net/6/docs/ref/#autocomplete.prevSnippetField), and Escape
  to [`clearSnippet`](https://codemirror.net/6/docs/ref/#autocomplete.clearSnippet).
  */
  @JSImport("@codemirror/autocomplete", "snippetKeymap")
  @js.native
  val snippetKeymap: Facet[js.Array[KeyBinding], js.Array[KeyBinding]] = js.native
  
  /**
  Explicitly start autocompletion.
  */
  @JSImport("@codemirror/autocomplete", "startCompletion")
  @js.native
  val startCompletion: Command = js.native
  
  /**
  Configures bracket closing behavior for a syntax (via
  [language data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt)) using the `"closeBrackets"`
  identifier.
  */
  trait CloseBracketConfig extends StObject {
    
    /**
      Characters in front of which newly opened brackets are
      automatically closed. Closing always happens in front of
      whitespace. Defaults to `")]}:;>"`.
      */
    var before: js.UndefOr[String] = js.undefined
    
    /**
      The opening brackets to close. Defaults to `["(", "[", "{", "'",
      '"']`. Brackets may be single characters or a triple of quotes
      (as in `"''''"`).
      */
    var brackets: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      When determining whether a given node may be a string, recognize
      these prefixes before the opening quote.
      */
    var stringPrefixes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CloseBracketConfig {
    
    inline def apply(): CloseBracketConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseBracketConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseBracketConfig] (val x: Self) extends AnyVal {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBrackets(value: js.Array[String]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
      
      inline def setBracketsVarargs(value: String*): Self = StObject.set(x, "brackets", js.Array(value*))
      
      inline def setStringPrefixes(value: js.Array[String]): Self = StObject.set(x, "stringPrefixes", value.asInstanceOf[js.Any])
      
      inline def setStringPrefixesUndefined: Self = StObject.set(x, "stringPrefixes", js.undefined)
      
      inline def setStringPrefixesVarargs(value: String*): Self = StObject.set(x, "stringPrefixes", js.Array(value*))
    }
  }
  
  /**
  Objects type used to represent individual completions.
  */
  trait Completion extends StObject {
    
    /**
      How to apply the completion. The default is to replace it with
      its [label](https://codemirror.net/6/docs/ref/#autocomplete.Completion.label). When this holds a
      string, the completion range is replaced by that string. When it
      is a function, that function is called to perform the
      completion. If it fires a transaction, it is responsible for
      adding the [`pickedCompletion`](https://codemirror.net/6/docs/ref/#autocomplete.pickedCompletion)
      annotation to it.
      */
    @JSName("apply")
    var apply: js.UndefOr[
        String | (js.Function4[
          /* view */ EditorView, 
          /* completion */ this.type, 
          /* from */ Double, 
          /* to */ Double, 
          Unit
        ])
      ] = js.undefined
    
    /**
      When given, should be a number from -99 to 99 that adjusts how
      this completion is ranked compared to other completions that
      match the input as well as this one. A negative number moves it
      down the list, a positive number moves it up.
      */
    var boost: js.UndefOr[Double] = js.undefined
    
    /**
      An optional short piece of information to show (with a different
      style) after the label.
      */
    var detail: js.UndefOr[String] = js.undefined
    
    /**
      Additional info to show when the completion is selected. Can be
      a plain string or a function that'll render the DOM structure to
      show when invoked.
      */
    var info: js.UndefOr[
        String | (js.Function1[/* completion */ this.type, Node | Null | (js.Promise[Node | Null])])
      ] = js.undefined
    
    /**
      The label to show in the completion picker. This is what input
      is matched agains to determine whether a completion matches (and
      how well it matches).
      */
    var label: String
    
    /**
      Can be used to divide the completion list into sections.
      Completions in a given section (matched by name) will be grouped
      together, with a heading above them. Options without section
      will appear above all sections. A string value is equivalent to
      a `{name}` object.
      */
    var section: js.UndefOr[String | CompletionSection] = js.undefined
    
    /**
      The type of the completion. This is used to pick an icon to show
      for the completion. Icons are styled with a CSS class created by
      appending the type name to `"cm-completionIcon-"`. You can
      define or restyle icons by defining these selectors. The base
      library defines simple icons for `class`, `constant`, `enum`,
      `function`, `interface`, `keyword`, `method`, `namespace`,
      `property`, `text`, `type`, and `variable`.
      
      Multiple types can be provided by separating them with spaces.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Completion {
    
    inline def apply(label: String): Completion = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Completion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Completion] (val x: Self) extends AnyVal {
      
      inline def setApply(
        value: String | (js.Function4[/* view */ EditorView, Completion, /* from */ Double, /* to */ Double, Unit])
      ): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setApplyFunction4(value: (/* view */ EditorView, Completion, /* from */ Double, /* to */ Double) => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction4(value))
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setInfo(value: String | (js.Function1[Completion, Node | Null | (js.Promise[Node | Null])])): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoFunction1(value: Completion => Node | Null | (js.Promise[Node | Null])): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSection(value: String | CompletionSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CompletionConfig extends StObject {
    
    /**
      By default, completions are shown below the cursor when there is
      space. Setting this to true will make the extension put the
      completions above the cursor when possible.
      */
    var aboveCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      When enabled (defaults to true), autocompletion will start
      whenever the user types something that can be completed.
      */
    var activateOnTyping: js.UndefOr[Boolean] = js.undefined
    
    /**
      This option can be used to inject additional content into
      options. The `render` function will be called for each visible
      completion, and should produce a DOM node to show. `position`
      determines where in the DOM the result appears, relative to
      other added widgets and the standard content. The default icons
      have position 20, the label position 50, and the detail position
      80.
      */
    var addToOptions: js.UndefOr[js.Array[Position]] = js.undefined
    
    /**
      Determines whether the completion tooltip is closed when the
      editor loses focus. Defaults to true.
      */
    var closeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      The comparison function to use when sorting completions with the same
      match score. Defaults to using
      [`localeCompare`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/localeCompare).
      */
    var compareCompletions: js.UndefOr[js.Function2[/* a */ Completion, /* b */ Completion, Double]] = js.undefined
    
    /**
      Set this to false to disable the [default completion
      keymap](https://codemirror.net/6/docs/ref/#autocomplete.completionKeymap). (This requires you to
      add bindings to control completion yourself. The bindings should
      probably have a higher precedence than other bindings for the
      same keys.)
      */
    var defaultKeymap: js.UndefOr[Boolean] = js.undefined
    
    /**
      By default, the library will render icons based on the
      completion's [type](https://codemirror.net/6/docs/ref/#autocomplete.Completion.type) in front of
      each option. Set this to false to turn that off.
      */
    var icons: js.UndefOr[Boolean] = js.undefined
    
    /**
      By default, commands relating to an open completion only take
      effect 75 milliseconds after the completion opened, so that key
      presses made before the user is aware of the tooltip don't go to
      the tooltip. This option can be used to configure that delay.
      */
    var interactionDelay: js.UndefOr[Double] = js.undefined
    
    /**
      The maximum number of options to render to the DOM.
      */
    var maxRenderedOptions: js.UndefOr[Double] = js.undefined
    
    /**
      This can be used to add additional CSS classes to completion
      options.
      */
    var optionClass: js.UndefOr[js.Function1[/* completion */ Completion, String]] = js.undefined
    
    /**
      Override the completion sources used. By default, they will be
      taken from the `"autocomplete"` [language
      data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) (which should hold
      [completion sources](https://codemirror.net/6/docs/ref/#autocomplete.CompletionSource) or arrays
      of [completions](https://codemirror.net/6/docs/ref/#autocomplete.Completion)).
      */
    var `override`: js.UndefOr[js.Array[CompletionSource] | Null] = js.undefined
    
    /**
      By default, [info](https://codemirror.net/6/docs/ref/#autocomplet.Completion.info) tooltips are
      placed to the side of the selected. This option can be used to
      override that. It will be given rectangles for the list of
      completions, the selected option, the info element, and the
      availble [tooltip space](https://codemirror.net/6/docs/ref/#view.tooltips^config.tooltipSpace),
      and should return style and/or class strings for the info
      element.
      */
    var positionInfo: js.UndefOr[
        js.Function5[
          /* view */ EditorView, 
          /* list */ Rect, 
          /* option */ Rect, 
          /* info */ Rect, 
          /* space */ Rect, 
          Class
        ]
      ] = js.undefined
    
    /**
      By default, when completion opens, the first option is selected
      and can be confirmed with
      [`acceptCompletion`](https://codemirror.net/6/docs/ref/#autocomplete.acceptCompletion). When this
      is set to false, the completion widget starts with no completion
      selected, and the user has to explicitly move to a completion
      before you can confirm one.
      */
    var selectOnOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      When given, this may return an additional CSS class to add to
      the completion dialog element.
      */
    var tooltipClass: js.UndefOr[js.Function1[/* state */ EditorState, String]] = js.undefined
  }
  object CompletionConfig {
    
    inline def apply(): CompletionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletionConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompletionConfig] (val x: Self) extends AnyVal {
      
      inline def setAboveCursor(value: Boolean): Self = StObject.set(x, "aboveCursor", value.asInstanceOf[js.Any])
      
      inline def setAboveCursorUndefined: Self = StObject.set(x, "aboveCursor", js.undefined)
      
      inline def setActivateOnTyping(value: Boolean): Self = StObject.set(x, "activateOnTyping", value.asInstanceOf[js.Any])
      
      inline def setActivateOnTypingUndefined: Self = StObject.set(x, "activateOnTyping", js.undefined)
      
      inline def setAddToOptions(value: js.Array[Position]): Self = StObject.set(x, "addToOptions", value.asInstanceOf[js.Any])
      
      inline def setAddToOptionsUndefined: Self = StObject.set(x, "addToOptions", js.undefined)
      
      inline def setAddToOptionsVarargs(value: Position*): Self = StObject.set(x, "addToOptions", js.Array(value*))
      
      inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      inline def setCompareCompletions(value: (/* a */ Completion, /* b */ Completion) => Double): Self = StObject.set(x, "compareCompletions", js.Any.fromFunction2(value))
      
      inline def setCompareCompletionsUndefined: Self = StObject.set(x, "compareCompletions", js.undefined)
      
      inline def setDefaultKeymap(value: Boolean): Self = StObject.set(x, "defaultKeymap", value.asInstanceOf[js.Any])
      
      inline def setDefaultKeymapUndefined: Self = StObject.set(x, "defaultKeymap", js.undefined)
      
      inline def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setInteractionDelay(value: Double): Self = StObject.set(x, "interactionDelay", value.asInstanceOf[js.Any])
      
      inline def setInteractionDelayUndefined: Self = StObject.set(x, "interactionDelay", js.undefined)
      
      inline def setMaxRenderedOptions(value: Double): Self = StObject.set(x, "maxRenderedOptions", value.asInstanceOf[js.Any])
      
      inline def setMaxRenderedOptionsUndefined: Self = StObject.set(x, "maxRenderedOptions", js.undefined)
      
      inline def setOptionClass(value: /* completion */ Completion => String): Self = StObject.set(x, "optionClass", js.Any.fromFunction1(value))
      
      inline def setOptionClassUndefined: Self = StObject.set(x, "optionClass", js.undefined)
      
      inline def setOverride(value: js.Array[CompletionSource]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideNull: Self = StObject.set(x, "override", null)
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setOverrideVarargs(value: CompletionSource*): Self = StObject.set(x, "override", js.Array(value*))
      
      inline def setPositionInfo(
        value: (/* view */ EditorView, /* list */ Rect, /* option */ Rect, /* info */ Rect, /* space */ Rect) => Class
      ): Self = StObject.set(x, "positionInfo", js.Any.fromFunction5(value))
      
      inline def setPositionInfoUndefined: Self = StObject.set(x, "positionInfo", js.undefined)
      
      inline def setSelectOnOpen(value: Boolean): Self = StObject.set(x, "selectOnOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectOnOpenUndefined: Self = StObject.set(x, "selectOnOpen", js.undefined)
      
      inline def setTooltipClass(value: /* state */ EditorState => String): Self = StObject.set(x, "tooltipClass", js.Any.fromFunction1(value))
      
      inline def setTooltipClassUndefined: Self = StObject.set(x, "tooltipClass", js.undefined)
    }
  }
  
  /**
  Interface for objects returned by completion sources.
  */
  trait CompletionResult extends StObject {
    
    /**
      By default, the library filters and scores completions. Set
      `filter` to `false` to disable this, and cause your completions
      to all be included, in the order they were given. When there are
      other sources, unfiltered completions appear at the top of the
      list of completions. `validFor` must not be given when `filter`
      is `false`, because it only works when filtering.
      */
    var filter: js.UndefOr[Boolean] = js.undefined
    
    /**
      The start of the range that is being completed.
      */
    var from: Double
    
    /**
      When [`filter`](https://codemirror.net/6/docs/ref/#autocomplete.CompletionResult.filter) is set to
      `false`, this may be provided to compute the ranges on the label
      that match the input. Should return an array of numbers where
      each pair of adjacent numbers provide the start and end of a
      range.
      */
    var getMatch: js.UndefOr[js.Function1[/* completion */ Completion, js.Array[Double]]] = js.undefined
    
    /**
      The completions returned. These don't have to be compared with
      the input by the source—the autocompletion system will do its
      own matching (against the text between `from` and `to`) and
      sorting.
      */
    var options: js.Array[Completion]
    
    /**
      The end of the range that is being completed. Defaults to the
      main cursor position.
      */
    var to: js.UndefOr[Double] = js.undefined
    
    /**
      Synchronously update the completion result after typing or
      deletion. If given, this should not do any expensive work, since
      it will be called during editor state updates. The function
      should make sure (similar to
      [`validFor`](https://codemirror.net/6/docs/ref/#autocomplete.CompletionResult.validFor)) that the
      completion still applies in the new state.
      */
    var update: js.UndefOr[
        js.Function4[
          /* current */ this.type, 
          /* from */ Double, 
          /* to */ Double, 
          /* context */ CompletionContext, 
          this.type | Null
        ]
      ] = js.undefined
    
    /**
      When given, further typing or deletion that causes the part of
      the document between ([mapped](https://codemirror.net/6/docs/ref/#state.ChangeDesc.mapPos)) `from`
      and `to` to match this regular expression or predicate function
      will not query the completion source again, but continue with
      this list of options. This can help a lot with responsiveness,
      since it allows the completion list to be updated synchronously.
      */
    var validFor: js.UndefOr[
        js.RegExp | (js.Function4[/* text */ String, /* from */ Double, /* to */ Double, /* state */ EditorState, Boolean])
      ] = js.undefined
  }
  object CompletionResult {
    
    inline def apply(from: Double, options: js.Array[Completion]): CompletionResult = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompletionResult] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGetMatch(value: /* completion */ Completion => js.Array[Double]): Self = StObject.set(x, "getMatch", js.Any.fromFunction1(value))
      
      inline def setGetMatchUndefined: Self = StObject.set(x, "getMatch", js.undefined)
      
      inline def setOptions(value: js.Array[Completion]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Completion*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setUpdate(
        value: (CompletionResult, /* from */ Double, /* to */ Double, /* context */ CompletionContext) => CompletionResult | Null
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setValidFor(
        value: js.RegExp | (js.Function4[/* text */ String, /* from */ Double, /* to */ Double, /* state */ EditorState, Boolean])
      ): Self = StObject.set(x, "validFor", value.asInstanceOf[js.Any])
      
      inline def setValidForFunction4(value: (/* text */ String, /* from */ Double, /* to */ Double, /* state */ EditorState) => Boolean): Self = StObject.set(x, "validFor", js.Any.fromFunction4(value))
      
      inline def setValidForUndefined: Self = StObject.set(x, "validFor", js.undefined)
    }
  }
  
  /**
  Object used to describe a completion
  [section](https://codemirror.net/6/docs/ref/#autocomplete.Completion.section). It is recommended to
  create a shared object used by all the completions in a given
  section.
  */
  trait CompletionSection extends StObject {
    
    /**
      An optional function that renders the section header. Since the
      headers are shown inside a list, you should make sure the
      resulting element has a `display: list-item` style.
      */
    var header: js.UndefOr[js.Function1[/* section */ this.type, HTMLElement]] = js.undefined
    
    /**
      The name of the section. If no `render` method is present, this
      will be displayed above the options.
      */
    var name: String
    
    /**
      By default, sections are ordered alphabetically by name. To
      specify an explicit order, `rank` can be used. Sections with a
      lower rank will be shown above sections with a higher rank.
      */
    var rank: js.UndefOr[Double] = js.undefined
  }
  object CompletionSection {
    
    inline def apply(name: String): CompletionSection = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionSection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompletionSection] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: CompletionSection => HTMLElement): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    }
  }
  
  /**
  The function signature for a completion source. Such a function
  may return its [result](https://codemirror.net/6/docs/ref/#autocomplete.CompletionResult)
  synchronously or as a promise. Returning null indicates no
  completions are available.
  */
  type CompletionSource = js.Function1[
    /* context */ CompletionContext, 
    CompletionResult | Null | (js.Promise[CompletionResult | Null])
  ]
}
