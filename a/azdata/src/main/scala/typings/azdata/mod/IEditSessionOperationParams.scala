package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditSessionOperationParams extends js.Object {
  var ownerUri: String
}

object IEditSessionOperationParams {
  @scala.inline
  def apply(ownerUri: String): IEditSessionOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditSessionOperationParams]
  }
}

