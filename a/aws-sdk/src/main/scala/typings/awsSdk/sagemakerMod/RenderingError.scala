package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingError extends js.Object {
  /**
    * A unique identifier for a specific class of errors.
    */
  var Code: String = js.native
  /**
    * A human-readable message describing the error.
    */
  var Message: String = js.native
}

object RenderingError {
  @scala.inline
  def apply(Code: String, Message: String): RenderingError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderingError]
  }
}

