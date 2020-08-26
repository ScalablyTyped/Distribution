package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoMLJobResponse extends js.Object {
  /**
    * When a job is created, it is assigned a unique ARN.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn = js.native
}

object CreateAutoMLJobResponse {
  @scala.inline
  def apply(AutoMLJobArn: AutoMLJobArn): CreateAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobResponse]
  }
  @scala.inline
  implicit class CreateAutoMLJobResponseOps[Self <: CreateAutoMLJobResponse] (val x: Self) extends AnyVal {
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
    def setAutoMLJobArn(value: AutoMLJobArn): Self = this.set("AutoMLJobArn", value.asInstanceOf[js.Any])
  }
  
}

