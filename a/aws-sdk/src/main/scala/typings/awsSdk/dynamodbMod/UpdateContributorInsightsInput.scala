package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContributorInsightsInput extends StObject {
  
  /**
    * Represents the contributor insights action.
    */
  var ContributorInsightsAction: typings.awsSdk.dynamodbMod.ContributorInsightsAction
  
  /**
    * The global secondary index name, if applicable.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object UpdateContributorInsightsInput {
  
  @scala.inline
  def apply(ContributorInsightsAction: ContributorInsightsAction, TableName: TableName): UpdateContributorInsightsInput = {
    val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContributorInsightsInput]
  }
  
  @scala.inline
  implicit class UpdateContributorInsightsInputMutableBuilder[Self <: UpdateContributorInsightsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContributorInsightsAction(value: ContributorInsightsAction): Self = StObject.set(x, "ContributorInsightsAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
