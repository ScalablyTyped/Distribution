package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatabaseResponse extends js.Object {
  var result: Boolean = js.native
  var taskId: Double = js.native
}

object CreateDatabaseResponse {
  @scala.inline
  def apply(result: Boolean, taskId: Double): CreateDatabaseResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatabaseResponse]
  }
  @scala.inline
  implicit class CreateDatabaseResponseOps[Self <: CreateDatabaseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskId(value: Double): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
  
}

