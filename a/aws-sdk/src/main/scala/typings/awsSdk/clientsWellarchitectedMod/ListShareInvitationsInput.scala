package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListShareInvitationsInput extends StObject {
  
  /**
    * An optional string added to the beginning of each lens name returned in the results.
    */
  var LensNamePrefix: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensNamePrefix] = js.undefined
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[ListShareInvitationsMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  /**
    * The type of share invitations to be returned.
    */
  var ShareResourceType: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareResourceType] = js.undefined
  
  var WorkloadNamePrefix: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadNamePrefix] = js.undefined
}
object ListShareInvitationsInput {
  
  inline def apply(): ListShareInvitationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShareInvitationsInput]
  }
  
  extension [Self <: ListShareInvitationsInput](x: Self) {
    
    inline def setLensNamePrefix(value: LensNamePrefix): Self = StObject.set(x, "LensNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLensNamePrefixUndefined: Self = StObject.set(x, "LensNamePrefix", js.undefined)
    
    inline def setMaxResults(value: ListShareInvitationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setShareResourceType(value: ShareResourceType): Self = StObject.set(x, "ShareResourceType", value.asInstanceOf[js.Any])
    
    inline def setShareResourceTypeUndefined: Self = StObject.set(x, "ShareResourceType", js.undefined)
    
    inline def setWorkloadNamePrefix(value: WorkloadNamePrefix): Self = StObject.set(x, "WorkloadNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNamePrefixUndefined: Self = StObject.set(x, "WorkloadNamePrefix", js.undefined)
  }
}
