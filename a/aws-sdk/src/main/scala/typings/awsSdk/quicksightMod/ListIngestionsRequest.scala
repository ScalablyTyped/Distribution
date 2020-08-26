package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIngestionsRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID of the dataset used in the ingestion.
    */
  var DataSetId: java.lang.String = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[IngestionMaxResults] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.native
}

object ListIngestionsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DataSetId: java.lang.String): ListIngestionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIngestionsRequest]
  }
  @scala.inline
  implicit class ListIngestionsRequestOps[Self <: ListIngestionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSetId(value: java.lang.String): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: IngestionMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: java.lang.String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

