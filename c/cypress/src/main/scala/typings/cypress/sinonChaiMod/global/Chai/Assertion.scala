package typings.cypress.sinonChaiMod.global.Chai

import org.scalablytyped.runtime.Instantiable0
import typings.cypress.sinonMod.SinonSpy
import typings.std.ErrorConstructor
import typings.std.global.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends js.Object {
  /**
    * true if the spy was called at least once.
    */
  var called: Assertion = js.native
  /**
    * true if the spy was called exactly once.
    */
  var calledOnce: Assertion = js.native
  /**
    * true if the spy was called exactly thrice.
    */
  var calledThrice: Assertion = js.native
  /**
    * true if the spy was called exactly twice.
    */
  var calledTwice: Assertion = js.native
  /**
    * Returns true if spy/stub was called with the new operator. Beware that
    * this is inferred based on the value of the this object and the spy
    * function's prototype, so it may give false positives if you actively
    * return the right kind of object.
    */
  var calledWithNew: Assertion = js.native
  /**
    * @param count The number of recorded calls.
    */
  def callCount(count: Double): Assertion = js.native
  /**
    * Returns true if the spy was called after anotherSpy.
    */
  def calledAfter(anotherSpy: SinonSpy): Assertion = js.native
  /**
    * Returns true if the spy was called before anotherSpy.
    */
  def calledBefore(anotherSpy: SinonSpy): Assertion = js.native
  /**
    * Returns true if spy was called after anotherSpy, and no spy calls occurred
    * between anotherSpy and spy.
    */
  def calledImmediatelyAfter(anotherSpy: SinonSpy): Assertion = js.native
  /**
    * Returns true if spy was called before anotherSpy, and no spy calls occurred
    * between spy and anotherSpy.
    */
  def calledImmediatelyBefore(anotherSpy: SinonSpy): Assertion = js.native
  /**
    * Returns true if context was this for this call.
    */
  def calledOn(context: js.Any): Assertion = js.native
  /**
    * Returns true if spy was called at exactly once with the provided arguments.
    */
  def calledOnceWith(args: js.Any*): Assertion = js.native
  /**
    * Returns true if spy was called exactly once with the provided arguments and no others.
    */
  def calledOnceWithExactly(args: js.Any*): Assertion = js.native
  /**
    * Returns true if call received provided arguments (and possibly others).
    */
  def calledWith(args: js.Any*): Assertion = js.native
  /**
    * Returns true if call received provided arguments and no others.
    */
  def calledWithExactly(args: js.Any*): Assertion = js.native
  /**
    * Returns true if call received matching arguments (and possibly others).
    * This behaves the same as spyCall.calledWith(sinon.match(arg1), sinon.match(arg2), ...).
    */
  def calledWithMatch(args: js.Any*): Assertion = js.native
  /**
    * Returns true if spy returned the provided value at least once. Uses
    * deep comparison for objects and arrays. Use spy.returned(sinon.match.same(obj))
    * for strict comparison (see matchers).
    */
  def returned(obj: js.Any): Assertion = js.native
  /**
    * Returns true if spy threw the provided exception object at least once.
    */
  def thrown(): Assertion = js.native
  def thrown(obj: ErrorConstructor with Instantiable0[Error]): Assertion = js.native
  def thrown(obj: String): Assertion = js.native
  def thrown(obj: typings.std.Error): Assertion = js.native
}

