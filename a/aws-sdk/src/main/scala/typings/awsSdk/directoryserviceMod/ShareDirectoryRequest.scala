package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareDirectoryRequest extends StObject {
  
  /**
    * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a directory sharing request (HANDSHAKE).
    */
  var ShareMethod: typings.awsSdk.directoryserviceMod.ShareMethod = js.native
  
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  
  /**
    * Identifier for the directory consumer account with whom the directory is to be shared.
    */
  var ShareTarget: typings.awsSdk.directoryserviceMod.ShareTarget = js.native
}
object ShareDirectoryRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, ShareMethod: ShareMethod, ShareTarget: ShareTarget): ShareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], ShareMethod = ShareMethod.asInstanceOf[js.Any], ShareTarget = ShareTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDirectoryRequest]
  }
  
  @scala.inline
  implicit class ShareDirectoryRequestMutableBuilder[Self <: ShareDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareMethod(value: ShareMethod): Self = StObject.set(x, "ShareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareNotes(value: Notes): Self = StObject.set(x, "ShareNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareNotesUndefined: Self = StObject.set(x, "ShareNotes", js.undefined)
    
    @scala.inline
    def setShareTarget(value: ShareTarget): Self = StObject.set(x, "ShareTarget", value.asInstanceOf[js.Any])
  }
}
