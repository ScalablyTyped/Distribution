package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBrowserValidatedParams extends js.Object {
  var message: String
  var succeeded: Boolean
}

object FileBrowserValidatedParams {
  @scala.inline
  def apply(message: String, succeeded: Boolean): FileBrowserValidatedParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserValidatedParams]
  }
}

