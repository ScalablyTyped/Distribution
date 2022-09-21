package typings.babelCore.mod

import typings.babelCore.anon.FnCall
import typings.babelCore.anon.ReadonlyPartialConfig
import typings.babelCore.babelCoreBooleans.`false`
import typings.babelCore.babelCoreStrings.Dotes
import typings.babelCore.babelCoreStrings.Dotes6
import typings.babelCore.babelCoreStrings.Dotjs
import typings.babelCore.babelCoreStrings.Dotjsx
import typings.babelCore.babelCoreStrings.Dotmjs
import typings.babelCore.mod.^
import typings.babelTemplate.mod.DefaultTemplateBuilder
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_EXTENSIONS: js.Tuple5[Dotjs, Dotjsx, Dotes6, Dotes, Dotmjs] = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_EXTENSIONS").asInstanceOf[js.Tuple5[Dotjs, Dotjsx, Dotes6, Dotes, Dotmjs]]

inline def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions]): ConfigItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[ConfigItem]
inline def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions], options: CreateConfigItemOptions): ConfigItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfigItem]
inline def createConfigItem(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]]): ConfigItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[ConfigItem]
inline def createConfigItem(
  value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]],
  options: CreateConfigItemOptions
): ConfigItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfigItem]
inline def createConfigItem(value: PluginTarget): ConfigItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any]).asInstanceOf[ConfigItem]
inline def createConfigItem(value: PluginTarget, options: CreateConfigItemOptions): ConfigItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfigItem")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConfigItem]

inline def loadOptions(): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("loadOptions")().asInstanceOf[js.Object | Null]
inline def loadOptions(options: TransformOptions): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("loadOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]

inline def loadPartialConfig(): ReadonlyPartialConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfig")().asInstanceOf[ReadonlyPartialConfig | Null]
inline def loadPartialConfig(options: TransformOptions): ReadonlyPartialConfig | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfig")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlyPartialConfig | Null]

inline def loadPartialConfigAsync(): js.Promise[ReadonlyPartialConfig | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfigAsync")().asInstanceOf[js.Promise[ReadonlyPartialConfig | Null]]
inline def loadPartialConfigAsync(options: TransformOptions): js.Promise[ReadonlyPartialConfig | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPartialConfigAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadonlyPartialConfig | Null]]

inline def parse(code: String): ParseResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[ParseResult | Null]
inline def parse(code: String, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse(code: String, options: Unit, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse(code: String, options: TransformOptions): ParseResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult | Null]
inline def parse(code: String, options: TransformOptions, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def parseAsync(code: String): js.Promise[ParseResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParseResult | Null]]
inline def parseAsync(code: String, options: TransformOptions): js.Promise[ParseResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParseResult | Null]]

inline def parseSync(code: String): ParseResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any]).asInstanceOf[ParseResult | Null]
inline def parseSync(code: String, options: TransformOptions): ParseResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult | Null]

inline def resolvePlugin(name: String, dirname: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePlugin")(name.asInstanceOf[js.Any], dirname.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def resolvePreset(name: String, dirname: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePreset")(name.asInstanceOf[js.Any], dirname.asInstanceOf[js.Any])).asInstanceOf[String | Null]

inline def template: DefaultTemplateBuilder = ^.asInstanceOf[js.Dynamic].selectDynamic("template").asInstanceOf[DefaultTemplateBuilder]

inline def transform(code: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
inline def transform(code: String, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transform(code: String, opts: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transform(code: String, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
inline def transform(code: String, opts: TransformOptions, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def transformAsync(code: String): js.Promise[BabelFileResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BabelFileResult | Null]]
inline def transformAsync(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformAsync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BabelFileResult | Null]]

inline def transformFile(filename: String, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFile(filename: String, opts: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFile(filename: String, opts: TransformOptions, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFile")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def transformFileAsync(filename: String): js.Promise[BabelFileResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFileAsync")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BabelFileResult | Null]]
inline def transformFileAsync(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFileAsync")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BabelFileResult | Null]]

inline def transformFileSync(filename: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
inline def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFileSync")(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]

inline def transformFromAst(ast: Node, code: String, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFromAst(ast: Node, code: String, opts: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFromAst(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFromAst(ast: Node, code: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFromAst(ast: Node, code: Unit, opts: Unit, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def transformFromAst(ast: Node, code: Unit, opts: TransformOptions, callback: FileResultCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAst")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def transformFromAstAsync(ast: Node): js.Promise[BabelFileResult | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BabelFileResult | Null]]
inline def transformFromAstAsync(ast: Node, code: String): js.Promise[BabelFileResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BabelFileResult | Null]]
inline def transformFromAstAsync(ast: Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BabelFileResult | Null]]
inline def transformFromAstAsync(ast: Node, code: Unit, opts: TransformOptions): js.Promise[BabelFileResult | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstAsync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BabelFileResult | Null]]

inline def transformFromAstSync(ast: Node): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
inline def transformFromAstSync(ast: Node, code: String): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
inline def transformFromAstSync(ast: Node, code: String, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
inline def transformFromAstSync(ast: Node, code: Unit, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]

inline def transformSync(code: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
inline def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ConfigFunction = js.Function1[/* api */ ConfigAPI, TransformOptions]

type FileParseCallback = js.Function2[/* err */ js.Error | Null, /* result */ ParseResult | Null, Any]

type FileResultCallback = js.Function2[/* err */ js.Error | Null, /* result */ BabelFileResult | Null, Any]

type MatchPattern = String | js.RegExp | (js.Function2[/* filename */ js.UndefOr[String], /* context */ MatchPatternContext, Boolean])

type Node = typings.babelTypes.mod.Node

type ParseResult = ReturnType[FnCall]

type PluginItem = ConfigItem | PluginObj[Any] | PluginTarget | (js.Tuple2[PluginTarget, PluginOptions]) | (js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]])

type PluginOptions = js.UndefOr[js.Object | `false`]

type PluginTarget = String | js.Object | (js.Function1[/* repeated */ Any, Any])

type SimpleCacheCallback[T /* <: SimpleCacheKey */] = js.Function0[T]

type SimpleCacheKey = js.UndefOr[String | Boolean | Double | Null]
