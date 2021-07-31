package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceSummaryOutput extends StObject {
  
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A table that shows counts of noncompliant resources.
    */
  var SummaryList: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.SummaryList] = js.undefined
}
object GetComplianceSummaryOutput {
  
  @scala.inline
  def apply(): GetComplianceSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryOutput]
  }
  
  @scala.inline
  implicit class GetComplianceSummaryOutputMutableBuilder[Self <: GetComplianceSummaryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setSummaryList(value: SummaryList): Self = StObject.set(x, "SummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryListUndefined: Self = StObject.set(x, "SummaryList", js.undefined)
    
    @scala.inline
    def setSummaryListVarargs(value: Summary*): Self = StObject.set(x, "SummaryList", js.Array(value :_*))
  }
}
