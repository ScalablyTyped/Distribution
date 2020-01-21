package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIngestionResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the data ingestion.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * An ID for the ingestion.
    */
  var IngestionId: js.UndefOr[typings.awsSdk.quicksightMod.IngestionId] = js.native
  /**
    * The ingestion status.
    */
  var IngestionStatus: js.UndefOr[typings.awsSdk.quicksightMod.IngestionStatus] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[java.lang.String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object CreateIngestionResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    IngestionId: IngestionId = null,
    IngestionStatus: IngestionStatus = null,
    RequestId: java.lang.String = null,
    Status: Int | scala.Double = null
  ): CreateIngestionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (IngestionId != null) __obj.updateDynamic("IngestionId")(IngestionId.asInstanceOf[js.Any])
    if (IngestionStatus != null) __obj.updateDynamic("IngestionStatus")(IngestionStatus.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIngestionResponse]
  }
}

