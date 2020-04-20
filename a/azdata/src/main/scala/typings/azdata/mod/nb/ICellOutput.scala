package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellOutput extends js.Object {
  var output_type: OutputTypeName
}

object ICellOutput {
  @scala.inline
  def apply(output_type: OutputTypeName): ICellOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellOutput]
  }
}

