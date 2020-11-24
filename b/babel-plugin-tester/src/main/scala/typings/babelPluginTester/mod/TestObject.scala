package typings.babelPluginTester.mod

import typings.babelCore.mod.TransformOptions
import typings.babelPluginTester.anon.Filename
import typings.std.Error
import typings.std.NonNullable
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var babelOptions: js.UndefOr[TransformOptions] = js.native
  
  /**
    * The code that you want to run through your babel plugin. This must be
    * provided unless you provide a fixture instead. If there's no output or
    * outputFixture and snapshot is not true, then the assertion is that this
    * code is unchanged by the plugin.
    */
  var code: js.UndefOr[String] = js.native
  
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
  
  /**
    * If you'd rather put your code in a separate file, you can specify a
    * filename here. If it's an absolute path, that's the file that will be
    * loaded, otherwise, this will be path.joined with the filename path.
    */
  var fixture: js.UndefOr[String] = js.native
  
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
  
  /**
    * If you set up some state, it's quite possible you want to tear it down.
    * You can either define this as its own property, or you can return it from
    * the setup function. This can likewise return a promise if it's
    * asynchronous.
    */
  var teardown: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
  
  /**
    * If provided, this will be used instead of the pluginName. If you're using
    * the object API, then the key of this object will be the title (see
    * example below).
    */
  var title: js.UndefOr[String] = js.native
}
object TestObject {
  
  @scala.inline
  def apply(): TestObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestObject]
  }
  
  @scala.inline
  implicit class TestObjectOps[Self <: TestObject] (val x: Self) extends AnyVal {
    
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
    def setBabelOptions(value: TransformOptions): Self = this.set("babelOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelOptions: Self = this.set("babelOptions", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setErrorFunction1(value: /* error */ js.Any => Boolean): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: Boolean | String | RegExp | Error | (js.Function1[/* error */ js.Any, Boolean])): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFixture(value: String): Self = this.set("fixture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixture: Self = this.set("fixture", js.undefined)
    
    @scala.inline
    def setFormatResult(value: (/* code */ String, /* options */ Filename) => String): Self = this.set("formatResult", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatResult: Self = this.set("formatResult", js.undefined)
    
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
    def setSetup(
      value: () => Unit | (NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | (js.Promise[(NonNullable[js.UndefOr[js.Function0[Unit | js.Promise[Unit]]]]) | Unit])
    ): Self = this.set("setup", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSnapshot(value: Boolean): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    
    @scala.inline
    def setTeardown(value: () => Unit | js.Promise[Unit]): Self = this.set("teardown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
