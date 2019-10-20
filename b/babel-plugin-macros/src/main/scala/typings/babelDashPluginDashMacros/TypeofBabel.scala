package typings.babelDashPluginDashMacros

import org.scalablytyped.runtime.Instantiable2
import typings.atBabelCore.atBabelCoreMod.BabelFileResult
import typings.atBabelCore.atBabelCoreMod.ConfigItem
import typings.atBabelCore.atBabelCoreMod.CreateConfigItemOptions
import typings.atBabelCore.atBabelCoreMod.FileParseCallback
import typings.atBabelCore.atBabelCoreMod.FileResultCallback
import typings.atBabelCore.atBabelCoreMod.ParseResult
import typings.atBabelCore.atBabelCoreMod.PartialConfig
import typings.atBabelCore.atBabelCoreMod.PluginOptions
import typings.atBabelCore.atBabelCoreMod.PluginTarget
import typings.atBabelCore.atBabelCoreMod.TransformOptions
import typings.atBabelTemplate.atBabelTemplateMod.DefaultTemplateBuilder
import typings.atBabelTemplate.atBabelTemplateMod.PublicReplacements
import typings.atBabelTemplate.atBabelTemplateMod.TemplateBuilder
import typings.atBabelTemplate.atBabelTemplateMod.TemplateBuilderOptions
import typings.atBabelTraverse.atBabelTraverseMod.Hub
import typings.atBabelTraverse.atBabelTraverseMod.Node
import typings.atBabelTraverse.atBabelTraverseMod.NodePath
import typings.atBabelTraverse.atBabelTraverseMod.Scope
import typings.atBabelTraverse.atBabelTraverseMod.TraverseOptions
import typings.atBabelTypes.atBabelTypesMod.Statement
import typings.babelDashPluginDashMacros.babelDashPluginDashMacrosStrings.DOTes
import typings.babelDashPluginDashMacros.babelDashPluginDashMacrosStrings.DOTes6
import typings.babelDashPluginDashMacros.babelDashPluginDashMacrosStrings.DOTjs
import typings.babelDashPluginDashMacros.babelDashPluginDashMacrosStrings.DOTjsx
import typings.babelDashPluginDashMacros.babelDashPluginDashMacrosStrings.DOTmjs
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBabel extends js.Object {
  val DEFAULT_EXTENSIONS: js.Tuple5[DOTjs, DOTjsx, DOTes6, DOTes, DOTmjs] = js.native
  var NodePath: Instantiable2[
    /* hub */ Hub, 
    /* parent */ Node, 
    typings.atBabelCore.atBabelCoreMod.NodePath[js.Object]
  ] = js.native
  @JSName("template")
  val template_Original: DefaultTemplateBuilder = js.native
  val types: Typeoftypes = js.native
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
  def resolvePlugin(name: String, dirname: String): String | Null = js.native
  def resolvePreset(name: String, dirname: String): String | Null = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def template(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  def template(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def template(opts: TemplateBuilderOptions): TemplateBuilder[Statement | js.Array[Statement]] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def template(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
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
  def transformFromAst(
    ast: typings.atBabelCore.atBabelCoreMod.Node,
    code: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(
    ast: typings.atBabelCore.atBabelCoreMod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(
    ast: typings.atBabelCore.atBabelCoreMod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: TransformOptions,
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(ast: typings.atBabelCore.atBabelCoreMod.Node, code: String, callback: FileResultCallback): Unit = js.native
  def transformFromAst(
    ast: typings.atBabelCore.atBabelCoreMod.Node,
    code: String,
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(
    ast: typings.atBabelCore.atBabelCoreMod.Node,
    code: String,
    opts: TransformOptions,
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAstAsync(ast: typings.atBabelCore.atBabelCoreMod.Node): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: typings.atBabelCore.atBabelCoreMod.Node, code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: typings.atBabelCore.atBabelCoreMod.Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstSync(ast: typings.atBabelCore.atBabelCoreMod.Node): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: typings.atBabelCore.atBabelCoreMod.Node, code: String): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: typings.atBabelCore.atBabelCoreMod.Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformSync(code: String): BabelFileResult | Null = js.native
  def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node]): Unit = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node], scope: Scope, state: js.Any): Unit = js.native
  def traverse(
    parent: js.Array[Node],
    opts: TraverseOptions[Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node]): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: js.Any): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: js.Any, parentPath: NodePath[Node]): Unit = js.native
  def traverse[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: js.UndefOr[scala.Nothing], state: S): Unit = js.native
  def traverse[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def traverse[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: js.UndefOr[scala.Nothing], state: S): Unit = js.native
  def traverse[S](
    parent: Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: Scope, state: S, parentPath: NodePath[Node]): Unit = js.native
}

