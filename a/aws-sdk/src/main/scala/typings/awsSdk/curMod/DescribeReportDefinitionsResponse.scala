package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReportDefinitionsResponse extends js.Object {
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of AWS Cost and Usage reports owned by the account.
    */
  var ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.native
}

object DescribeReportDefinitionsResponse {
  @scala.inline
  def apply(): DescribeReportDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReportDefinitionsResponse]
  }
  @scala.inline
  implicit class DescribeReportDefinitionsResponseOps[Self <: DescribeReportDefinitionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setReportDefinitionsVarargs(value: ReportDefinition*): Self = this.set("ReportDefinitions", js.Array(value :_*))
    @scala.inline
    def setReportDefinitions(value: ReportDefinitionList): Self = this.set("ReportDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportDefinitions: Self = this.set("ReportDefinitions", js.undefined)
  }
  
}

