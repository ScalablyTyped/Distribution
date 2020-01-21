package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetPermissionsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DataSetArn: js.UndefOr[Arn] = js.native
  /**
    * The ID for the dataset whose permissions you want to update. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object UpdateDataSetPermissionsResponse {
  @scala.inline
  def apply(
    DataSetArn: Arn = null,
    DataSetId: ResourceId = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): UpdateDataSetPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSetArn != null) __obj.updateDynamic("DataSetArn")(DataSetArn.asInstanceOf[js.Any])
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetPermissionsResponse]
  }
}

