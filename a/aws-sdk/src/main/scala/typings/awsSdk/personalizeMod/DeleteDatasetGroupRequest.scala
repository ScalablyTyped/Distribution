package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetGroupRequest extends js.Object {
  /**
    * The ARN of the dataset group to delete.
    */
  var datasetGroupArn: Arn = js.native
}

object DeleteDatasetGroupRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
  @scala.inline
  implicit class DeleteDatasetGroupRequestOps[Self <: DeleteDatasetGroupRequest] (val x: Self) extends AnyVal {
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

