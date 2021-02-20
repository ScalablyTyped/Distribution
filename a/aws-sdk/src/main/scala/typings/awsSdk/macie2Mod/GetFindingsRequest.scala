package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsRequest extends StObject {
  
  /**
    * An array of strings that lists the unique identifiers for the findings to retrieve.
    */
  var findingIds: listOfString = js.native
  
  /**
    * The criteria for sorting the results of the request.
    */
  var sortCriteria: js.UndefOr[SortCriteria] = js.native
}
object GetFindingsRequest {
  
  @scala.inline
  def apply(findingIds: listOfString): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(findingIds = findingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
  
  @scala.inline
  implicit class GetFindingsRequestMutableBuilder[Self <: GetFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingIds(value: listOfString): Self = StObject.set(x, "findingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsVarargs(value: string*): Self = StObject.set(x, "findingIds", js.Array(value :_*))
    
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
