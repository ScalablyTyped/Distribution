package typings
package babelifyLib.babelifyMod.BabelifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelifyOptions
  extends babelDashCoreLib.babelDashCoreMod.TransformOptions {
  /** These are passed to babel.util.canCompile() for each filename
    * default: null
    */
  var extensions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
    * default: false
    */
  var sourceMapsAbsolute: js.UndefOr[scala.Boolean] = js.undefined
}

object BabelifyOptions {
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
    extensions: java.lang.String | js.Array[java.lang.String] = null,
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
    sourceMapsAbsolute: js.UndefOr[scala.Boolean] = js.undefined,
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

