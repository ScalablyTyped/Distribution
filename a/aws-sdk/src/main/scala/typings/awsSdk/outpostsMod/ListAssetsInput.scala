package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsInput extends StObject {
  
  /**
    *  A filter for the host ID of Dedicated Hosts on the Outpost.  Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var HostIdFilter: js.UndefOr[HostIdList] = js.undefined
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostIdentifier: typings.awsSdk.outpostsMod.OutpostIdentifier
}
object ListAssetsInput {
  
  inline def apply(OutpostIdentifier: OutpostIdentifier): ListAssetsInput = {
    val __obj = js.Dynamic.literal(OutpostIdentifier = OutpostIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsInput]
  }
  
  extension [Self <: ListAssetsInput](x: Self) {
    
    inline def setHostIdFilter(value: HostIdList): Self = StObject.set(x, "HostIdFilter", value.asInstanceOf[js.Any])
    
    inline def setHostIdFilterUndefined: Self = StObject.set(x, "HostIdFilter", js.undefined)
    
    inline def setHostIdFilterVarargs(value: HostId*): Self = StObject.set(x, "HostIdFilter", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostIdentifier(value: OutpostIdentifier): Self = StObject.set(x, "OutpostIdentifier", value.asInstanceOf[js.Any])
  }
}
