package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContributorInsightsOutput extends StObject {
  
  /**
    * <p>The status of contributor insights</p>
    */
  var ContributorInsightsStatus: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContributorInsightsStatus | String
  ] = js.undefined
  
  /**
    * <p>The name of the global secondary index, if applicable.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object UpdateContributorInsightsOutput {
  
  inline def apply(): UpdateContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContributorInsightsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContributorInsightsOutput] (val x: Self) extends AnyVal {
    
    inline def setContributorInsightsStatus(value: ContributorInsightsStatus | String): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
