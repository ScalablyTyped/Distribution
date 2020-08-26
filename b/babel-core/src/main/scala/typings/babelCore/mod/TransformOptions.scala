package typings.babelCore.mod

import typings.babelCore.babelCoreStrings.`inline`
import typings.babelCore.babelCoreStrings.auto
import typings.babelCore.babelCoreStrings.both
import typings.babelCore.babelCoreStrings.enter
import typings.babelCore.babelCoreStrings.exit
import typings.babelCore.babelCoreStrings.module
import typings.babelCore.babelCoreStrings.script
import typings.babelGenerator.mod.GeneratorOptions
import typings.babelTraverse.mod.NodePath
import typings.babylon.mod.BabylonOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions extends js.Object {
  /** Include the AST in the returned object. Default: `true`. */
  var ast: js.UndefOr[Boolean] = js.native
  /** Attach a comment after all non-user injected code. */
  var auxiliaryCommentAfter: js.UndefOr[String] = js.native
  /** Attach a comment before all non-user injected code. */
  var auxiliaryCommentBefore: js.UndefOr[String] = js.native
  /** Specify whether or not to use `.babelrc` and `.babelignore` files. Default: `true`. */
  var babelrc: js.UndefOr[Boolean] = js.native
  /** Enable code generation. Default: `true`. */
  var code: js.UndefOr[Boolean] = js.native
  /** write comments to generated output. Default: `true`. */
  var comments: js.UndefOr[Boolean] = js.native
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"`, `compact` is set to
    * `true` on input sizes of >100KB.
    */
  var compact: js.UndefOr[Boolean | auto] = js.native
  /**
    * This is an object of keys that represent different environments. For example, you may have:
    * `{ env: { production: { / * specific options * / } } }`
    * which will use those options when the enviroment variable `BABEL_ENV` is set to `"production"`.
    * If `BABEL_ENV` isn't set then `NODE_ENV` will be used, if it's not set then it defaults to `"development"`.
    */
  var env: js.UndefOr[js.Object] = js.native
  /** A path to an .babelrc file to extend. */
  var `extends`: js.UndefOr[String] = js.native
  /** Filename to use when reading from stdin - this will be used in source-maps, errors etc. Default: "unknown". */
  var filename: js.UndefOr[String] = js.native
  /** Filename relative to `sourceRoot`. */
  var filenameRelative: js.UndefOr[String] = js.native
  /** An object containing the options to be passed down to the babel code generator, babel-generator. Default: `{}` */
  var generatorOpts: js.UndefOr[GeneratorOptions] = js.native
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`.
    * If falsy value is returned then the generated module id is used.
    */
  var getModuleId: js.UndefOr[js.Function1[/* moduleName */ String, String]] = js.native
  /** Enable/disable ANSI syntax highlighting of code frames. Default: `true`. */
  var highlightCode: js.UndefOr[Boolean] = js.native
  /** list of glob paths to **not** compile. Opposite to the `only` option. */
  var ignore: js.UndefOr[js.Array[String]] = js.native
  /** A source map object that the output source map will be based on. */
  var inputSourceMap: js.UndefOr[js.Object] = js.native
  /** Should the output be minified. Default: `false` */
  var minified: js.UndefOr[Boolean] = js.native
  /** Specify a custom name for module ids. */
  var moduleId: js.UndefOr[String] = js.native
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous.
    * (Not available for `common` modules).
    */
  var moduleIds: js.UndefOr[Boolean] = js.native
  /** Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions. */
  var moduleRoot: js.UndefOr[String] = js.native
  /**
    * A glob, regex, or mixed array of both, matching paths to only compile. Can also be an array of arrays containing
    * paths to explicitly match. When attempting to compile a non-matching file it's returned verbatim.
    */
  var only: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  /** Babylon parser options. */
  var parserOpts: js.UndefOr[BabylonOptions] = js.native
  /** List of plugins to load and use. */
  var plugins: js.UndefOr[js.Array[_]] = js.native
  /** List of presets (a set of plugins) to load and use. */
  var presets: js.UndefOr[js.Array[_]] = js.native
  /** Resolve a module source ie. import "SOURCE"; to a custom value. */
  var resolveModuleSource: js.UndefOr[js.Function2[/* source */ String, /* filename */ String, String]] = js.native
  /** Retain line numbers - will result in really ugly code. Default: `false` */
  var retainLines: js.UndefOr[Boolean] = js.native
  /**
    * An optional callback that controls whether a comment should be output or not. Called as
    * `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comments` option when used.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.native
  /** Set `sources[0]` on returned source map. */
  var sourceFileName: js.UndefOr[String] = js.native
  /** Set `file` on returned source map. */
  var sourceMapTarget: js.UndefOr[String] = js.native
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a `sourceMappingURL`
    * directive is added to the bottom of the returned code. If set to `"both"` then a map property is returned as well
    * as a source map comment appended.
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both] = js.native
  /** The root from which all sources are relative. */
  var sourceRoot: js.UndefOr[String] = js.native
  /** Indicate the mode the code should be parsed in. Can be either “script” or “module”. Default: "module" */
  var sourceType: js.UndefOr[script | module] = js.native
  /**
    * An optional callback that can be used to wrap visitor methods.
    * NOTE: This is useful for things like introspection, and not really needed for implementing anything.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[/* path */ NodePath[typings.babelTraverse.mod.Node], /* state */ js.Any, Unit], 
      js.Function2[/* path */ NodePath[typings.babelTraverse.mod.Node], /* state */ _, Unit]
    ]
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
    def setAuxiliaryCommentAfter(value: String): Self = this.set("auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentAfter: Self = this.set("auxiliaryCommentAfter", js.undefined)
    @scala.inline
    def setAuxiliaryCommentBefore(value: String): Self = this.set("auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentBefore: Self = this.set("auxiliaryCommentBefore", js.undefined)
    @scala.inline
    def setBabelrc(value: Boolean): Self = this.set("babelrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBabelrc: Self = this.set("babelrc", js.undefined)
    @scala.inline
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCompact(value: Boolean | auto): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setEnv(value: js.Object): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilenameRelative(value: String): Self = this.set("filenameRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameRelative: Self = this.set("filenameRelative", js.undefined)
    @scala.inline
    def setGeneratorOpts(value: GeneratorOptions): Self = this.set("generatorOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratorOpts: Self = this.set("generatorOpts", js.undefined)
    @scala.inline
    def setGetModuleId(value: /* moduleName */ String => String): Self = this.set("getModuleId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetModuleId: Self = this.set("getModuleId", js.undefined)
    @scala.inline
    def setHighlightCode(value: Boolean): Self = this.set("highlightCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCode: Self = this.set("highlightCode", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setInputSourceMap(value: js.Object): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
    @scala.inline
    def setMinified(value: Boolean): Self = this.set("minified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinified: Self = this.set("minified", js.undefined)
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    @scala.inline
    def setModuleIds(value: Boolean): Self = this.set("moduleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleIds: Self = this.set("moduleIds", js.undefined)
    @scala.inline
    def setModuleRoot(value: String): Self = this.set("moduleRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleRoot: Self = this.set("moduleRoot", js.undefined)
    @scala.inline
    def setOnlyVarargs(value: (String | RegExp)*): Self = this.set("only", js.Array(value :_*))
    @scala.inline
    def setOnly(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setParserOpts(value: BabylonOptions): Self = this.set("parserOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserOpts: Self = this.set("parserOpts", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPresetsVarargs(value: js.Any*): Self = this.set("presets", js.Array(value :_*))
    @scala.inline
    def setPresets(value: js.Array[_]): Self = this.set("presets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
    @scala.inline
    def setResolveModuleSource(value: (/* source */ String, /* filename */ String) => String): Self = this.set("resolveModuleSource", js.Any.fromFunction2(value))
    @scala.inline
    def deleteResolveModuleSource: Self = this.set("resolveModuleSource", js.undefined)
    @scala.inline
    def setRetainLines(value: Boolean): Self = this.set("retainLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainLines: Self = this.set("retainLines", js.undefined)
    @scala.inline
    def setShouldPrintComment(value: /* comment */ String => Boolean): Self = this.set("shouldPrintComment", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldPrintComment: Self = this.set("shouldPrintComment", js.undefined)
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    @scala.inline
    def setSourceMapTarget(value: String): Self = this.set("sourceMapTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapTarget: Self = this.set("sourceMapTarget", js.undefined)
    @scala.inline
    def setSourceMaps(value: Boolean | `inline` | both): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[typings.babelTraverse.mod.Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[typings.babelTraverse.mod.Node], /* state */ _, Unit]
    ): Self = this.set("wrapPluginVisitorMethod", js.Any.fromFunction3(value))
    @scala.inline
    def deleteWrapPluginVisitorMethod: Self = this.set("wrapPluginVisitorMethod", js.undefined)
  }
  
}

