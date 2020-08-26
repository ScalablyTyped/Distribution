package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConformancePackStatusResponse extends js.Object {
  /**
    * A list of ConformancePackStatusDetail objects.
    */
  var ConformancePackStatusDetails: js.UndefOr[ConformancePackStatusDetailsList] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object DescribeConformancePackStatusResponse {
  @scala.inline
  def apply(): DescribeConformancePackStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConformancePackStatusResponse]
  }
  @scala.inline
  implicit class DescribeConformancePackStatusResponseOps[Self <: DescribeConformancePackStatusResponse] (val x: Self) extends AnyVal {
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
    def setConformancePackStatusDetailsVarargs(value: ConformancePackStatusDetail*): Self = this.set("ConformancePackStatusDetails", js.Array(value :_*))
    @scala.inline
    def setConformancePackStatusDetails(value: ConformancePackStatusDetailsList): Self = this.set("ConformancePackStatusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConformancePackStatusDetails: Self = this.set("ConformancePackStatusDetails", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

