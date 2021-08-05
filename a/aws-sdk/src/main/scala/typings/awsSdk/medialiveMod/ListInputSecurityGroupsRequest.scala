package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputSecurityGroupsRequest extends StObject {
  
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListInputSecurityGroupsRequest {
  
  inline def apply(): ListInputSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputSecurityGroupsRequest]
  }
  
  extension [Self <: ListInputSecurityGroupsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
