package typings.babelPluginTester.mod

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.MatchPattern
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
trait PluginTesterOptions extends js.Object {
  var ast: js.UndefOr[Boolean] = js.undefined
  var auxiliaryCommentAfter: js.UndefOr[String] = js.undefined
  var auxiliaryCommentBefore: js.UndefOr[String] = js.undefined
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
  var babelrc: js.UndefOr[Boolean] = js.undefined
  var babelrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern]] = js.undefined
  var caller: js.UndefOr[TransformCaller] = js.undefined
  /**
    * The code that you want to run through your babel plugin. This must be
    * provided unless you provide a fixture instead. If there's no output or
    * outputFixture and snapshot is not true, then the assertion is that this
    * code is unchanged by the plugin.
    */
  var code: js.UndefOr[String] = js.undefined
  var comments: js.UndefOr[Boolean] = js.undefined
  var compact: js.UndefOr[Boolean | auto] = js.undefined
  var configFile: js.UndefOr[String | Boolean] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
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
  var env: js.UndefOr[StringDictionary[js.UndefOr[TransformOptions | Null]]] = js.undefined
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
  var error: js.UndefOr[Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean])] = js.undefined
  var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  var `extends`: js.UndefOr[String] = js.undefined
  /**
    * Relative paths from the other options will be relative to this. Normally
    * you'll provide this as filename: __filename. The only options property
    * affected by this value is fixtures. Test Object properties affected by
    * this value are: fixture and outputFixture. If those properties are not
    * absolute paths, then they will be path.joined with path.dirname of the
    * filename.
    */
  var filename: js.UndefOr[String] = js.undefined
  var filenameRelative: js.UndefOr[String] = js.undefined
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
  var generatorOpts: js.UndefOr[GeneratorOptions] = js.undefined
  var getModuleId: js.UndefOr[js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]] = js.undefined
  var highlightCode: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  var inputSourceMap: js.UndefOr[js.Object] = js.undefined
  var minified: js.UndefOr[Boolean] = js.undefined
  var moduleId: js.UndefOr[String] = js.undefined
  var moduleIds: js.UndefOr[Boolean] = js.undefined
  var moduleRoot: js.UndefOr[String] = js.undefined
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
  var parserOpts: js.UndefOr[ParserOptions] = js.undefined
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
  var plugin: js.Any
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
  var plugins: js.UndefOr[js.Array[PluginItem]] = js.undefined
  var presets: js.UndefOr[js.Array[PluginItem]] = js.undefined
  var retainLines: js.UndefOr[Boolean] = js.undefined
  var root: js.UndefOr[String] = js.undefined
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
      Unit | (NonNullable[js.Function0[Unit | js.Promise[Unit]]]) | (js.Promise[(NonNullable[js.Function0[Unit | js.Promise[Unit]]]) | Unit])
    ]
  ] = js.undefined
  var shouldPrintComment: js.UndefOr[js.Function1[/* commentContents */ String, Boolean]] = js.undefined
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
  var sourceFileName: js.UndefOr[String] = js.undefined
  var sourceMaps: js.UndefOr[Boolean | `inline` | both] = js.undefined
  var sourceRoot: js.UndefOr[String] = js.undefined
  var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
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
    js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ js.Any, Unit], 
      js.Function2[/* path */ NodePath[Node], /* state */ _, Unit]
    ]
  ] = js.undefined
}

object PluginTesterOptions {
  @scala.inline
  def apply(
    plugin: js.Any,
    ast: js.UndefOr[Boolean] = js.undefined,
    auxiliaryCommentAfter: String = null,
    auxiliaryCommentBefore: String = null,
    babel: BabelType = null,
    babelOptions: TransformOptions = null,
    babelrc: js.UndefOr[Boolean] = js.undefined,
    babelrcRoots: Boolean | MatchPattern | js.Array[MatchPattern] = null,
    caller: TransformCaller = null,
    code: String = null,
    comments: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | auto = null,
    configFile: String | Boolean = null,
    cwd: String = null,
    endOfLine: lf | crlf | auto | preserve = null,
    env: StringDictionary[js.UndefOr[TransformOptions | Null]] = null,
    envName: String = null,
    error: Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean]) = null,
    exclude: MatchPattern | js.Array[MatchPattern] = null,
    `extends`: String = null,
    filename: String = null,
    filenameRelative: String = null,
    fixture: String = null,
    fixtures: String = null,
    formatResult: (/* code */ String, /* options */ Filename) => String = null,
    generatorOpts: GeneratorOptions = null,
    getModuleId: /* moduleName */ String => js.UndefOr[String | Null] = null,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[MatchPattern] = null,
    include: MatchPattern | js.Array[MatchPattern] = null,
    inputSourceMap: js.Object = null,
    minified: js.UndefOr[Boolean] = js.undefined,
    moduleId: String = null,
    moduleIds: js.UndefOr[Boolean] = js.undefined,
    moduleRoot: String = null,
    only: js.UndefOr[Boolean] = js.undefined,
    output: String = null,
    outputFixture: String = null,
    overrides: js.Array[TransformOptions] = null,
    parserOpts: ParserOptions = null,
    pluginName: String = null,
    pluginOptions: PluginOptions = null,
    plugins: js.Array[PluginItem] = null,
    presets: js.Array[PluginItem] = null,
    retainLines: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    rootMode: root | upward | `upward-optional` = null,
    setup: () => Unit | (NonNullable[js.Function0[Unit | js.Promise[Unit]]]) | (js.Promise[(NonNullable[js.Function0[Unit | js.Promise[Unit]]]) | Unit]) = null,
    shouldPrintComment: /* commentContents */ String => Boolean = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    snapshot: js.UndefOr[Boolean] = js.undefined,
    sourceFileName: String = null,
    sourceMaps: Boolean | `inline` | both = null,
    sourceRoot: String = null,
    sourceType: script | module | unambiguous = null,
    teardown: () => Unit | js.Promise[Unit] = null,
    test: MatchPattern | js.Array[MatchPattern] = null,
    tests: (js.Array[TestObject | String]) | (Record[String, TestObject | String]) = null,
    title: String = null,
    wrapPluginVisitorMethod: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ js.Any, Unit]) => js.Function2[/* path */ NodePath[Node], /* state */ _, Unit] = null
  ): PluginTesterOptions = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.get.asInstanceOf[js.Any])
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter.asInstanceOf[js.Any])
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore.asInstanceOf[js.Any])
    if (babel != null) __obj.updateDynamic("babel")(babel.asInstanceOf[js.Any])
    if (babelOptions != null) __obj.updateDynamic("babelOptions")(babelOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(babelrc)) __obj.updateDynamic("babelrc")(babelrc.get.asInstanceOf[js.Any])
    if (babelrcRoots != null) __obj.updateDynamic("babelrcRoots")(babelrcRoots.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.get.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (endOfLine != null) __obj.updateDynamic("endOfLine")(endOfLine.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envName != null) __obj.updateDynamic("envName")(envName.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative.asInstanceOf[js.Any])
    if (fixture != null) __obj.updateDynamic("fixture")(fixture.asInstanceOf[js.Any])
    if (fixtures != null) __obj.updateDynamic("fixtures")(fixtures.asInstanceOf[js.Any])
    if (formatResult != null) __obj.updateDynamic("formatResult")(js.Any.fromFunction2(formatResult))
    if (generatorOpts != null) __obj.updateDynamic("generatorOpts")(generatorOpts.asInstanceOf[js.Any])
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(js.Any.fromFunction1(getModuleId))
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(minified)) __obj.updateDynamic("minified")(minified.get.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleIds)) __obj.updateDynamic("moduleIds")(moduleIds.get.asInstanceOf[js.Any])
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (outputFixture != null) __obj.updateDynamic("outputFixture")(outputFixture.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (parserOpts != null) __obj.updateDynamic("parserOpts")(parserOpts.asInstanceOf[js.Any])
    if (pluginName != null) __obj.updateDynamic("pluginName")(pluginName.asInstanceOf[js.Any])
    if (pluginOptions != null) __obj.updateDynamic("pluginOptions")(pluginOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootMode != null) __obj.updateDynamic("rootMode")(rootMode.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction0(setup))
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(js.Any.fromFunction1(shouldPrintComment))
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.get.asInstanceOf[js.Any])
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName.asInstanceOf[js.Any])
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction0(teardown))
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (tests != null) __obj.updateDynamic("tests")(tests.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapPluginVisitorMethod != null) __obj.updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3(wrapPluginVisitorMethod))
    __obj.asInstanceOf[PluginTesterOptions]
  }
}

