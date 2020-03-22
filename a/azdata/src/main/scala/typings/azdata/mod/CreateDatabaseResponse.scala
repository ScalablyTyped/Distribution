package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatabaseResponse extends js.Object {
  var result: Boolean
  var taskId: Double
}

object CreateDatabaseResponse {
  @scala.inline
  def apply(result: Boolean, taskId: Double): CreateDatabaseResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDatabaseResponse]
  }
}

