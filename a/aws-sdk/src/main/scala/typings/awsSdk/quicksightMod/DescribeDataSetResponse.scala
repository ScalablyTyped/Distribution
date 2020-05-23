package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSetResponse extends js.Object {
  /**
    * Information on the dataset.
    */
  var DataSet: js.UndefOr[typings.awsSdk.quicksightMod.DataSet] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeDataSetResponse {
  @scala.inline
  def apply(DataSet: DataSet = null, RequestId: String = null, Status: js.UndefOr[StatusCode] = js.undefined): DescribeDataSetResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSet != null) __obj.updateDynamic("DataSet")(DataSet.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataSetResponse]
  }
}

