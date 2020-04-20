package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleExecuteParams extends js.Object {
  var ownerUri: String
  var queryString: String
}

object SimpleExecuteParams {
  @scala.inline
  def apply(ownerUri: String, queryString: String): SimpleExecuteParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExecuteParams]
  }
}

