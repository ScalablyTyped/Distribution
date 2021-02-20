package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeContributorInsightsOutput extends StObject {
  
  /**
    * List of names of the associated Alpine rules.
    */
  var ContributorInsightsRuleList: js.UndefOr[typings.awsSdk.dynamodbMod.ContributorInsightsRuleList] = js.native
  
  /**
    * Current Status contributor insights.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ContributorInsightsStatus] = js.native
  
  /**
    * Returns information about the last failure that encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
    */
  var FailureException: js.UndefOr[typings.awsSdk.dynamodbMod.FailureException] = js.native
  
  /**
    * The name of the global secondary index being described.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  
  /**
    * Timestamp of the last time the status was changed.
    */
  var LastUpdateDateTime: js.UndefOr[typings.awsSdk.dynamodbMod.LastUpdateDateTime] = js.native
  
  /**
    * The name of the table being described.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.native
}
object DescribeContributorInsightsOutput {
  
  @scala.inline
  def apply(): DescribeContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContributorInsightsOutput]
  }
  
  @scala.inline
  implicit class DescribeContributorInsightsOutputMutableBuilder[Self <: DescribeContributorInsightsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContributorInsightsRuleList(value: ContributorInsightsRuleList): Self = StObject.set(x, "ContributorInsightsRuleList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorInsightsRuleListUndefined: Self = StObject.set(x, "ContributorInsightsRuleList", js.undefined)
    
    @scala.inline
    def setContributorInsightsRuleListVarargs(value: ContributorInsightsRule*): Self = StObject.set(x, "ContributorInsightsRuleList", js.Array(value :_*))
    
    @scala.inline
    def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
    
    @scala.inline
    def setFailureException(value: FailureException): Self = StObject.set(x, "FailureException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureExceptionUndefined: Self = StObject.set(x, "FailureException", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setLastUpdateDateTime(value: LastUpdateDateTime): Self = StObject.set(x, "LastUpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateTimeUndefined: Self = StObject.set(x, "LastUpdateDateTime", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
