package typings
package cypressLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldThrow extends js.Object {
  def apply(actual: js.Function): scala.Unit = js.native
  def apply(actual: js.Function, constructor: js.Function): scala.Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: java.lang.String): scala.Unit = js.native
  def apply(
    actual: js.Function,
    constructor: js.Function,
    expected: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: stdLib.RegExp): scala.Unit = js.native
  def apply(actual: js.Function, constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def apply(actual: js.Function, constructor: stdLib.Error): scala.Unit = js.native
  def apply(actual: js.Function, constructor: stdLib.Error, expected: java.lang.String): scala.Unit = js.native
  def apply(
    actual: js.Function,
    constructor: stdLib.Error,
    expected: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  def apply(actual: js.Function, constructor: stdLib.Error, expected: stdLib.RegExp): scala.Unit = js.native
  def apply(actual: js.Function, constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def apply(actual: js.Function, expected: java.lang.String): scala.Unit = js.native
  def apply(actual: js.Function, expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def apply(actual: js.Function, expected: stdLib.RegExp): scala.Unit = js.native
  def apply(actual: js.Function, expected: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
}

