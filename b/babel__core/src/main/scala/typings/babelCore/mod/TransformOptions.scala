package typings.babelCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.anon.Android
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptions extends StObject {
  
  /**
    * Specify which assumptions it can make about your code, to better optimize the compilation result. **NOTE**: This replaces the various `loose` options in plugins in favor of
    * top-level options that can apply to multiple plugins
    *
    * @see https://babeljs.io/docs/en/assumptions
    */
  var assumptions: js.UndefOr[StringDictionary[Boolean] | Null] = js.undefined
  
  /**
    * Include the AST in the returned object
    *
    * Default: `false`
    */
  var ast: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Attach a comment after all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Attach a comment before all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specify whether or not to use .babelrc and
    * .babelignore files.
    *
    * Default: `true`
    */
  var babelrc: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specify which packages should be search for .babelrc files when they are being compiled. `true` to always search, or a path string or an array of paths to packages to search
    * inside of. Defaults to only searching the "root" package.
    *
    * Default: `(root)`
    */
  var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.undefined
  
  /**
    * Toggles whether or not browserslist config sources are used, which includes searching for any browserslist files or referencing the browserslist key inside package.json.
    * This is useful for projects that use a browserslist config for files that won't be compiled with Babel.
    *
    * If a string is specified, it must represent the path of a browserslist configuration file. Relative paths are resolved relative to the configuration file which specifies
    * this option, or to `cwd` when it's passed as part of the programmatic options.
    *
    * Default: `true`
    */
  var browserslistConfigFile: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The Browserslist environment to use.
    *
    * Default: `undefined`
    */
  var browserslistEnv: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Utilities may pass a caller object to identify themselves to Babel and
    * pass capability-related flags for use by configs, presets and plugins.
    *
    * @see https://babeljs.io/docs/en/next/options#caller
    */
  var caller: js.UndefOr[TransformCaller] = js.undefined
  
  /**
    * By default `babel.transformFromAst` will clone the input AST to avoid mutations.
    * Specifying `cloneInputAst: false` can improve parsing performance if the input AST is not used elsewhere.
    *
    * Default: `true`
    */
  var cloneInputAst: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enable code generation
    *
    * Default: `true`
    */
  var code: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output comments in generated output
    *
    * Default: `true`
    */
  var comments: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"` compact is set to `true` on input sizes of >500KB
    *
    * Default: `"auto"`
    */
  var compact: js.UndefOr[Boolean | auto | Null] = js.undefined
  
  /**
    * The config file to load Babel's config from. Defaults to searching for "babel.config.js" inside the "root" folder. `false` will disable searching for config files.
    *
    * Default: `undefined`
    */
  var configFile: js.UndefOr[String | Boolean | Null] = js.undefined
  
  /**
    * The working directory that Babel's programmatic options are loaded relative to.
    *
    * Default: `"."`
    */
  var cwd: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is an object of keys that represent different environments. For example, you may have: `{ env: { production: { \/ * specific options *\/ } } }`
    * which will use those options when the `envName` is `production`
    *
    * Default: `{}`
    */
  var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.undefined
  
  /**
    * Defaults to environment variable `BABEL_ENV` if set, or else `NODE_ENV` if set, or else it defaults to `"development"`
    *
    * Default: env vars
    */
  var envName: js.UndefOr[String] = js.undefined
  
  /**
    * If any of patterns match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  
  /**
    * A path to a `.babelrc` file to extend
    *
    * Default: `null`
    */
  var `extends`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filename for use in errors etc
    *
    * Default: `"unknown"`
    */
  var filename: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Filename relative to `sourceRoot`
    *
    * Default: `(filename)`
    */
  var filenameRelative: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An object containing the options to be passed down to the babel code generator, @babel/generator
    *
    * Default: `{}`
    */
  var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.undefined
  
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`. If falsy value is returned then the generated module id is used
    *
    * Default: `null`
    */
  var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.undefined
  
  /**
    * ANSI highlight syntax error code frames
    *
    * Default: `true`
    */
  var highlightCode: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Opposite to the `only` option. `ignore` is disregarded if `only` is specified
    *
    * Default: `null`
    */
  var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
  
  /**
    * This option is a synonym for "test"
    */
  var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  
  /**
    * A source map object that the output source map will be based on
    *
    * Default: `null`
    */
  var inputSourceMap: js.UndefOr[InputSourceMap | Null] = js.undefined
  
  /**
    * Should the output be minified (not printing last semicolons in blocks, printing literal string values instead of escaped ones, stripping `()` from `new` when safe)
    *
    * Default: `false`
    */
  var minified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specify a custom name for module ids
    *
    * Default: `null`
    */
  var moduleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous. (Not available for `common` modules)
    *
    * Default: `false`
    */
  var moduleIds: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions
    *
    * Default: `(sourceRoot)`
    */
  var moduleRoot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A glob, regex, or mixed array of both, matching paths to **only** compile. Can also be an array of arrays containing paths to explicitly match. When attempting to compile
    * a non-matching file it's returned verbatim
    *
    * Default: `null`
    */
  var only: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
  
  /**
    * Allows users to provide an array of options that will be merged into the current configuration one at a time.
    * This feature is best used alongside the "test"/"include"/"exclude" options to provide conditions for which an override should apply
    */
  var overrides: js.UndefOr[js.Array[TransformOptions]] = js.undefined
  
  /**
    * An object containing the options to be passed down to the babel parser, @babel/parser
    *
    * Default: `{}`
    */
  var parserOpts: js.UndefOr[ParserOptions | Null] = js.undefined
  
  /**
    * List of plugins to load and use
    *
    * Default: `[]`
    */
  var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
  
  /**
    * List of presets (a set of plugins) to load and use
    *
    * Default: `[]`
    */
  var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
  
  /**
    * Retain line numbers. This will lead to wacky code but is handy for scenarios where you can't use source maps. (**NOTE**: This will not retain the columns)
    *
    * Default: `false`
    */
  var retainLines: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specify the "root" folder that defines the location to search for "babel.config.js", and the default folder to allow `.babelrc` files inside of.
    *
    * Default: `"."`
    */
  var root: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This option, combined with the "root" value, defines how Babel chooses its project root.
    * The different modes define different ways that Babel can process the "root" value to get
    * the final project root.
    *
    * @see https://babeljs.io/docs/en/next/options#rootmode
    */
  var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
  
  /**
    * An optional callback that controls whether a comment should be output or not. Called as `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comment` option when used
    *
    * Default: `null`
    */
  var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.undefined
  
  /**
    * Set `sources[0]` on returned source map
    *
    * Default: `(filenameRelative)`
    */
  var sourceFileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a sourceMappingURL directive is added to the bottom of the returned code. If set to `"both"`
    * then a `map` property is returned as well as a source map comment appended. **This does not emit sourcemap files by itself!**
    *
    * Default: `false`
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.undefined
  
  /**
    * The root from which all sources are relative
    *
    * Default: `(moduleRoot)`
    */
  var sourceRoot: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicate the mode the code should be parsed in. Can be one of "script", "module", or "unambiguous". `"unambiguous"` will make Babel attempt to guess, based on the presence of ES6
    * `import` or `export` statements. Files with ES6 `import`s and `export`s are considered `"module"` and are otherwise `"script"`.
    *
    * Default: `("module")`
    */
  var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.undefined
  
  /**
    * Describes the environments you support/target for your project.
    * This can either be a [browserslist-compatible](https://github.com/ai/browserslist) query (with [caveats](https://babeljs.io/docs/en/babel-preset-env#ineffective-browserslist-queries))
    *
    * Default: `{}`
    */
  var targets: js.UndefOr[String | js.Array[String] | Android] = js.undefined
  
  /**
    * If all patterns fail to match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  
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
        /* state */ Any, 
        Unit
      ], 
      js.Function2[
        /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
        /* state */ Any, 
        Unit
      ]
    ]) | Null
  ] = js.undefined
}
object TransformOptions {
  
  inline def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
    inline def setAssumptions(value: StringDictionary[Boolean]): Self = StObject.set(x, "assumptions", value.asInstanceOf[js.Any])
    
    inline def setAssumptionsNull: Self = StObject.set(x, "assumptions", null)
    
    inline def setAssumptionsUndefined: Self = StObject.set(x, "assumptions", js.undefined)
    
    inline def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstNull: Self = StObject.set(x, "ast", null)
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryCommentAfterNull: Self = StObject.set(x, "auxiliaryCommentAfter", null)
    
    inline def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
    
    inline def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryCommentBeforeNull: Self = StObject.set(x, "auxiliaryCommentBefore", null)
    
    inline def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
    
    inline def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
    
    inline def setBabelrcNull: Self = StObject.set(x, "babelrc", null)
    
    inline def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
    
    inline def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "babelrcRoots", js.Any.fromFunction2(value))
    
    inline def setBabelrcRootsNull: Self = StObject.set(x, "babelrcRoots", null)
    
    inline def setBabelrcRootsUndefined: Self = StObject.set(x, "babelrcRoots", js.undefined)
    
    inline def setBabelrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "babelrcRoots", js.Array(value*))
    
    inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
    
    inline def setBrowserslistConfigFile(value: Boolean): Self = StObject.set(x, "browserslistConfigFile", value.asInstanceOf[js.Any])
    
    inline def setBrowserslistConfigFileNull: Self = StObject.set(x, "browserslistConfigFile", null)
    
    inline def setBrowserslistConfigFileUndefined: Self = StObject.set(x, "browserslistConfigFile", js.undefined)
    
    inline def setBrowserslistEnv(value: String): Self = StObject.set(x, "browserslistEnv", value.asInstanceOf[js.Any])
    
    inline def setBrowserslistEnvNull: Self = StObject.set(x, "browserslistEnv", null)
    
    inline def setBrowserslistEnvUndefined: Self = StObject.set(x, "browserslistEnv", js.undefined)
    
    inline def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setCloneInputAst(value: Boolean): Self = StObject.set(x, "cloneInputAst", value.asInstanceOf[js.Any])
    
    inline def setCloneInputAstNull: Self = StObject.set(x, "cloneInputAst", null)
    
    inline def setCloneInputAstUndefined: Self = StObject.set(x, "cloneInputAst", js.undefined)
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactNull: Self = StObject.set(x, "compact", null)
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    inline def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileNull: Self = StObject.set(x, "configFile", null)
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdNull: Self = StObject.set(x, "cwd", null)
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
    
    inline def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
    
    inline def setEnvNull: Self = StObject.set(x, "env", null)
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction2(value))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: MatchPattern*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameNull: Self = StObject.set(x, "filename", null)
    
    inline def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
    
    inline def setFilenameRelativeNull: Self = StObject.set(x, "filenameRelative", null)
    
    inline def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
    
    inline def setGeneratorOptsNull: Self = StObject.set(x, "generatorOpts", null)
    
    inline def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
    
    inline def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
    
    inline def setGetModuleIdNull: Self = StObject.set(x, "getModuleId", null)
    
    inline def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
    
    inline def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
    
    inline def setHighlightCodeNull: Self = StObject.set(x, "highlightCode", null)
    
    inline def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
    
    inline def setIgnore(value: js.Array[MatchPattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: MatchPattern*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setInclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction2(value))
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: MatchPattern*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setInputSourceMap(value: InputSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
    
    inline def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
    
    inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
    
    inline def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
    
    inline def setMinifiedNull: Self = StObject.set(x, "minified", null)
    
    inline def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
    
    inline def setModuleIdsNull: Self = StObject.set(x, "moduleIds", null)
    
    inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
    
    inline def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
    
    inline def setModuleRootNull: Self = StObject.set(x, "moduleRoot", null)
    
    inline def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
    
    inline def setOnly(value: js.Array[MatchPattern]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyNull: Self = StObject.set(x, "only", null)
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setOnlyVarargs(value: MatchPattern*): Self = StObject.set(x, "only", js.Array(value*))
    
    inline def setOverrides(value: js.Array[TransformOptions]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: TransformOptions*): Self = StObject.set(x, "overrides", js.Array(value*))
    
    inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
    
    inline def setParserOptsNull: Self = StObject.set(x, "parserOpts", null)
    
    inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
    
    inline def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPresets(value: js.Array[PluginItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
    
    inline def setPresetsNull: Self = StObject.set(x, "presets", null)
    
    inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
    
    inline def setPresetsVarargs(value: PluginItem*): Self = StObject.set(x, "presets", js.Array(value*))
    
    inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
    
    inline def setRetainLinesNull: Self = StObject.set(x, "retainLines", null)
    
    inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
    
    inline def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
    
    inline def setShouldPrintCommentNull: Self = StObject.set(x, "shouldPrintComment", null)
    
    inline def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
    
    inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
    
    inline def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
    
    inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
    
    inline def setSourceMaps(value: Boolean | `inline` | both): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    inline def setSourceMapsNull: Self = StObject.set(x, "sourceMaps", null)
    
    inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setTargets(value: String | js.Array[String] | Android): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: MatchPattern*): Self = StObject.set(x, "test", js.Array(value*))
    
    inline def setWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[
          /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
          /* state */ Any, 
          Unit
        ]) => js.Function2[
          /* path */ typings.babelTraverse.mod.NodePath[typings.babelTypes.mod.Node], 
          /* state */ Any, 
          Unit
        ]
    ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
    
    inline def setWrapPluginVisitorMethodNull: Self = StObject.set(x, "wrapPluginVisitorMethod", null)
    
    inline def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
  }
}
