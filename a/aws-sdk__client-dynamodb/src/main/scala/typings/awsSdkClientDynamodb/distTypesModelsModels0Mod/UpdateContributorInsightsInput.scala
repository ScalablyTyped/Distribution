package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContributorInsightsInput extends StObject {
  
  /**
    * <p>Represents the contributor insights action.</p>
    */
  var ContributorInsightsAction: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContributorInsightsAction | String
  ] = js.undefined
  
  /**
    * <p>The global secondary index name, if applicable.</p>
    */
  var IndexName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object UpdateContributorInsightsInput {
  
  inline def apply(): UpdateContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContributorInsightsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContributorInsightsInput] (val x: Self) extends AnyVal {
    
    inline def setContributorInsightsAction(value: ContributorInsightsAction | String): Self = StObject.set(x, "ContributorInsightsAction", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsActionUndefined: Self = StObject.set(x, "ContributorInsightsAction", js.undefined)
    
    inline def setIndexName(value: String): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
