package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContributorInsightsInput extends StObject {
  
  /**
    * Maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[ListContributorInsightsLimit] = js.undefined
  
  /**
    * A token to for the desired page, if there is one.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.undefined
}
object ListContributorInsightsInput {
  
  inline def apply(): ListContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsInput]
  }
  
  extension [Self <: ListContributorInsightsInput](x: Self) {
    
    inline def setMaxResults(value: ListContributorInsightsLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
