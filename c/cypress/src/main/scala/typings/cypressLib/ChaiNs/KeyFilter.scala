package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyFilter extends js.Object {
  @JSName("keys")
  var keys_Original: Keys = js.native
  def keys(keys: java.lang.String*): Assertion = js.native
  def keys(keys: cypressLib.Object): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
}

