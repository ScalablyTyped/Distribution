package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIngestionRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String = js.native
  /**
    * An ID for the ingestion.
    */
  var IngestionId: typings.awsSdk.quicksightMod.IngestionId = js.native
}

object CreateIngestionRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String, IngestionId: IngestionId): CreateIngestionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], IngestionId = IngestionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIngestionRequest]
  }
}

