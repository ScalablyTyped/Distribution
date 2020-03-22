package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBrowserCloseResponse extends js.Object {
  var message: String
  var succeeded: Boolean
}

object FileBrowserCloseResponse {
  @scala.inline
  def apply(message: String, succeeded: Boolean): FileBrowserCloseResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileBrowserCloseResponse]
  }
}

