package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceSummaryOutput extends js.Object {
  
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  
  /**
    * A table that shows counts of noncompliant resources.
    */
  var SummaryList: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.SummaryList] = js.native
}
object GetComplianceSummaryOutput {
  
  @scala.inline
  def apply(): GetComplianceSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryOutput]
  }
  
  @scala.inline
  implicit class GetComplianceSummaryOutputOps[Self <: GetComplianceSummaryOutput] (val x: Self) extends AnyVal {
    
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
    def setPaginationToken(value: PaginationToken): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
    
    @scala.inline
    def setSummaryListVarargs(value: Summary*): Self = this.set("SummaryList", js.Array(value :_*))
    
    @scala.inline
    def setSummaryList(value: SummaryList): Self = this.set("SummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryList: Self = this.set("SummaryList", js.undefined)
  }
}
