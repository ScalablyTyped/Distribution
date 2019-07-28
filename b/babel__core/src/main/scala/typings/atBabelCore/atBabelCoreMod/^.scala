package typings.atBabelCore.atBabelCoreMod

import typings.atBabelCore.atBabelCoreStrings.DOTes
import typings.atBabelCore.atBabelCoreStrings.DOTes6
import typings.atBabelCore.atBabelCoreStrings.DOTjs
import typings.atBabelCore.atBabelCoreStrings.DOTjsx
import typings.atBabelCore.atBabelCoreStrings.DOTmjs
import typings.atBabelTemplate.atBabelTemplateMod.DefaultTemplateBuilder
import typings.atBabelTraverse.atBabelTraverseMod.Scope
import typings.atBabelTraverse.atBabelTraverseMod.TraverseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_EXTENSIONS: js.Tuple5[DOTjs, DOTjsx, DOTes6, DOTes, DOTmjs] = js.native
  val template: DefaultTemplateBuilder = js.native
  val version: String = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions]): ConfigItem = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions], options: CreateConfigItemOptions): ConfigItem = js.native
  def createConfigItem(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]]): ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]],
    options: CreateConfigItemOptions
  ): ConfigItem = js.native
  def createConfigItem(value: PluginTarget): ConfigItem = js.native
  def createConfigItem(value: PluginTarget, options: CreateConfigItemOptions): ConfigItem = js.native
  def loadOptions(): js.Object | Null = js.native
  def loadOptions(options: TransformOptions): js.Object | Null = js.native
  def loadPartialConfig(): PartialConfig | Null = js.native
  def loadPartialConfig(options: TransformOptions): PartialConfig | Null = js.native
  def parse(code: String): ParseResult | Null = js.native
  def parse(code: String, callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: js.UndefOr[scala.Nothing], callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: TransformOptions): ParseResult | Null = js.native
  def parse(code: String, options: TransformOptions, callback: FileParseCallback): Unit = js.native
  def parseAsync(code: String): js.Promise[ParseResult | Null] = js.native
  def parseAsync(code: String, options: TransformOptions): js.Promise[ParseResult | Null] = js.native
  def parseSync(code: String): ParseResult | Null = js.native
  def parseSync(code: String, options: TransformOptions): ParseResult | Null = js.native
  def transform(code: String): BabelFileResult | Null = js.native
  def transform(code: String, callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transform(code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformAsync(code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformAsync(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFile(filename: String, callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformFileAsync(filename: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFileAsync(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFileSync(filename: String): BabelFileResult | Null = js.native
  def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFromAst(
    ast: Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFromAst(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformFromAstAsync(ast: Node): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: Node, code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstSync(ast: Node): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: Node, code: String): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformSync(code: String): BabelFileResult | Null = js.native
  def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def traverse(
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse(
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node],
    scope: Scope
  ): Unit = js.native
  def traverse(
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def traverse(
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: typings.atBabelTraverse.atBabelTraverseMod.NodePath[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse(
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse(
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node],
    scope: Scope
  ): Unit = js.native
  def traverse(
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node],
    scope: Scope,
    state: js.Any
  ): Unit = js.native
  def traverse(
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[typings.atBabelTraverse.atBabelTraverseMod.Node],
    scope: Scope,
    state: js.Any,
    parentPath: typings.atBabelTraverse.atBabelTraverseMod.NodePath[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: typings.atBabelTraverse.atBabelTraverseMod.NodePath[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: js.Array[typings.atBabelTraverse.atBabelTraverseMod.Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: typings.atBabelTraverse.atBabelTraverseMod.NodePath[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: typings.atBabelTraverse.atBabelTraverseMod.NodePath[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
  def traverse[S](
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S
  ): Unit = js.native
  def traverse[S](
    parent: typings.atBabelTraverse.atBabelTraverseMod.Node,
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: typings.atBabelTraverse.atBabelTraverseMod.NodePath[typings.atBabelTraverse.atBabelTraverseMod.Node]
  ): Unit = js.native
}

