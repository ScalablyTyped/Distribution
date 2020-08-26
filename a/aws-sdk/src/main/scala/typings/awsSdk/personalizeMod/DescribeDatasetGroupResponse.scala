package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetGroupResponse extends js.Object {
  /**
    * A listing of the dataset group's properties.
    */
  var datasetGroup: js.UndefOr[DatasetGroup] = js.native
}

object DescribeDatasetGroupResponse {
  @scala.inline
  def apply(): DescribeDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetGroupResponse]
  }
  @scala.inline
  implicit class DescribeDatasetGroupResponseOps[Self <: DescribeDatasetGroupResponse] (val x: Self) extends AnyVal {
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
    def setDatasetGroup(value: DatasetGroup): Self = this.set("datasetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroup: Self = this.set("datasetGroup", js.undefined)
  }
  
}

