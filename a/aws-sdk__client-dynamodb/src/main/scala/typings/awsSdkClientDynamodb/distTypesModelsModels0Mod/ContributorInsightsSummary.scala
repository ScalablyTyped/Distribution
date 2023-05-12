package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributorInsightsSummary extends StObject {
  
  /**
    * <p>Describes the current status for contributor insights for the given table and index,
    *             if applicable.</p>
    */
  var ContributorInsightsStatus: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContributorInsightsStatus | String
  ] = js.undefined
  
  /**
    * <p>Name of the index associated with the summary, if any.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Name of the table associated with the summary.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object ContributorInsightsSummary {
  
  inline def apply(): ContributorInsightsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributorInsightsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContributorInsightsSummary] (val x: Self) extends AnyVal {
    
    inline def setContributorInsightsStatus(value: ContributorInsightsStatus | String): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
