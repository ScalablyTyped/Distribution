package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphResponse extends js.Object {
  /**
    * The ARN of the new behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.detectiveMod.GraphArn] = js.native
}

object CreateGraphResponse {
  @scala.inline
  def apply(): CreateGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphResponse]
  }
  @scala.inline
  implicit class CreateGraphResponseOps[Self <: CreateGraphResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteGraphArn: Self = this.set("GraphArn", js.undefined)
  }
  
}

