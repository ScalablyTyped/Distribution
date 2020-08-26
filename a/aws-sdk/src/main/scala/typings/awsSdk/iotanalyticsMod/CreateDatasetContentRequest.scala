package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetContentRequest extends js.Object {
  /**
    * The name of the data set.
    */
  var datasetName: DatasetName = js.native
}

object CreateDatasetContentRequest {
  @scala.inline
  def apply(datasetName: DatasetName): CreateDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetContentRequest]
  }
  @scala.inline
  implicit class CreateDatasetContentRequestOps[Self <: CreateDatasetContentRequest] (val x: Self) extends AnyVal {
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
    def setDatasetName(value: DatasetName): Self = this.set("datasetName", value.asInstanceOf[js.Any])
  }
  
}

