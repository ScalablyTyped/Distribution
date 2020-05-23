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

trait TransformOptions extends js.Object {
  /** Include the AST in the returned object. Default: `true`. */
  var ast: js.UndefOr[Boolean] = js.undefined
  /** Attach a comment after all non-user injected code. */
  var auxiliaryCommentAfter: js.UndefOr[String] = js.undefined
  /** Attach a comment before all non-user injected code. */
  var auxiliaryCommentBefore: js.UndefOr[String] = js.undefined
  /** Specify whether or not to use `.babelrc` and `.babelignore` files. Default: `true`. */
  var babelrc: js.UndefOr[Boolean] = js.undefined
  /** Enable code generation. Default: `true`. */
  var code: js.UndefOr[Boolean] = js.undefined
  /** write comments to generated output. Default: `true`. */
  var comments: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"`, `compact` is set to
    * `true` on input sizes of >100KB.
    */
  var compact: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * This is an object of keys that represent different environments. For example, you may have:
    * `{ env: { production: { / * specific options * / } } }`
    * which will use those options when the enviroment variable `BABEL_ENV` is set to `"production"`.
    * If `BABEL_ENV` isn't set then `NODE_ENV` will be used, if it's not set then it defaults to `"development"`.
    */
  var env: js.UndefOr[js.Object] = js.undefined
  /** A path to an .babelrc file to extend. */
  var `extends`: js.UndefOr[String] = js.undefined
  /** Filename to use when reading from stdin - this will be used in source-maps, errors etc. Default: "unknown". */
  var filename: js.UndefOr[String] = js.undefined
  /** Filename relative to `sourceRoot`. */
  var filenameRelative: js.UndefOr[String] = js.undefined
  /** An object containing the options to be passed down to the babel code generator, babel-generator. Default: `{}` */
  var generatorOpts: js.UndefOr[GeneratorOptions] = js.undefined
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`.
    * If falsy value is returned then the generated module id is used.
    */
  var getModuleId: js.UndefOr[js.Function1[/* moduleName */ String, String]] = js.undefined
  /** Enable/disable ANSI syntax highlighting of code frames. Default: `true`. */
  var highlightCode: js.UndefOr[Boolean] = js.undefined
  /** list of glob paths to **not** compile. Opposite to the `only` option. */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  /** A source map object that the output source map will be based on. */
  var inputSourceMap: js.UndefOr[js.Object] = js.undefined
  /** Should the output be minified. Default: `false` */
  var minified: js.UndefOr[Boolean] = js.undefined
  /** Specify a custom name for module ids. */
  var moduleId: js.UndefOr[String] = js.undefined
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous.
    * (Not available for `common` modules).
    */
  var moduleIds: js.UndefOr[Boolean] = js.undefined
  /** Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions. */
  var moduleRoot: js.UndefOr[String] = js.undefined
  /**
    * A glob, regex, or mixed array of both, matching paths to only compile. Can also be an array of arrays containing
    * paths to explicitly match. When attempting to compile a non-matching file it's returned verbatim.
    */
  var only: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  /** Babylon parser options. */
  var parserOpts: js.UndefOr[BabylonOptions] = js.undefined
  /** List of plugins to load and use. */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /** List of presets (a set of plugins) to load and use. */
  var presets: js.UndefOr[js.Array[_]] = js.undefined
  /** Resolve a module source ie. import "SOURCE"; to a custom value. */
  var resolveModuleSource: js.UndefOr[js.Function2[/* source */ String, /* filename */ String, String]] = js.undefined
  /** Retain line numbers - will result in really ugly code. Default: `false` */
  var retainLines: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional callback that controls whether a comment should be output or not. Called as
    * `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comments` option when used.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ String, Boolean]] = js.undefined
  /** Set `sources[0]` on returned source map. */
  var sourceFileName: js.UndefOr[String] = js.undefined
  /** Set `file` on returned source map. */
  var sourceMapTarget: js.UndefOr[String] = js.undefined
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a `sourceMappingURL`
    * directive is added to the bottom of the returned code. If set to `"both"` then a map property is returned as well
    * as a source map comment appended.
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both] = js.undefined
  /** The root from which all sources are relative. */
  var sourceRoot: js.UndefOr[String] = js.undefined
  /** Indicate the mode the code should be parsed in. Can be either “script” or “module”. Default: "module" */
  var sourceType: js.UndefOr[script | module] = js.undefined
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
  ] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    ast: js.UndefOr[Boolean] = js.undefined,
    auxiliaryCommentAfter: String = null,
    auxiliaryCommentBefore: String = null,
    babelrc: js.UndefOr[Boolean] = js.undefined,
    code: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | auto = null,
    env: js.Object = null,
    `extends`: String = null,
    filename: String = null,
    filenameRelative: String = null,
    generatorOpts: GeneratorOptions = null,
    getModuleId: /* moduleName */ String => String = null,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String] = null,
    inputSourceMap: js.Object = null,
    minified: js.UndefOr[Boolean] = js.undefined,
    moduleId: String = null,
    moduleIds: js.UndefOr[Boolean] = js.undefined,
    moduleRoot: String = null,
    only: String | RegExp | (js.Array[String | RegExp]) = null,
    parserOpts: BabylonOptions = null,
    plugins: js.Array[_] = null,
    presets: js.Array[_] = null,
    resolveModuleSource: (/* source */ String, /* filename */ String) => String = null,
    retainLines: js.UndefOr[Boolean] = js.undefined,
    shouldPrintComment: /* comment */ String => Boolean = null,
    sourceFileName: String = null,
    sourceMapTarget: String = null,
    sourceMaps: Boolean | `inline` | both = null,
    sourceRoot: String = null,
    sourceType: script | module = null,
    wrapPluginVisitorMethod: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[typings.babelTraverse.mod.Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[typings.babelTraverse.mod.Node], /* state */ _, Unit] = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.get.asInstanceOf[js.Any])
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter.asInstanceOf[js.Any])
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(babelrc)) __obj.updateDynamic("babelrc")(babelrc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.get.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative.asInstanceOf[js.Any])
    if (generatorOpts != null) __obj.updateDynamic("generatorOpts")(generatorOpts.asInstanceOf[js.Any])
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(js.Any.fromFunction1(getModuleId))
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(minified)) __obj.updateDynamic("minified")(minified.get.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleIds)) __obj.updateDynamic("moduleIds")(moduleIds.get.asInstanceOf[js.Any])
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (parserOpts != null) __obj.updateDynamic("parserOpts")(parserOpts.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (resolveModuleSource != null) __obj.updateDynamic("resolveModuleSource")(js.Any.fromFunction2(resolveModuleSource))
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines.get.asInstanceOf[js.Any])
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(js.Any.fromFunction1(shouldPrintComment))
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName.asInstanceOf[js.Any])
    if (sourceMapTarget != null) __obj.updateDynamic("sourceMapTarget")(sourceMapTarget.asInstanceOf[js.Any])
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (wrapPluginVisitorMethod != null) __obj.updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3(wrapPluginVisitorMethod))
    __obj.asInstanceOf[TransformOptions]
  }
}

