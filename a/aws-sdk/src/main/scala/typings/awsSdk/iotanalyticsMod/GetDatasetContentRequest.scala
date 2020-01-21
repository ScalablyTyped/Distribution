package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDatasetContentRequest extends js.Object {
  /**
    * The name of the data set whose contents are retrieved.
    */
  var datasetName: DatasetName = js.native
  /**
    * The version of the data set whose contents are retrieved. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to retrieve the contents of the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.native
}

object GetDatasetContentRequest {
  @scala.inline
  def apply(datasetName: DatasetName, versionId: DatasetContentVersion = null): GetDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatasetContentRequest]
  }
}

