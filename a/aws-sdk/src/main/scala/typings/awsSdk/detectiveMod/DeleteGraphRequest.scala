package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGraphRequest extends js.Object {
  /**
    * The ARN of the behavior graph to disable.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}

object DeleteGraphRequest {
  @scala.inline
  def apply(GraphArn: GraphArn): DeleteGraphRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGraphRequest]
  }
  @scala.inline
  implicit class DeleteGraphRequestOps[Self <: DeleteGraphRequest] (val x: Self) extends AnyVal {
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
    def setGraphArn(value: GraphArn): Self = this.set("GraphArn", value.asInstanceOf[js.Any])
  }
  
}

