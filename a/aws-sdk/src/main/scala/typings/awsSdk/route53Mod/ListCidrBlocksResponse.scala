package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCidrBlocksResponse extends StObject {
  
  /**
    * A complex type that contains information about the CIDR blocks.
    */
  var CidrBlocks: js.UndefOr[CidrBlockSummaries] = js.undefined
  
  /**
    * An opaque pagination token to indicate where the service is to begin enumerating results.  If no value is provided, the listing of results starts from the beginning.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCidrBlocksResponse {
  
  inline def apply(): ListCidrBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCidrBlocksResponse]
  }
  
  extension [Self <: ListCidrBlocksResponse](x: Self) {
    
    inline def setCidrBlocks(value: CidrBlockSummaries): Self = StObject.set(x, "CidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setCidrBlocksUndefined: Self = StObject.set(x, "CidrBlocks", js.undefined)
    
    inline def setCidrBlocksVarargs(value: CidrBlockSummary*): Self = StObject.set(x, "CidrBlocks", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
