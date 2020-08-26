package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStandardsResponse extends js.Object {
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * A list of available standards.
    */
  var Standards: js.UndefOr[typings.awsSdk.securityhubMod.Standards] = js.native
}

object DescribeStandardsResponse {
  @scala.inline
  def apply(): DescribeStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsResponse]
  }
  @scala.inline
  implicit class DescribeStandardsResponseOps[Self <: DescribeStandardsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStandardsVarargs(value: Standard*): Self = this.set("Standards", js.Array(value :_*))
    @scala.inline
    def setStandards(value: Standards): Self = this.set("Standards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandards: Self = this.set("Standards", js.undefined)
  }
  
}

