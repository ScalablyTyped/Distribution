package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributorInsightsSummary extends js.Object {
  
  /**
    * Describes the current status for contributor insights for the given table and index, if applicable.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
  
  /**
    * Name of the index associated with the summary, if any.
    */
  var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  
  /**
    * Name of the table associated with the summary.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}
object ContributorInsightsSummary {
  
  @scala.inline
  def apply(): ContributorInsightsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributorInsightsSummary]
  }
  
  @scala.inline
  implicit class ContributorInsightsSummaryOps[Self <: ContributorInsightsSummary] (val x: Self) extends AnyVal {
    
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
    def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = this.set("ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributorInsightsStatus: Self = this.set("ContributorInsightsStatus", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
}
