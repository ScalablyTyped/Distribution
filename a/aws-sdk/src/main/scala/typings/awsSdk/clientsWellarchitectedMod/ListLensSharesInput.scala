package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensSharesInput extends StObject {
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[ListWorkloadSharesMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  /**
    * The Amazon Web Services account ID, IAM role, organization ID, or organizational unit (OU) ID with which the lens is shared.
    */
  var SharedWithPrefix: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.SharedWithPrefix] = js.undefined
  
  var Status: js.UndefOr[ShareStatus] = js.undefined
}
object ListLensSharesInput {
  
  inline def apply(LensAlias: LensAlias): ListLensSharesInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLensSharesInput]
  }
  
  extension [Self <: ListLensSharesInput](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListWorkloadSharesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSharedWithPrefix(value: SharedWithPrefix): Self = StObject.set(x, "SharedWithPrefix", value.asInstanceOf[js.Any])
    
    inline def setSharedWithPrefixUndefined: Self = StObject.set(x, "SharedWithPrefix", js.undefined)
    
    inline def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
