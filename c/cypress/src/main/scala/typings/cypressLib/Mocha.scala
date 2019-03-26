package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha")
@js.native
class Mocha () extends js.Object {
  def this(options: Anon_Bail) = this()
  @JSName("currentTest")
  var currentTest_Original: cypressLib.MochaNs.ITestDefinition = js.native
  def addFile(file: java.lang.String): Mocha = js.native
  def asyncOnly(value: scala.Boolean): Mocha = js.native
  def bail(): Mocha = js.native
  def bail(value: scala.Boolean): Mocha = js.native
  def checkLeaks(): Mocha = js.native
  def currentTest(expectation: java.lang.String): cypressLib.MochaNs.ITest = js.native
  def currentTest(
    expectation: java.lang.String,
    callback: js.ThisFunction1[/* this */ cypressLib.MochaNs.ITestCallbackContext, /* done */ MochaDone, _]
  ): cypressLib.MochaNs.ITest = js.native
  def enableTimeouts(value: scala.Boolean): Mocha = js.native
  def globals(value: java.lang.String): Mocha = js.native
  def globals(values: js.Array[java.lang.String]): Mocha = js.native
  def grep(value: java.lang.String): Mocha = js.native
  def grep(value: stdLib.RegExp): Mocha = js.native
  /** Enables growl support. */
  def growl(): Mocha = js.native
  def ignoreLeaks(value: scala.Boolean): Mocha = js.native
  def invert(): Mocha = js.native
  def noHighlighting(value: scala.Boolean): Mocha = js.native
  /** Sets reporter by name, defaults to "spec". */
  def reporter(name: java.lang.String): Mocha = js.native
  /** Sets reporter constructor, defaults to mocha.reporters.Spec. */
  def reporter(reporter: ReporterConstructor): Mocha = js.native
  /** Runs tests and invokes `onComplete()` when finished. */
  def run(): cypressLib.MochaNs.IRunner = js.native
  def run(onComplete: js.Function1[/* failures */ scala.Double, scala.Unit]): cypressLib.MochaNs.IRunner = js.native
  /** Setup mocha with the given options. */
  def setup(options: MochaSetupOptions): Mocha = js.native
  def slow(value: scala.Double): Mocha = js.native
  /**
    * Function to allow assertion libraries to throw errors directly into mocha.
    * This is useful when running tests in a browser because window.onerror will
    * only receive the 'message' attribute of the Error.
    */
  def throwError(error: stdLib.Error): scala.Unit = js.native
  def timeout(value: scala.Double): Mocha = js.native
  def ui(value: java.lang.String): Mocha = js.native
  def useColors(value: scala.Boolean): Mocha = js.native
  def useInlineDiffs(value: scala.Boolean): Mocha = js.native
}

