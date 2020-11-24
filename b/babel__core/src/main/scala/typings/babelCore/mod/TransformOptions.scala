package typings.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.babelCoreStrings.`inline`
import typings.babelCore.babelCoreStrings.`upward-optional`
import typings.babelCore.babelCoreStrings.auto
import typings.babelCore.babelCoreStrings.both
import typings.babelCore.babelCoreStrings.enter
import typings.babelCore.babelCoreStrings.exit
import typings.babelCore.babelCoreStrings.module
import typings.babelCore.babelCoreStrings.root
import typings.babelCore.babelCoreStrings.script
import typings.babelCore.babelCoreStrings.unambiguous
import typings.babelCore.babelCoreStrings.upward
import typings.babelGenerator.mod.GeneratorOptions
import typings.babelParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOptions extends js.Object {
  
  /**
    * Include the AST in the returned object
    *
    * Default: `false`
    */
  var ast: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Attach a comment after all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.native
  
  /**
    * Attach a comment before all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.native
  
  /**
    * Specify whether or not to use .babelrc and
    * .babelignore files.
    *
    * Default: `true`
    */
  var babelrc: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Specify which packages should be search for .babelrc files when they are being compiled. `true` to always search, or a path string or an array of paths to packages to search
    * inside of. Defaults to only searching the "root" package.
    *
    * Default: `(root)`
    */
  var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.native
  
  /**
    * Utilities may pass a caller object to identify themselves to Babel and
    * pass capability-related flags for use by configs, presets and plugins.
    *
    * @see https://babeljs.io/docs/en/next/options#caller
    */
  var caller: js.UndefOr[TransformCaller] = js.native
  
  /**
    * Enable code generation
    *
    * Default: `true`
    */
  var code: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Output comments in generated output
    *
    * Default: `true`
    */
  var comments: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"` compact is set to `true` on input sizes of >500KB
    *
    * Default: `"auto"`
    */
  var compact: js.UndefOr[Boolean | auto | Null] = js.native
  
  /**
    * The config file to load Babel's config from. Defaults to searching for "babel.config.js" inside the "root" folder. `false` will disable searching for config files.
    *
    * Default: `undefined`
    */
  var configFile: js.UndefOr[String | Boolean | Null] = js.native
  
  /**
    * The working directory that Babel's programmatic options are loaded relative to.
    *
    * Default: `"."`
    */
  var cwd: js.UndefOr[String | Null] = js.native
  
  /**
    * This is an object of keys that represent different environments. For example, you may have: `{ env: { production: { \/ * specific options *\/ } } }`
    * which will use those options when the `envName` is `production`
    *
    * Default: `{}`
    */
  var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.native
  
  /**
    * Defaults to environment variable `BABEL_ENV` if set, or else `NODE_ENV` if set, or else it defaults to `"development"`
    *
    * Default: env vars
    */
  var envName: js.UndefOr[String] = js.native
  
  /**
    * If any of patterns match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  
  /**
    * A path to a `.babelrc` file to extend
    *
    * Default: `null`
    */
  var `extends`: js.UndefOr[String | Null] = js.native
  
  /**
    * Filename for use in errors etc
    *
    * Default: `"unknown"`
    */
  var filename: js.UndefOr[String | Null] = js.native
  
  /**
    * Filename relative to `sourceRoot`
    *
    * Default: `(filename)`
    */
  var filenameRelative: js.UndefOr[String | Null] = js.native
  
  /**
    * An object containing the options to be passed down to the babel code generator, @babel/generator
    *
    * Default: `{}`
    */
  var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.native
  
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`. If falsy value is returned then the generated module id is used
    *
    * Default: `null`
    */
  var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.native
  
  /**
    * ANSI highlight syntax error code frames
    *
    * Default: `true`
    */
  var highlightCode: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Opposite to the `only` option. `ignore` is disregarded if `only` is specified
    *
    * Default: `null`
    */
  var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.native
  
  /**
    * This option is a synonym for "test"
    */
  var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  
  /**
    * A source map object that the output source map will be based on
    *
    * Default: `null`
    */
  var inputSourceMap: js.UndefOr[js.Object | Null] = js.native
  
  /**
    * Should the output be minified (not printing last semicolons in blocks, printing literal string values instead of escaped ones, stripping `()` from `new` when safe)
    *
    * Default: `false`
    */
  var minified: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Specify a custom name for module ids
    *
    * Default: `null`
    */
  var moduleId: js.UndefOr[String | Null] = js.native
  
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous. (Not available for `common` modules)
    *
    * Default: `false`
    */
  var moduleIds: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions
    *
    * Default: `(sourceRoot)`
    */
  var moduleRoot: js.UndefOr[String | Null] = js.native
  
  /**
    * A glob, regex, or mixed array of both, matching paths to **only** compile. Can also be an array of arrays containing paths to explicitly match. When attempting to compile
    * a non-matching file it's returned verbatim
    *
    * Default: `null`
    */
  var only: js.UndefOr[js.Array[MatchPattern] | Null] = js.native
  
  /**
    * Allows users to provide an array of options that will be merged into the current configuration one at a time.
    * This feature is best used alongside the "test"/"include"/"exclude" options to provide conditions for which an override should apply
    */
  var overrides: js.UndefOr[js.Array[TransformOptions]] = js.native
  
  /**
    * An object containing the options to be passed down to the babel parser, @babel/parser
    *
    * Default: `{}`
    */
  var parserOpts: js.UndefOr[ParserOptions | Null] = js.native
  
  /**
    * List of plugins to load and use
    *
    * Default: `[]`
    */
  var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.native
  
  /**
    * List of presets (a set of plugins) to load and use
    *
    * Default: `[]`
    */
  var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.native
  
  /**
    * Retain line numbers. This will lead to wacky code but is handy for scenarios where you can't use source maps. (**NOTE**: This will not retain the columns)
    *
    * Default: `false`
    */
  var retainLines: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Specify the "root" folder that defines the location to search for "babel.config.js", and the default folder to allow `.babelrc` files inside of.
    *
    * Default: `"."`
    */
  var root: js.UndefOr[String | Null] = js.native
  
  /**
    * This option, combined with the "root" value, defines how Babel chooses its project root.
    * The different modes define different ways that Babel can process the "root" value to get
    * the final project root.
    *
    * @see https://babeljs.io/docs/en/next/options#rootmode
    */
  var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.native
  
  /**
    * An optional callback that controls whether a comment should be output or not. Called as `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comment` option when used
    *
    * Default: `null`
    */
  var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.native
  
  /**
    * Set `sources[0]` on returned source map
    *
    * Default: `(filenameRelative)`
    */
  var sourceFileName: js.UndefOr[String | Null] = js.native
  
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a sourceMappingURL directive is added to the bottom of the returned code. If set to `"both"`
    * then a `map` property is returned as well as a source map comment appended. **This does not emit sourcemap files by itself!**
    *
    * Default: `false`
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.native
  
  /**
    * The root from which all sources are relative
    *
    * Default: `(moduleRoot)`
    */
  var sourceRoot: js.UndefOr[String | Null] = js.native
  
  /**
    * Indicate the mode the code should be parsed in. Can be one of "script", "module", or "unambiguous". `"unambiguous"` will make Babel attempt to guess, based on the presence of ES6
    * `import` or `export` statements. Files with ES6 `import`s and `export`s are considered `"module"` and are otherwise `"script"`.
    *
    * Default: `("module")`
    */
  var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.native
  
  /**
    * If all patterns fail to match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  
  /**
    * An optional callback that can be used to wrap visitor methods. **NOTE**: This is useful for things like introspection, and not really needed for implementing anything. Called as
    * `wrapPluginVisitorMethod(pluginAlias, visitorType, callback)`.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    (js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[
        /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
        /* state */ js.Any, 
        Unit
      ], 
      js.Function2[
        /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
        /* state */ _, 
        Unit
      ]
    ]) | Null
  ] = js.native
}
object TransformOptions {
  
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAst(value: Boolean): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    
    @scala.inline
    def setAstNull: Self = this.set("ast", null)
    
    @scala.inline
    def setAuxiliaryCommentAfter(value: String): Self = this.set("auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuxiliaryCommentAfter: Self = this.set("auxiliaryCommentAfter", js.undefined)
    
    @scala.inline
    def setAuxiliaryCommentAfterNull: Self = this.set("auxiliaryCommentAfter", null)
    
    @scala.inline
    def setAuxiliaryCommentBefore(value: String): Self = this.set("auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuxiliaryCommentBefore: Self = this.set("auxiliaryCommentBefore", js.undefined)
    
    @scala.inline
    def setAuxiliaryCommentBeforeNull: Self = this.set("auxiliaryCommentBefore", null)
    
    @scala.inline
    def setBabelrc(value: Boolean): Self = this.set("babelrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelrc: Self = this.set("babelrc", js.undefined)
    
    @scala.inline
    def setBabelrcNull: Self = this.set("babelrc", null)
    
    @scala.inline
    def setBabelrcRootsVarargs(value: MatchPattern*): Self = this.set("babelrcRoots", js.Array(value :_*))
    
    @scala.inline
    def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("babelrcRoots", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = this.set("babelrcRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelrcRoots: Self = this.set("babelrcRoots", js.undefined)
    
    @scala.inline
    def setBabelrcRootsNull: Self = this.set("babelrcRoots", null)
    
    @scala.inline
    def setCaller(value: TransformCaller): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    
    @scala.inline
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setCompact(value: Boolean | auto): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setCompactNull: Self = this.set("compact", null)
    
    @scala.inline
    def setConfigFile(value: String | Boolean): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    
    @scala.inline
    def setConfigFileNull: Self = this.set("configFile", null)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setCwdNull: Self = this.set("cwd", null)
    
    @scala.inline
    def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setEnvNull: Self = this.set("env", null)
    
    @scala.inline
    def setEnvName(value: String): Self = this.set("envName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvName: Self = this.set("envName", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: MatchPattern*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("exclude", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExclude(value: MatchPattern | js.Array[MatchPattern]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    
    @scala.inline
    def setFilenameRelative(value: String): Self = this.set("filenameRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilenameRelative: Self = this.set("filenameRelative", js.undefined)
    
    @scala.inline
    def setFilenameRelativeNull: Self = this.set("filenameRelative", null)
    
    @scala.inline
    def setGeneratorOpts(value: GeneratorOptions): Self = this.set("generatorOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratorOpts: Self = this.set("generatorOpts", js.undefined)
    
    @scala.inline
    def setGeneratorOptsNull: Self = this.set("generatorOpts", null)
    
    @scala.inline
    def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = this.set("getModuleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetModuleId: Self = this.set("getModuleId", js.undefined)
    
    @scala.inline
    def setGetModuleIdNull: Self = this.set("getModuleId", null)
    
    @scala.inline
    def setHighlightCode(value: Boolean): Self = this.set("highlightCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightCode: Self = this.set("highlightCode", js.undefined)
    
    @scala.inline
    def setHighlightCodeNull: Self = this.set("highlightCode", null)
    
    @scala.inline
    def setIgnoreVarargs(value: MatchPattern*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[MatchPattern]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIgnoreNull: Self = this.set("ignore", null)
    
    @scala.inline
    def setIncludeVarargs(value: MatchPattern*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("include", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInclude(value: MatchPattern | js.Array[MatchPattern]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setInputSourceMap(value: js.Object): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
    
    @scala.inline
    def setInputSourceMapNull: Self = this.set("inputSourceMap", null)
    
    @scala.inline
    def setMinified(value: Boolean): Self = this.set("minified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinified: Self = this.set("minified", js.undefined)
    
    @scala.inline
    def setMinifiedNull: Self = this.set("minified", null)
    
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    
    @scala.inline
    def setModuleIdNull: Self = this.set("moduleId", null)
    
    @scala.inline
    def setModuleIds(value: Boolean): Self = this.set("moduleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleIds: Self = this.set("moduleIds", js.undefined)
    
    @scala.inline
    def setModuleIdsNull: Self = this.set("moduleIds", null)
    
    @scala.inline
    def setModuleRoot(value: String): Self = this.set("moduleRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleRoot: Self = this.set("moduleRoot", js.undefined)
    
    @scala.inline
    def setModuleRootNull: Self = this.set("moduleRoot", null)
    
    @scala.inline
    def setOnlyVarargs(value: MatchPattern*): Self = this.set("only", js.Array(value :_*))
    
    @scala.inline
    def setOnly(value: js.Array[MatchPattern]): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    
    @scala.inline
    def setOnlyNull: Self = this.set("only", null)
    
    @scala.inline
    def setOverridesVarargs(value: TransformOptions*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: js.Array[TransformOptions]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setParserOpts(value: ParserOptions): Self = this.set("parserOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParserOpts: Self = this.set("parserOpts", js.undefined)
    
    @scala.inline
    def setParserOptsNull: Self = this.set("parserOpts", null)
    
    @scala.inline
    def setPluginsVarargs(value: PluginItem*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[PluginItem]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPluginsNull: Self = this.set("plugins", null)
    
    @scala.inline
    def setPresetsVarargs(value: PluginItem*): Self = this.set("presets", js.Array(value :_*))
    
    @scala.inline
    def setPresets(value: js.Array[PluginItem]): Self = this.set("presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
    
    @scala.inline
    def setPresetsNull: Self = this.set("presets", null)
    
    @scala.inline
    def setRetainLines(value: Boolean): Self = this.set("retainLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainLines: Self = this.set("retainLines", js.undefined)
    
    @scala.inline
    def setRetainLinesNull: Self = this.set("retainLines", null)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setRootMode(value: root | upward | `upward-optional`): Self = this.set("rootMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootMode: Self = this.set("rootMode", js.undefined)
    
    @scala.inline
    def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = this.set("shouldPrintComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldPrintComment: Self = this.set("shouldPrintComment", js.undefined)
    
    @scala.inline
    def setShouldPrintCommentNull: Self = this.set("shouldPrintComment", null)
    
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    
    @scala.inline
    def setSourceFileNameNull: Self = this.set("sourceFileName", null)
    
    @scala.inline
    def setSourceMaps(value: Boolean | `inline` | both): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    
    @scala.inline
    def setSourceMapsNull: Self = this.set("sourceMaps", null)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setSourceRootNull: Self = this.set("sourceRoot", null)
    
    @scala.inline
    def setSourceType(value: script | module | unambiguous): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeNull: Self = this.set("sourceType", null)
    
    @scala.inline
    def setTestVarargs(value: MatchPattern*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("test", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[
          /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
          /* state */ js.Any, 
          Unit
        ]) => js.Function2[
          /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
          /* state */ _, 
          Unit
        ]
    ): Self = this.set("wrapPluginVisitorMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWrapPluginVisitorMethod: Self = this.set("wrapPluginVisitorMethod", js.undefined)
    
    @scala.inline
    def setWrapPluginVisitorMethodNull: Self = this.set("wrapPluginVisitorMethod", null)
  }
}
