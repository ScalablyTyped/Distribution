package typings
package cypressLib.typesSinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonMock extends js.Object {
  /**
    * Overrides obj.method with a mock function and returns it.
    */
  def expects(method: java.lang.String): SinonExpectation
  /**
    * Restores all mocked methods.
    */
  def restore(): scala.Unit
  /**
    * Verifies all expectations on the mock.
    * If any expectation is not satisfied, an exception is thrown.
    * Also restores the mocked methods.
    */
  def verify(): scala.Unit
}

object SinonMock {
  @scala.inline
  def apply(expects: java.lang.String => SinonExpectation, restore: () => scala.Unit, verify: () => scala.Unit): SinonMock = {
    val __obj = js.Dynamic.literal(expects = js.Any.fromFunction1(expects), restore = js.Any.fromFunction0(restore), verify = js.Any.fromFunction0(verify))
  
    __obj.asInstanceOf[SinonMock]
  }
}

