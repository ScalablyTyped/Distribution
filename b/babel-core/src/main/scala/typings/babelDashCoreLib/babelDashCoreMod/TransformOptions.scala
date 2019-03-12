package typings
package babelDashCoreLib.babelDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  /** Include the AST in the returned object. Default: `true`. */
  var ast: js.UndefOr[scala.Boolean] = js.undefined
  /** Attach a comment after all non-user injected code. */
  var auxiliaryCommentAfter: js.UndefOr[java.lang.String] = js.undefined
  /** Attach a comment before all non-user injected code. */
  var auxiliaryCommentBefore: js.UndefOr[java.lang.String] = js.undefined
  /** Specify whether or not to use `.babelrc` and `.babelignore` files. Default: `true`. */
  var babelrc: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable code generation. Default: `true`. */
  var code: js.UndefOr[scala.Boolean] = js.undefined
  /** write comments to generated output. Default: `true`. */
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"`, `compact` is set to
    * `true` on input sizes of >100KB.
    */
  var compact: js.UndefOr[scala.Boolean | babelDashCoreLib.babelDashCoreLibStrings.auto] = js.undefined
  /**
    * This is an object of keys that represent different environments. For example, you may have:
    * `{ env: { production: { / * specific options * / } } }`
    * which will use those options when the enviroment variable `BABEL_ENV` is set to `"production"`.
    * If `BABEL_ENV` isn't set then `NODE_ENV` will be used, if it's not set then it defaults to `"development"`.
    */
  var env: js.UndefOr[js.Object] = js.undefined
  /** A path to an .babelrc file to extend. */
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
  /** Filename to use when reading from stdin - this will be used in source-maps, errors etc. Default: "unknown". */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Filename relative to `sourceRoot`. */
  var filenameRelative: js.UndefOr[java.lang.String] = js.undefined
  /** An object containing the options to be passed down to the babel code generator, babel-generator. Default: `{}` */
  var generatorOpts: js.UndefOr[babelDashGeneratorLib.babelDashGeneratorMod.GeneratorOptions] = js.undefined
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`.
    * If falsy value is returned then the generated module id is used.
    */
  var getModuleId: js.UndefOr[js.Function1[/* moduleName */ java.lang.String, java.lang.String]] = js.undefined
  /** Enable/disable ANSI syntax highlighting of code frames. Default: `true`. */
  var highlightCode: js.UndefOr[scala.Boolean] = js.undefined
  /** list of glob paths to **not** compile. Opposite to the `only` option. */
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A source map object that the output source map will be based on. */
  var inputSourceMap: js.UndefOr[js.Object] = js.undefined
  /** Should the output be minified. Default: `false` */
  var minified: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify a custom name for module ids. */
  var moduleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous.
    * (Not available for `common` modules).
    */
  var moduleIds: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions. */
  var moduleRoot: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A glob, regex, or mixed array of both, matching paths to only compile. Can also be an array of arrays containing
    * paths to explicitly match. When attempting to compile a non-matching file it's returned verbatim.
    */
  var only: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  /** Babylon parser options. */
  var parserOpts: js.UndefOr[babylonLib.babylonMod.BabylonOptions] = js.undefined
  /** List of plugins to load and use. */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /** List of presets (a set of plugins) to load and use. */
  var presets: js.UndefOr[js.Array[_]] = js.undefined
  /** Resolve a module source ie. import "SOURCE"; to a custom value. */
  var resolveModuleSource: js.UndefOr[
    js.Function2[/* source */ java.lang.String, /* filename */ java.lang.String, java.lang.String]
  ] = js.undefined
  /** Retain line numbers - will result in really ugly code. Default: `false` */
  var retainLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional callback that controls whether a comment should be output or not. Called as
    * `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comments` option when used.
    */
  var shouldPrintComment: js.UndefOr[js.Function1[/* comment */ java.lang.String, scala.Boolean]] = js.undefined
  /** Set `sources[0]` on returned source map. */
  var sourceFileName: js.UndefOr[java.lang.String] = js.undefined
  /** Set `file` on returned source map. */
  var sourceMapTarget: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a `sourceMappingURL`
    * directive is added to the bottom of the returned code. If set to `"both"` then a map property is returned as well
    * as a source map comment appended.
    */
  var sourceMaps: js.UndefOr[
    scala.Boolean | babelDashCoreLib.babelDashCoreLibStrings.`inline` | babelDashCoreLib.babelDashCoreLibStrings.both
  ] = js.undefined
  /** The root from which all sources are relative. */
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
  /** Indicate the mode the code should be parsed in. Can be either “script” or “module”. Default: "module" */
  var sourceType: js.UndefOr[
    babelDashCoreLib.babelDashCoreLibStrings.script | babelDashCoreLib.babelDashCoreLibStrings.module
  ] = js.undefined
  /**
    * An optional callback that can be used to wrap visitor methods.
    * NOTE: This is useful for things like introspection, and not really needed for implementing anything.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    js.Function3[
      /* pluginAlias */ java.lang.String, 
      /* visitorType */ babelDashCoreLib.babelDashCoreLibStrings.enter | babelDashCoreLib.babelDashCoreLibStrings.exit, 
      /* callback */ js.Function2[
        /* path */ babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node], 
        /* state */ js.Any, 
        scala.Unit
      ], 
      js.Function2[
        /* path */ babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node], 
        /* state */ _, 
        scala.Unit
      ]
    ]
  ] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    ast: js.UndefOr[scala.Boolean] = js.undefined,
    auxiliaryCommentAfter: java.lang.String = null,
    auxiliaryCommentBefore: java.lang.String = null,
    babelrc: js.UndefOr[scala.Boolean] = js.undefined,
    code: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.UndefOr[scala.Boolean] = js.undefined,
    compact: scala.Boolean | babelDashCoreLib.babelDashCoreLibStrings.auto = null,
    env: js.Object = null,
    `extends`: java.lang.String = null,
    filename: java.lang.String = null,
    filenameRelative: java.lang.String = null,
    generatorOpts: babelDashGeneratorLib.babelDashGeneratorMod.GeneratorOptions = null,
    getModuleId: /* moduleName */ java.lang.String => java.lang.String = null,
    highlightCode: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[java.lang.String] = null,
    inputSourceMap: js.Object = null,
    minified: js.UndefOr[scala.Boolean] = js.undefined,
    moduleId: java.lang.String = null,
    moduleIds: js.UndefOr[scala.Boolean] = js.undefined,
    moduleRoot: java.lang.String = null,
    only: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    parserOpts: babylonLib.babylonMod.BabylonOptions = null,
    plugins: js.Array[_] = null,
    presets: js.Array[_] = null,
    resolveModuleSource: (/* source */ java.lang.String, /* filename */ java.lang.String) => java.lang.String = null,
    retainLines: js.UndefOr[scala.Boolean] = js.undefined,
    shouldPrintComment: /* comment */ java.lang.String => scala.Boolean = null,
    sourceFileName: java.lang.String = null,
    sourceMapTarget: java.lang.String = null,
    sourceMaps: scala.Boolean | babelDashCoreLib.babelDashCoreLibStrings.`inline` | babelDashCoreLib.babelDashCoreLibStrings.both = null,
    sourceRoot: java.lang.String = null,
    sourceType: babelDashCoreLib.babelDashCoreLibStrings.script | babelDashCoreLib.babelDashCoreLibStrings.module = null,
    wrapPluginVisitorMethod: (/* pluginAlias */ java.lang.String, /* visitorType */ babelDashCoreLib.babelDashCoreLibStrings.enter | babelDashCoreLib.babelDashCoreLibStrings.exit, /* callback */ js.Function2[
      /* path */ babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node], 
      /* state */ js.Any, 
      scala.Unit
    ]) => js.Function2[
      /* path */ babelDashTraverseLib.babelDashTraverseMod.NodePath[babelDashTraverseLib.babelDashTraverseMod.Node], 
      /* state */ _, 
      scala.Unit
    ] = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast)
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter)
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore)
    if (!js.isUndefined(babelrc)) __obj.updateDynamic("babelrc")(babelrc)
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative)
    if (generatorOpts != null) __obj.updateDynamic("generatorOpts")(generatorOpts)
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(js.Any.fromFunction1(getModuleId))
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap)
    if (!js.isUndefined(minified)) __obj.updateDynamic("minified")(minified)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId)
    if (!js.isUndefined(moduleIds)) __obj.updateDynamic("moduleIds")(moduleIds)
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot)
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (parserOpts != null) __obj.updateDynamic("parserOpts")(parserOpts)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (presets != null) __obj.updateDynamic("presets")(presets)
    if (resolveModuleSource != null) __obj.updateDynamic("resolveModuleSource")(js.Any.fromFunction2(resolveModuleSource))
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines)
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(js.Any.fromFunction1(shouldPrintComment))
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName)
    if (sourceMapTarget != null) __obj.updateDynamic("sourceMapTarget")(sourceMapTarget)
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (wrapPluginVisitorMethod != null) __obj.updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3(wrapPluginVisitorMethod))
    __obj.asInstanceOf[TransformOptions]
  }
}

