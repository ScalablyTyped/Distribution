package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributorInsightsSummary extends StObject {
  
  /**
    * Describes the current status for contributor insights for the given table and index, if applicable.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ContributorInsightsStatus] = js.undefined
  
  /**
    * Name of the index associated with the summary, if any.
    */
  var IndexName: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.IndexName] = js.undefined
  
  /**
    * Name of the table associated with the summary.
    */
  var TableName: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableName] = js.undefined
}
object ContributorInsightsSummary {
  
  inline def apply(): ContributorInsightsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributorInsightsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContributorInsightsSummary] (val x: Self) extends AnyVal {
    
    inline def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
