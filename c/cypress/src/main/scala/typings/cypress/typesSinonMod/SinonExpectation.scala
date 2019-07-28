package typings.cypress.typesSinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonExpectation extends SinonStub {
  /**
    * Specify the minimum amount of calls expected.
    */
  def atLeast(n: Double): SinonExpectation = js.native
  /**
    * Specify the maximum amount of calls expected.
    * @param n
    */
  def atMost(n: Double): SinonExpectation = js.native
  /**
    * Expect the method to be called exactly @param n times.
    */
  def exactly(n: Double): SinonExpectation = js.native
  /**
    * Expect the method to never be called.
    */
  def never(): SinonExpectation = js.native
  def on(obj: js.Any): SinonExpectation = js.native
  /**
    * Expect the method to be called exactly once.
    */
  def once(): SinonExpectation = js.native
  /**
    * Expect the method to be called exactly thrice.
    */
  def thrice(): SinonExpectation = js.native
  /**
    * Expect the method to be called exactly twice.
    */
  def twice(): SinonExpectation = js.native
  /**
    * Verifies all expectations on the mock.
    * If any expectation is not satisfied, an exception is thrown.
    * Also restores the mocked methods.
    */
  def verify(): SinonExpectation = js.native
  /**
    * Expect the method to be called with the provided arguments and no others.
    * An expectation instance only holds onto a single set of arguments specified with withExactArgs.
    * Subsequent calls will overwrite the previously-specified set of arguments (even if they are different),
    * so it is generally not intended that this method be invoked more than once per test case.
    * @param args
    */
  def withExactArgs(args: js.Any*): SinonExpectation = js.native
}

