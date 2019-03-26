package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  def apply(regexp: java.lang.String, message: java.lang.String): Assertion = js.native
  def apply(regexp: stdLib.RegExp): Assertion = js.native
  def apply(regexp: stdLib.RegExp, message: java.lang.String): Assertion = js.native
  def apply(selector: java.lang.String): Assertion = js.native
}

