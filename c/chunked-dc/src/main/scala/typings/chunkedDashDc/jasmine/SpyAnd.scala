package typings.chunkedDashDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyAnd extends js.Object {
  /** By chaining the spy with and.callFake, all calls to the spy will delegate to the supplied function. */
  def callFake(fn: js.Function): Spy
  /** By chaining the spy with and.callThrough, the spy will still track all calls to it but in addition it will delegate to the actual implementation. */
  def callThrough(): Spy
  /** By chaining the spy with and.returnValue, all calls to the function will return a specific value. */
  def returnValue(`val`: js.Any): Spy
  /** By chaining the spy with and.returnValues, all calls to the function will return specific values in order until it reaches the end of the return values list. */
  def returnValues(values: js.Any*): Spy
  /** When a calling strategy is used for a spy, the original stubbing behavior can be returned at any time with and.stub. */
  def stub(): Spy
  /** By chaining the spy with and.throwError, all calls to the spy will throw the specified value. */
  def throwError(msg: String): Spy
}

object SpyAnd {
  @scala.inline
  def apply(
    callFake: js.Function => Spy,
    callThrough: () => Spy,
    returnValue: js.Any => Spy,
    returnValues: /* repeated */ js.Any => Spy,
    stub: () => Spy,
    throwError: String => Spy
  ): SpyAnd = {
    val __obj = js.Dynamic.literal(callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), returnValue = js.Any.fromFunction1(returnValue), returnValues = js.Any.fromFunction1(returnValues), stub = js.Any.fromFunction0(stub), throwError = js.Any.fromFunction1(throwError))
  
    __obj.asInstanceOf[SpyAnd]
  }
}

