package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSnapshotMessage extends StObject {
  
  /**
    * The name of the snapshot to be deleted.
    */
  var SnapshotName: String = js.native
}
object DeleteSnapshotMessage {
  
  @scala.inline
  def apply(SnapshotName: String): DeleteSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotMessage]
  }
  
  @scala.inline
  implicit class DeleteSnapshotMessageMutableBuilder[Self <: DeleteSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
