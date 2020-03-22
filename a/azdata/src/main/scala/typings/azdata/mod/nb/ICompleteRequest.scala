package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompleteRequest extends js.Object {
  var code: String
  var cursor_pos: Double
}

object ICompleteRequest {
  @scala.inline
  def apply(code: String, cursor_pos: Double): ICompleteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICompleteRequest]
  }
}

