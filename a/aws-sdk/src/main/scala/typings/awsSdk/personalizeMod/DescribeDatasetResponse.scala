package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetResponse extends js.Object {
  /**
    * A listing of the dataset's properties.
    */
  var dataset: js.UndefOr[Dataset] = js.native
}

object DescribeDatasetResponse {
  @scala.inline
  def apply(dataset: Dataset = null): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
}

