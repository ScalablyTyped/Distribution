package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputOutput extends js.Object {
  var input: Anon_Check
  var output: Anon_Check
}

object Anon_InputOutput {
  @scala.inline
  def apply(input: Anon_Check, output: Anon_Check): Anon_InputOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Anon_InputOutput]
  }
}

