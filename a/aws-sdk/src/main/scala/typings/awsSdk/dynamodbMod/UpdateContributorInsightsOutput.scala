package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContributorInsightsOutput extends js.Object {
  
  /**
    * The status of contributor insights
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ContributorInsightsStatus] = js.native
  
  /**
    * The name of the global secondary index, if applicable.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.native
}
object UpdateContributorInsightsOutput {
  
  @scala.inline
  def apply(): UpdateContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContributorInsightsOutput]
  }
  
  @scala.inline
  implicit class UpdateContributorInsightsOutputOps[Self <: UpdateContributorInsightsOutput] (val x: Self) extends AnyVal {
    
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
