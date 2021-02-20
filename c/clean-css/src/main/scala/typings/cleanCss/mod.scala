package typings.cleanCss

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.cleanCss.anon.AdjacentSpace
import typings.cleanCss.anon.AfterAtRule
import typings.cleanCss.anon.All
import typings.cleanCss.anon.AroundSelectorRelation
import typings.cleanCss.anon.BackgroundClipMerging
import typings.cleanCss.anon.Ch
import typings.cleanCss.anon.Efficiency
import typings.cleanCss.anon.MergeAdjacentRules
import typings.cleanCss.anon.Opacity
import typings.cleanCss.anon.SourceMap
import typings.cleanCss.cleanCssBooleans.`false`
import typings.cleanCss.cleanCssBooleans.`true`
import typings.cleanCss.cleanCssNumbers.`0`
import typings.cleanCss.cleanCssNumbers.`1`
import typings.cleanCss.cleanCssNumbers.`2`
import typings.cleanCss.cleanCssStrings.Asterisk
import typings.cleanCss.cleanCssStrings.`keep-breaks`
import typings.cleanCss.cleanCssStrings.beautify
import typings.cleanCss.cleanCssStrings.ie7
import typings.cleanCss.cleanCssStrings.ie8
import typings.cleanCss.cleanCssStrings.ie9
import typings.cleanCss.cleanCssStrings.space
import typings.cleanCss.cleanCssStrings.tab
import typings.node.Buffer
import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("clean-css", JSImport.Namespace)
  @js.native
  class ^ protected () extends MinifierPromise {
    def this(options: OptionsPromise) = this()
  }
  @JSImport("clean-css", JSImport.Namespace)
  @js.native
  val ^ : Constructor = js.native
  
  /**
    * Fine grained configuration for compatibility option
    */
  @js.native
  trait CompatibilityOptions extends StObject {
    
    /**
      * A hash of compatibility options related to color
      */
    var colors: js.UndefOr[Opacity] = js.native
    
    /**
      * A hash of properties that can be set with compatibility
      */
    var properties: js.UndefOr[BackgroundClipMerging] = js.native
    
    /**
      * A hash of options related to compatibility of selectors
      */
    var selectors: js.UndefOr[AdjacentSpace] = js.native
    
    /**
      * A hash of options related to comparability of supported units
      */
    var units: js.UndefOr[Ch] = js.native
  }
  object CompatibilityOptions {
    
    @scala.inline
    def apply(): CompatibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompatibilityOptions]
    }
    
    @scala.inline
    implicit class CompatibilityOptionsMutableBuilder[Self <: CompatibilityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Opacity): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setProperties(value: BackgroundClipMerging): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setSelectors(value: AdjacentSpace): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      @scala.inline
      def setUnits(value: Ch): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  /**
    * Constructor interface for CleanCSS
    */
  @js.native
  trait Constructor
    extends Instantiable0[MinifierOutput]
       with Instantiable1[
          (/* options */ OptionsOutput) | (/* options */ OptionsPromise), 
          MinifierOutput | MinifierPromise
        ]
  
  /**
    * Callback type when fetch is used
    */
  type FetchCallback = js.Function2[/* message */ String | Double, /* body */ String, Unit]
  
  /**
    * Fine grained options for configuring the CSS formatting
    */
  @js.native
  trait FormatOptions extends StObject {
    
    /**
      * Controls the new line character, can be `'\r\n'` or `'\n'`(aliased as `'windows'` and `'unix'`
      * or `'crlf'` and `'lf'`); defaults to system one, so former on Windows and latter on Unix
      */
    var breakWith: js.UndefOr[String] = js.native
    
    /**
      *  Controls where to insert breaks
      */
    var breaks: js.UndefOr[AfterAtRule] = js.native
    
    /**
      * Controls number of characters to indent with; defaults to `0`
      */
    var indentBy: js.UndefOr[Double] = js.native
    
    /**
      * Controls a character to indent with, can be `'space'` or `'tab'`; defaults to `'space'`
      */
    var indentWith: js.UndefOr[space | tab] = js.native
    
    /**
      * Controls removing trailing semicolons in rule; defaults to `false` - means remove
      */
    var semicolonAfterLastProperty: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls where to insert spaces
      */
    var spaces: js.UndefOr[AroundSelectorRelation] = js.native
    
    /**
      * Controls maximum line length; defaults to `false`
      */
    var wrapAt: js.UndefOr[`false` | Double] = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakWith(value: String): Self = StObject.set(x, "breakWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakWithUndefined: Self = StObject.set(x, "breakWith", js.undefined)
      
      @scala.inline
      def setBreaks(value: AfterAtRule): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
      
      @scala.inline
      def setIndentBy(value: Double): Self = StObject.set(x, "indentBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentByUndefined: Self = StObject.set(x, "indentBy", js.undefined)
      
      @scala.inline
      def setIndentWith(value: space | tab): Self = StObject.set(x, "indentWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWithUndefined: Self = StObject.set(x, "indentWith", js.undefined)
      
      @scala.inline
      def setSemicolonAfterLastProperty(value: Boolean): Self = StObject.set(x, "semicolonAfterLastProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemicolonAfterLastPropertyUndefined: Self = StObject.set(x, "semicolonAfterLastProperty", js.undefined)
      
      @scala.inline
      def setSpaces(value: AroundSelectorRelation): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      
      @scala.inline
      def setWrapAt(value: `false` | Double): Self = StObject.set(x, "wrapAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapAtUndefined: Self = StObject.set(x, "wrapAt", js.undefined)
    }
  }
  
  /**
    * Union type for both types of minifier functions
    */
  /* Rewritten from type alias, can be one of: 
    - typings.cleanCss.mod.MinifierOutput
    - typings.cleanCss.mod.MinifierPromise
  */
  trait Minifier extends StObject
  
  /**
    * Interface exposed when a new CleanCSS object is created
    */
  @js.native
  trait MinifierOutput extends Minifier {
    
    def minify(sources: Sources): Output = js.native
    def minify(sources: Sources, callback: js.Function2[/* error */ js.Any, /* output */ Output, Unit]): Output = js.native
    def minify(sources: Sources, sourceMap: String): Output = js.native
    def minify(
      sources: Sources,
      sourceMap: String,
      callback: js.Function2[/* error */ js.Any, /* output */ Output, Unit]
    ): Output = js.native
  }
  
  /**
    * Interface exposed when a new CleanCSS object is created with returnPromise set to true
    */
  @js.native
  trait MinifierPromise extends Minifier {
    
    def minify(sources: Sources): js.Promise[Output] = js.native
    def minify(sources: Sources, sourceMap: String): js.Promise[Output] = js.native
  }
  
  /**
    * Fine grained options for configuring optimizations
    */
  @js.native
  trait OptimizationsOptions extends StObject {
    
    var `1`: js.UndefOr[All] = js.native
    
    var `2`: js.UndefOr[MergeAdjacentRules] = js.native
  }
  object OptimizationsOptions {
    
    @scala.inline
    def apply(): OptimizationsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimizationsOptions]
    }
    
    @scala.inline
    implicit class OptimizationsOptionsMutableBuilder[Self <: OptimizationsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1(value: All): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1Undefined: Self = StObject.set(x, "1", js.undefined)
      
      @scala.inline
      def set2(value: MergeAdjacentRules): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Undefined: Self = StObject.set(x, "2", js.undefined)
    }
  }
  
  /**
    * Discriminant union of both sets of options types.  If you initialize without setting `returnPromise: true`
    *  and want to return a promise, you will need to cast to the correct options type so that TypeScript
    *  knows what the expected return type will be:
    *  `(options = options as CleanCSS.OptionsPromise).returnPromise = true`
    */
  /* Rewritten from type alias, can be one of: 
    - typings.cleanCss.mod.OptionsPromise
    - typings.cleanCss.mod.OptionsOutput
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def OptionsOutput(): typings.cleanCss.mod.OptionsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.cleanCss.mod.OptionsOutput]
    }
    
    @scala.inline
    def OptionsPromise(returnPromise: `true`): typings.cleanCss.mod.OptionsPromise = {
      val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cleanCss.mod.OptionsPromise]
    }
  }
  
  /**
    * Shared options passed when initializing a new instance of CleanCSS that returns either a promise or output
    */
  @js.native
  trait OptionsBase extends StObject {
    
    /**
      * Controls compatibility mode used; defaults to ie10+ using `'*'`.
      *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
      */
    var compatibility: js.UndefOr[Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions] = js.native
    
    /**
      * Controls a function for handling remote requests; Defaults to the build in `loadRemoteResource` function
      */
    var fetch: js.UndefOr[
        js.Function4[
          /* uri */ String, 
          /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, 
          /* inlineTimeout */ Double, 
          /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Controls output CSS formatting; defaults to `false`.
      *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
      */
    var format: js.UndefOr[beautify | `keep-breaks` | FormatOptions | `false`] = js.native
    
    /**
      * inline option whitelists which @import rules will be processed.  Defaults to `'local'`
      * Accepts the following values:
      *  'local': enables local inlining;
      *  'remote': enables remote inlining;
      *  'none': disables all inlining;
      *  'all': enables all inlining, same as ['local', 'remote'];
      *  '[uri]': enables remote inlining from the specified uri;
      *  '![url]': disables remote inlining from the specified uri;
      */
    var `inline`: js.UndefOr[js.Array[String] | `false`] = js.native
    
    /**
      * Controls extra options for inlining remote @import rules
      */
    var inlineRequest: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.native
    
    /**
      * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
      */
    var inlineTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Controls optimization level used; defaults to `1`.
      * Level hash exposes `1`, and `2`.
      */
    var level: js.UndefOr[`0` | `1` | `2` | OptimizationsOptions] = js.native
    
    /**
      * Controls URL rebasing; defaults to `true`;
      */
    var rebase: js.UndefOr[Boolean] = js.native
    
    /**
      * controls a directory to which all URLs are rebased, most likely the directory under which the output file
      * will live; defaults to the current directory;
      */
    var rebaseTo: js.UndefOr[String] = js.native
    
    /**
      *  Controls whether an output source map is built; defaults to `false`
      */
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    /**
      *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
      */
    var sourceMapInlineSources: js.UndefOr[Boolean] = js.native
  }
  object OptionsBase {
    
    @scala.inline
    def apply(): OptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit class OptionsBaseMutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompatibility(value: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
      
      @scala.inline
      def setFetch(
        value: (/* uri */ String, /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFormat(value: beautify | `keep-breaks` | FormatOptions | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInline(value: js.Array[String] | `false`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRequest(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "inlineRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRequestUndefined: Self = StObject.set(x, "inlineRequest", js.undefined)
      
      @scala.inline
      def setInlineTimeout(value: Double): Self = StObject.set(x, "inlineTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTimeoutUndefined: Self = StObject.set(x, "inlineTimeout", js.undefined)
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: `0` | `1` | `2` | OptimizationsOptions): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setRebase(value: Boolean): Self = StObject.set(x, "rebase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseTo(value: String): Self = StObject.set(x, "rebaseTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseToUndefined: Self = StObject.set(x, "rebaseTo", js.undefined)
      
      @scala.inline
      def setRebaseUndefined: Self = StObject.set(x, "rebase", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapInlineSources(value: Boolean): Self = StObject.set(x, "sourceMapInlineSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapInlineSourcesUndefined: Self = StObject.set(x, "sourceMapInlineSources", js.undefined)
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  /**
    * Options when returning an output
    */
  /* Inlined clean-css.clean-css.OptionsBase & {  returnPromise :false | undefined} */
  @js.native
  trait OptionsOutput extends Options {
    
    /**
      * Controls compatibility mode used; defaults to ie10+ using `'*'`.
      *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
      */
    var compatibility: js.UndefOr[Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions] = js.native
    
    /**
      * Controls a function for handling remote requests; Defaults to the build in `loadRemoteResource` function
      */
    var fetch: js.UndefOr[
        js.Function4[
          /* uri */ String, 
          /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, 
          /* inlineTimeout */ Double, 
          /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Controls output CSS formatting; defaults to `false`.
      *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
      */
    var format: js.UndefOr[beautify | `keep-breaks` | FormatOptions | `false`] = js.native
    
    /**
      * inline option whitelists which @import rules will be processed.  Defaults to `'local'`
      * Accepts the following values:
      *  'local': enables local inlining;
      *  'remote': enables remote inlining;
      *  'none': disables all inlining;
      *  'all': enables all inlining, same as ['local', 'remote'];
      *  '[uri]': enables remote inlining from the specified uri;
      *  '![url]': disables remote inlining from the specified uri;
      */
    var `inline`: js.UndefOr[js.Array[String] | `false`] = js.native
    
    /**
      * Controls extra options for inlining remote @import rules
      */
    var inlineRequest: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.native
    
    /**
      * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
      */
    var inlineTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Controls optimization level used; defaults to `1`.
      * Level hash exposes `1`, and `2`.
      */
    var level: js.UndefOr[`0` | `1` | `2` | OptimizationsOptions] = js.native
    
    /**
      * Controls URL rebasing; defaults to `true`;
      */
    var rebase: js.UndefOr[Boolean] = js.native
    
    /**
      * controls a directory to which all URLs are rebased, most likely the directory under which the output file
      * will live; defaults to the current directory;
      */
    var rebaseTo: js.UndefOr[String] = js.native
    
    /**
      * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
      */
    var returnPromise: js.UndefOr[`false`] = js.native
    
    /**
      *  Controls whether an output source map is built; defaults to `false`
      */
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    /**
      *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
      */
    var sourceMapInlineSources: js.UndefOr[Boolean] = js.native
  }
  object OptionsOutput {
    
    @scala.inline
    def apply(): OptionsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsOutput]
    }
    
    @scala.inline
    implicit class OptionsOutputMutableBuilder[Self <: OptionsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompatibility(value: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
      
      @scala.inline
      def setFetch(
        value: (/* uri */ String, /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFormat(value: beautify | `keep-breaks` | FormatOptions | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInline(value: js.Array[String] | `false`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRequest(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "inlineRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRequestUndefined: Self = StObject.set(x, "inlineRequest", js.undefined)
      
      @scala.inline
      def setInlineTimeout(value: Double): Self = StObject.set(x, "inlineTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTimeoutUndefined: Self = StObject.set(x, "inlineTimeout", js.undefined)
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: `0` | `1` | `2` | OptimizationsOptions): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setRebase(value: Boolean): Self = StObject.set(x, "rebase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseTo(value: String): Self = StObject.set(x, "rebaseTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseToUndefined: Self = StObject.set(x, "rebaseTo", js.undefined)
      
      @scala.inline
      def setRebaseUndefined: Self = StObject.set(x, "rebase", js.undefined)
      
      @scala.inline
      def setReturnPromise(value: `false`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnPromiseUndefined: Self = StObject.set(x, "returnPromise", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapInlineSources(value: Boolean): Self = StObject.set(x, "sourceMapInlineSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapInlineSourcesUndefined: Self = StObject.set(x, "sourceMapInlineSources", js.undefined)
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  /**
    * Options when returning a promise
    */
  /* Inlined clean-css.clean-css.OptionsBase & {  returnPromise :true} */
  @js.native
  trait OptionsPromise extends Options {
    
    /**
      * Controls compatibility mode used; defaults to ie10+ using `'*'`.
      *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
      */
    var compatibility: js.UndefOr[Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions] = js.native
    
    /**
      * Controls a function for handling remote requests; Defaults to the build in `loadRemoteResource` function
      */
    var fetch: js.UndefOr[
        js.Function4[
          /* uri */ String, 
          /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, 
          /* inlineTimeout */ Double, 
          /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      * Controls output CSS formatting; defaults to `false`.
      *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
      */
    var format: js.UndefOr[beautify | `keep-breaks` | FormatOptions | `false`] = js.native
    
    /**
      * inline option whitelists which @import rules will be processed.  Defaults to `'local'`
      * Accepts the following values:
      *  'local': enables local inlining;
      *  'remote': enables remote inlining;
      *  'none': disables all inlining;
      *  'all': enables all inlining, same as ['local', 'remote'];
      *  '[uri]': enables remote inlining from the specified uri;
      *  '![url]': disables remote inlining from the specified uri;
      */
    var `inline`: js.UndefOr[js.Array[String] | `false`] = js.native
    
    /**
      * Controls extra options for inlining remote @import rules
      */
    var inlineRequest: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.native
    
    /**
      * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
      */
    var inlineTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Controls optimization level used; defaults to `1`.
      * Level hash exposes `1`, and `2`.
      */
    var level: js.UndefOr[`0` | `1` | `2` | OptimizationsOptions] = js.native
    
    /**
      * Controls URL rebasing; defaults to `true`;
      */
    var rebase: js.UndefOr[Boolean] = js.native
    
    /**
      * controls a directory to which all URLs are rebased, most likely the directory under which the output file
      * will live; defaults to the current directory;
      */
    var rebaseTo: js.UndefOr[String] = js.native
    
    /**
      * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
      */
    var returnPromise: `true` = js.native
    
    /**
      *  Controls whether an output source map is built; defaults to `false`
      */
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    /**
      *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
      */
    var sourceMapInlineSources: js.UndefOr[Boolean] = js.native
  }
  object OptionsPromise {
    
    @scala.inline
    def apply(returnPromise: `true`): OptionsPromise = {
      val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsPromise]
    }
    
    @scala.inline
    implicit class OptionsPromiseMutableBuilder[Self <: OptionsPromise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompatibility(value: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
      
      @scala.inline
      def setFetch(
        value: (/* uri */ String, /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFormat(value: beautify | `keep-breaks` | FormatOptions | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInline(value: js.Array[String] | `false`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRequest(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "inlineRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineRequestUndefined: Self = StObject.set(x, "inlineRequest", js.undefined)
      
      @scala.inline
      def setInlineTimeout(value: Double): Self = StObject.set(x, "inlineTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineTimeoutUndefined: Self = StObject.set(x, "inlineTimeout", js.undefined)
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: `0` | `1` | `2` | OptimizationsOptions): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setRebase(value: Boolean): Self = StObject.set(x, "rebase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseTo(value: String): Self = StObject.set(x, "rebaseTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebaseToUndefined: Self = StObject.set(x, "rebaseTo", js.undefined)
      
      @scala.inline
      def setRebaseUndefined: Self = StObject.set(x, "rebase", js.undefined)
      
      @scala.inline
      def setReturnPromise(value: `true`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapInlineSources(value: Boolean): Self = StObject.set(x, "sourceMapInlineSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapInlineSourcesUndefined: Self = StObject.set(x, "sourceMapInlineSources", js.undefined)
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  /**
    * Output returned when calling minify functions
    */
  @js.native
  trait Output extends StObject {
    
    /**
      * A list of errors raised
      */
    var errors: js.Array[String] = js.native
    
    /**
      * Output source map if requested with `sourceMap` option
      */
    var sourceMap: String = js.native
    
    /**
      * Contains statistics on the minify process
      */
    var stats: Efficiency = js.native
    
    /**
      * Optimized output CSS as a string
      */
    var styles: String = js.native
    
    /**
      * A list of warnings raised
      */
    var warnings: js.Array[String] = js.native
  }
  object Output {
    
    @scala.inline
    def apply(
      errors: js.Array[String],
      sourceMap: String,
      stats: Efficiency,
      styles: String,
      warnings: js.Array[String]
    ): Output = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setSourceMap(value: String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Efficiency): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  /**
    * Hash of input source(s).  Passing an array of hashes allows you to explicitly specify the order in which the input files
    *  are concatenated. Whereas when you use a single hash the order is determined by the traversal order of object properties
    */
  type Source = /**
    * Path to file
    */
  StringDictionary[SourceMap]
  
  /**
    * Union of all types acceptable as input for the minify function
    */
  type Sources = String | (js.Array[Source | String]) | Source | Buffer
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Constructor = ^
}
