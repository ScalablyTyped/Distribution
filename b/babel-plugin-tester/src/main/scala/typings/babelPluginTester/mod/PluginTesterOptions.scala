package typings.babelPluginTester.mod

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.MatchPattern
import typings.babelCore.mod.MatchPatternContext
import typings.babelCore.mod.PluginItem
import typings.babelCore.mod.PluginOptions
import typings.babelCore.mod.TransformCaller
import typings.babelCore.mod.TransformOptions
import typings.babelGenerator.mod.GeneratorOptions
import typings.babelParser.mod.ParserOptions
import typings.babelPluginTester.anon.Filename
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
import typings.babelTraverse.mod.Node
import typings.babelTraverse.mod.NodePath
import typings.std.Error
import typings.std.NonNullable
import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent babel-plugin-tester.babel-plugin-tester.TestObject */
/* Inlined parent babel-plugin-tester.babel-plugin-tester.Omit<@babel/core.@babel/core.TransformOptions, 'code' | 'only'> */
@js.native
trait PluginTesterOptions extends js.Object {
  var ast: js.UndefOr[Boolean | Null] = js.native
  var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.native
  var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.native
  /**
    * Use this to provide your own implementation of babel. This is
    * particularly useful if you want to use a different version of babel than
    * what's included in this package.
    */
  var babel: js.UndefOr[BabelType] = js.native
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
  var babelOptions: js.UndefOr[TransformOptions] = js.native
  var babelrc: js.UndefOr[Boolean | Null] = js.native
  var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern] | Null] = js.native
  var caller: js.UndefOr[TransformCaller] = js.native
  /**
    * The code that you want to run through your babel plugin. This must be
    * provided unless you provide a fixture instead. If there's no output or
    * outputFixture and snapshot is not true, then the assertion is that this
    * code is unchanged by the plugin.
    */
  var code: js.UndefOr[String] = js.native
  var comments: js.UndefOr[Boolean | Null] = js.native
  var compact: js.UndefOr[Boolean | auto | Null] = js.native
  var configFile: js.UndefOr[String | Boolean | Null] = js.native
  var cwd: js.UndefOr[String | Null] = js.native
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
  var endOfLine: js.UndefOr[lf | crlf | auto | preserve] = js.native
  var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.native
  var envName: js.UndefOr[String] = js.native
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
  var error: js.UndefOr[Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean])] = js.native
  var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  var `extends`: js.UndefOr[String | Null] = js.native
  /**
    * Relative paths from the other options will be relative to this. Normally
    * you'll provide this as filename: __filename. The only options property
    * affected by this value is fixtures. Test Object properties affected by
    * this value are: fixture and outputFixture. If those properties are not
    * absolute paths, then they will be path.joined with path.dirname of the
    * filename.
    */
  var filename: js.UndefOr[String] = js.native
  var filenameRelative: js.UndefOr[String | Null] = js.native
  /**
    * If you'd rather put your code in a separate file, you can specify a
    * filename here. If it's an absolute path, that's the file that will be
    * loaded, otherwise, this will be path.joined with the filename path.
    */
  var fixture: js.UndefOr[String] = js.native
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
  var fixtures: js.UndefOr[String] = js.native
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
  var formatResult: js.UndefOr[js.Function2[/* code */ String, /* options */ Filename, String]] = js.native
  var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.native
  var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.native
  var highlightCode: js.UndefOr[Boolean | Null] = js.native
  var ignore: js.UndefOr[js.Array[MatchPattern] | Null] = js.native
  var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
  var inputSourceMap: js.UndefOr[js.Object | Null] = js.native
  var minified: js.UndefOr[Boolean | Null] = js.native
  var moduleId: js.UndefOr[String | Null] = js.native
  var moduleIds: js.UndefOr[Boolean | Null] = js.native
  var moduleRoot: js.UndefOr[String | Null] = js.native
  /**
    * To run only this test. Useful while developing to help focus on a single
    * test. Can be used on multiple tests.
    */
  var only: js.UndefOr[Boolean] = js.native
  /**
    * If this is provided, the result of the plugin will be compared with this
    * output for the assertion. It will have any indentation stripped and will
    * be trimmed as a convenience for template literals.
    */
  var output: js.UndefOr[String] = js.native
  /**
    * If you'd rather put your output in a separate file, you can specify this
    * instead (works the same as fixture).
    */
  var outputFixture: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[js.Array[TransformOptions]] = js.native
  var parserOpts: js.UndefOr[ParserOptions | Null] = js.native
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
  var plugin: js.Any = js.native
  /**
    * This is used for the describe title as well as the test titles. If it can be inferred from the plugin's name then it will be and you don't need to provide this option.
    */
  var pluginName: js.UndefOr[String] = js.native
  /**
    * This can be used to pass options into your plugin at transform time. This
    * option can be overwritten using the test object.
    *
    */
  var pluginOptions: js.UndefOr[PluginOptions] = js.native
  var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.native
  var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.native
  var retainLines: js.UndefOr[Boolean | Null] = js.native
  var root: js.UndefOr[String | Null] = js.native
  var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.native
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
  ] = js.native
  var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.native
  /**
    * To skip running this test. Useful for when you're working on a feature
    * that is not yet supported.
    */
  var skip: js.UndefOr[Boolean] = js.native
  /**
    * If you'd prefer to take a snapshot of your output rather than compare it
    * to something you hard-code, then specify snapshot: true. This will take a
    * snapshot with both the source code and the output, making the snapshot
    * easier to understand.
    */
  var snapshot: js.UndefOr[Boolean] = js.native
  var sourceFileName: js.UndefOr[String | Null] = js.native
  var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.native
  var sourceRoot: js.UndefOr[String | Null] = js.native
  var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.native
  /**
    * If you set up some state, it's quite possible you want to tear it down.
    * You can either define this as its own property, or you can return it from
    * the setup function. This can likewise return a promise if it's
    * asynchronous.
    */
  var teardown: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.native
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
  var tests: js.UndefOr[(js.Array[TestObject | String]) | (Record[String, TestObject | String])] = js.native
  /**
    * This can be used to specify a title for the describe block (rather than
    * using the pluginName).
    */
  var title: js.UndefOr[String] = js.native
  var wrapPluginVisitorMethod: js.UndefOr[
    (js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ js.Any, Unit], 
      js.Function2[/* path */ NodePath[Node], /* state */ _, Unit]
    ]) | Null
  ] = js.native
}

object PluginTesterOptions {
  @scala.inline
  def apply(plugin: js.Any): PluginTesterOptions = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginTesterOptions]
  }
  @scala.inline
  implicit class PluginTesterOptionsOps[Self <: PluginTesterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlugin(value: js.Any): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setAst(value: Boolean): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    @scala.inline
    def setAstNull: Self = this.set("ast", null)
    @scala.inline
    def setAuxiliaryCommentAfter(value: String): Self = this.set("auxiliaryCommentAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentAfter: Self = this.set("auxiliaryCommentAfter", js.undefined)
    @scala.inline
    def setAuxiliaryCommentAfterNull: Self = this.set("auxiliaryCommentAfter", null)
    @scala.inline
    def setAuxiliaryCommentBefore(value: String): Self = this.set("auxiliaryCommentBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryCommentBefore: Self = this.set("auxiliaryCommentBefore", js.undefined)
    @scala.inline
    def setAuxiliaryCommentBeforeNull: Self = this.set("auxiliaryCommentBefore", null)
    @scala.inline
    def setBabel(value: BabelType): Self = this.set("babel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBabel: Self = this.set("babel", js.undefined)
    @scala.inline
    def setBabelOptions(value: TransformOptions): Self = this.set("babelOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBabelOptions: Self = this.set("babelOptions", js.undefined)
    @scala.inline
    def setBabelrc(value: Boolean): Self = this.set("babelrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBabelrc: Self = this.set("babelrc", js.undefined)
    @scala.inline
    def setBabelrcNull: Self = this.set("babelrc", null)
    @scala.inline
    def setBabelrcRootsVarargs(value: MatchPattern*): Self = this.set("babelrcRoots", js.Array(value :_*))
    @scala.inline
    def setBabelrcRootsFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("babelrcRoots", js.Any.fromFunction2(value))
    @scala.inline
    def setBabelrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = this.set("babelrcRoots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBabelrcRoots: Self = this.set("babelrcRoots", js.undefined)
    @scala.inline
    def setBabelrcRootsNull: Self = this.set("babelrcRoots", null)
    @scala.inline
    def setCaller(value: TransformCaller): Self = this.set("caller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    @scala.inline
    def setCompact(value: Boolean | auto): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setCompactNull: Self = this.set("compact", null)
    @scala.inline
    def setConfigFile(value: String | Boolean): Self = this.set("configFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    @scala.inline
    def setConfigFileNull: Self = this.set("configFile", null)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setCwdNull: Self = this.set("cwd", null)
    @scala.inline
    def setEndOfLine(value: lf | crlf | auto | preserve): Self = this.set("endOfLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfLine: Self = this.set("endOfLine", js.undefined)
    @scala.inline
    def setEnv(value: StringDictionary[js.UndefOr[TransformOptions | Null]]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setEnvNull: Self = this.set("env", null)
    @scala.inline
    def setEnvName(value: String): Self = this.set("envName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvName: Self = this.set("envName", js.undefined)
    @scala.inline
    def setErrorFunction1(value: /* error */ js.Any => Boolean): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setError(value: Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean])): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: MatchPattern*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExcludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("exclude", js.Any.fromFunction2(value))
    @scala.inline
    def setExclude(value: MatchPattern | js.Array[MatchPattern]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilenameRelative(value: String): Self = this.set("filenameRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilenameRelative: Self = this.set("filenameRelative", js.undefined)
    @scala.inline
    def setFilenameRelativeNull: Self = this.set("filenameRelative", null)
    @scala.inline
    def setFixture(value: String): Self = this.set("fixture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixture: Self = this.set("fixture", js.undefined)
    @scala.inline
    def setFixtures(value: String): Self = this.set("fixtures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixtures: Self = this.set("fixtures", js.undefined)
    @scala.inline
    def setFormatResult(value: (/* code */ String, /* options */ Filename) => String): Self = this.set("formatResult", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatResult: Self = this.set("formatResult", js.undefined)
    @scala.inline
    def setGeneratorOpts(value: GeneratorOptions): Self = this.set("generatorOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratorOpts: Self = this.set("generatorOpts", js.undefined)
    @scala.inline
    def setGeneratorOptsNull: Self = this.set("generatorOpts", null)
    @scala.inline
    def setGetModuleId(value: /* moduleName */ String => js.UndefOr[String | Null]): Self = this.set("getModuleId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetModuleId: Self = this.set("getModuleId", js.undefined)
    @scala.inline
    def setGetModuleIdNull: Self = this.set("getModuleId", null)
    @scala.inline
    def setHighlightCode(value: Boolean): Self = this.set("highlightCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCode: Self = this.set("highlightCode", js.undefined)
    @scala.inline
    def setHighlightCodeNull: Self = this.set("highlightCode", null)
    @scala.inline
    def setIgnoreVarargs(value: MatchPattern*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[MatchPattern]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIgnoreNull: Self = this.set("ignore", null)
    @scala.inline
    def setIncludeVarargs(value: MatchPattern*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setIncludeFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("include", js.Any.fromFunction2(value))
    @scala.inline
    def setInclude(value: MatchPattern | js.Array[MatchPattern]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setInputSourceMap(value: js.Object): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
    @scala.inline
    def setInputSourceMapNull: Self = this.set("inputSourceMap", null)
    @scala.inline
    def setMinified(value: Boolean): Self = this.set("minified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinified: Self = this.set("minified", js.undefined)
    @scala.inline
    def setMinifiedNull: Self = this.set("minified", null)
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    @scala.inline
    def setModuleIdNull: Self = this.set("moduleId", null)
    @scala.inline
    def setModuleIds(value: Boolean): Self = this.set("moduleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleIds: Self = this.set("moduleIds", js.undefined)
    @scala.inline
    def setModuleIdsNull: Self = this.set("moduleIds", null)
    @scala.inline
    def setModuleRoot(value: String): Self = this.set("moduleRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleRoot: Self = this.set("moduleRoot", js.undefined)
    @scala.inline
    def setModuleRootNull: Self = this.set("moduleRoot", null)
    @scala.inline
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setOutputFixture(value: String): Self = this.set("outputFixture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFixture: Self = this.set("outputFixture", js.undefined)
    @scala.inline
    def setOverridesVarargs(value: TransformOptions*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[TransformOptions]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setParserOpts(value: ParserOptions): Self = this.set("parserOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParserOpts: Self = this.set("parserOpts", js.undefined)
    @scala.inline
    def setParserOptsNull: Self = this.set("parserOpts", null)
    @scala.inline
    def setPluginName(value: String): Self = this.set("pluginName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginName: Self = this.set("pluginName", js.undefined)
    @scala.inline
    def setPluginOptions(value: PluginOptions): Self = this.set("pluginOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluginOptions: Self = this.set("pluginOptions", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: PluginItem*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[PluginItem]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPluginsNull: Self = this.set("plugins", null)
    @scala.inline
    def setPresetsVarargs(value: PluginItem*): Self = this.set("presets", js.Array(value :_*))
    @scala.inline
    def setPresets(value: js.Array[PluginItem]): Self = this.set("presets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresets: Self = this.set("presets", js.undefined)
    @scala.inline
    def setPresetsNull: Self = this.set("presets", null)
    @scala.inline
    def setRetainLines(value: Boolean): Self = this.set("retainLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainLines: Self = this.set("retainLines", js.undefined)
    @scala.inline
    def setRetainLinesNull: Self = this.set("retainLines", null)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setRootMode(value: root | upward | `upward-optional`): Self = this.set("rootMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootMode: Self = this.set("rootMode", js.undefined)
    @scala.inline
    def setSetup(
      value: () => Unit | (NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | (js.Promise[(NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | Unit])
    ): Self = this.set("setup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    @scala.inline
    def setShouldPrintComment(value: /* commentContents */ String => Boolean): Self = this.set("shouldPrintComment", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldPrintComment: Self = this.set("shouldPrintComment", js.undefined)
    @scala.inline
    def setShouldPrintCommentNull: Self = this.set("shouldPrintComment", null)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSnapshot(value: Boolean): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    @scala.inline
    def setSourceFileNameNull: Self = this.set("sourceFileName", null)
    @scala.inline
    def setSourceMaps(value: Boolean | `inline` | both): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    @scala.inline
    def setSourceMapsNull: Self = this.set("sourceMaps", null)
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    @scala.inline
    def setSourceRootNull: Self = this.set("sourceRoot", null)
    @scala.inline
    def setSourceType(value: script | module | unambiguous): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setSourceTypeNull: Self = this.set("sourceType", null)
    @scala.inline
    def setTeardown(value: () => Unit | js.Promise[Unit]): Self = this.set("teardown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    @scala.inline
    def setTestVarargs(value: MatchPattern*): Self = this.set("test", js.Array(value :_*))
    @scala.inline
    def setTestFunction2(value: (/* filename */ js.UndefOr[String], /* context */ MatchPatternContext) => Boolean): Self = this.set("test", js.Any.fromFunction2(value))
    @scala.inline
    def setTest(value: MatchPattern | js.Array[MatchPattern]): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setTestsVarargs(value: (TestObject | String)*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: (js.Array[TestObject | String]) | (Record[String, TestObject | String])): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTests: Self = this.set("tests", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWrapPluginVisitorMethod(
      value: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[Node], /* state */ _, Unit]
    ): Self = this.set("wrapPluginVisitorMethod", js.Any.fromFunction3(value))
    @scala.inline
    def deleteWrapPluginVisitorMethod: Self = this.set("wrapPluginVisitorMethod", js.undefined)
    @scala.inline
    def setWrapPluginVisitorMethodNull: Self = this.set("wrapPluginVisitorMethod", null)
  }
  
}

