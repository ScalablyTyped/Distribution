package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to describe.
    */
  var datasetGroupArn: Arn = js.native
}

object DescribeDatasetGroupRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn): DescribeDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetGroupRequest]
  }
  @scala.inline
  implicit class DescribeDatasetGroupRequestOps[Self <: DescribeDatasetGroupRequest] (val x: Self) extends AnyVal {
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
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
  }
  
}

