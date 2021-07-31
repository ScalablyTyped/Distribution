package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotRequest extends StObject {
  
  /**
    * The identifier of the directory of which to take a snapshot.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The descriptive name to apply to the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.undefined
}
object CreateSnapshotRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
  
  @scala.inline
  implicit class CreateSnapshotRequestMutableBuilder[Self <: CreateSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SnapshotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
