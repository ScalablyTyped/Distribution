package typings
package atBabelCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", JSImport.Namespace)
@js.native
object coreModMembers extends js.Object {
  val template: atBabelTemplateLib.DefaultTemplateBuilder = js.native
  val version: java.lang.String = js.native
  def createConfigItem(value: PluginTarget): ConfigItem = js.native
  def createConfigItem(value: PluginTarget, options: CreateConfigItemOptions): ConfigItem = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions]): ConfigItem = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions], options: CreateConfigItemOptions): ConfigItem = js.native
  def createConfigItem(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[java.lang.String]]): ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[java.lang.String]],
    options: CreateConfigItemOptions
  ): ConfigItem = js.native
  def loadOptions(): js.Object | scala.Null = js.native
  def loadOptions(options: TransformOptions): js.Object | scala.Null = js.native
  def loadPartialConfig(): stdLib.Readonly[PartialConfig] | scala.Null = js.native
  def loadPartialConfig(options: TransformOptions): stdLib.Readonly[PartialConfig] | scala.Null = js.native
  def parse(code: java.lang.String): ParseResult | scala.Null = js.native
  def parse(code: java.lang.String, callback: FileParseCallback): scala.Unit = js.native
  def parse(code: java.lang.String, options: TransformOptions): ParseResult | scala.Null = js.native
  def parse(code: java.lang.String, options: TransformOptions, callback: FileParseCallback): scala.Unit = js.native
  def parse(code: java.lang.String, options: js.UndefOr[scala.Nothing], callback: FileParseCallback): scala.Unit = js.native
  def parseAsync(code: java.lang.String): stdLib.Promise[ParseResult | scala.Null] = js.native
  def parseAsync(code: java.lang.String, options: TransformOptions): stdLib.Promise[ParseResult | scala.Null] = js.native
  def parseSync(code: java.lang.String): ParseResult | scala.Null = js.native
  def parseSync(code: java.lang.String, options: TransformOptions): ParseResult | scala.Null = js.native
  def transform(code: java.lang.String): BabelFileResult | scala.Null = js.native
  def transform(code: java.lang.String, callback: FileResultCallback): scala.Unit = js.native
  def transform(code: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def transform(code: java.lang.String, opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transform(code: java.lang.String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformAsync(code: java.lang.String): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  def transformAsync(code: java.lang.String, opts: TransformOptions): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  def transformFile(filename: java.lang.String, callback: FileResultCallback): scala.Unit = js.native
  def transformFile(filename: java.lang.String, opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformFile(filename: java.lang.String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformFileAsync(filename: java.lang.String): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  def transformFileAsync(filename: java.lang.String, opts: TransformOptions): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  def transformFileSync(filename: java.lang.String): BabelFileResult | scala.Null = js.native
  def transformFileSync(filename: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def transformFromAst(ast: Node, code: java.lang.String, callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: java.lang.String, opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: java.lang.String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(
    ast: Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): scala.Unit = js.native
  def transformFromAstSync(ast: Node): BabelFileResult | scala.Null = js.native
  def transformFromAstSync(ast: Node, code: java.lang.String): BabelFileResult | scala.Null = js.native
  def transformFromAstSync(ast: Node, code: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  @JSName("transformFromAstSync")
  def transformFromAstSync_Promise(ast: Node): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  @JSName("transformFromAstSync")
  def transformFromAstSync_Promise(ast: Node, code: java.lang.String): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  @JSName("transformFromAstSync")
  def transformFromAstSync_Promise(ast: Node, code: java.lang.String, opts: TransformOptions): stdLib.Promise[BabelFileResult | scala.Null] = js.native
  def transformSync(code: java.lang.String): BabelFileResult | scala.Null = js.native
  def transformSync(code: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def traverse(
    parent: atBabelTraverseLib.traverseMod.Node,
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: atBabelTraverseLib.traverseMod.Node,
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node],
    scope: atBabelTraverseLib.traverseMod.Scope
  ): scala.Unit = js.native
  def traverse(
    parent: atBabelTraverseLib.traverseMod.Node,
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: js.Any
  ): scala.Unit = js.native
  def traverse(
    parent: atBabelTraverseLib.traverseMod.Node,
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: js.Any,
    parentPath: atBabelTraverseLib.traverseMod.NodePath[atBabelTraverseLib.traverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.traverseMod.Node],
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.traverseMod.Node],
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node],
    scope: atBabelTraverseLib.traverseMod.Scope
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.traverseMod.Node],
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: js.Any
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.traverseMod.Node],
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[atBabelTraverseLib.traverseMod.Node],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: js.Any,
    parentPath: atBabelTraverseLib.traverseMod.NodePath[atBabelTraverseLib.traverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: atBabelTraverseLib.traverseMod.Node,
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: atBabelTraverseLib.traverseMod.Node,
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: S,
    parentPath: atBabelTraverseLib.traverseMod.NodePath[atBabelTraverseLib.traverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[atBabelTraverseLib.traverseMod.Node],
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[atBabelTraverseLib.traverseMod.Node],
    opts: atBabelTraverseLib.traverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.traverseMod.Scope,
    state: S,
    parentPath: atBabelTraverseLib.traverseMod.NodePath[atBabelTraverseLib.traverseMod.Node]
  ): scala.Unit = js.native
}

