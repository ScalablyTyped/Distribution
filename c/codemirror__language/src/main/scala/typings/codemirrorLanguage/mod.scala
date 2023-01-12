package typings.codemirrorLanguage

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorLanguage.anon.Alias
import typings.codemirrorLanguage.anon.Align
import typings.codemirrorLanguage.anon.All
import typings.codemirrorLanguage.anon.Except
import typings.codemirrorLanguage.anon.Fallback
import typings.codemirrorLanguage.anon.From
import typings.codemirrorLanguage.anon.LanguageData
import typings.codemirrorLanguage.anon.OverrideIndentation
import typings.codemirrorLanguage.anon.To
import typings.codemirrorLanguage.codemirrorLanguageInts.`-1`
import typings.codemirrorLanguage.codemirrorLanguageInts.`0`
import typings.codemirrorLanguage.codemirrorLanguageInts.`1`
import typings.codemirrorState.mod.ChangeSet
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.Facet
import typings.codemirrorState.mod.Range
import typings.codemirrorState.mod.StateEffectType
import typings.codemirrorState.mod.StateField
import typings.codemirrorView.mod.BlockInfo
import typings.codemirrorView.mod.Command
import typings.codemirrorView.mod.Decoration
import typings.codemirrorView.mod.DecorationSet
import typings.codemirrorView.mod.EditorView
import typings.codemirrorView.mod.KeyBinding
import typings.codemirrorView.mod.ViewUpdate
import typings.lezerCommon.distTreeMod.SyntaxNode
import typings.lezerCommon.mod.NodeProp
import typings.lezerCommon.mod.NodeType
import typings.lezerCommon.mod.Parser
import typings.lezerCommon.mod.Tree
import typings.lezerCommon.mod.TreeFragment
import typings.lezerHighlight.mod.Highlighter
import typings.lezerHighlight.mod.Tag
import typings.lezerLr.distParseMod.ParserConfig
import typings.lezerLr.mod.LRParser
import typings.std.Event
import typings.std.HTMLElement
import typings.std.RegExpMatchArray
import typings.styleMod.mod.StyleModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  A highlight style associates CSS styles with higlighting
  [tags](https://lezer.codemirror.net/docs/ref#highlight.Tag).
  */
  @JSImport("@codemirror/language", "HighlightStyle")
  @js.native
  /* private */ open class HighlightStyle ()
    extends StObject
       with Highlighter {
    
    /**
      A style module holding the CSS rules for this highlight style.
      When using
      [`highlightTree`](https://lezer.codemirror.net/docs/ref#highlight.highlightTree)
      outside of the editor, you may want to manually mount this
      module to show the highlighting.
      */
    val module: StyleModule | Null = js.native
    
    /* CompleteClass */
    override def style(tags: js.Array[Tag]): String | Null = js.native
  }
  object HighlightStyle {
    
    @JSImport("@codemirror/language", "HighlightStyle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Create a highlighter style that associates the given styles to
      the given tags. The specs must be objects that hold a style tag
      or array of tags in their `tag` property, and either a single
      `class` property providing a static CSS class (for highlighter
      that rely on external styling), or a
      [`style-mod`](https://github.com/marijnh/style-mod#documentation)-style
      set of CSS properties (which define the styling for those tags).
      
      The CSS rules created for a highlighter will be emitted in the
      order of the spec's properties. That means that for elements that
      have multiple tags associated with them, styles defined further
      down in the list will have a higher CSS precedence than styles
      defined earlier.
      */
    /* static member */
    inline def define(specs: js.Array[TagStyle]): HighlightStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(specs.asInstanceOf[js.Any]).asInstanceOf[HighlightStyle]
    inline def define(specs: js.Array[TagStyle], options: All): HighlightStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(specs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HighlightStyle]
  }
  
  /**
  Indentation contexts are used when calling [indentation
  services](https://codemirror.net/6/docs/ref/#language.indentService). They provide helper utilities
  useful in indentation logic, and can selectively override the
  indentation reported for some lines.
  */
  @JSImport("@codemirror/language", "IndentContext")
  @js.native
  open class IndentContext protected () extends StObject {
    /**
      Create an indent context.
      */
    def this(/**
      The editor state.
      */
    state: EditorState) = this()
    def this(/**
      The editor state.
      */
    state: EditorState, /**
      @internal
      */
    options: OverrideIndentation) = this()
    
    /**
      Find the column for the given position.
      */
    def column(pos: Double): Double = js.native
    def column(pos: Double, bias: `-1` | `1`): Double = js.native
    
    /**
      Find the column position (taking tabs into account) of the given
      position in the given string.
      */
    def countColumn(line: String): Double = js.native
    def countColumn(line: String, pos: Double): Double = js.native
    
    /**
      Get a description of the line at the given position, taking
      [simulated line
      breaks](https://codemirror.net/6/docs/ref/#language.IndentContext.constructor^options.simulateBreak)
      into account. If there is such a break at `pos`, the `bias`
      argument determines whether the part of the line line before or
      after the break is used.
      */
    def lineAt(pos: Double): From = js.native
    def lineAt(pos: Double, bias: `-1` | `1`): From = js.native
    
    /**
      Find the indentation column of the line at the given point.
      */
    def lineIndent(pos: Double): Double = js.native
    def lineIndent(pos: Double, bias: `-1` | `1`): Double = js.native
    
    /**
      Returns the [simulated line
      break](https://codemirror.net/6/docs/ref/#language.IndentContext.constructor^options.simulateBreak)
      for this context, if any.
      */
    def simulatedBreak: Double | Null = js.native
    
    /**
      The editor state.
      */
    val state: EditorState = js.native
    
    /**
      Get the text directly after `pos`, either the entire line
      or the next 100 characters, whichever is shorter.
      */
    def textAfterPos(pos: Double): String = js.native
    def textAfterPos(pos: Double, bias: `-1` | `1`): String = js.native
    
    /**
      The indent unit (number of columns per indentation level).
      */
    var unit: Double = js.native
  }
  
  /**
  A subclass of [`Language`](https://codemirror.net/6/docs/ref/#language.Language) for use with Lezer
  [LR parsers](https://lezer.codemirror.net/docs/ref#lr.LRParser)
  parsers.
  */
  @JSImport("@codemirror/language", "LRLanguage")
  @js.native
  /* private */ open class LRLanguage () extends Language_ {
    
    /**
      Create a new instance of this language with a reconfigured
      version of its parser.
      */
    def configure(options: ParserConfig): LRLanguage = js.native
    
    @JSName("parser")
    val parser_LRLanguage: LRParser = js.native
  }
  object LRLanguage {
    
    @JSImport("@codemirror/language", "LRLanguage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Define a language from a parser.
      */
    /* static member */
    inline def define(spec: LanguageData): LRLanguage = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[LRLanguage]
  }
  
  /**
  Language descriptions are used to store metadata about languages
  and to dynamically load them. Their main role is finding the
  appropriate language for a filename or dynamically loading nested
  parsers.
  */
  @JSImport("@codemirror/language", "LanguageDescription")
  @js.native
  /* private */ open class LanguageDescription () extends StObject {
    
    /**
      Alternative names for the mode (lowercased, includes `this.name`).
      */
    val alias: js.Array[String] = js.native
    
    /**
      File extensions associated with this language.
      */
    val extensions: js.Array[String] = js.native
    
    /**
      Optional filename pattern that should be associated with this
      language.
      */
    val filename: js.UndefOr[js.RegExp] = js.native
    
    /**
      Start loading the the language. Will return a promise that
      resolves to a [`LanguageSupport`](https://codemirror.net/6/docs/ref/#language.LanguageSupport)
      object when the language successfully loads.
      */
    def load(): js.Promise[LanguageSupport] = js.native
    
    /* private */ var loadFunc: Any = js.native
    
    /* private */ var loading: Any = js.native
    
    /**
      The name of this language.
      */
    val name: String = js.native
    
    /**
      If the language has been loaded, this will hold its value.
      */
    var support: js.UndefOr[LanguageSupport] = js.native
  }
  object LanguageDescription {
    
    @JSImport("@codemirror/language", "LanguageDescription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Look for a language in the given array of descriptions that
      matches the filename. Will first match
      [`filename`](https://codemirror.net/6/docs/ref/#language.LanguageDescription.filename) patterns,
      and then [extensions](https://codemirror.net/6/docs/ref/#language.LanguageDescription.extensions),
      and return the first language that matches.
      */
    /* static member */
    inline def matchFilename(descs: js.Array[LanguageDescription], filename: String): LanguageDescription | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchFilename")(descs.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[LanguageDescription | Null]
    
    /**
      Look for a language whose name or alias matches the the given
      name (case-insensitively). If `fuzzy` is true, and no direct
      matchs is found, this'll also search for a language whose name
      or alias occurs in the string (for names shorter than three
      characters, only when surrounded by non-word characters).
      */
    /* static member */
    inline def matchLanguageName(descs: js.Array[LanguageDescription], name: String): LanguageDescription | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchLanguageName")(descs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LanguageDescription | Null]
    inline def matchLanguageName(descs: js.Array[LanguageDescription], name: String, fuzzy: Boolean): LanguageDescription | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchLanguageName")(descs.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fuzzy.asInstanceOf[js.Any])).asInstanceOf[LanguageDescription | Null]
    
    /**
      Create a language description.
      */
    /* static member */
    inline def of(spec: Alias): LanguageDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(spec.asInstanceOf[js.Any]).asInstanceOf[LanguageDescription]
  }
  
  /**
  This class bundles a [language](https://codemirror.net/6/docs/ref/#language.Language) with an
  optional set of supporting extensions. Language packages are
  encouraged to export a function that optionally takes a
  configuration object and returns a `LanguageSupport` instance, as
  the main way for client code to use the package.
  */
  @JSImport("@codemirror/language", "LanguageSupport")
  @js.native
  open class LanguageSupport protected () extends StObject {
    /**
      Create a language support object.
      */
    def this(/**
      The language object.
      */
    language: Language_) = this()
    def this(
      /**
      The language object.
      */
    language: Language_,
      /**
      An optional set of supporting extensions. When nesting a
      language in another language, the outer language is encouraged
      to include the supporting extensions for its inner languages
      in its own set of support extensions.
      */
    support: Extension
    ) = this()
    
    /**
      An extension including both the language and its support
      extensions. (Allowing the object to be used as an extension
      value itself.)
      */
    var `extension`: Extension = js.native
    
    /**
      The language object.
      */
    val language: Language_ = js.native
    
    /**
      An optional set of supporting extensions. When nesting a
      language in another language, the outer language is encouraged
      to include the supporting extensions for its inner languages
      in its own set of support extensions.
      */
    val support: Extension = js.native
  }
  
  /**
  A language object manages parsing and per-language
  [metadata](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt). Parse data is
  managed as a [Lezer](https://lezer.codemirror.net) tree. The class
  can be used directly, via the [`LRLanguage`](https://codemirror.net/6/docs/ref/#language.LRLanguage)
  subclass for [Lezer](https://lezer.codemirror.net/) LR parsers, or
  via the [`StreamLanguage`](https://codemirror.net/6/docs/ref/#language.StreamLanguage) subclass
  for stream parsers.
  */
  @JSImport("@codemirror/language", "Language")
  @js.native
  open class Language_ protected () extends StObject {
    /**
      Construct a language object. If you need to invoke this
      directly, first define a data facet with
      [`defineLanguageFacet`](https://codemirror.net/6/docs/ref/#language.defineLanguageFacet), and then
      configure your parser to [attach](https://codemirror.net/6/docs/ref/#language.languageDataProp) it
      to the language's outer syntax node.
      */
    def this(
      /**
      The [language data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) facet
      used for this language.
      */
    data: Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]],
      parser: Parser
    ) = this()
    def this(
      /**
      The [language data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) facet
      used for this language.
      */
    data: Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]],
      parser: Parser,
      extraExtensions: js.Array[Extension]
    ) = this()
    
    /**
      Indicates whether this language allows nested languages. The
      default implementation returns true.
      */
    def allowsNesting: Boolean = js.native
    
    /**
      The [language data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) facet
      used for this language.
      */
    val data: Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]] = js.native
    
    /**
      The extension value to install this as the document language.
      */
    val `extension`: Extension = js.native
    
    /**
      Find the document regions that were parsed using this language.
      The returned regions will _include_ any nested languages rooted
      in this language, when those exist.
      */
    def findRegions(state: EditorState): js.Array[To] = js.native
    
    /**
      Query whether this language is active at the given position.
      */
    def isActiveAt(state: EditorState, pos: Double): Boolean = js.native
    def isActiveAt(state: EditorState, pos: Double, side: `-1` | `0` | `1`): Boolean = js.native
    
    /**
      The parser object. Can be useful when using this as a [nested
      parser](https://lezer.codemirror.net/docs/ref#common.Parser).
      */
    var parser: Parser = js.native
  }
  
  /**
  A parse context provided to parsers working on the editor content.
  */
  @JSImport("@codemirror/language", "ParseContext")
  @js.native
  /* private */ open class ParseContext () extends StObject {
    
    /**
      Tree fragments that can be reused by incremental re-parses.
      */
    var fragments: js.Array[TreeFragment] = js.native
    
    /* private */ var parse: Any = js.native
    
    /* private */ var parser: Any = js.native
    
    /**
      Notify the parse scheduler that the given region was skipped
      because it wasn't in view, and the parse should be restarted
      when it comes into view.
      */
    def skipUntilInView(from: Double, to: Double): Unit = js.native
    
    /* private */ var startParse: Any = js.native
    
    /**
      The current editor state.
      */
    val state: EditorState = js.native
    
    /**
      The current editor viewport (or some overapproximation
      thereof). Intended to be used for opportunistically avoiding
      work (in which case
      [`skipUntilInView`](https://codemirror.net/6/docs/ref/#language.ParseContext.skipUntilInView)
      should be called to make sure the parser is restarted when the
      skipped region becomes visible).
      */
    var viewport: To = js.native
    
    /* private */ var withContext: Any = js.native
    
    /* private */ var withoutTempSkipped: Any = js.native
  }
  object ParseContext {
    
    @JSImport("@codemirror/language", "ParseContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Get the context for the current parse, or `null` if no editor
      parse is in progress.
      */
    /* static member */
    inline def get(): ParseContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[ParseContext | Null]
    
    /**
      Returns a parser intended to be used as placeholder when
      asynchronously loading a nested parser. It'll skip its input and
      mark it as not-really-parsed, so that the next update will parse
      it again.
      
      When `until` is given, a reparse will be scheduled when that
      promise resolves.
      */
    /* static member */
    inline def getSkippingParser(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("getSkippingParser")().asInstanceOf[Parser]
    inline def getSkippingParser(until: js.Promise[Any]): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("getSkippingParser")(until.asInstanceOf[js.Any]).asInstanceOf[Parser]
  }
  
  /**
  A [language](https://codemirror.net/6/docs/ref/#language.Language) class based on a CodeMirror
  5-style [streaming parser](https://codemirror.net/6/docs/ref/#language.StreamParser).
  */
  @JSImport("@codemirror/language", "StreamLanguage")
  @js.native
  /* private */ open class StreamLanguage[State] () extends Language_ {
    
    /* private */ var getIndent: Any = js.native
  }
  object StreamLanguage {
    
    @JSImport("@codemirror/language", "StreamLanguage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Define a stream language.
      */
    /* static member */
    inline def define[State](spec: StreamParser[State]): StreamLanguage[State] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[StreamLanguage[State]]
  }
  
  /**
  Encapsulates a single line of input. Given to stream syntax code,
  which uses it to tokenize the content.
  */
  @JSImport("@codemirror/language", "StringStream")
  @js.native
  open class StringStream protected () extends StObject {
    /**
      Create a stream.
      */
    def this(
      /**
      The line.
      */
    string: String,
      tabSize: Double,
      /**
      The current indent unit size.
      */
    indentUnit: Double
    ) = this()
    
    /**
      Move back `n` characters.
      */
    def backUp(n: Double): Unit = js.native
    
    /**
      Get the column position at `this.pos`.
      */
    def column(): Double = js.native
    
    /**
      Get the current token.
      */
    def current(): String = js.native
    
    /**
      Match the next character against the given string, regular
      expression, or predicate. Consume and return it if it matches.
      */
    def eat(`match`: String): String | Unit = js.native
    def eat(`match`: js.Function1[/* ch */ String, Boolean]): String | Unit = js.native
    def eat(`match`: js.RegExp): String | Unit = js.native
    
    /**
      Consume whitespace ahead of `this.pos`. Return true if any was
      found.
      */
    def eatSpace(): Boolean = js.native
    
    /**
      Continue matching characters that match the given string,
      regular expression, or predicate function. Return true if any
      characters were consumed.
      */
    def eatWhile(`match`: String): Boolean = js.native
    def eatWhile(`match`: js.Function1[/* ch */ String, Boolean]): Boolean = js.native
    def eatWhile(`match`: js.RegExp): Boolean = js.native
    
    /**
      True if we are at the end of the line.
      */
    def eol(): Boolean = js.native
    
    /**
      The current indent unit size.
      */
    var indentUnit: Double = js.native
    
    /**
      Get the indentation column of the current line.
      */
    def indentation(): Double = js.native
    
    /* private */ var lastColumnPos: Any = js.native
    
    /* private */ var lastColumnValue: Any = js.native
    
    /**
      Match the input against the given string or regular expression
      (which should start with a `^`). Return true or the regexp match
      if it matches.
      
      Unless `consume` is set to `false`, this will move `this.pos`
      past the matched text.
      
      When matching a string `caseInsensitive` can be set to true to
      make the match case-insensitive.
      */
    def `match`(pattern: String): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: String, consume: Boolean): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: String, consume: Boolean, caseInsensitive: Boolean): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: String, consume: Unit, caseInsensitive: Boolean): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: js.RegExp): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: js.RegExp, consume: Boolean): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: js.RegExp, consume: Boolean, caseInsensitive: Boolean): Boolean | RegExpMatchArray | Null = js.native
    def `match`(pattern: js.RegExp, consume: Unit, caseInsensitive: Boolean): Boolean | RegExpMatchArray | Null = js.native
    
    /**
      Read the next code unit and advance `this.pos`.
      */
    def next(): String | Unit = js.native
    
    /**
      Get the next code unit after the current position, or undefined
      if we're at the end of the line.
      */
    def peek(): js.UndefOr[String] = js.native
    
    /**
      The current position on the line.
      */
    var pos: Double = js.native
    
    /**
      Move to directly before the given character, if found on the
      current line.
      */
    def skipTo(ch: String): Boolean | Unit = js.native
    
    /**
      Move to the end of the line.
      */
    def skipToEnd(): Unit = js.native
    
    /**
      True if we are at the start of the line.
      */
    def sol(): Boolean = js.native
    
    /**
      The start position of the current token.
      */
    var start: Double = js.native
    
    /**
      The line.
      */
    var string: String = js.native
    
    /* private */ var tabSize: Any = js.native
  }
  
  /**
  Objects of this type provide context information and helper
  methods to indentation functions registered on syntax nodes.
  */
  @JSImport("@codemirror/language", "TreeIndentContext")
  @js.native
  /* private */ open class TreeIndentContext () extends IndentContext {
    
    /* private */ var base: Any = js.native
    
    /**
      Get the indentation at the reference line for `this.node`, which
      is the line on which it starts, unless there is a node that is
      _not_ a parent of this node covering the start of that line. If
      so, the line at the start of that node is tried, again skipping
      on if it is covered by another such node.
      */
    def baseIndent: Double = js.native
    
    /**
      Continue looking for indentations in the node's parent nodes,
      and return the result of that.
      */
    def continue(): Double | Null = js.native
    
    /**
      The syntax tree node to which the indentation strategy
      applies.
      */
    val node: SyntaxNode = js.native
    
    /**
      The position at which indentation is being computed.
      */
    val pos: Double = js.native
    
    /**
      Get the text directly after `this.pos`, either the entire line
      or the next 100 characters, whichever is shorter.
      */
    def textAfter: String = js.native
  }
  
  /**
  Create an extension that enables bracket matching. Whenever the
  cursor is next to a bracket, that bracket and the one it matches
  are highlighted. Or, when no matching bracket is found, another
  highlighting style is used to indicate this.
  */
  inline def bracketMatching(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("bracketMatching")().asInstanceOf[Extension]
  inline def bracketMatching(config: Config): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("bracketMatching")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  Create an extension that configures code folding.
  */
  inline def codeFolding(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("codeFolding")().asInstanceOf[Extension]
  inline def codeFolding(config: FoldConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("codeFolding")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  Creates an indentation strategy that, by default, indents
  continued lines one unit more than the node's base indentation.
  You can provide `except` to prevent indentation of lines that
  match a pattern (for example `/^else\b/` in `if`/`else`
  constructs), and you can change the amount of units used with the
  `units` option.
  */
  inline def continuedIndent(): js.Function1[/* context */ TreeIndentContext, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("continuedIndent")().asInstanceOf[js.Function1[/* context */ TreeIndentContext, Double]]
  inline def continuedIndent(param0: Except): js.Function1[/* context */ TreeIndentContext, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("continuedIndent")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* context */ TreeIndentContext, Double]]
  
  /**
  A default highlight style (works well with light themes).
  */
  @JSImport("@codemirror/language", "defaultHighlightStyle")
  @js.native
  val defaultHighlightStyle: HighlightStyle = js.native
  
  /**
  Helper function to define a facet (to be added to the top syntax
  node(s) for a language via
  [`languageDataProp`](https://codemirror.net/6/docs/ref/#language.languageDataProp)), that will be
  used to associate language data with the language. You
  probably only need this when subclassing
  [`Language`](https://codemirror.net/6/docs/ref/#language.Language).
  */
  inline def defineLanguageFacet(): Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineLanguageFacet")().asInstanceOf[Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]]]
  inline def defineLanguageFacet(baseData: StringDictionary[Any]): Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defineLanguageFacet")(baseData.asInstanceOf[js.Any]).asInstanceOf[Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]]]
  
  /**
  An indentation strategy for delimited (usually bracketed) nodes.
  Will, by default, indent one unit more than the parent's base
  indent unless the line starts with a closing token. When `align`
  is true and there are non-skipped nodes on the node's opening
  line, the content of the node will be aligned with the end of the
  opening node, like this:
    foo(bar,
    baz)
  */
  inline def delimitedIndent(param0: Align): js.Function1[/* context */ TreeIndentContext, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("delimitedIndent")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* context */ TreeIndentContext, Double]]
  
  /**
  Try to get a parse tree that spans at least up to `upto`. The
  method will do at most `timeout` milliseconds of work to parse
  up to that point if the tree isn't already available.
  */
  inline def ensureSyntaxTree(state: EditorState, upto: Double): Tree | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSyntaxTree")(state.asInstanceOf[js.Any], upto.asInstanceOf[js.Any])).asInstanceOf[Tree | Null]
  inline def ensureSyntaxTree(state: EditorState, upto: Double, timeout: Double): Tree | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSyntaxTree")(state.asInstanceOf[js.Any], upto.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Tree | Null]
  
  /**
  An indentation strategy that aligns a node's content to its base
  indentation.
  */
  inline def flatIndent(context: TreeIndentContext): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flatIndent")(context.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  Fold all top-level foldable ranges. Note that, in most cases,
  folding information will depend on the [syntax
  tree](https://codemirror.net/6/docs/ref/#language.syntaxTree), and folding everything may not work
  reliably when the document hasn't been fully parsed (either
  because the editor state was only just initialized, or because the
  document is so big that the parser decided not to parse it
  entirely).
  */
  @JSImport("@codemirror/language", "foldAll")
  @js.native
  val foldAll: Command = js.native
  
  /**
  Fold the lines that are selected, if possible.
  */
  @JSImport("@codemirror/language", "foldCode")
  @js.native
  val foldCode: Command = js.native
  
  /**
  State effect that can be attached to a transaction to fold the
  given range. (You probably only need this in exceptional
  circumstances—usually you'll just want to let
  [`foldCode`](https://codemirror.net/6/docs/ref/#language.foldCode) and the [fold
  gutter](https://codemirror.net/6/docs/ref/#language.foldGutter) create the transactions.)
  */
  @JSImport("@codemirror/language", "foldEffect")
  @js.native
  val foldEffect: StateEffectType[DocRange] = js.native
  
  /**
  Create an extension that registers a fold gutter, which shows a
  fold status indicator before foldable lines (which can be clicked
  to fold or unfold the line).
  */
  inline def foldGutter(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("foldGutter")().asInstanceOf[Extension]
  inline def foldGutter(config: FoldGutterConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("foldGutter")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  [Fold](https://codemirror.net/6/docs/ref/#language.foldNodeProp) function that folds everything but
  the first and the last child of a syntax node. Useful for nodes
  that start and end with delimiters.
  */
  inline def foldInside(node: SyntaxNode): To | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("foldInside")(node.asInstanceOf[js.Any]).asInstanceOf[To | Null]
  
  /**
  Default fold-related key bindings.
    - Ctrl-Shift-[ (Cmd-Alt-[ on macOS): [`foldCode`](https://codemirror.net/6/docs/ref/#language.foldCode).
    - Ctrl-Shift-] (Cmd-Alt-] on macOS): [`unfoldCode`](https://codemirror.net/6/docs/ref/#language.unfoldCode).
    - Ctrl-Alt-[: [`foldAll`](https://codemirror.net/6/docs/ref/#language.foldAll).
    - Ctrl-Alt-]: [`unfoldAll`](https://codemirror.net/6/docs/ref/#language.unfoldAll).
  */
  @JSImport("@codemirror/language", "foldKeymap")
  @js.native
  val foldKeymap: js.Array[KeyBinding] = js.native
  
  /**
  This node prop is used to associate folding information with
  syntax node types. Given a syntax node, it should check whether
  that tree is foldable and return the range that can be collapsed
  when it is.
  */
  @JSImport("@codemirror/language", "foldNodeProp")
  @js.native
  val foldNodeProp: NodeProp[js.Function2[/* node */ SyntaxNode, /* state */ EditorState, To | Null]] = js.native
  
  /**
  A facet that registers a code folding service. When called with
  the extent of a line, such a function should return a foldable
  range that starts on that line (but continues beyond it), if one
  can be found.
  */
  @JSImport("@codemirror/language", "foldService")
  @js.native
  val foldService: Facet[
    js.Function3[/* state */ EditorState, /* lineStart */ Double, /* lineEnd */ Double, To | Null], 
    js.Array[
      js.Function3[/* state */ EditorState, /* lineStart */ Double, /* lineEnd */ Double, To | Null]
    ]
  ] = js.native
  
  /**
  The state field that stores the folded ranges (as a [decoration
  set](https://codemirror.net/6/docs/ref/#view.DecorationSet)). Can be passed to
  [`EditorState.toJSON`](https://codemirror.net/6/docs/ref/#state.EditorState.toJSON) and
  [`fromJSON`](https://codemirror.net/6/docs/ref/#state.EditorState^fromJSON) to serialize the fold
  state.
  */
  @JSImport("@codemirror/language", "foldState")
  @js.native
  val foldState: StateField[DecorationSet] = js.native
  
  /**
  Check whether the given line is foldable. First asks any fold
  services registered through
  [`foldService`](https://codemirror.net/6/docs/ref/#language.foldService), and if none of them return
  a result, tries to query the [fold node
  prop](https://codemirror.net/6/docs/ref/#language.foldNodeProp) of syntax nodes that cover the end
  of the line.
  */
  inline def foldable(state: EditorState, lineStart: Double, lineEnd: Double): To | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("foldable")(state.asInstanceOf[js.Any], lineStart.asInstanceOf[js.Any], lineEnd.asInstanceOf[js.Any])).asInstanceOf[To | Null]
  
  /**
  Get a [range set](https://codemirror.net/6/docs/ref/#state.RangeSet) containing the folded ranges
  in the given state.
  */
  inline def foldedRanges(state: EditorState): DecorationSet = ^.asInstanceOf[js.Dynamic].applyDynamic("foldedRanges")(state.asInstanceOf[js.Any]).asInstanceOf[DecorationSet]
  
  /**
  Move parsing forward, and update the editor state afterwards to
  reflect the new tree. Will work for at most `timeout`
  milliseconds. Returns true if the parser managed get to the given
  position in that time.
  */
  inline def forceParsing(view: EditorView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("forceParsing")(view.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def forceParsing(view: EditorView, upto: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("forceParsing")(view.asInstanceOf[js.Any], upto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def forceParsing(view: EditorView, upto: Double, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("forceParsing")(view.asInstanceOf[js.Any], upto.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def forceParsing(view: EditorView, upto: Unit, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("forceParsing")(view.asInstanceOf[js.Any], upto.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
  Return the _column width_ of an indent unit in the state.
  Determined by the [`indentUnit`](https://codemirror.net/6/docs/ref/#language.indentUnit)
  facet, and [`tabSize`](https://codemirror.net/6/docs/ref/#state.EditorState^tabSize) when that
  contains tabs.
  */
  inline def getIndentUnit(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndentUnit")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  Get the indentation at the given position. Will first consult any
  [indent services](https://codemirror.net/6/docs/ref/#language.indentService) that are registered,
  and if none of those return an indentation, this will check the
  syntax tree for the [indent node prop](https://codemirror.net/6/docs/ref/#language.indentNodeProp)
  and use that if found. Returns a number when an indentation could
  be determined, and null otherwise.
  */
  inline def getIndentation(context: IndentContext, pos: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentation")(context.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  inline def getIndentation(context: EditorState, pos: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentation")(context.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  /**
  Returns the CSS classes (if any) that the highlighters active in
  the state would assign to the given style
  [tags](https://lezer.codemirror.net/docs/ref#highlight.Tag) and
  (optional) language
  [scope](https://codemirror.net/6/docs/ref/#language.HighlightStyle^define^options.scope).
  */
  inline def highlightingFor(state: EditorState, tags: js.Array[Tag]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightingFor")(state.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def highlightingFor(state: EditorState, tags: js.Array[Tag], scope: NodeType): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("highlightingFor")(state.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
  A syntax tree node prop used to associate indentation strategies
  with node types. Such a strategy is a function from an indentation
  context to a column number or null, where null indicates that no
  definitive indentation can be determined.
  */
  @JSImport("@codemirror/language", "indentNodeProp")
  @js.native
  val indentNodeProp: NodeProp[js.Function1[/* context */ TreeIndentContext, Double | Null]] = js.native
  
  /**
  Enables reindentation on input. When a language defines an
  `indentOnInput` field in its [language
  data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt), which must hold a regular
  expression, the line at the cursor will be reindented whenever new
  text is typed and the input from the start of the line up to the
  cursor matches that regexp.
  To avoid unneccesary reindents, it is recommended to start the
  regexp with `^` (usually followed by `\s*`), and end it with `$`.
  For example, `/^\s*\}$/` will reindent when a closing brace is
  added at the start of a line.
  */
  inline def indentOnInput(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("indentOnInput")().asInstanceOf[Extension]
  
  /**
  Create a change set that auto-indents all lines touched by the
  given document range.
  */
  inline def indentRange(state: EditorState, from: Double, to: Double): ChangeSet = (^.asInstanceOf[js.Dynamic].applyDynamic("indentRange")(state.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[ChangeSet]
  
  /**
  Facet that defines a way to provide a function that computes the
  appropriate indentation depth at the start of a given line, or
  `null` to indicate no appropriate indentation could be determined.
  */
  @JSImport("@codemirror/language", "indentService")
  @js.native
  val indentService: Facet[
    js.Function2[/* context */ IndentContext, /* pos */ Double, Double | Null], 
    js.Array[js.Function2[/* context */ IndentContext, /* pos */ Double, Double | Null]]
  ] = js.native
  
  /**
  Create an indentation string that covers columns 0 to `cols`.
  Will use tabs for as much of the columns as possible when the
  [`indentUnit`](https://codemirror.net/6/docs/ref/#language.indentUnit) facet contains
  tabs.
  */
  inline def indentString(state: EditorState, cols: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("indentString")(state.asInstanceOf[js.Any], cols.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
  Facet for overriding the unit by which indentation happens.
  Should be a string consisting either entirely of spaces or
  entirely of tabs. When not set, this defaults to 2 spaces.
  */
  @JSImport("@codemirror/language", "indentUnit")
  @js.native
  val indentUnit: Facet[String, String] = js.native
  
  /**
  The facet used to associate a language with an editor state. Used
  by `Language` object's `extension` property (so you don't need to
  manually wrap your languages in this). Can be used to access the
  current language on a state.
  */
  @JSImport("@codemirror/language", "language")
  @js.native
  val language: Facet[Language_, Language_ | Null] = js.native
  
  /**
  Node prop stored in a parser's top syntax node to provide the
  facet that stores language-specific data for that language.
  */
  @JSImport("@codemirror/language", "languageDataProp")
  @js.native
  val languageDataProp: NodeProp[Facet[StringDictionary[Any], js.Array[StringDictionary[Any]]]] = js.native
  
  /**
  Find the matching bracket for the token at `pos`, scanning
  direction `dir`. Only the `brackets` and `maxScanDistance`
  properties are used from `config`, if given. Returns null if no
  bracket was found at `pos`, or a match result otherwise.
  */
  inline def matchBrackets(state: EditorState, pos: Double, dir: `-1` | `1`): MatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBrackets")(state.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[MatchResult | Null]
  inline def matchBrackets(state: EditorState, pos: Double, dir: `-1` | `1`, config: Config): MatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchBrackets")(state.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MatchResult | Null]
  
  /**
  Wrap a highlighter in an editor extension that uses it to apply
  syntax highlighting to the editor content.
  When multiple (non-fallback) styles are provided, the styling
  applied is the union of the classes they emit.
  */
  inline def syntaxHighlighting(highlighter: Highlighter): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("syntaxHighlighting")(highlighter.asInstanceOf[js.Any]).asInstanceOf[Extension]
  inline def syntaxHighlighting(highlighter: Highlighter, options: Fallback): Extension = (^.asInstanceOf[js.Dynamic].applyDynamic("syntaxHighlighting")(highlighter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Extension]
  
  /**
  Tells you whether the language parser is planning to do more
  parsing work (in a `requestIdleCallback` pseudo-thread) or has
  stopped running, either because it parsed the entire document,
  because it spent too much time and was cut off, or because there
  is no language parser enabled.
  */
  inline def syntaxParserRunning(view: EditorView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("syntaxParserRunning")(view.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
  Get the syntax tree for a state, which is the current (possibly
  incomplete) parse tree of the active
  [language](https://codemirror.net/6/docs/ref/#language.Language), or the empty tree if there is no
  language available.
  */
  inline def syntaxTree(state: EditorState): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("syntaxTree")(state.asInstanceOf[js.Any]).asInstanceOf[Tree]
  
  /**
  Queries whether there is a full syntax tree available up to the
  given document position. If there isn't, the background parse
  process _might_ still be working and update the tree further, but
  there is no guarantee of that—the parser will [stop
  working](https://codemirror.net/6/docs/ref/#language.syntaxParserRunning) when it has spent a
  certain amount of time or has moved beyond the visible viewport.
  Always returns false if no language has been enabled.
  */
  inline def syntaxTreeAvailable(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("syntaxTreeAvailable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def syntaxTreeAvailable(state: EditorState, upto: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("syntaxTreeAvailable")(state.asInstanceOf[js.Any], upto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
  Unfold all folded code.
  */
  @JSImport("@codemirror/language", "unfoldAll")
  @js.native
  val unfoldAll: Command = js.native
  
  /**
  Unfold folded ranges on selected lines.
  */
  @JSImport("@codemirror/language", "unfoldCode")
  @js.native
  val unfoldCode: Command = js.native
  
  /**
  State effect that unfolds the given range (if it was folded).
  */
  @JSImport("@codemirror/language", "unfoldEffect")
  @js.native
  val unfoldEffect: StateEffectType[DocRange] = js.native
  
  trait Config extends StObject {
    
    /**
      Whether the bracket matching should look at the character after
      the cursor when matching (if the one before isn't a bracket).
      Defaults to true.
      */
    var afterCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
      The bracket characters to match, as a string of pairs. Defaults
      to `"()[]{}"`. Note that these are only used as fallback when
      there is no [matching
      information](https://lezer.codemirror.net/docs/ref/#common.NodeProp^closedBy)
      in the syntax tree.
      */
    var brackets: js.UndefOr[String] = js.undefined
    
    /**
      The maximum distance to scan for matching brackets. This is only
      relevant for brackets not encoded in the syntax tree. Defaults
      to 10 000.
      */
    var maxScanDistance: js.UndefOr[Double] = js.undefined
    
    /**
      Can be used to configure the way in which brackets are
      decorated. The default behavior is to add the
      `cm-matchingBracket` class for matching pairs, and
      `cm-nonmatchingBracket` for mismatched pairs or single brackets.
      */
    var renderMatch: js.UndefOr[
        js.Function2[/* match */ MatchResult, /* state */ EditorState, js.Array[Range[Decoration]]]
      ] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAfterCursor(value: Boolean): Self = StObject.set(x, "afterCursor", value.asInstanceOf[js.Any])
      
      inline def setAfterCursorUndefined: Self = StObject.set(x, "afterCursor", js.undefined)
      
      inline def setBrackets(value: String): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
      
      inline def setMaxScanDistance(value: Double): Self = StObject.set(x, "maxScanDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxScanDistanceUndefined: Self = StObject.set(x, "maxScanDistance", js.undefined)
      
      inline def setRenderMatch(value: (/* match */ MatchResult, /* state */ EditorState) => js.Array[Range[Decoration]]): Self = StObject.set(x, "renderMatch", js.Any.fromFunction2(value))
      
      inline def setRenderMatchUndefined: Self = StObject.set(x, "renderMatch", js.undefined)
    }
  }
  
  trait DocRange extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object DocRange {
    
    inline def apply(from: Double, to: Double): DocRange = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocRange] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait FoldConfig extends StObject {
    
    /**
      A function that creates the DOM element used to indicate the
      position of folded code. The `onclick` argument is the default
      click event handler, which toggles folding on the line that
      holds the element, and should probably be added as an event
      handler to the returned element.
      
      When this option isn't given, the `placeholderText` option will
      be used to create the placeholder element.
      */
    var placeholderDOM: js.UndefOr[
        (js.Function2[
          /* view */ EditorView, 
          /* onclick */ js.Function1[/* event */ Event, Unit], 
          HTMLElement
        ]) | Null
      ] = js.undefined
    
    /**
      Text to use as placeholder for folded text. Defaults to `"…"`.
      Will be styled with the `"cm-foldPlaceholder"` class.
      */
    var placeholderText: js.UndefOr[String] = js.undefined
  }
  object FoldConfig {
    
    inline def apply(): FoldConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FoldConfig] (val x: Self) extends AnyVal {
      
      inline def setPlaceholderDOM(value: (/* view */ EditorView, /* onclick */ js.Function1[/* event */ Event, Unit]) => HTMLElement): Self = StObject.set(x, "placeholderDOM", js.Any.fromFunction2(value))
      
      inline def setPlaceholderDOMNull: Self = StObject.set(x, "placeholderDOM", null)
      
      inline def setPlaceholderDOMUndefined: Self = StObject.set(x, "placeholderDOM", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
    }
  }
  
  trait FoldGutterConfig extends StObject {
    
    /**
      Text used to indicate that a given line is folded.
      Defaults to `"›"`.
      */
    var closedText: js.UndefOr[String] = js.undefined
    
    /**
      Supply event handlers for DOM events on this gutter.
      */
    var domEventHandlers: js.UndefOr[Handlers] = js.undefined
    
    /**
      When given, if this returns true for a given view update,
      recompute the fold markers.
      */
    var foldingChanged: js.UndefOr[js.Function1[/* update */ ViewUpdate, Boolean]] = js.undefined
    
    /**
      A function that creates the DOM element used to indicate a
      given line is folded or can be folded.
      When not given, the `openText`/`closeText` option will be used instead.
      */
    var markerDOM: js.UndefOr[(js.Function1[/* open */ Boolean, HTMLElement]) | Null] = js.undefined
    
    /**
      Text used to indicate that a given line can be folded.
      Defaults to `"⌄"`.
      */
    var openText: js.UndefOr[String] = js.undefined
  }
  object FoldGutterConfig {
    
    inline def apply(): FoldGutterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldGutterConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FoldGutterConfig] (val x: Self) extends AnyVal {
      
      inline def setClosedText(value: String): Self = StObject.set(x, "closedText", value.asInstanceOf[js.Any])
      
      inline def setClosedTextUndefined: Self = StObject.set(x, "closedText", js.undefined)
      
      inline def setDomEventHandlers(value: Handlers): Self = StObject.set(x, "domEventHandlers", value.asInstanceOf[js.Any])
      
      inline def setDomEventHandlersUndefined: Self = StObject.set(x, "domEventHandlers", js.undefined)
      
      inline def setFoldingChanged(value: /* update */ ViewUpdate => Boolean): Self = StObject.set(x, "foldingChanged", js.Any.fromFunction1(value))
      
      inline def setFoldingChangedUndefined: Self = StObject.set(x, "foldingChanged", js.undefined)
      
      inline def setMarkerDOM(value: /* open */ Boolean => HTMLElement): Self = StObject.set(x, "markerDOM", js.Any.fromFunction1(value))
      
      inline def setMarkerDOMNull: Self = StObject.set(x, "markerDOM", null)
      
      inline def setMarkerDOMUndefined: Self = StObject.set(x, "markerDOM", js.undefined)
      
      inline def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
      
      inline def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
    }
  }
  
  type Handlers = StringDictionary[
    js.Function3[/* view */ EditorView, /* line */ BlockInfo, /* event */ Event, Boolean]
  ]
  
  /**
  The result returned from `matchBrackets`.
  */
  trait MatchResult extends StObject {
    
    /**
      The extent of the matched token, if any was found.
      */
    var end: js.UndefOr[To] = js.undefined
    
    /**
      Whether the tokens match. This can be false even when `end` has
      a value, if that token doesn't match the opening token.
      */
    var matched: Boolean
    
    /**
      The extent of the bracket token found.
      */
    var start: To
  }
  object MatchResult {
    
    inline def apply(matched: Boolean, start: To): MatchResult = {
      val __obj = js.Dynamic.literal(matched = matched.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchResult] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: To): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setMatched(value: Boolean): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
      
      inline def setStart(value: To): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  A stream parser parses or tokenizes content from start to end,
  emitting tokens as it goes over it. It keeps a mutable (but
  copyable) object with state, in which it can store information
  about the current context.
  */
  trait StreamParser[State] extends StObject {
    
    /**
      This notifies the parser of a blank line in the input. It can
      update its state here if it needs to.
      */
    var blankLine: js.UndefOr[js.Function2[/* state */ State, /* indentUnit */ Double, Unit]] = js.undefined
    
    /**
      Copy a given state. By default, a shallow object copy is done
      which also copies arrays held at the top level of the object.
      */
    var copyState: js.UndefOr[js.Function1[/* state */ State, State]] = js.undefined
    
    /**
      Compute automatic indentation for the line that starts with the
      given state and text.
      */
    var indent: js.UndefOr[
        js.Function3[/* state */ State, /* textAfter */ String, /* context */ IndentContext, Double | Null]
      ] = js.undefined
    
    /**
      Default [language data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) to
      attach to this language.
      */
    var languageData: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      Produce a start state for the parser.
      */
    var startState: js.UndefOr[js.Function1[/* indentUnit */ Double, State]] = js.undefined
    
    /**
      Read one token, advancing the stream past it, and returning a
      string indicating the token's style tag—either the name of one
      of the tags in
      [`tags`](https://lezer.codemirror.net/docs/ref#highlight.tags),
      or such a name suffixed by one or more tag
      [modifier](https://lezer.codemirror.net/docs/ref#highlight.Tag^defineModifier)
      names, separated by periods. For example `"keyword"` or
      "`variableName.constant"`.
      
      It is okay to return a zero-length token, but only if that
      updates the state so that the next call will return a non-empty
      token again.
      */
    def token(stream: StringStream, state: State): String | Null
    
    /**
      Extra tokens to use in this parser. When the tokenizer returns a
      token name that exists as a property in this object, the
      corresponding tag will be assigned to the token.
      */
    var tokenTable: js.UndefOr[StringDictionary[Tag]] = js.undefined
  }
  object StreamParser {
    
    inline def apply[State](token: (StringStream, State) => String | Null): StreamParser[State] = {
      val __obj = js.Dynamic.literal(token = js.Any.fromFunction2(token))
      __obj.asInstanceOf[StreamParser[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamParser[?], State] (val x: Self & StreamParser[State]) extends AnyVal {
      
      inline def setBlankLine(value: (/* state */ State, /* indentUnit */ Double) => Unit): Self = StObject.set(x, "blankLine", js.Any.fromFunction2(value))
      
      inline def setBlankLineUndefined: Self = StObject.set(x, "blankLine", js.undefined)
      
      inline def setCopyState(value: /* state */ State => State): Self = StObject.set(x, "copyState", js.Any.fromFunction1(value))
      
      inline def setCopyStateUndefined: Self = StObject.set(x, "copyState", js.undefined)
      
      inline def setIndent(value: (/* state */ State, /* textAfter */ String, /* context */ IndentContext) => Double | Null): Self = StObject.set(x, "indent", js.Any.fromFunction3(value))
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLanguageData(value: StringDictionary[Any]): Self = StObject.set(x, "languageData", value.asInstanceOf[js.Any])
      
      inline def setLanguageDataUndefined: Self = StObject.set(x, "languageData", js.undefined)
      
      inline def setStartState(value: /* indentUnit */ Double => State): Self = StObject.set(x, "startState", js.Any.fromFunction1(value))
      
      inline def setStartStateUndefined: Self = StObject.set(x, "startState", js.undefined)
      
      inline def setToken(value: (StringStream, State) => String | Null): Self = StObject.set(x, "token", js.Any.fromFunction2(value))
      
      inline def setTokenTable(value: StringDictionary[Tag]): Self = StObject.set(x, "tokenTable", value.asInstanceOf[js.Any])
      
      inline def setTokenTableUndefined: Self = StObject.set(x, "tokenTable", js.undefined)
    }
  }
  
  /**
  The type of object used in
  [`HighlightStyle.define`](https://codemirror.net/6/docs/ref/#language.HighlightStyle^define).
  Assigns a style to one or more highlighting
  [tags](https://lezer.codemirror.net/docs/ref#highlight.Tag), which can either be a fixed class name
  (which must be defined elsewhere), or a set of CSS properties, for
  which the library will define an anonymous class.
  */
  trait TagStyle
    extends StObject
       with /**
    Any further properties (if `class` isn't given) will be
    interpreted as in style objects given to
    [style-mod](https://github.com/marijnh/style-mod#documentation).
    (The type here is `any` because of TypeScript limitations.)
    */
  /* styleProperty */ StringDictionary[Any] {
    
    /**
      If given, this maps the tags to a fixed class name.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      The tag or tags to target.
      */
    var tag: Tag | js.Array[Tag]
  }
  object TagStyle {
    
    inline def apply(tag: Tag | js.Array[Tag]): TagStyle = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagStyle] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setTag(value: Tag | js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
}
