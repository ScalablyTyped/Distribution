package typings.babelPluginTester

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.anon.ReadonlyPartialConfig
import typings.babelCore.mod.BabelFileResult
import typings.babelCore.mod.ConfigItem
import typings.babelCore.mod.CreateConfigItemOptions
import typings.babelCore.mod.FileParseCallback
import typings.babelCore.mod.FileResultCallback
import typings.babelCore.mod.InputSourceMap
import typings.babelCore.mod.MatchPattern
import typings.babelCore.mod.MatchPatternContext
import typings.babelCore.mod.Node
import typings.babelCore.mod.ParseResult
import typings.babelCore.mod.PluginItem
import typings.babelCore.mod.PluginOptions
import typings.babelCore.mod.PluginTarget
import typings.babelCore.mod.TransformCaller
import typings.babelCore.mod.TransformOptions
import typings.babelGenerator.mod.GeneratorOptions
import typings.babelParser.mod.ParserOptions
import typings.babelPluginTester.anon.Config
import typings.babelPluginTester.anon.Filename
import typings.babelPluginTester.anon.TypeofNodePath
import typings.babelPluginTester.anon.Typeoftraverse
import typings.babelPluginTester.anon.Typeoftypes
import typings.babelPluginTester.babelPluginTesterStrings.Dotes
import typings.babelPluginTester.babelPluginTesterStrings.Dotes6
import typings.babelPluginTester.babelPluginTesterStrings.Dotjs
import typings.babelPluginTester.babelPluginTesterStrings.Dotjsx
import typings.babelPluginTester.babelPluginTesterStrings.Dotmjs
import typings.babelPluginTester.babelPluginTesterStrings.`inline`
import typings.babelPluginTester.babelPluginTesterStrings.`upward-optional`
import typings.babelPluginTester.babelPluginTesterStrings.auto
import typings.babelPluginTester.babelPluginTesterStrings.both
import typings.babelPluginTester.babelPluginTesterStrings.crlf
import typings.babelPluginTester.babelPluginTesterStrings.enter
import typings.babelPluginTester.babelPluginTesterStrings.exit
import typings.babelPluginTester.babelPluginTesterStrings.lf
import typings.babelPluginTester.babelPluginTesterStrings.module
import typings.babelPluginTester.babelPluginTesterStrings.preserve
import typings.babelPluginTester.babelPluginTesterStrings.root
import typings.babelPluginTester.babelPluginTesterStrings.script
import typings.babelPluginTester.babelPluginTesterStrings.unambiguous
import typings.babelPluginTester.babelPluginTesterStrings.upward
import typings.babelTemplate.mod.DefaultTemplateBuilder
import typings.babelTemplate.mod.PublicReplacements
import typings.babelTemplate.mod.TemplateBuilder
import typings.babelTemplate.mod.TemplateBuilderOptions
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Statement
import typings.std.Exclude
import typings.std.NonNullable
import typings.std.Pick
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babel-plugin-tester", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: PluginTesterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def prettierFormatter(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettierFormatter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prettierFormatter(code: String, options: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettierFormatter")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object unstringSnapshotSerializer {
    
    @JSImport("babel-plugin-tester", "unstringSnapshotSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def print(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def test(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
  
  @js.native
  trait BabelType extends StObject {
    
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
    
    val version: String = js.native
  }
  
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /* Inlined parent babel-plugin-tester.babel-plugin-tester.TestObject */
  /* Inlined parent babel-plugin-tester.babel-plugin-tester.Omit<@babel/core.@babel/core.TransformOptions, 'code' | 'only'> */
  trait PluginTesterOptions extends StObject {
    
    var ast: js.UndefOr[Boolean | Null] = js.undefined
    
    var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.undefined
    
    var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Use this to provide your own implementation of babel. This is
      * particularly useful if you want to use a different version of babel than
      * what's included in this package.
      */
    var babel: js.UndefOr[BabelType] = js.undefined
    
    /**
      * To use `babel.config.js` instead of `.babelrc`, set babelOptions to the
      * config object:
      *
      * ```ts
      * pluginTester({
      *   plugin: yourPlugin,
      *   ...
      *   babelOptions: require('./babel.config.js'),
      *   ...
      *   tests: {
      *     // your test objects
      *   },
      * });
      * ```
      *
      */
    var babelOptions: js.UndefOr[TransformOptions] = js.undefined
    
    var babelrc: js.UndefOr[Boolean | Null] = js.undefined
    
    var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.undefined
    
    var browserslistConfigFile: js.UndefOr[Boolean | Null] = js.undefined
    
    var browserslistEnv: js.UndefOr[String | Null] = js.undefined
    
    var caller: js.UndefOr[TransformCaller] = js.undefined
    
    var cloneInputAst: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The code that you want to run through your babel plugin. This must be
      * provided unless you provide a fixture instead. If there's no output or
      * outputFixture and snapshot is not true, then the assertion is that this
      * code is unchanged by the plugin.
      */
    var code: js.UndefOr[String] = js.undefined
    
    var comments: js.UndefOr[Boolean | Null] = js.undefined
    
    var compact: js.UndefOr[Boolean | auto | Null] = js.undefined
    
    var configFile: js.UndefOr[String | Boolean | Null] = js.undefined
    
    var cwd: js.UndefOr[String | Null] = js.undefined
    
    /**
      * This is used to control which line endings the output from babel should
      * have
      *
      * - `lf` - **Unix** default
      * - `crlf` - **Windows**
      * - `auto` - Use the system default
      * - `preserve` Use the line ending from the input.
      *
      * @default 'lf'
      */
    var endOfLine: js.UndefOr[lf | crlf | auto | preserve] = js.undefined
    
    var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.undefined
    
    var envName: js.UndefOr[String] = js.undefined
    
    /**
      * If a particular test case should be throwing an error, you can that using
      * one of the following:
      *
      * ```ts
      * {
      *  // ...
      *   error: true,
      *   error: 'should have this exact message',
      *   error: /should pass this regex/,
      *   error: SyntaxError, // should be instance of this constructor
      *   error: err => {
      *     if (err instanceof SyntaxError && /message/.test(err.message)) {
      *       return true; // test will fail if function doesn't return `true`
      *     }
      *   },
      * }
      * ```
      */
    var error: js.UndefOr[
        Boolean | String | js.RegExp | js.Error | (js.Function1[/* error */ Any, Boolean])
      ] = js.undefined
    
    var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var `extends`: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Relative paths from the other options will be relative to this. Normally
      * you'll provide this as filename: __filename. The only options property
      * affected by this value is fixtures. Test Object properties affected by
      * this value are: fixture and outputFixture. If those properties are not
      * absolute paths, then they will be path.joined with path.dirname of the
      * filename.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    var filenameRelative: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If you'd rather put your code in a separate file, you can specify a
      * filename here. If it's an absolute path, that's the file that will be
      * loaded, otherwise, this will be path.joined with the filename path.
      */
    var fixture: js.UndefOr[String] = js.undefined
    
    /**
      * This is a path to a directory with this format:
      *
      * ```
      * __fixtures__
      * ├── first-test # test title will be: "first test"
      * │   ├── code.js # required
      * │   └── output.js # required
      * └── second-test
      *     ├── .babelrc # optional
      *     ├── options.json # optional
      *     ├── code.js
      *     └── output.js
      * ```
      *
      * With this you could make your test config like so:
      *
      * ```ts
      * pluginTester({
      *   plugin,
      *   fixtures: path.join(__dirname, '__fixtures__'),
      * })
      * ```
      *
      * And it would run two tests. One for each directory in __fixtures__, with
      * plugin options set to the content of options.json
      *
      * Options are inherited, placing a options.json file in __fixtures__ would
      * add those options to all fixtures.
      */
    var fixtures: js.UndefOr[String] = js.undefined
    
    /**
      * This defaults to a function which formats your code output with prettier.
      * If you have prettier configured, then it will use your configuration. If
      * you don't then it will be default configuration.
      *
      * If you'd like to specify your own, then feel free to do so. Here's the
      * API:
      *
      * ```ts
      * function customFormatter(code, { filename }) {
      *   return formattedCode;
      * }
      * ```
      *
      * The use case for this originally was for testing codemods and formatting
      * their result with prettier-eslint.
      */
    var formatResult: js.UndefOr[js.Function2[/* code */ String, /* options */ Filename, String]] = js.undefined
    
    var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.undefined
    
    var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.undefined
    
    var highlightCode: js.UndefOr[Boolean | Null] = js.undefined
    
    var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.undefined
    
    var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    var inputSourceMap: js.UndefOr[InputSourceMap | Null] = js.undefined
    
    var minified: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleId: js.UndefOr[String | Null] = js.undefined
    
    var moduleIds: js.UndefOr[Boolean | Null] = js.undefined
    
    var moduleRoot: js.UndefOr[String | Null] = js.undefined
    
    /**
      * To run only this test. Useful while developing to help focus on a single
      * test. Can be used on multiple tests.
      */
    var only: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this is provided, the result of the plugin will be compared with this
      * output for the assertion. It will have any indentation stripped and will
      * be trimmed as a convenience for template literals.
      */
    var output: js.UndefOr[String] = js.undefined
    
    /**
      * If you'd rather put your output in a separate file, you can specify this
      * instead (works the same as fixture).
      */
    var outputFixture: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[js.Array[TransformOptions]] = js.undefined
    
    var parserOpts: js.UndefOr[ParserOptions | Null] = js.undefined
    
    /**
      * Your babel plugin. For example:
      *
      * ```ts
      * pluginTester({
      *   plugin: identifierReversePlugin,
      *   tests: {
      *   },
      * })
      *
      * // normally you would import this from your plugin module
      * function identifierReversePlugin() {
      *   return {
      *     name: 'identifier reverse',
      *     visitor: {
      *       Identifier(idPath) {
      *         idPath.node.name = idPath.node.name.split('').reverse().join('')
      *       },
      *     },
      *   }
      * }
      * ```
      */
    var plugin: Any
    
    /**
      * This is used for the describe title as well as the test titles. If it can be inferred from the plugin's name then it will be and you don't need to provide this option.
      */
    var pluginName: js.UndefOr[String] = js.undefined
    
    /**
      * This can be used to pass options into your plugin at transform time. This
      * option can be overwritten using the test object.
      *
      */
    var pluginOptions: js.UndefOr[PluginOptions] = js.undefined
    
    var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
    
    var retainLines: js.UndefOr[Boolean | Null] = js.undefined
    
    var root: js.UndefOr[String | Null] = js.undefined
    
    var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
    
    /**
      * If you need something set up before a particular test is run, you can do
      * this with setup. This function will be run before the test runs. It can
      * return a function which will be treated as a teardown function. It can
      * also return a promise. If that promise resolves to a function, that will
      * be treated as a teardown function.
      */
    var setup: js.UndefOr[
        js.Function0[
          Unit | (NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | (js.Promise[(NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | Unit])
        ]
      ] = js.undefined
    
    var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.undefined
    
    /**
      * To skip running this test. Useful for when you're working on a feature
      * that is not yet supported.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you'd prefer to take a snapshot of your output rather than compare it
      * to something you hard-code, then specify snapshot: true. This will take a
      * snapshot with both the source code and the output, making the snapshot
      * easier to understand.
      */
    var snapshot: js.UndefOr[Boolean] = js.undefined
    
    var sourceFileName: js.UndefOr[String | Null] = js.undefined
    
    var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.undefined
    
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
    
    var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.undefined
    
    /**
      * If you set up some state, it's quite possible you want to tear it down.
      * You can either define this as its own property, or you can return it from
      * the setup function. This can likewise return a promise if it's
      * asynchronous.
      */
    var teardown: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
    
    /**
      * You provide test objects as the tests option to babel-plugin-tester. You
      * can either provide the tests as an object of test objects or an array of
      * test objects.
      *
      * If you provide the tests as an object, the key will be used as the title
      * of the test.
      *
      * If you provide an array, the title will be derived from it's index and a
      * specified title property or the pluginName.
      *
      * Read more about test objects below.
      */
    var tests: js.UndefOr[(js.Array[TestObject | String]) | (Record[String, TestObject | String])] = js.undefined
    
    /**
      * This can be used to specify a title for the describe block (rather than
      * using the pluginName).
      */
    var title: js.UndefOr[String] = js.undefined
    
    var wrapPluginVisitorMethod: js.UndefOr[
        (js.Function3[
          /* pluginAlias */ String, 
          /* visitorType */ enter | exit, 
          /* callback */ js.Function2[/* path */ NodePath[typings.babelTypes.mod.Node], /* state */ Any, Unit], 
          js.Function2[/* path */ NodePath[typings.babelTypes.mod.Node], /* state */ Any, Unit]
        ]) | Null
      ] = js.undefined
  }
  object PluginTesterOptions {
    
    inline def apply(plugin: Any): PluginTesterOptions = {
      val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginTesterOptions]
    }
    
    extension [Self <: PluginTesterOptions](x: Self) {
      
      inline def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstNull: Self = StObject.set(x, "ast", null)
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setAuxiliaryCommentAfter(value: String): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentAfterNull: Self = StObject.set(x, "auxiliaryCommentAfter", null)
      
      inline def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      inline def setAuxiliaryCommentBefore(value: String): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      inline def setAuxiliaryCommentBeforeNull: Self = StObject.set(x, "auxiliaryCommentBefore", null)
      
      inline def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      inline def setBabel(value: BabelType): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
      
      inline def setBabelOptions(value: TransformOptions): Self = StObject.set(x, "babelOptions", value.asInstanceOf[js.Any])
      
      inline def setBabelOptionsUndefined: Self = StObject.set(x, "babelOptions", js.undefined)
      
      inline def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
      
      inline def setBabelrc(value: Boolean): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      inline def setBabelrcNull: Self = StObject.set(x, "babelrc", null)
      
      inline def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "babelrcRoots", value.asInstanceOf[js.Any])
      
      inline def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "babelrcRoots", js.Any.fromFunction2(value))
      
      inline def setBabelrcRootsNull: Self = StObject.set(x, "babelrcRoots", null)
      
      inline def setBabelrcRootsUndefined: Self = StObject.set(x, "babelrcRoots", js.undefined)
      
      inline def setBabelrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "babelrcRoots", js.Array(value*))
      
      inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      inline def setBrowserslistConfigFile(value: Boolean): Self = StObject.set(x, "browserslistConfigFile", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistConfigFileNull: Self = StObject.set(x, "browserslistConfigFile", null)
      
      inline def setBrowserslistConfigFileUndefined: Self = StObject.set(x, "browserslistConfigFile", js.undefined)
      
      inline def setBrowserslistEnv(value: String): Self = StObject.set(x, "browserslistEnv", value.asInstanceOf[js.Any])
      
      inline def setBrowserslistEnvNull: Self = StObject.set(x, "browserslistEnv", null)
      
      inline def setBrowserslistEnvUndefined: Self = StObject.set(x, "browserslistEnv", js.undefined)
      
      inline def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
      
      inline def setCloneInputAst(value: Boolean): Self = StObject.set(x, "cloneInputAst", value.asInstanceOf[js.Any])
      
      inline def setCloneInputAstNull: Self = StObject.set(x, "cloneInputAst", null)
      
      inline def setCloneInputAstUndefined: Self = StObject.set(x, "cloneInputAst", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setCompact(value: Boolean | auto): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactNull: Self = StObject.set(x, "compact", null)
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileNull: Self = StObject.set(x, "configFile", null)
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdNull: Self = StObject.set(x, "cwd", null)
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEndOfLine(value: lf | crlf | auto | preserve): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
      
      inline def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
      
      inline def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
      
      inline def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
      
      inline def setEnvNull: Self = StObject.set(x, "env", null)
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setError(value: Boolean | String | js.RegExp | js.Error | (js.Function1[/* error */ Any, Boolean])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(value: /* error */ Any => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction2(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: MatchPattern*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsNull: Self = StObject.set(x, "extends", null)
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
      
      inline def setFilenameRelativeNull: Self = StObject.set(x, "filenameRelative", null)
      
      inline def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFixture(value: String): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
      
      inline def setFixtureUndefined: Self = StObject.set(x, "fixture", js.undefined)
      
      inline def setFixtures(value: String): Self = StObject.set(x, "fixtures", value.asInstanceOf[js.Any])
      
      inline def setFixturesUndefined: Self = StObject.set(x, "fixtures", js.undefined)
      
      inline def setFormatResult(value: (/* code */ String, /* options */ Filename) => String): Self = StObject.set(x, "formatResult", js.Any.fromFunction2(value))
      
      inline def setFormatResultUndefined: Self = StObject.set(x, "formatResult", js.undefined)
      
      inline def setGeneratorOpts(value: GeneratorOptions): Self = StObject.set(x, "generatorOpts", value.asInstanceOf[js.Any])
      
      inline def setGeneratorOptsNull: Self = StObject.set(x, "generatorOpts", null)
      
      inline def setGeneratorOptsUndefined: Self = StObject.set(x, "generatorOpts", js.undefined)
      
      inline def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = StObject.set(x, "getModuleId", js.Any.fromFunction1(value))
      
      inline def setGetModuleIdNull: Self = StObject.set(x, "getModuleId", null)
      
      inline def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
      
      inline def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      inline def setHighlightCodeNull: Self = StObject.set(x, "highlightCode", null)
      
      inline def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      inline def setIgnore(value: js.Array[MatchPattern]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNull: Self = StObject.set(x, "ignore", null)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: MatchPattern*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInclude(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction2(value))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: MatchPattern*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setInputSourceMap(value: InputSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      inline def setMinified(value: Boolean): Self = StObject.set(x, "minified", value.asInstanceOf[js.Any])
      
      inline def setMinifiedNull: Self = StObject.set(x, "minified", null)
      
      inline def setMinifiedUndefined: Self = StObject.set(x, "minified", js.undefined)
      
      inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      inline def setModuleIdNull: Self = StObject.set(x, "moduleId", null)
      
      inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
      
      inline def setModuleIds(value: Boolean): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      inline def setModuleIdsNull: Self = StObject.set(x, "moduleIds", null)
      
      inline def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      inline def setModuleRoot(value: String): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
      
      inline def setModuleRootNull: Self = StObject.set(x, "moduleRoot", null)
      
      inline def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputFixture(value: String): Self = StObject.set(x, "outputFixture", value.asInstanceOf[js.Any])
      
      inline def setOutputFixtureUndefined: Self = StObject.set(x, "outputFixture", js.undefined)
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setOverrides(value: js.Array[TransformOptions]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: TransformOptions*): Self = StObject.set(x, "overrides", js.Array(value*))
      
      inline def setParserOpts(value: ParserOptions): Self = StObject.set(x, "parserOpts", value.asInstanceOf[js.Any])
      
      inline def setParserOptsNull: Self = StObject.set(x, "parserOpts", null)
      
      inline def setParserOptsUndefined: Self = StObject.set(x, "parserOpts", js.undefined)
      
      inline def setPlugin(value: Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
      
      inline def setPluginOptions(value: PluginOptions): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      inline def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(value: js.Array[PluginItem]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsNull: Self = StObject.set(x, "presets", null)
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(value: PluginItem*): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      inline def setRetainLinesNull: Self = StObject.set(x, "retainLines", null)
      
      inline def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
      
      inline def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSetup(
        value: () => Unit | (NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | (js.Promise[(NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | Unit])
      ): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = StObject.set(x, "shouldPrintComment", js.Any.fromFunction1(value))
      
      inline def setShouldPrintCommentNull: Self = StObject.set(x, "shouldPrintComment", null)
      
      inline def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
      
      inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
      
      inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      inline def setSourceMaps(value: Boolean | `inline` | both): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      inline def setSourceMapsNull: Self = StObject.set(x, "sourceMaps", null)
      
      inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeNull: Self = StObject.set(x, "sourceType", null)
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setTeardown(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
      
      inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
      
      inline def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction2(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: MatchPattern*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setTests(value: (js.Array[TestObject | String]) | (Record[String, TestObject | String])): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
      
      inline def setTestsVarargs(value: (TestObject | String)*): Self = StObject.set(x, "tests", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWrapPluginVisitorMethod(
        value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[typings.babelTypes.mod.Node], /* state */ Any, Unit]) => js.Function2[/* path */ NodePath[typings.babelTypes.mod.Node], /* state */ Any, Unit]
      ): Self = StObject.set(x, "wrapPluginVisitorMethod", js.Any.fromFunction3(value))
      
      inline def setWrapPluginVisitorMethodNull: Self = StObject.set(x, "wrapPluginVisitorMethod", null)
      
      inline def setWrapPluginVisitorMethodUndefined: Self = StObject.set(x, "wrapPluginVisitorMethod", js.undefined)
    }
  }
  
  trait TestObject extends StObject {
    
    /**
      * To use `babel.config.js` instead of `.babelrc`, set babelOptions to the
      * config object:
      *
      * ```ts
      * pluginTester({
      *   plugin: yourPlugin,
      *   ...
      *   babelOptions: require('./babel.config.js'),
      *   ...
      *   tests: {
      *     // your test objects
      *   },
      * });
      * ```
      *
      */
    var babelOptions: js.UndefOr[TransformOptions] = js.undefined
    
    /**
      * The code that you want to run through your babel plugin. This must be
      * provided unless you provide a fixture instead. If there's no output or
      * outputFixture and snapshot is not true, then the assertion is that this
      * code is unchanged by the plugin.
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * If a particular test case should be throwing an error, you can that using
      * one of the following:
      *
      * ```ts
      * {
      *  // ...
      *   error: true,
      *   error: 'should have this exact message',
      *   error: /should pass this regex/,
      *   error: SyntaxError, // should be instance of this constructor
      *   error: err => {
      *     if (err instanceof SyntaxError && /message/.test(err.message)) {
      *       return true; // test will fail if function doesn't return `true`
      *     }
      *   },
      * }
      * ```
      */
    var error: js.UndefOr[
        Boolean | String | js.RegExp | js.Error | (js.Function1[/* error */ Any, Boolean])
      ] = js.undefined
    
    /**
      * If you'd rather put your code in a separate file, you can specify a
      * filename here. If it's an absolute path, that's the file that will be
      * loaded, otherwise, this will be path.joined with the filename path.
      */
    var fixture: js.UndefOr[String] = js.undefined
    
    /**
      * This defaults to a function which formats your code output with prettier.
      * If you have prettier configured, then it will use your configuration. If
      * you don't then it will be default configuration.
      *
      * If you'd like to specify your own, then feel free to do so. Here's the
      * API:
      *
      * ```ts
      * function customFormatter(code, { filename }) {
      *   return formattedCode;
      * }
      * ```
      *
      * The use case for this originally was for testing codemods and formatting
      * their result with prettier-eslint.
      */
    var formatResult: js.UndefOr[js.Function2[/* code */ String, /* options */ Filename, String]] = js.undefined
    
    /**
      * To run only this test. Useful while developing to help focus on a single
      * test. Can be used on multiple tests.
      */
    var only: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If this is provided, the result of the plugin will be compared with this
      * output for the assertion. It will have any indentation stripped and will
      * be trimmed as a convenience for template literals.
      */
    var output: js.UndefOr[String] = js.undefined
    
    /**
      * If you'd rather put your output in a separate file, you can specify this
      * instead (works the same as fixture).
      */
    var outputFixture: js.UndefOr[String] = js.undefined
    
    /**
      * This can be used to pass options into your plugin at transform time.
      *
      */
    var pluginOptions: js.UndefOr[PluginOptions] = js.undefined
    
    /**
      * If you need something set up before a particular test is run, you can do
      * this with setup. This function will be run before the test runs. It can
      * return a function which will be treated as a teardown function. It can
      * also return a promise. If that promise resolves to a function, that will
      * be treated as a teardown function.
      */
    var setup: js.UndefOr[
        js.Function0[
          Unit | (NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | (js.Promise[(NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | Unit])
        ]
      ] = js.undefined
    
    /**
      * To skip running this test. Useful for when you're working on a feature
      * that is not yet supported.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you'd prefer to take a snapshot of your output rather than compare it
      * to something you hard-code, then specify snapshot: true. This will take a
      * snapshot with both the source code and the output, making the snapshot
      * easier to understand.
      */
    var snapshot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you set up some state, it's quite possible you want to tear it down.
      * You can either define this as its own property, or you can return it from
      * the setup function. This can likewise return a promise if it's
      * asynchronous.
      */
    var teardown: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    /**
      * If provided, this will be used instead of the pluginName. If you're using
      * the object API, then the key of this object will be the title (see
      * example below).
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object TestObject {
    
    inline def apply(): TestObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestObject]
    }
    
    extension [Self <: TestObject](x: Self) {
      
      inline def setBabelOptions(value: TransformOptions): Self = StObject.set(x, "babelOptions", value.asInstanceOf[js.Any])
      
      inline def setBabelOptionsUndefined: Self = StObject.set(x, "babelOptions", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setError(value: Boolean | String | js.RegExp | js.Error | (js.Function1[/* error */ Any, Boolean])): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorFunction1(value: /* error */ Any => Boolean): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFixture(value: String): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
      
      inline def setFixtureUndefined: Self = StObject.set(x, "fixture", js.undefined)
      
      inline def setFormatResult(value: (/* code */ String, /* options */ Filename) => String): Self = StObject.set(x, "formatResult", js.Any.fromFunction2(value))
      
      inline def setFormatResultUndefined: Self = StObject.set(x, "formatResult", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputFixture(value: String): Self = StObject.set(x, "outputFixture", value.asInstanceOf[js.Any])
      
      inline def setOutputFixtureUndefined: Self = StObject.set(x, "outputFixture", js.undefined)
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPluginOptions(value: PluginOptions): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      inline def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      inline def setSetup(
        value: () => Unit | (NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | (js.Promise[(NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | Unit])
      ): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
      
      inline def setTeardown(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
      
      inline def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
