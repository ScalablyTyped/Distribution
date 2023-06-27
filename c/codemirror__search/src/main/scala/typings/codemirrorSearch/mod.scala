package typings.codemirrorSearch

import typings.codemirrorSearch.anon.CaseSensitive
import typings.codemirrorSearch.anon.From
import typings.codemirrorSearch.anon.To
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.SelectionRange
import typings.codemirrorState.mod.StateCommand
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorState.mod.StateEffectType
import typings.codemirrorState.mod.Text
import typings.codemirrorView.mod.Command
import typings.codemirrorView.mod.EditorView
import typings.codemirrorView.mod.KeyBinding
import typings.codemirrorView.mod.Panel
import typings.std.Iterator
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  This class is similar to [`SearchCursor`](https://codemirror.net/6/docs/ref/#search.SearchCursor)
  but searches for a regular expression pattern instead of a plain
  string.
  */
  @JSImport("@codemirror/search", "RegExpCursor")
  @js.native
  open class RegExpCursor protected ()
    extends StObject
       with Iterator[From, Any, Unit] {
    /**
      Create a cursor that will search the given range in the given
      document. `query` should be the raw pattern (as you'd pass it to
      `new RegExp`).
      */
    def this(text: Text, query: String) = this()
    def this(text: Text, query: String, options: RegExpCursorOptions) = this()
    def this(text: Text, query: String, options: Unit, from: Double) = this()
    def this(text: Text, query: String, options: RegExpCursorOptions, from: Double) = this()
    def this(text: Text, query: String, options: Unit, from: Double, to: Double) = this()
    def this(text: Text, query: String, options: Unit, from: Unit, to: Double) = this()
    def this(text: Text, query: String, options: RegExpCursorOptions, from: Double, to: Double) = this()
    def this(text: Text, query: String, options: RegExpCursorOptions, from: Unit, to: Double) = this()
    
    /* private */ var curLine: Any = js.native
    
    /* private */ var curLineStart: Any = js.native
    
    /**
      Set to `true` when the cursor has reached the end of the search
      range.
      */
    var done: Boolean = js.native
    
    /* private */ var getLine: Any = js.native
    
    /* private */ var iter: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[From]] = js.native
    
    /* private */ var matchPos: Any = js.native
    
    /**
      Move to the next match, if there is one.
      */
    def next(): this.type = js.native
    
    /* private */ var nextLine: Any = js.native
    
    /* private */ var re: Any = js.native
    
    /* private */ var test: Any = js.native
    
    /* private */ var text: Any = js.native
    
    /* private */ var to: Any = js.native
    
    /**
      Will contain an object with the extent of the match and the
      match object when [`next`](https://codemirror.net/6/docs/ref/#search.RegExpCursor.next)
      sucessfully finds a match.
      */
    var value: From = js.native
  }
  
  /**
  A search cursor provides an iterator over text matches in a
  document.
  */
  @JSImport("@codemirror/search", "SearchCursor")
  @js.native
  open class SearchCursor protected ()
    extends StObject
       with Iterator[To, Any, Unit] {
    /**
      Create a text cursor. The query is the search string, `from` to
      `to` provides the region to search.
      
      When `normalize` is given, it will be called, on both the query
      string and the content it is matched against, before comparing.
      You can, for example, create a case-insensitive search by
      passing `s => s.toLowerCase()`.
      
      Text is always normalized with
      [`.normalize("NFKD")`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/normalize)
      (when supported).
      */
    def this(text: Text, query: String) = this()
    def this(text: Text, query: String, from: Double) = this()
    def this(text: Text, query: String, from: Double, to: Double) = this()
    def this(text: Text, query: String, from: Unit, to: Double) = this()
    def this(
      text: Text,
      query: String,
      from: Double,
      to: Double,
      normalize: js.Function1[/* string */ String, String]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Double,
      to: Unit,
      normalize: js.Function1[/* string */ String, String]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Unit,
      to: Double,
      normalize: js.Function1[/* string */ String, String]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Unit,
      to: Unit,
      normalize: js.Function1[/* string */ String, String]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Double,
      to: Double,
      normalize: js.Function1[/* string */ String, String],
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Double,
      to: Double,
      normalize: Unit,
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Double,
      to: Unit,
      normalize: js.Function1[/* string */ String, String],
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Double,
      to: Unit,
      normalize: Unit,
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Unit,
      to: Double,
      normalize: js.Function1[/* string */ String, String],
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Unit,
      to: Double,
      normalize: Unit,
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Unit,
      to: Unit,
      normalize: js.Function1[/* string */ String, String],
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    def this(
      text: Text,
      query: String,
      from: Unit,
      to: Unit,
      normalize: Unit,
      test: js.Function4[/* from */ Double, /* to */ Double, /* buffer */ String, /* bufferPos */ Double, Boolean]
    ) = this()
    
    /* private */ var buffer: Any = js.native
    
    /* private */ var bufferPos: Any = js.native
    
    /* private */ var bufferStart: Any = js.native
    
    /**
      Whether the end of the iterated region has been reached.
      */
    var done: Boolean = js.native
    
    /* private */ var iter: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[To]] = js.native
    
    /* private */ var `match`: Any = js.native
    
    /* private */ var matches: Any = js.native
    
    /**
      Look for the next match. Updates the iterator's
      [`value`](https://codemirror.net/6/docs/ref/#search.SearchCursor.value) and
      [`done`](https://codemirror.net/6/docs/ref/#search.SearchCursor.done) properties. Should be called
      at least once before using the cursor.
      */
    def next(): this.type = js.native
    
    /**
      The `next` method will ignore matches that partially overlap a
      previous match. This method behaves like `next`, but includes
      such matches.
      */
    def nextOverlapping(): this.type = js.native
    
    /* private */ var normalize: Any = js.native
    
    /* private */ var peek: Any = js.native
    
    /* private */ var query: Any = js.native
    
    /* private */ var test: Any = js.native
    
    /**
      The current match (only holds a meaningful value after
      [`next`](https://codemirror.net/6/docs/ref/#search.SearchCursor.next) has been called and when
      `done` is false).
      */
    var value: To = js.native
  }
  
  /**
  A search query. Part of the editor's search state.
  */
  @JSImport("@codemirror/search", "SearchQuery")
  @js.native
  open class SearchQuery protected () extends StObject {
    /**
      Create a query object.
      */
    def this(config: CaseSensitive) = this()
    
    /**
      Indicates whether the search is case-sensitive.
      */
    val caseSensitive: Boolean = js.native
    
    /**
      Compare this query to another query.
      */
    def eq(other: SearchQuery): Boolean = js.native
    
    /**
      Get a search cursor for this query, searching through the given
      range in the given state.
      */
    def getCursor(state: EditorState): js.Iterator[To] = js.native
    def getCursor(state: EditorState, from: Double): js.Iterator[To] = js.native
    def getCursor(state: EditorState, from: Double, to: Double): js.Iterator[To] = js.native
    def getCursor(state: EditorState, from: Unit, to: Double): js.Iterator[To] = js.native
    def getCursor(state: Text): js.Iterator[To] = js.native
    def getCursor(state: Text, from: Double): js.Iterator[To] = js.native
    def getCursor(state: Text, from: Double, to: Double): js.Iterator[To] = js.native
    def getCursor(state: Text, from: Unit, to: Double): js.Iterator[To] = js.native
    
    /**
      By default, string search will replace `\n`, `\r`, and `\t` in
      the query with newline, return, and tab characters. When this
      is set to true, that behavior is disabled.
      */
    val literal: Boolean = js.native
    
    /**
      When true, the search string is interpreted as a regular
      expression.
      */
    val regexp: Boolean = js.native
    
    /**
      The replace text, or the empty string if no replace text has
      been given.
      */
    val replace: String = js.native
    
    /**
      The search string (or regular expression).
      */
    val search: String = js.native
    
    /**
      Whether this query is non-empty and, in case of a regular
      expression search, syntactically valid.
      */
    val valid: Boolean = js.native
    
    /**
      When true, matches that contain words are ignored when there are
      further word characters around them.
      */
    val wholeWord: Boolean = js.native
  }
  
  /**
  Close the search panel.
  */
  @JSImport("@codemirror/search", "closeSearchPanel")
  @js.native
  val closeSearchPanel: Command = js.native
  
  /**
  Open the search panel if it isn't already open, and move the
  selection to the first match after the current main selection.
  Will wrap around to the start of the document when it reaches the
  end.
  */
  @JSImport("@codemirror/search", "findNext")
  @js.native
  val findNext: Command = js.native
  
  /**
  Move the selection to the previous instance of the search query,
  before the current main selection. Will wrap past the start
  of the document to start searching at the end again.
  */
  @JSImport("@codemirror/search", "findPrevious")
  @js.native
  val findPrevious: Command = js.native
  
  /**
  Get the current search query from an editor state.
  */
  inline def getSearchQuery(state: EditorState): SearchQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("getSearchQuery")(state.asInstanceOf[js.Any]).asInstanceOf[SearchQuery]
  
  /**
  Command that shows a dialog asking the user for a line number, and
  when a valid position is provided, moves the cursor to that line.
  Supports line numbers, relative line offsets prefixed with `+` or
  `-`, document percentages suffixed with `%`, and an optional
  column position by adding `:` and a second number after the line
  number.
  */
  @JSImport("@codemirror/search", "gotoLine")
  @js.native
  val gotoLine: Command = js.native
  
  /**
  This extension highlights text that matches the selection. It uses
  the `"cm-selectionMatch"` class for the highlighting. When
  `highlightWordAroundCursor` is enabled, the word at the cursor
  itself will be highlighted with `"cm-selectionMatch-main"`.
  */
  inline def highlightSelectionMatches(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightSelectionMatches")().asInstanceOf[Extension]
  inline def highlightSelectionMatches(options: HighlightOptions): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightSelectionMatches")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  Make sure the search panel is open and focused.
  */
  @JSImport("@codemirror/search", "openSearchPanel")
  @js.native
  val openSearchPanel: Command = js.native
  
  /**
  Replace all instances of the search query with the given
  replacement.
  */
  @JSImport("@codemirror/search", "replaceAll")
  @js.native
  val replaceAll: Command = js.native
  
  /**
  Replace the current match of the search query.
  */
  @JSImport("@codemirror/search", "replaceNext")
  @js.native
  val replaceNext: Command = js.native
  
  /**
  Add search state to the editor configuration, and optionally
  configure the search extension.
  ([`openSearchPanel`](https://codemirror.net/6/docs/ref/#search.openSearchPanel) will automatically
  enable this if it isn't already on).
  */
  inline def search(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("search")().asInstanceOf[Extension]
  inline def search(config: SearchConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  Default search-related key bindings.
    - Mod-f: [`openSearchPanel`](https://codemirror.net/6/docs/ref/#search.openSearchPanel)
    - F3, Mod-g: [`findNext`](https://codemirror.net/6/docs/ref/#search.findNext)
    - Shift-F3, Shift-Mod-g: [`findPrevious`](https://codemirror.net/6/docs/ref/#search.findPrevious)
    - Alt-g: [`gotoLine`](https://codemirror.net/6/docs/ref/#search.gotoLine)
    - Mod-d: [`selectNextOccurrence`](https://codemirror.net/6/docs/ref/#search.selectNextOccurrence)
  */
  @JSImport("@codemirror/search", "searchKeymap")
  @js.native
  val searchKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Query whether the search panel is open in the given editor state.
  */
  inline def searchPanelOpen(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("searchPanelOpen")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
  Select all instances of the search query.
  */
  @JSImport("@codemirror/search", "selectMatches")
  @js.native
  val selectMatches: Command = js.native
  
  /**
  Select next occurrence of the current selection. Expand selection
  to the surrounding word when the selection is empty.
  */
  @JSImport("@codemirror/search", "selectNextOccurrence")
  @js.native
  val selectNextOccurrence: StateCommand = js.native
  
  /**
  Select all instances of the currently selected text.
  */
  @JSImport("@codemirror/search", "selectSelectionMatches")
  @js.native
  val selectSelectionMatches: StateCommand = js.native
  
  /**
  A state effect that updates the current search query. Note that
  this only has an effect if the search state has been initialized
  (by including [`search`](https://codemirror.net/6/docs/ref/#search.search) in your configuration or
  by running [`openSearchPanel`](https://codemirror.net/6/docs/ref/#search.openSearchPanel) at least
  once).
  */
  @JSImport("@codemirror/search", "setSearchQuery")
  @js.native
  val setSearchQuery: StateEffectType[SearchQuery] = js.native
  
  trait HighlightOptions extends StObject {
    
    /**
      Determines whether, when nothing is selected, the word around
      the cursor is matched instead. Defaults to false.
      */
    var highlightWordAroundCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      The amount of matches (in the viewport) at which to disable
      highlighting. Defaults to 100.
      */
    var maxMatches: js.UndefOr[Double] = js.undefined
    
    /**
      The minimum length of the selection before it is highlighted.
      Defaults to 1 (always highlight non-cursor selections).
      */
    var minSelectionLength: js.UndefOr[Double] = js.undefined
    
    /**
      Whether to only highlight whole words.
      */
    var wholeWords: js.UndefOr[Boolean] = js.undefined
  }
  object HighlightOptions {
    
    inline def apply(): HighlightOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightOptions] (val x: Self) extends AnyVal {
      
      inline def setHighlightWordAroundCursor(value: Boolean): Self = StObject.set(x, "highlightWordAroundCursor", value.asInstanceOf[js.Any])
      
      inline def setHighlightWordAroundCursorUndefined: Self = StObject.set(x, "highlightWordAroundCursor", js.undefined)
      
      inline def setMaxMatches(value: Double): Self = StObject.set(x, "maxMatches", value.asInstanceOf[js.Any])
      
      inline def setMaxMatchesUndefined: Self = StObject.set(x, "maxMatches", js.undefined)
      
      inline def setMinSelectionLength(value: Double): Self = StObject.set(x, "minSelectionLength", value.asInstanceOf[js.Any])
      
      inline def setMinSelectionLengthUndefined: Self = StObject.set(x, "minSelectionLength", js.undefined)
      
      inline def setWholeWords(value: Boolean): Self = StObject.set(x, "wholeWords", value.asInstanceOf[js.Any])
      
      inline def setWholeWordsUndefined: Self = StObject.set(x, "wholeWords", js.undefined)
    }
  }
  
  trait RegExpCursorOptions extends StObject {
    
    var ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    var test: js.UndefOr[
        js.Function3[/* from */ Double, /* to */ Double, /* match */ RegExpExecArray, Boolean]
      ] = js.undefined
  }
  object RegExpCursorOptions {
    
    inline def apply(): RegExpCursorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegExpCursorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegExpCursorOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setTest(value: (/* from */ Double, /* to */ Double, /* match */ RegExpExecArray) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction3(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  trait SearchConfig extends StObject {
    
    /**
      Whether to enable case sensitivity by default when the search
      panel is activated (defaults to false).
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      Can be used to override the way the search panel is implemented.
      Should create a [Panel](https://codemirror.net/6/docs/ref/#view.Panel) that contains a form
      which lets the user:
      
      - See the [current](https://codemirror.net/6/docs/ref/#search.getSearchQuery) search query.
      - Manipulate the [query](https://codemirror.net/6/docs/ref/#search.SearchQuery) and
      [update](https://codemirror.net/6/docs/ref/#search.setSearchQuery) the search state with a new
      query.
      - Notice external changes to the query by reacting to the
      appropriate [state effect](https://codemirror.net/6/docs/ref/#search.setSearchQuery).
      - Run some of the search commands.
      
      The field that should be focused when opening the panel must be
      tagged with a `main-field=true` DOM attribute.
      */
    var createPanel: js.UndefOr[js.Function1[/* view */ EditorView, Panel]] = js.undefined
    
    /**
      Whether to treat string searches literally by default (defaults to false).
      */
    var literal: js.UndefOr[Boolean] = js.undefined
    
    /**
      Used to turn on regular expression search in the default query.
      Defaults to false.
      */
    var regexp: js.UndefOr[Boolean] = js.undefined
    
    /**
      By default, matches are scrolled into view using the default
      behavior of
      [`EditorView.scrollIntoView`](https://codemirror.net/6/docs/ref/#view.EditorView^scrollIntoView).
      This option allows you to pass a custom function to produce the
      scroll effect.
      */
    var scrollToMatch: js.UndefOr[
        js.Function2[/* range */ SelectionRange, /* view */ EditorView, StateEffect[Any]]
      ] = js.undefined
    
    /**
      Whether to position the search panel at the top of the editor
      (the default is at the bottom).
      */
    var top: js.UndefOr[Boolean] = js.undefined
    
    /**
      Controls whether the default query has by-word matching enabled.
      Defaults to false.
      */
    var wholeWord: js.UndefOr[Boolean] = js.undefined
  }
  object SearchConfig {
    
    inline def apply(): SearchConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchConfig] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setCreatePanel(value: /* view */ EditorView => Panel): Self = StObject.set(x, "createPanel", js.Any.fromFunction1(value))
      
      inline def setCreatePanelUndefined: Self = StObject.set(x, "createPanel", js.undefined)
      
      inline def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      inline def setRegexp(value: Boolean): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setScrollToMatch(value: (/* range */ SelectionRange, /* view */ EditorView) => StateEffect[Any]): Self = StObject.set(x, "scrollToMatch", js.Any.fromFunction2(value))
      
      inline def setScrollToMatchUndefined: Self = StObject.set(x, "scrollToMatch", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWholeWord(value: Boolean): Self = StObject.set(x, "wholeWord", value.asInstanceOf[js.Any])
      
      inline def setWholeWordUndefined: Self = StObject.set(x, "wholeWord", js.undefined)
    }
  }
}
