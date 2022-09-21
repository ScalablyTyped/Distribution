package typings.awsSdk.ssmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEngagementsResult extends StObject {
  
  /**
    * A list of each engagement that occurred during the specified time range of an incident.
    */
  var Engagements: EngagementsList
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListEngagementsResult {
  
  inline def apply(Engagements: EngagementsList): ListEngagementsResult = {
    val __obj = js.Dynamic.literal(Engagements = Engagements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEngagementsResult]
  }
  
  extension [Self <: ListEngagementsResult](x: Self) {
    
    inline def setEngagements(value: EngagementsList): Self = StObject.set(x, "Engagements", value.asInstanceOf[js.Any])
    
    inline def setEngagementsVarargs(value: Engagement*): Self = StObject.set(x, "Engagements", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
