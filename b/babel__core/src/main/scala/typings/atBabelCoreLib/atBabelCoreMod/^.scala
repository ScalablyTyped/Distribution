package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_EXTENSIONS: js.Tuple5[
    atBabelCoreLib.atBabelCoreLibStrings.DOTjs, 
    atBabelCoreLib.atBabelCoreLibStrings.DOTjsx, 
    atBabelCoreLib.atBabelCoreLibStrings.DOTes6, 
    atBabelCoreLib.atBabelCoreLibStrings.DOTes, 
    atBabelCoreLib.atBabelCoreLibStrings.DOTmjs
  ] = js.native
  val template: atBabelTemplateLib.atBabelTemplateMod.DefaultTemplateBuilder = js.native
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
  def loadPartialConfig(): PartialConfig | scala.Null = js.native
  def loadPartialConfig(options: TransformOptions): PartialConfig | scala.Null = js.native
  def parse(code: java.lang.String): ParseResult | scala.Null = js.native
  def parse(code: java.lang.String, callback: FileParseCallback): scala.Unit = js.native
  def parse(code: java.lang.String, options: js.UndefOr[scala.Nothing], callback: FileParseCallback): scala.Unit = js.native
  def parse(code: java.lang.String, options: TransformOptions): ParseResult | scala.Null = js.native
  def parse(code: java.lang.String, options: TransformOptions, callback: FileParseCallback): scala.Unit = js.native
  def parseAsync(code: java.lang.String): js.Promise[ParseResult | scala.Null] = js.native
  def parseAsync(code: java.lang.String, options: TransformOptions): js.Promise[ParseResult | scala.Null] = js.native
  def parseSync(code: java.lang.String): ParseResult | scala.Null = js.native
  def parseSync(code: java.lang.String, options: TransformOptions): ParseResult | scala.Null = js.native
  def transform(code: java.lang.String): BabelFileResult | scala.Null = js.native
  def transform(code: java.lang.String, callback: FileResultCallback): scala.Unit = js.native
  def transform(code: java.lang.String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transform(code: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def transform(code: java.lang.String, opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformAsync(code: java.lang.String): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformAsync(code: java.lang.String, opts: TransformOptions): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformFile(filename: java.lang.String, callback: FileResultCallback): scala.Unit = js.native
  def transformFile(filename: java.lang.String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformFile(filename: java.lang.String, opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformFileAsync(filename: java.lang.String): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformFileAsync(filename: java.lang.String, opts: TransformOptions): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformFileSync(filename: java.lang.String): BabelFileResult | scala.Null = js.native
  def transformFileSync(filename: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(
    ast: Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): scala.Unit = js.native
  def transformFromAst(ast: Node, code: js.UndefOr[scala.Nothing], opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: java.lang.String, callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: java.lang.String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): scala.Unit = js.native
  def transformFromAst(ast: Node, code: java.lang.String, opts: TransformOptions, callback: FileResultCallback): scala.Unit = js.native
  def transformFromAstAsync(ast: Node): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformFromAstAsync(ast: Node, code: java.lang.String): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformFromAstAsync(ast: Node, code: java.lang.String, opts: TransformOptions): js.Promise[BabelFileResult | scala.Null] = js.native
  def transformFromAstSync(ast: Node): BabelFileResult | scala.Null = js.native
  def transformFromAstSync(ast: Node, code: java.lang.String): BabelFileResult | scala.Null = js.native
  def transformFromAstSync(ast: Node, code: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def transformSync(code: java.lang.String): BabelFileResult | scala.Null = js.native
  def transformSync(code: java.lang.String, opts: TransformOptions): BabelFileResult | scala.Null = js.native
  def traverse(
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope
  ): scala.Unit = js.native
  def traverse(
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: js.Any
  ): scala.Unit = js.native
  def traverse(
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: js.Any,
    parentPath: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: js.Any
  ): scala.Unit = js.native
  def traverse(
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[atBabelTraverseLib.atBabelTraverseMod.Node],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: js.Any,
    parentPath: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: atBabelTraverseLib.atBabelTraverseMod.Node,
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: S,
    parentPath: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: S
  ): scala.Unit = js.native
  def traverse[S](
    parent: js.Array[atBabelTraverseLib.atBabelTraverseMod.Node],
    opts: atBabelTraverseLib.atBabelTraverseMod.TraverseOptions[S],
    scope: atBabelTraverseLib.atBabelTraverseMod.Scope,
    state: S,
    parentPath: atBabelTraverseLib.atBabelTraverseMod.NodePath[atBabelTraverseLib.atBabelTraverseMod.Node]
  ): scala.Unit = js.native
}

