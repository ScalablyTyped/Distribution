package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecordOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
  /**
    * Information about the product created as the result of a request. For example, the output for a CloudFormation-backed product that creates an S3 bucket would include the S3 bucket URL.
    */
  var RecordOutputs: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordOutputs] = js.native
}

object DescribeRecordOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    RecordDetail: RecordDetail = null,
    RecordOutputs: RecordOutputs = null
  ): DescribeRecordOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail.asInstanceOf[js.Any])
    if (RecordOutputs != null) __obj.updateDynamic("RecordOutputs")(RecordOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecordOutput]
  }
}

