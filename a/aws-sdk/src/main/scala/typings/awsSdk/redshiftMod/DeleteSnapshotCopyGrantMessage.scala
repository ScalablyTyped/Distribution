package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotCopyGrantMessage extends StObject {
  
  /**
    * The name of the snapshot copy grant to delete.
    */
  var SnapshotCopyGrantName: String = js.native
}
object DeleteSnapshotCopyGrantMessage {
  
  @scala.inline
  def apply(SnapshotCopyGrantName: String): DeleteSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotCopyGrantMessage]
  }
  
  @scala.inline
  implicit class DeleteSnapshotCopyGrantMessageMutableBuilder[Self <: DeleteSnapshotCopyGrantMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
  }
}
