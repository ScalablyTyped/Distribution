package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsWorkmailMod.MaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. The first call does not contain any tokens.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
}
object ListOrganizationsRequest {
  
  inline def apply(): ListOrganizationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationsRequest]
  }
  
  extension [Self <: ListOrganizationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
