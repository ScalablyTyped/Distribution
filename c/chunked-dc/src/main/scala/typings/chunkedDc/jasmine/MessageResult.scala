package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResult extends Result {
  var trace: Trace
  var values: js.Any
}

object MessageResult {
  @scala.inline
  def apply(trace: Trace, `type`: String, values: js.Any): MessageResult = {
    val __obj = js.Dynamic.literal(trace = trace.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResult]
  }
}

