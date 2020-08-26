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
  def apply(): DescribeRecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecordOutput]
  }
  @scala.inline
  implicit class DescribeRecordOutputOps[Self <: DescribeRecordOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    @scala.inline
    def setRecordDetail(value: RecordDetail): Self = this.set("RecordDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordDetail: Self = this.set("RecordDetail", js.undefined)
    @scala.inline
    def setRecordOutputsVarargs(value: RecordOutput*): Self = this.set("RecordOutputs", js.Array(value :_*))
    @scala.inline
    def setRecordOutputs(value: RecordOutputs): Self = this.set("RecordOutputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordOutputs: Self = this.set("RecordOutputs", js.undefined)
  }
  
}

