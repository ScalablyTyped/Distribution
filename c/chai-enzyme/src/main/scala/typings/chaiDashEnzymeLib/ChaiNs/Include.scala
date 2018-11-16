package typings
package chaiDashEnzymeLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Include extends js.Object {
  /**
           * Assert that the wrapper contains a given node:
           * @param code
           */
  def apply(selector: EnzymeSelector): Assertion = js.native
  /**
           * Assert that the given wrapper has the supplied text:
           * @param str
           */
  def text(): Assertion = js.native
  /**
           * Assert that the given wrapper has the supplied text:
           * @param str
           */
  def text(str: java.lang.String): Assertion = js.native
}

