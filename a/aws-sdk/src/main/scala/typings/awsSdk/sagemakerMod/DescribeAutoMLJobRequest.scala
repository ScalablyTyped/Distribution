package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutoMLJobRequest extends js.Object {
  /**
    * Request information about a job using that job's unique name.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
}

object DescribeAutoMLJobRequest {
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): DescribeAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutoMLJobRequest]
  }
  @scala.inline
  implicit class DescribeAutoMLJobRequestOps[Self <: DescribeAutoMLJobRequest] (val x: Self) extends AnyVal {
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
    def setAutoMLJobName(value: AutoMLJobName): Self = this.set("AutoMLJobName", value.asInstanceOf[js.Any])
  }
  
}

