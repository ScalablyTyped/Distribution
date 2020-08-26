package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePacksResponse extends js.Object {
  /**
    * Returns a list of ConformancePackDetail objects.
    */
  var ConformancePackDetails: js.UndefOr[ConformancePackDetailList] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePacksResponse {
  @scala.inline
  def apply(): DescribeConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePacksResponse]
  }
  @scala.inline
  implicit class DescribeConformancePacksResponseOps[Self <: DescribeConformancePacksResponse] (val x: Self) extends AnyVal {
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
    def setConformancePackDetailsVarargs(value: ConformancePackDetail*): Self = this.set("ConformancePackDetails", js.Array(value :_*))
    @scala.inline
    def setConformancePackDetails(value: ConformancePackDetailList): Self = this.set("ConformancePackDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConformancePackDetails: Self = this.set("ConformancePackDetails", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

