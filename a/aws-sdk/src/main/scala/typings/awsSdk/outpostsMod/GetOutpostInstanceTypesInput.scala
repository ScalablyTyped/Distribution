package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutpostInstanceTypesInput extends StObject {
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost.   In requests, Amazon Web Services Outposts accepts the Amazon Resource Name (ARN) or an ID for Outposts and sites throughout the Outposts Query API. To address backwards compatibility, the parameter names OutpostID or SiteID remain in use. Despite the parameter name, you can make the request with an ARN. 
    */
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId
}
object GetOutpostInstanceTypesInput {
  
  inline def apply(OutpostId: OutpostId): GetOutpostInstanceTypesInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypesInput]
  }
  
  extension [Self <: GetOutpostInstanceTypesInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
