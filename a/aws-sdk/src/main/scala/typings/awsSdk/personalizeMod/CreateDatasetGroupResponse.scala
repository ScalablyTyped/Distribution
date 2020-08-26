package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetGroupResponse {
  @scala.inline
  def apply(): CreateDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetGroupResponse]
  }
  @scala.inline
  implicit class CreateDatasetGroupResponseOps[Self <: CreateDatasetGroupResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("datasetGroupArn", js.undefined)
  }
  
}

