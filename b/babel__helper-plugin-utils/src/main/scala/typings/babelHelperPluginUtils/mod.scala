package typings.babelHelperPluginUtils

import typings.babelCore.anon.ReadonlyPartialConfig
import typings.babelCore.mod.BabelFileResult
import typings.babelCore.mod.ConfigAPI
import typings.babelCore.mod.ConfigItem
import typings.babelCore.mod.CreateConfigItemOptions
import typings.babelCore.mod.FileParseCallback
import typings.babelCore.mod.FileResultCallback
import typings.babelCore.mod.Node
import typings.babelCore.mod.ParseResult
import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginOptions
import typings.babelCore.mod.PluginPass
import typings.babelCore.mod.PluginTarget
import typings.babelCore.mod.TransformOptions
import typings.babelHelperPluginUtils.anon.TypeofNodePath
import typings.babelHelperPluginUtils.anon.Typeoftraverse
import typings.babelHelperPluginUtils.anon.Typeoftypes
import typings.babelHelperPluginUtils.babelHelperPluginUtilsStrings.Dotes
import typings.babelHelperPluginUtils.babelHelperPluginUtilsStrings.Dotes6
import typings.babelHelperPluginUtils.babelHelperPluginUtilsStrings.Dotjs
import typings.babelHelperPluginUtils.babelHelperPluginUtilsStrings.Dotjsx
import typings.babelHelperPluginUtils.babelHelperPluginUtilsStrings.Dotmjs
import typings.babelTemplate.mod.DefaultTemplateBuilder
import typings.babelTemplate.mod.PublicReplacements
import typings.babelTemplate.mod.TemplateBuilder
import typings.babelTemplate.mod.TemplateBuilderOptions
import typings.babelTypes.mod.Statement
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@babel/helper-plugin-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def declare[O /* <: Record[String, Any] */, R /* <: PluginObj[PluginPass] */](builder: js.Function3[/* api */ BabelAPI, /* options */ O, /* dirname */ String, R]): js.Function3[/* api */ js.Object, /* options */ js.UndefOr[O | Null], /* dirname */ String, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("declare")(builder.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* api */ js.Object, /* options */ js.UndefOr[O | Null], /* dirname */ String, R]]
  
  @js.native
  trait BabelAPI
    extends StObject
       with ConfigAPI {
    
    val DEFAULT_EXTENSIONS: js.Tuple5[Dotjs, Dotjsx, Dotes6, Dotes, Dotmjs] = js.native
    
    var NodePath: TypeofNodePath = js.native
    
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
    
    def loadPartialConfig(): ReadonlyPartialConfig | Null = js.native
    def loadPartialConfig(options: TransformOptions): ReadonlyPartialConfig | Null = js.native
    
    def loadPartialConfigAsync(): js.Promise[ReadonlyPartialConfig | Null] = js.native
    def loadPartialConfigAsync(options: TransformOptions): js.Promise[ReadonlyPartialConfig | Null] = js.native
    
    def parse(code: String): ParseResult | Null = js.native
    def parse(code: String, callback: FileParseCallback): Unit = js.native
    def parse(code: String, options: Unit, callback: FileParseCallback): Unit = js.native
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
    def template(tpl: TemplateStringsArray, args: Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
    @JSName("template")
    val template_Original: DefaultTemplateBuilder = js.native
    
    def transform(code: String): BabelFileResult | Null = js.native
    def transform(code: String, callback: FileResultCallback): Unit = js.native
    def transform(code: String, opts: Unit, callback: FileResultCallback): Unit = js.native
    def transform(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
    def transform(code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
    
    def transformAsync(code: String): js.Promise[BabelFileResult | Null] = js.native
    def transformAsync(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
    
    def transformFile(filename: String, callback: FileResultCallback): Unit = js.native
    def transformFile(filename: String, opts: Unit, callback: FileResultCallback): Unit = js.native
    def transformFile(filename: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
    
    def transformFileAsync(filename: String): js.Promise[BabelFileResult | Null] = js.native
    def transformFileAsync(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
    
    def transformFileSync(filename: String): BabelFileResult | Null = js.native
    def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult | Null = js.native
    
    def transformFromAst(ast: Node, code: String, callback: FileResultCallback): Unit = js.native
    def transformFromAst(ast: Node, code: String, opts: Unit, callback: FileResultCallback): Unit = js.native
    def transformFromAst(ast: Node, code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
    def transformFromAst(ast: Node, code: Unit, callback: FileResultCallback): Unit = js.native
    def transformFromAst(ast: Node, code: Unit, opts: Unit, callback: FileResultCallback): Unit = js.native
    def transformFromAst(ast: Node, code: Unit, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
    
    def transformFromAstAsync(ast: Node): js.Promise[BabelFileResult | Null] = js.native
    def transformFromAstAsync(ast: Node, code: String): js.Promise[BabelFileResult | Null] = js.native
    def transformFromAstAsync(ast: Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
    def transformFromAstAsync(ast: Node, code: Unit, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
    
    def transformFromAstSync(ast: Node): BabelFileResult | Null = js.native
    def transformFromAstSync(ast: Node, code: String): BabelFileResult | Null = js.native
    def transformFromAstSync(ast: Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
    def transformFromAstSync(ast: Node, code: Unit, opts: TransformOptions): BabelFileResult | Null = js.native
    
    def transformSync(code: String): BabelFileResult | Null = js.native
    def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
    
    val traverse: Typeoftraverse = js.native
    
    val types: Typeoftypes = js.native
  }
}
