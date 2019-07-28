package typings.babelify.babelifyMod

import typings.babelDashCore.babelDashCoreMod.TransformOptions
import typings.babelDashCore.babelDashCoreStrings.`inline`
import typings.babelDashCore.babelDashCoreStrings.auto
import typings.babelDashCore.babelDashCoreStrings.both
import typings.babelDashCore.babelDashCoreStrings.enter
import typings.babelDashCore.babelDashCoreStrings.exit
import typings.babelDashCore.babelDashCoreStrings.module
import typings.babelDashCore.babelDashCoreStrings.script
import typings.babelDashGenerator.babelDashGeneratorMod.GeneratorOptions
import typings.babelDashTraverse.babelDashTraverseMod.Node
import typings.babelDashTraverse.babelDashTraverseMod.NodePath
import typings.babylon.babylonMod.BabylonOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelifyOptions extends TransformOptions {
  /** These are passed to babel.util.canCompile() for each filename
    * default: null
    */
  var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
  /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
    * default: false
    */
  var sourceMapsAbsolute: js.UndefOr[Boolean] = js.undefined
}

object BabelifyOptions {
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
    extensions: String | js.Array[String] = null,
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
    sourceMapsAbsolute: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null,
    sourceType: script | module = null,
    wrapPluginVisitorMethod: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[Node], /* state */ _, Unit] = null
  ): BabelifyOptions = {
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
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
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
    if (!js.isUndefined(sourceMapsAbsolute)) __obj.updateDynamic("sourceMapsAbsolute")(sourceMapsAbsolute)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (wrapPluginVisitorMethod != null) __obj.updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3(wrapPluginVisitorMethod))
    __obj.asInstanceOf[BabelifyOptions]
  }
}

