package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareInvitation extends StObject {
  
  var LensAlias: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensAlias] = js.undefined
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  /**
    * The ID assigned to the share invitation.
    */
  var ShareInvitationId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareInvitationId] = js.undefined
  
  /**
    * The resource type of the share invitation.
    */
  var ShareResourceType: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareResourceType] = js.undefined
  
  var WorkloadId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object ShareInvitation {
  
  inline def apply(): ShareInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareInvitation]
  }
  
  extension [Self <: ShareInvitation](x: Self) {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensAliasUndefined: Self = StObject.set(x, "LensAlias", js.undefined)
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setShareInvitationId(value: ShareInvitationId): Self = StObject.set(x, "ShareInvitationId", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationIdUndefined: Self = StObject.set(x, "ShareInvitationId", js.undefined)
    
    inline def setShareResourceType(value: ShareResourceType): Self = StObject.set(x, "ShareResourceType", value.asInstanceOf[js.Any])
    
    inline def setShareResourceTypeUndefined: Self = StObject.set(x, "ShareResourceType", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
