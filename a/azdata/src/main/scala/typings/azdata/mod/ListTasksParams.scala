package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTasksParams extends js.Object {
  var listActiveTasksOnly: Boolean
}

object ListTasksParams {
  @scala.inline
  def apply(listActiveTasksOnly: Boolean): ListTasksParams = {
    val __obj = js.Dynamic.literal(listActiveTasksOnly = listActiveTasksOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTasksParams]
  }
}

