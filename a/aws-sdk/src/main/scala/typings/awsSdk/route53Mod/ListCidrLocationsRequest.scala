package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCidrLocationsRequest extends StObject {
  
  /**
    * The CIDR collection ID.
    */
  var CollectionId: UUID
  
  /**
    * The maximum number of CIDR collection locations to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53Mod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token to indicate where the service is to begin enumerating results. If no value is provided, the listing of results starts from the beginning.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCidrLocationsRequest {
  
  inline def apply(CollectionId: UUID): ListCidrLocationsRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCidrLocationsRequest]
  }
  
  extension [Self <: ListCidrLocationsRequest](x: Self) {
    
    inline def setCollectionId(value: UUID): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
