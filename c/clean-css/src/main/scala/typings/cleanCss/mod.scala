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
import typings.cleanCss.cleanCssInts.`0`
import typings.cleanCss.cleanCssInts.`1`
import typings.cleanCss.cleanCssInts.`2`
import typings.cleanCss.cleanCssStrings.Asterisk
import typings.cleanCss.cleanCssStrings.`keep-breaks`
import typings.cleanCss.cleanCssStrings.beautify
import typings.cleanCss.cleanCssStrings.ie7
import typings.cleanCss.cleanCssStrings.ie8
import typings.cleanCss.cleanCssStrings.ie9
import typings.cleanCss.cleanCssStrings.space
import typings.cleanCss.cleanCssStrings.tab
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.RequestOptions
import typings.sourceMap.mod.RawSourceMap
import typings.sourceMap.mod.SourceMapGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("clean-css", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MinifierPromise {
    def this(options: OptionsPromise) = this()
  }
  @JSImport("clean-css", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /**
    * Fine grained configuration for compatibility option
    */
  trait CompatibilityOptions extends StObject {
    
    /**
      * A hash of compatibility options related to color
      */
    var colors: js.UndefOr[Opacity] = js.undefined
    
    /**
      * A hash of properties that can be set with compatibility
      */
    var properties: js.UndefOr[BackgroundClipMerging] = js.undefined
    
    /**
      * A hash of options related to compatibility of selectors
      */
    var selectors: js.UndefOr[AdjacentSpace] = js.undefined
    
    /**
      * A hash of options related to comparability of supported units
      */
    var units: js.UndefOr[Ch] = js.undefined
  }
  object CompatibilityOptions {
    
    inline def apply(): CompatibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompatibilityOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompatibilityOptions] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Opacity): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setProperties(value: BackgroundClipMerging): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSelectors(value: AdjacentSpace): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setUnits(value: Ch): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  /**
    * Constructor interface for CleanCSS
    */
  @js.native
  trait Constructor
    extends StObject
       with Instantiable0[MinifierOutput]
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
  trait FormatOptions extends StObject {
    
    /**
      * Controls the new line character, can be `'\r\n'` or `'\n'`(aliased as `'windows'` and `'unix'`
      * or `'crlf'` and `'lf'`); defaults to system one, so former on Windows and latter on Unix
      */
    var breakWith: js.UndefOr[String] = js.undefined
    
    /**
      *  Controls where to insert breaks
      */
    var breaks: js.UndefOr[AfterAtRule] = js.undefined
    
    /**
      * Controls number of characters to indent with; defaults to `0`
      */
    var indentBy: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls a character to indent with, can be `'space'` or `'tab'`; defaults to `'space'`
      */
    var indentWith: js.UndefOr[space | tab] = js.undefined
    
    /**
      * Controls removing trailing semicolons in rule; defaults to `false` - means remove
      */
    var semicolonAfterLastProperty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls where to insert spaces
      */
    var spaces: js.UndefOr[AroundSelectorRelation] = js.undefined
    
    /**
      * Controls maximum line length; defaults to `false`
      */
    var wrapAt: js.UndefOr[`false` | Double] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setBreakWith(value: String): Self = StObject.set(x, "breakWith", value.asInstanceOf[js.Any])
      
      inline def setBreakWithUndefined: Self = StObject.set(x, "breakWith", js.undefined)
      
      inline def setBreaks(value: AfterAtRule): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
      
      inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
      
      inline def setIndentBy(value: Double): Self = StObject.set(x, "indentBy", value.asInstanceOf[js.Any])
      
      inline def setIndentByUndefined: Self = StObject.set(x, "indentBy", js.undefined)
      
      inline def setIndentWith(value: space | tab): Self = StObject.set(x, "indentWith", value.asInstanceOf[js.Any])
      
      inline def setIndentWithUndefined: Self = StObject.set(x, "indentWith", js.undefined)
      
      inline def setSemicolonAfterLastProperty(value: Boolean): Self = StObject.set(x, "semicolonAfterLastProperty", value.asInstanceOf[js.Any])
      
      inline def setSemicolonAfterLastPropertyUndefined: Self = StObject.set(x, "semicolonAfterLastProperty", js.undefined)
      
      inline def setSpaces(value: AroundSelectorRelation): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
      
      inline def setWrapAt(value: `false` | Double): Self = StObject.set(x, "wrapAt", value.asInstanceOf[js.Any])
      
      inline def setWrapAtUndefined: Self = StObject.set(x, "wrapAt", js.undefined)
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
  trait MinifierOutput
    extends StObject
       with Minifier {
    
    def minify(sources: Sources): Output = js.native
    def minify(sources: Sources, callback: js.Function2[/* error */ Any, /* output */ Output, Unit]): Output = js.native
    def minify(sources: Sources, sourceMap: String): Output = js.native
    def minify(
      sources: Sources,
      sourceMap: String,
      callback: js.Function2[/* error */ Any, /* output */ Output, Unit]
    ): Output = js.native
    def minify(sources: Sources, sourceMap: RawSourceMap): Output = js.native
    def minify(
      sources: Sources,
      sourceMap: RawSourceMap,
      callback: js.Function2[/* error */ Any, /* output */ Output, Unit]
    ): Output = js.native
  }
  
  /**
    * Interface exposed when a new CleanCSS object is created with returnPromise set to true
    */
  @js.native
  trait MinifierPromise
    extends StObject
       with Minifier {
    
    def minify(sources: Sources): js.Promise[Output] = js.native
    def minify(sources: Sources, sourceMap: String): js.Promise[Output] = js.native
    def minify(sources: Sources, sourceMap: RawSourceMap): js.Promise[Output] = js.native
  }
  
  /**
    * Fine grained options for configuring optimizations
    */
  trait OptimizationsOptions extends StObject {
    
    var `1`: js.UndefOr[All] = js.undefined
    
    var `2`: js.UndefOr[MergeAdjacentRules] = js.undefined
  }
  object OptimizationsOptions {
    
    inline def apply(): OptimizationsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimizationsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptimizationsOptions] (val x: Self) extends AnyVal {
      
      inline def set1(value: All): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set1Undefined: Self = StObject.set(x, "1", js.undefined)
      
      inline def set2(value: MergeAdjacentRules): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set2Undefined: Self = StObject.set(x, "2", js.undefined)
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
    
    inline def OptionsOutput(): typings.cleanCss.mod.OptionsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.cleanCss.mod.OptionsOutput]
    }
    
    inline def OptionsPromise(): typings.cleanCss.mod.OptionsPromise = {
      val __obj = js.Dynamic.literal(returnPromise = true)
      __obj.asInstanceOf[typings.cleanCss.mod.OptionsPromise]
    }
  }
  
  /**
    * Shared options passed when initializing a new instance of CleanCSS that returns either a promise or output
    */
  trait OptionsBase extends StObject {
    
    /**
      * Controls compatibility mode used; defaults to ie10+ using `'*'`.
      *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
      */
    var compatibility: js.UndefOr[Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Controls output CSS formatting; defaults to `false`.
      *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
      */
    var format: js.UndefOr[beautify | `keep-breaks` | FormatOptions | `false`] = js.undefined
    
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
    var `inline`: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /**
      * Controls extra options for inlining remote @import rules
      */
    var inlineRequest: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.undefined
    
    /**
      * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
      */
    var inlineTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls optimization level used; defaults to `1`.
      * Level hash exposes `1`, and `2`.
      */
    var level: js.UndefOr[`0` | `1` | `2` | OptimizationsOptions] = js.undefined
    
    /**
      * Controls URL rebasing; defaults to `true`;
      */
    var rebase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * controls a directory to which all URLs are rebased, most likely the directory under which the output file
      * will live; defaults to the current directory;
      */
    var rebaseTo: js.UndefOr[String] = js.undefined
    
    /**
      *  Controls whether an output source map is built; defaults to `false`
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
      */
    var sourceMapInlineSources: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsBase {
    
    inline def apply(): OptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsBase] (val x: Self) extends AnyVal {
      
      inline def setCompatibility(value: Asterisk | ie9 | ie8 | ie7 | CompatibilityOptions): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
      
      inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
      
      inline def setFetch(
        value: (/* uri */ String, /* inlineRequest */ RequestOptions | typings.node.httpsMod.RequestOptions, /* inlineTimeout */ Double, /* done */ js.Function2[/* message */ String | Double, /* body */ String, Unit]) => Unit
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction4(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFormat(value: beautify | `keep-breaks` | FormatOptions | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInline(value: js.Array[String] | `false`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineRequest(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "inlineRequest", value.asInstanceOf[js.Any])
      
      inline def setInlineRequestUndefined: Self = StObject.set(x, "inlineRequest", js.undefined)
      
      inline def setInlineTimeout(value: Double): Self = StObject.set(x, "inlineTimeout", value.asInstanceOf[js.Any])
      
      inline def setInlineTimeoutUndefined: Self = StObject.set(x, "inlineTimeout", js.undefined)
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInlineVarargs(value: String*): Self = StObject.set(x, "inline", js.Array(value*))
      
      inline def setLevel(value: `0` | `1` | `2` | OptimizationsOptions): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setRebase(value: Boolean): Self = StObject.set(x, "rebase", value.asInstanceOf[js.Any])
      
      inline def setRebaseTo(value: String): Self = StObject.set(x, "rebaseTo", value.asInstanceOf[js.Any])
      
      inline def setRebaseToUndefined: Self = StObject.set(x, "rebaseTo", js.undefined)
      
      inline def setRebaseUndefined: Self = StObject.set(x, "rebase", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapInlineSources(value: Boolean): Self = StObject.set(x, "sourceMapInlineSources", value.asInstanceOf[js.Any])
      
      inline def setSourceMapInlineSourcesUndefined: Self = StObject.set(x, "sourceMapInlineSources", js.undefined)
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  /**
    * Options when returning an output
    */
  trait OptionsOutput
    extends StObject
       with OptionsBase
       with Options {
    
    /**
      * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
      */
    var returnPromise: js.UndefOr[`false`] = js.undefined
  }
  object OptionsOutput {
    
    inline def apply(): OptionsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsOutput] (val x: Self) extends AnyVal {
      
      inline def setReturnPromise(value: `false`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
      
      inline def setReturnPromiseUndefined: Self = StObject.set(x, "returnPromise", js.undefined)
    }
  }
  
  /**
    * Options when returning a promise
    */
  trait OptionsPromise
    extends StObject
       with OptionsBase
       with Options {
    
    /**
      * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
      */
    var returnPromise: `true`
  }
  object OptionsPromise {
    
    inline def apply(): OptionsPromise = {
      val __obj = js.Dynamic.literal(returnPromise = true)
      __obj.asInstanceOf[OptionsPromise]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsPromise] (val x: Self) extends AnyVal {
      
      inline def setReturnPromise(value: `true`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Output returned when calling minify functions
    */
  trait Output extends StObject {
    
    /**
      * A list of errors raised
      */
    var errors: js.Array[String]
    
    /**
      * Output source map if requested with `sourceMap` option
      */
    var sourceMap: js.UndefOr[SourceMapGenerator] = js.undefined
    
    /**
      * Contains statistics on the minify process
      */
    var stats: Efficiency
    
    /**
      * Optimized output CSS as a string
      */
    var styles: String
    
    /**
      * A list of warnings raised
      */
    var warnings: js.Array[String]
  }
  object Output {
    
    inline def apply(errors: js.Array[String], stats: Efficiency, styles: String, warnings: js.Array[String]): Output = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSourceMap(value: SourceMapGenerator): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStats(value: Efficiency): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
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
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Constructor = ^
}
