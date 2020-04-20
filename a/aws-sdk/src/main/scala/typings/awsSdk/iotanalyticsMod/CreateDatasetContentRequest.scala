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
}

