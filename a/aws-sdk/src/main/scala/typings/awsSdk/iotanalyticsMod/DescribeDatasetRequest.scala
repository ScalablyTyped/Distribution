package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetRequest extends js.Object {
  /**
    * The name of the data set whose information is retrieved.
    */
  var datasetName: DatasetName = js.native
}

object DescribeDatasetRequest {
  @scala.inline
  def apply(datasetName: DatasetName): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
}

