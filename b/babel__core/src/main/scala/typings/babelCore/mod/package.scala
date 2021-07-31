package typings.babelCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def DEFAULT_EXTENSIONS: js.Tuple5[
typings.babelCore.babelCoreStrings.Dotjs, 
typings.babelCore.babelCoreStrings.Dotjsx, 
typings.babelCore.babelCoreStrings.Dotes6, 
typings.babelCore.babelCoreStrings.Dotes, 
typings.babelCore.babelCoreStrings.Dotmjs] = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_EXTENSIONS").asInstanceOf[js.Tuple5[
typings.babelCore.babelCoreStrings.Dotjs, 
typings.babelCore.babelCoreStrings.Dotjsx, 
typings.babelCore.babelCoreStrings.Dotes6, 
typings.babelCore.babelCoreStrings.Dotes, 
typings.babelCore.babelCoreStrings.Dotmjs]]

@scala.inline
def createConfigItem(value: js.Tuple2[typings.babelCore.mod.PluginTarget, typings.babelCore.mod.PluginOptions]): typings.babelCore.mod.ConfigItem = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.ConfigItem]
@scala.inline
def createConfigItem(
  value: js.Tuple2[typings.babelCore.mod.PluginTarget, typings.babelCore.mod.PluginOptions],
  options: typings.babelCore.mod.CreateConfigItemOptions
): typings.babelCore.mod.ConfigItem = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.ConfigItem]
@scala.inline
def createConfigItem(
  value: js.Tuple3[
  typings.babelCore.mod.PluginTarget, 
  typings.babelCore.mod.PluginOptions, 
  js.UndefOr[java.lang.String]
]
): typings.babelCore.mod.ConfigItem = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.ConfigItem]
@scala.inline
def createConfigItem(
  value: js.Tuple3[
  typings.babelCore.mod.PluginTarget, 
  typings.babelCore.mod.PluginOptions, 
  js.UndefOr[java.lang.String]
],
  options: typings.babelCore.mod.CreateConfigItemOptions
): typings.babelCore.mod.ConfigItem = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.ConfigItem]
@scala.inline
def createConfigItem(value: typings.babelCore.mod.PluginTarget): typings.babelCore.mod.ConfigItem = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.ConfigItem]
@scala.inline
def createConfigItem(value: typings.babelCore.mod.PluginTarget, options: typings.babelCore.mod.CreateConfigItemOptions): typings.babelCore.mod.ConfigItem = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.ConfigItem]

@scala.inline
def loadOptions(): js.Object | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadOptions")().asInstanceOf[js.Object | scala.Null]
@scala.inline
def loadOptions(options: typings.babelCore.mod.TransformOptions): js.Object | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object | scala.Null]

@scala.inline
def loadPartialConfig(): typings.babelCore.anon.ReadonlyPartialConfig | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfig")().asInstanceOf[typings.babelCore.anon.ReadonlyPartialConfig | scala.Null]
@scala.inline
def loadPartialConfig(options: typings.babelCore.mod.TransformOptions): typings.babelCore.anon.ReadonlyPartialConfig | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfig")(options.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.anon.ReadonlyPartialConfig | scala.Null]

@scala.inline
def parse(code: java.lang.String): typings.babelCore.mod.ParseResult | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.ParseResult | scala.Null]
@scala.inline
def parse(code: java.lang.String, callback: typings.babelCore.mod.FileParseCallback): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def parse(code: java.lang.String, options: scala.Unit, callback: typings.babelCore.mod.FileParseCallback): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def parse(code: java.lang.String, options: typings.babelCore.mod.TransformOptions): typings.babelCore.mod.ParseResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.ParseResult | scala.Null]
@scala.inline
def parse(
  code: java.lang.String,
  options: typings.babelCore.mod.TransformOptions,
  callback: typings.babelCore.mod.FileParseCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def parseAsync(code: java.lang.String): js.Promise[typings.babelCore.mod.ParseResult | scala.Null] = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babelCore.mod.ParseResult | scala.Null]]
@scala.inline
def parseAsync(code: java.lang.String, options: typings.babelCore.mod.TransformOptions): js.Promise[typings.babelCore.mod.ParseResult | scala.Null] = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babelCore.mod.ParseResult | scala.Null]]

@scala.inline
def parseSync(code: java.lang.String): typings.babelCore.mod.ParseResult | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.ParseResult | scala.Null]
@scala.inline
def parseSync(code: java.lang.String, options: typings.babelCore.mod.TransformOptions): typings.babelCore.mod.ParseResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.ParseResult | scala.Null]

@scala.inline
def resolvePlugin(name: java.lang.String, dirname: java.lang.String): java.lang.String | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolvePlugin")(name.asInstanceOf[js.Any], dirname.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]

@scala.inline
def resolvePreset(name: java.lang.String, dirname: java.lang.String): java.lang.String | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolvePreset")(name.asInstanceOf[js.Any], dirname.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]

@scala.inline
def template: typings.babelTemplate.mod.DefaultTemplateBuilder = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("template").asInstanceOf[typings.babelTemplate.mod.DefaultTemplateBuilder]

@scala.inline
def transform(code: java.lang.String): typings.babelCore.mod.BabelFileResult | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transform(code: java.lang.String, callback: typings.babelCore.mod.FileResultCallback): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transform(code: java.lang.String, opts: scala.Unit, callback: typings.babelCore.mod.FileResultCallback): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transform(code: java.lang.String, opts: typings.babelCore.mod.TransformOptions): typings.babelCore.mod.BabelFileResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transform(
  code: java.lang.String,
  opts: typings.babelCore.mod.TransformOptions,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def transformAsync(code: java.lang.String): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]
@scala.inline
def transformAsync(code: java.lang.String, opts: typings.babelCore.mod.TransformOptions): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]

@scala.inline
def transformFile(filename: java.lang.String, callback: typings.babelCore.mod.FileResultCallback): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFile(filename: java.lang.String, opts: scala.Unit, callback: typings.babelCore.mod.FileResultCallback): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFile(
  filename: java.lang.String,
  opts: typings.babelCore.mod.TransformOptions,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def transformFileAsync(filename: java.lang.String): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileAsync")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]
@scala.inline
def transformFileAsync(filename: java.lang.String, opts: typings.babelCore.mod.TransformOptions): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileAsync")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]

@scala.inline
def transformFileSync(filename: java.lang.String): typings.babelCore.mod.BabelFileResult | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transformFileSync(filename: java.lang.String, opts: typings.babelCore.mod.TransformOptions): typings.babelCore.mod.BabelFileResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]

@scala.inline
def transformFromAst(
  ast: typings.babelCore.mod.Node,
  code: java.lang.String,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFromAst(
  ast: typings.babelCore.mod.Node,
  code: java.lang.String,
  opts: scala.Unit,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFromAst(
  ast: typings.babelCore.mod.Node,
  code: java.lang.String,
  opts: typings.babelCore.mod.TransformOptions,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFromAst(
  ast: typings.babelCore.mod.Node,
  code: scala.Unit,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFromAst(
  ast: typings.babelCore.mod.Node,
  code: scala.Unit,
  opts: scala.Unit,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def transformFromAst(
  ast: typings.babelCore.mod.Node,
  code: scala.Unit,
  opts: typings.babelCore.mod.TransformOptions,
  callback: typings.babelCore.mod.FileResultCallback
): scala.Unit = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def transformFromAstAsync(ast: typings.babelCore.mod.Node): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]
@scala.inline
def transformFromAstAsync(ast: typings.babelCore.mod.Node, code: java.lang.String): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]
@scala.inline
def transformFromAstAsync(
  ast: typings.babelCore.mod.Node,
  code: java.lang.String,
  opts: typings.babelCore.mod.TransformOptions
): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]
@scala.inline
def transformFromAstAsync(ast: typings.babelCore.mod.Node, code: scala.Unit, opts: typings.babelCore.mod.TransformOptions): js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null] = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babelCore.mod.BabelFileResult | scala.Null]]

@scala.inline
def transformFromAstSync(ast: typings.babelCore.mod.Node): typings.babelCore.mod.BabelFileResult | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transformFromAstSync(ast: typings.babelCore.mod.Node, code: java.lang.String): typings.babelCore.mod.BabelFileResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transformFromAstSync(
  ast: typings.babelCore.mod.Node,
  code: java.lang.String,
  opts: typings.babelCore.mod.TransformOptions
): typings.babelCore.mod.BabelFileResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transformFromAstSync(ast: typings.babelCore.mod.Node, code: scala.Unit, opts: typings.babelCore.mod.TransformOptions): typings.babelCore.mod.BabelFileResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]

@scala.inline
def transformSync(code: java.lang.String): typings.babelCore.mod.BabelFileResult | scala.Null = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]
@scala.inline
def transformSync(code: java.lang.String, opts: typings.babelCore.mod.TransformOptions): typings.babelCore.mod.BabelFileResult | scala.Null = (typings.babelCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.babelCore.mod.BabelFileResult | scala.Null]

@scala.inline
def version: java.lang.String = typings.babelCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type ConfigFunction = js.Function1[/* api */ typings.babelCore.mod.ConfigAPI, typings.babelCore.mod.TransformOptions]

type FileParseCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* result */ typings.babelCore.mod.ParseResult | scala.Null, 
js.Any]

type FileResultCallback = js.Function2[
/* err */ typings.std.Error | scala.Null, 
/* result */ typings.babelCore.mod.BabelFileResult | scala.Null, 
js.Any]

type MatchPattern = java.lang.String | typings.std.RegExp | (js.Function2[
/* filename */ js.UndefOr[java.lang.String], 
/* context */ typings.babelCore.mod.MatchPatternContext, 
scala.Boolean])

type Node = typings.babelTypes.mod.Node

type ParseResult = typings.babelTypes.mod.File_ | typings.babelTypes.mod.Program_

type PluginItem = typings.babelCore.mod.ConfigItem | typings.babelCore.mod.PluginObj[js.Any] | typings.babelCore.mod.PluginTarget | (js.Tuple2[typings.babelCore.mod.PluginTarget, typings.babelCore.mod.PluginOptions]) | (js.Tuple3[
typings.babelCore.mod.PluginTarget, 
typings.babelCore.mod.PluginOptions, 
js.UndefOr[java.lang.String]])

type PluginOptions = js.UndefOr[js.Object | typings.babelCore.babelCoreBooleans.`false`]

type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])

type SimpleCacheCallback[T /* <: typings.babelCore.mod.SimpleCacheKey */] = js.Function0[T]

type SimpleCacheKey = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
