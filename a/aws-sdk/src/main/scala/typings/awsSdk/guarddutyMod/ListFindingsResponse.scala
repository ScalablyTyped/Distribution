package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResponse extends StObject {
  
  /**
    * The IDs of the findings that you're listing.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFindingsResponse {
  
  @scala.inline
  def apply(FindingIds: FindingIds): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  @scala.inline
  implicit class ListFindingsResponseMutableBuilder[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
