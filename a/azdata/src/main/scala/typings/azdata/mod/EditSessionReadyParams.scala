package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSessionReadyParams extends js.Object {
  var message: String
  var ownerUri: String
  var success: Boolean
}

object EditSessionReadyParams {
  @scala.inline
  def apply(message: String, ownerUri: String, success: Boolean): EditSessionReadyParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSessionReadyParams]
  }
}

