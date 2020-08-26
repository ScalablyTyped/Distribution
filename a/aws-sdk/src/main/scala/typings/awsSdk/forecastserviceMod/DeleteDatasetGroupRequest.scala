package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to delete.
    */
  var DatasetGroupArn: Arn = js.native
}

object DeleteDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
  @scala.inline
  implicit class DeleteDatasetGroupRequestOps[Self <: DeleteDatasetGroupRequest] (val x: Self) extends AnyVal {
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
    def setDatasetGroupArn(value: Arn): Self = this.set("DatasetGroupArn", value.asInstanceOf[js.Any])
  }
  
}

