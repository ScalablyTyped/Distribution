package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputOutputAnonAllowIncomplete extends js.Object {
  var input: Anon_AllowIncomplete
  var output: Anon_Check
}

object Anon_InputOutputAnonAllowIncomplete {
  @scala.inline
  def apply(input: Anon_AllowIncomplete, output: Anon_Check): Anon_InputOutputAnonAllowIncomplete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Anon_InputOutputAnonAllowIncomplete]
  }
}

