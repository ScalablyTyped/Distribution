package typings.babelPluginTester.mod

import typings.babelCore.mod.TransformOptions
import typings.babelPluginTester.anon.Filename
import typings.std.Error
import typings.std.NonNullable
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestObject extends js.Object {
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
  var error: js.UndefOr[Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean])] = js.undefined
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
  @scala.inline
  def apply(
    babelOptions: TransformOptions = null,
    code: String = null,
    error: Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean]) = null,
    fixture: String = null,
    formatResult: (/* code */ String, /* options */ Filename) => String = null,
    only: js.UndefOr[Boolean] = js.undefined,
    output: String = null,
    outputFixture: String = null,
    setup: () => Unit | (NonNullable[js.Function0[Unit | js.Promise[Unit]]]) | (js.Promise[(NonNullable[js.Function0[Unit | js.Promise[Unit]]]) | Unit]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    snapshot: js.UndefOr[Boolean] = js.undefined,
    teardown: () => Unit | js.Promise[Unit] = null,
    title: String = null
  ): TestObject = {
    val __obj = js.Dynamic.literal()
    if (babelOptions != null) __obj.updateDynamic("babelOptions")(babelOptions.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fixture != null) __obj.updateDynamic("fixture")(fixture.asInstanceOf[js.Any])
    if (formatResult != null) __obj.updateDynamic("formatResult")(js.Any.fromFunction2(formatResult))
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (outputFixture != null) __obj.updateDynamic("outputFixture")(outputFixture.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction0(setup))
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.get.asInstanceOf[js.Any])
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction0(teardown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestObject]
  }
}

