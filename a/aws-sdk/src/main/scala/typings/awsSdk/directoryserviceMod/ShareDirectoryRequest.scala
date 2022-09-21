package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDirectoryRequest extends StObject {
  
  /**
    * Identifier of the Managed Microsoft AD directory that you want to share with other Amazon Web Services accounts.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your Amazon Web Services organization (ORGANIZATIONS) or with any Amazon Web Services account by sending a directory sharing request (HANDSHAKE).
    */
  var ShareMethod: typings.awsSdk.directoryserviceMod.ShareMethod
  
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.undefined
  
  /**
    * Identifier for the directory consumer account with whom the directory is to be shared.
    */
  var ShareTarget: typings.awsSdk.directoryserviceMod.ShareTarget
}
object ShareDirectoryRequest {
  
  inline def apply(DirectoryId: DirectoryId, ShareMethod: ShareMethod, ShareTarget: ShareTarget): ShareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], ShareMethod = ShareMethod.asInstanceOf[js.Any], ShareTarget = ShareTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDirectoryRequest]
  }
  
  extension [Self <: ShareDirectoryRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setShareMethod(value: ShareMethod): Self = StObject.set(x, "ShareMethod", value.asInstanceOf[js.Any])
    
    inline def setShareNotes(value: Notes): Self = StObject.set(x, "ShareNotes", value.asInstanceOf[js.Any])
    
    inline def setShareNotesUndefined: Self = StObject.set(x, "ShareNotes", js.undefined)
    
    inline def setShareTarget(value: ShareTarget): Self = StObject.set(x, "ShareTarget", value.asInstanceOf[js.Any])
  }
}
