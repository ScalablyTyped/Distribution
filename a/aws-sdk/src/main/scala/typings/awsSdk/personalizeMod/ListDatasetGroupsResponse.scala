package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetGroupsResponse extends StObject {
  
  /**
    * The list of your dataset groups.
    */
  var datasetGroups: js.UndefOr[DatasetGroups] = js.undefined
  
  /**
    * A token for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetGroupsResponse {
  
  inline def apply(): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
  
  extension [Self <: ListDatasetGroupsResponse](x: Self) {
    
    inline def setDatasetGroups(value: DatasetGroups): Self = StObject.set(x, "datasetGroups", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupsUndefined: Self = StObject.set(x, "datasetGroups", js.undefined)
    
    inline def setDatasetGroupsVarargs(value: DatasetGroupSummary*): Self = StObject.set(x, "datasetGroups", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
