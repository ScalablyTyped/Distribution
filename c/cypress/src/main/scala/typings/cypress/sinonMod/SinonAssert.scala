package typings.cypress.sinonMod

import typings.cypress.anon.PartialSinonExposeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonAssert extends js.Object {
  // Properties
  /**
    * Defaults to AssertError.
    */
  var failException: String = js.native
  /**
    * Passes if spy was always called with obj as its this value.
    */
  def alwaysCalledOn(spy: SinonSpy, obj: js.Any): Unit = js.native
  /**
    * Passes if spy was always called with the provided arguments.
    * @param spy
    * @param args
    */
  def alwaysCalledWith(spy: SinonSpy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was always called with the provided arguments and no others.
    */
  def alwaysCalledWithExactly(spy: SinonSpy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was always called with matching arguments.
    * This behaves the same way as sinon.assert.alwaysCalledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
    */
  def alwaysCalledWithMatch(spy: SinonSpy, args: js.Any*): Unit = js.native
  /**
    * Like threw, only required for all calls to the spy.
    */
  def alwaysThrew(spy: SinonSpy): Unit = js.native
  /**
    * Like threw, only required for all calls to the spy.
    */
  def alwaysThrew(spy: SinonSpy, exception: String): Unit = js.native
  /**
    * Like threw, only required for all calls to the spy.
    */
  def alwaysThrew(spy: SinonSpy, exception: js.Any): Unit = js.native
  /**
    * Passes if spy was called exactly num times.
    */
  def callCount(spy: SinonSpy, count: Double): Unit = js.native
  /**
    * Passes if provided spies were called in the specified order.
    * @param spies
    */
  def callOrder(spies: SinonSpy*): Unit = js.native
  /**
    * Passes if spy was called at least once.
    */
  def called(spy: SinonSpy): Unit = js.native
  def calledOn(spyOrSpyCall: SinonSpyCall, obj: js.Any): Unit = js.native
  /**
    * Passes if spy was ever called with obj as its this value.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledOn(spy.firstCall, arg1, arg2, ...);.
    */
  def calledOn(spyOrSpyCall: SinonSpy, obj: js.Any): Unit = js.native
  /**
    * Passes if spy was called once and only once.
    */
  def calledOnce(spy: SinonSpy): Unit = js.native
  def calledOnceWithExactly(spyOrSpyCall: SinonSpyCall, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called at exactly once with the provided arguments and no others.
    * @param spyOrSpyCall
    * @param args
    */
  def calledOnceWithExactly(spyOrSpyCall: SinonSpy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called exactly three times.
    */
  def calledThrice(spy: SinonSpy): Unit = js.native
  /**
    * Passes if spy was called exactly twice.
    */
  def calledTwice(spy: SinonSpy): Unit = js.native
  def calledWith(spyOrSpyCall: SinonSpyCall, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called with the provided arguments.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWith(spy.firstCall, arg1, arg2, ...);.
    * @param spyOrSpyCall
    * @param args
    */
  def calledWith(spyOrSpyCall: SinonSpy, args: js.Any*): Unit = js.native
  def calledWithExactly(spyOrSpyCall: SinonSpyCall, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called with the provided arguments and no others.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithExactly(spy.getCall(1), arg1, arg2, ...);.
    * @param spyOrSpyCall
    * @param args
    */
  def calledWithExactly(spyOrSpyCall: SinonSpy, args: js.Any*): Unit = js.native
  def calledWithMatch(spyOrSpyCall: SinonSpyCall, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called with matching arguments.
    * This behaves the same way as sinon.assert.calledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithMatch(spy.secondCall, arg1, arg2, ...);.
    */
  def calledWithMatch(spyOrSpyCall: SinonSpy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was called with the new operator.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithNew(spy.secondCall, arg1, arg2, ...);.
    * @param spyOrSpyCall
    */
  def calledWithNew(spyOrSpyCall: SinonSpy): Unit = js.native
  def calledWithNew(spyOrSpyCall: SinonSpyCall): Unit = js.native
  /**
    * Exposes assertions into another object, to better integrate with the test framework.
    * For instance, JsTestDriver uses global assertions, and to make Sinon.JS assertions appear alongside them, you can do.
    * @example sinon.assert.expose(this);
    * This will give you assertCalled(spy),assertCallOrder(spy1, spy2, ...) and so on.
    * The method accepts an optional options object with two options.
    */
  def expose(obj: js.Any): Unit = js.native
  def expose(obj: js.Any, options: PartialSinonExposeOptions): Unit = js.native
  /**
    * Every assertion fails by calling this method.
    * By default it throws an error of type sinon.assert.failException.
    * If the test framework looks for assertion errors by checking for a specific exception, you can simply override the kind of exception thrown.
    * If that does not fit with your testing framework of choice, override the fail method to do the right thing.
    */
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  /**
    * Uses sinon.match to test if the arguments can be considered a match.
    */
  def `match`(actual: js.Any, expected: js.Any): Unit = js.native
  /**
    * Passes if spy was never called with the provided arguments.
    * @param spy
    * @param args
    */
  def neverCalledWith(spy: SinonSpy, args: js.Any*): Unit = js.native
  /**
    * Passes if spy was never called with matching arguments.
    * This behaves the same way as sinon.assert.neverCalledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
    * @param spy
    * @param args
    */
  def neverCalledWithMatch(spy: SinonSpy, args: js.Any*): Unit = js.native
   // Overridable
  // Methods
  /**
    * Passes if spy was never called
    * @param spy
    */
  def notCalled(spy: SinonSpy): Unit = js.native
   // Overridable
  /**
    * Called every time assertion passes.
    * Default implementation does nothing.
    */
  def pass(assertion: js.Any): Unit = js.native
  /**
    * Passes if spy threw any exception.
    */
  def threw(spyOrSpyCall: SinonSpy): Unit = js.native
  def threw(spyOrSpyCall: SinonSpyCall): Unit = js.native
  def threw(spyOrSpyCall: SinonSpyCall, exception: String): Unit = js.native
  def threw(spyOrSpyCall: SinonSpyCall, exception: js.Any): Unit = js.native
  /**
    * Passes if spy threw the given exception.
    * The exception is an actual object.
    * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
    */
  def threw(spyOrSpyCall: SinonSpy, exception: String): Unit = js.native
  /**
    * Passes if spy threw the given exception.
    * The exception is a String denoting its type.
    * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
    */
  def threw(spyOrSpyCall: SinonSpy, exception: js.Any): Unit = js.native
}

