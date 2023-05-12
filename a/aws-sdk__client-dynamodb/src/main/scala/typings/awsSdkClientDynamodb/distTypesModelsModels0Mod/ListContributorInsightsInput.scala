package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContributorInsightsInput extends StObject {
  
  /**
    * <p>Maximum number of results to return per page.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>A token to for the desired page, if there is one.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The name of the table.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object ListContributorInsightsInput {
  
  inline def apply(): ListContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContributorInsightsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
