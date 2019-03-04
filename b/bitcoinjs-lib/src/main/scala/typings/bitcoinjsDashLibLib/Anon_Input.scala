package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  var input: Anon_AllowIncomplete
  var output: Anon_AllowIncomplete
}

object Anon_Input {
  @scala.inline
  def apply(input: Anon_AllowIncomplete, output: Anon_AllowIncomplete): Anon_Input = {
    val __obj = js.Dynamic.literal(input = input, output = output)
  
    __obj.asInstanceOf[Anon_Input]
  }
}

