package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetResponse extends js.Object {
  /**
    * The ARN of the dataset.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetResponse {
  @scala.inline
  def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  @scala.inline
  implicit class CreateDatasetResponseOps[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
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
    def setDatasetArn(value: Arn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArn: Self = this.set("datasetArn", js.undefined)
  }
  
}

