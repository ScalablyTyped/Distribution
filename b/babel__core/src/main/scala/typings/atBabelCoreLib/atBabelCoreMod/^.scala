package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val template: atBabelTemplateLib.DefaultTemplateBuilder = js.native
  val version: java.lang.String = js.native
  def createConfigItem(value: atBabelCoreLib.atBabelCoreMod.PluginTarget): atBabelCoreLib.atBabelCoreMod.ConfigItem = js.native
  def createConfigItem(
    value: atBabelCoreLib.atBabelCoreMod.PluginTarget,
    options: atBabelCoreLib.atBabelCoreMod.CreateConfigItemOptions
  ): atBabelCoreLib.atBabelCoreMod.ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple2[
      atBabelCoreLib.atBabelCoreMod.PluginTarget, 
      atBabelCoreLib.atBabelCoreMod.PluginOptions
    ]
  ): atBabelCoreLib.atBabelCoreMod.ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple2[
      atBabelCoreLib.atBabelCoreMod.PluginTarget, 
      atBabelCoreLib.atBabelCoreMod.PluginOptions
    ],
    options: atBabelCoreLib.atBabelCoreMod.CreateConfigItemOptions
  ): atBabelCoreLib.atBabelCoreMod.ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple3[
      atBabelCoreLib.atBabelCoreMod.PluginTarget, 
      atBabelCoreLib.atBabelCoreMod.PluginOptions, 
      js.UndefOr[java.lang.String]
    ]
  ): atBabelCoreLib.atBabelCoreMod.ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple3[
      atBabelCoreLib.atBabelCoreMod.PluginTarget, 
      atBabelCoreLib.atBabelCoreMod.PluginOptions, 
      js.UndefOr[java.lang.String]
    ],
    options: atBabelCoreLib.atBabelCoreMod.CreateConfigItemOptions
  ): atBabelCoreLib.atBabelCoreMod.ConfigItem = js.native
  def loadOptions(): js.Object | scala.Null = js.native
  def loadOptions(options: atBabelCoreLib.atBabelCoreMod.TransformOptions): js.Object | scala.Null = js.native
  def loadPartialConfig(): stdLib.Readonly[atBabelCoreLib.atBabelCoreMod.PartialConfig] | scala.Null = js.native
  def loadPartialConfig(options: atBabelCoreLib.atBabelCoreMod.TransformOptions): stdLib.Readonly[atBabelCoreLib.atBabelCoreMod.PartialConfig] | scala.Null = js.native
  def parse(code: java.lang.String): atBabelCoreLib.atBabelCoreMod.ParseResult | scala.Null = js.native
  def parse(code: java.lang.String, callback: atBabelCoreLib.atBabelCoreMod.FileParseCallback): scala.Unit = js.native
  def parse(code: java.lang.String, options: atBabelCoreLib.atBabelCoreMod.TransformOptions): atBabelCoreLib.atBabelCoreMod.ParseResult | scala.Null = js.native
  def parse(
    code: java.lang.String,
    options: atBabelCoreLib.atBabelCoreMod.TransformOptions,
    callback: atBabelCoreLib.atBabelCoreMod.FileParseCallback
  ): scala.Unit = js.native
  def parse(
    code: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: atBabelCoreLib.atBabelCoreMod.FileParseCallback
  ): scala.Unit = js.native
  def parseAsync(code: java.lang.String): js.Promise[atBabelCoreLib.atBabelCoreMod.ParseResult | scala.Null] = js.native
  def parseAsync(code: java.lang.String, options: atBabelCoreLib.atBabelCoreMod.TransformOptions): js.Promise[atBabelCoreLib.atBabelCoreMod.ParseResult | scala.Null] = js.native
  def parseSync(code: java.lang.String): atBabelCoreLib.atBabelCoreMod.ParseResult | scala.Null = js.native
  def parseSync(code: java.lang.String, options: atBabelCoreLib.atBabelCoreMod.TransformOptions): atBabelCoreLib.atBabelCoreMod.ParseResult | scala.Null = js.native
  def transform(code: java.lang.String): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transform(code: java.lang.String, callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback): scala.Unit = js.native
  def transform(code: java.lang.String, opts: atBabelCoreLib.atBabelCoreMod.TransformOptions): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transform(
    code: java.lang.String,
    opts: atBabelCoreLib.atBabelCoreMod.TransformOptions,
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transform(
    code: java.lang.String,
    opts: js.UndefOr[scala.Nothing],
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformAsync(code: java.lang.String): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformAsync(code: java.lang.String, opts: atBabelCoreLib.atBabelCoreMod.TransformOptions): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformFile(filename: java.lang.String, callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback): scala.Unit = js.native
  def transformFile(
    filename: java.lang.String,
    opts: atBabelCoreLib.atBabelCoreMod.TransformOptions,
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFile(
    filename: java.lang.String,
    opts: js.UndefOr[scala.Nothing],
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFileAsync(filename: java.lang.String): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformFileAsync(filename: java.lang.String, opts: atBabelCoreLib.atBabelCoreMod.TransformOptions): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformFileSync(filename: java.lang.String): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transformFileSync(filename: java.lang.String, opts: atBabelCoreLib.atBabelCoreMod.TransformOptions): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transformFromAst(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: java.lang.String,
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFromAst(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: java.lang.String,
    opts: atBabelCoreLib.atBabelCoreMod.TransformOptions,
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFromAst(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: java.lang.String,
    opts: js.UndefOr[scala.Nothing],
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFromAst(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: js.UndefOr[scala.Nothing],
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFromAst(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: atBabelCoreLib.atBabelCoreMod.TransformOptions,
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFromAst(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: atBabelCoreLib.atBabelCoreMod.FileResultCallback
  ): scala.Unit = js.native
  def transformFromAstAsync(ast: atBabelCoreLib.atBabelCoreMod.Node): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformFromAstAsync(ast: atBabelCoreLib.atBabelCoreMod.Node, code: java.lang.String): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformFromAstAsync(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: java.lang.String,
    opts: atBabelCoreLib.atBabelCoreMod.TransformOptions
  ): js.Promise[atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null] = js.native
  def transformFromAstSync(ast: atBabelCoreLib.atBabelCoreMod.Node): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transformFromAstSync(ast: atBabelCoreLib.atBabelCoreMod.Node, code: java.lang.String): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transformFromAstSync(
    ast: atBabelCoreLib.atBabelCoreMod.Node,
    code: java.lang.String,
    opts: atBabelCoreLib.atBabelCoreMod.TransformOptions
  ): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transformSync(code: java.lang.String): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
  def transformSync(code: java.lang.String, opts: atBabelCoreLib.atBabelCoreMod.TransformOptions): atBabelCoreLib.atBabelCoreMod.BabelFileResult | scala.Null = js.native
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

