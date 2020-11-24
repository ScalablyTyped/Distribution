package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContributorInsightsOutput extends js.Object {
  
  /**
    * List of names of the associated Alpine rules.
    */
  var ContributorInsightsRuleList: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRuleList] = js.native
  
  /**
    * Current Status contributor insights.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
  
  /**
    * Returns information about the last failure that encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
    */
  var FailureException: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.FailureException] = js.native
  
  /**
    * The name of the global secondary index being described.
    */
  var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  
  /**
    * Timestamp of the last time the status was changed.
    */
  var LastUpdateDateTime: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.LastUpdateDateTime] = js.native
  
  /**
    * The name of the table being described.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}
object DescribeContributorInsightsOutput {
  
  @scala.inline
  def apply(): DescribeContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContributorInsightsOutput]
  }
  
  @scala.inline
  implicit class DescribeContributorInsightsOutputOps[Self <: DescribeContributorInsightsOutput] (val x: Self) extends AnyVal {
    
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
    def setContributorInsightsRuleListVarargs(value: ContributorInsightsRule*): Self = this.set("ContributorInsightsRuleList", js.Array(value :_*))
    
    @scala.inline
    def setContributorInsightsRuleList(value: ContributorInsightsRuleList): Self = this.set("ContributorInsightsRuleList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributorInsightsRuleList: Self = this.set("ContributorInsightsRuleList", js.undefined)
    
    @scala.inline
    def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = this.set("ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributorInsightsStatus: Self = this.set("ContributorInsightsStatus", js.undefined)
    
    @scala.inline
    def setFailureException(value: FailureException): Self = this.set("FailureException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureException: Self = this.set("FailureException", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTime(value: LastUpdateDateTime): Self = this.set("LastUpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateDateTime: Self = this.set("LastUpdateDateTime", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
}
