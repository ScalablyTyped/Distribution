package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIngestionRequest extends js.Object {
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

object DescribeIngestionRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String, IngestionId: IngestionId): DescribeIngestionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], IngestionId = IngestionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIngestionRequest]
  }
}

