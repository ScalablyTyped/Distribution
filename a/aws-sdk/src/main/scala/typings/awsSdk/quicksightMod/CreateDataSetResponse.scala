package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataSetResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The ID for the dataset that you want to create. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  /**
    * The ARN for the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the ingestion, which is triggered as a result of dataset creation if the import mode is SPICE.
    */
  var IngestionId: js.UndefOr[ResourceId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CreateDataSetResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    DataSetId: ResourceId = null,
    IngestionArn: Arn = null,
    IngestionId: ResourceId = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): CreateDataSetResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DataSetId != null) __obj.updateDynamic("DataSetId")(DataSetId.asInstanceOf[js.Any])
    if (IngestionArn != null) __obj.updateDynamic("IngestionArn")(IngestionArn.asInstanceOf[js.Any])
    if (IngestionId != null) __obj.updateDynamic("IngestionId")(IngestionId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetResponse]
  }
}

