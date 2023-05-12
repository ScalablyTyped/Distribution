package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandbyWorkspace extends StObject {
  
  /**
    * The identifier of the directory for the standby WorkSpace.
    */
  var DirectoryId: typings.awsSdk.clientsWorkspacesMod.DirectoryId
  
  /**
    * The identifier of the standby WorkSpace.
    */
  var PrimaryWorkspaceId: WorkspaceId
  
  /**
    * The tags associated with the standby WorkSpace.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The volume encryption key of the standby WorkSpace.
    */
  var VolumeEncryptionKey: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.VolumeEncryptionKey] = js.undefined
}
object StandbyWorkspace {
  
  inline def apply(DirectoryId: DirectoryId, PrimaryWorkspaceId: WorkspaceId): StandbyWorkspace = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], PrimaryWorkspaceId = PrimaryWorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandbyWorkspace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandbyWorkspace] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "PrimaryWorkspaceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeEncryptionKey(value: VolumeEncryptionKey): Self = StObject.set(x, "VolumeEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setVolumeEncryptionKeyUndefined: Self = StObject.set(x, "VolumeEncryptionKey", js.undefined)
  }
}
