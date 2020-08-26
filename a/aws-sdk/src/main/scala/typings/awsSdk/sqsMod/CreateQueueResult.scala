package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQueueResult extends js.Object {
  /**
    * The URL of the created Amazon SQS queue.
    */
  var QueueUrl: js.UndefOr[String] = js.native
}

object CreateQueueResult {
  @scala.inline
  def apply(): CreateQueueResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueResult]
  }
  @scala.inline
  implicit class CreateQueueResultOps[Self <: CreateQueueResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueUrl: Self = this.set("QueueUrl", js.undefined)
  }
  
}

