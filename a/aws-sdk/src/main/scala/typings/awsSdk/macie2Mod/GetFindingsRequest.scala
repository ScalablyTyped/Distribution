package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsRequest extends StObject {
  
  /**
    * An array of strings that lists the unique identifiers for the findings to retrieve. You can specify as many as 50 unique identifiers in this array.
    */
  var findingIds: listOfString
  
  /**
    * The criteria for sorting the results of the request.
    */
  var sortCriteria: js.UndefOr[SortCriteria] = js.undefined
}
object GetFindingsRequest {
  
  inline def apply(findingIds: listOfString): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(findingIds = findingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
  
  extension [Self <: GetFindingsRequest](x: Self) {
    
    inline def setFindingIds(value: listOfString): Self = StObject.set(x, "findingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsVarargs(value: string*): Self = StObject.set(x, "findingIds", js.Array(value*))
    
    inline def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
