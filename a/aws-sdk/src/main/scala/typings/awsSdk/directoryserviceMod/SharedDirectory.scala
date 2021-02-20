package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedDirectory extends StObject {
  
  /**
    * The date and time that the shared directory was created.
    */
  var CreatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.CreatedDateTime] = js.native
  
  /**
    * The date and time that the shared directory was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.native
  
  /**
    * Identifier of the directory owner account, which contains the directory that has been shared to the consumer account.
    */
  var OwnerAccountId: js.UndefOr[CustomerId] = js.native
  
  /**
    * Identifier of the directory in the directory owner account. 
    */
  var OwnerDirectoryId: js.UndefOr[DirectoryId] = js.native
  
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareMethod] = js.native
  
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.ShareStatus] = js.native
  
  /**
    * Identifier of the directory consumer account that has access to the shared directory (OwnerDirectoryId) in the directory owner account.
    */
  var SharedAccountId: js.UndefOr[CustomerId] = js.native
  
  /**
    * Identifier of the shared directory in the directory consumer account. This identifier is different for each directory owner account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}
object SharedDirectory {
  
  @scala.inline
  def apply(): SharedDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDirectory]
  }
  
  @scala.inline
  implicit class SharedDirectoryMutableBuilder[Self <: SharedDirectory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: CreatedDateTime): Self = StObject.set(x, "CreatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "CreatedDateTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: CustomerId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    @scala.inline
    def setOwnerDirectoryId(value: DirectoryId): Self = StObject.set(x, "OwnerDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDirectoryIdUndefined: Self = StObject.set(x, "OwnerDirectoryId", js.undefined)
    
    @scala.inline
    def setShareMethod(value: ShareMethod): Self = StObject.set(x, "ShareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareMethodUndefined: Self = StObject.set(x, "ShareMethod", js.undefined)
    
    @scala.inline
    def setShareNotes(value: Notes): Self = StObject.set(x, "ShareNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareNotesUndefined: Self = StObject.set(x, "ShareNotes", js.undefined)
    
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    @scala.inline
    def setSharedAccountId(value: CustomerId): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAccountIdUndefined: Self = StObject.set(x, "SharedAccountId", js.undefined)
    
    @scala.inline
    def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
