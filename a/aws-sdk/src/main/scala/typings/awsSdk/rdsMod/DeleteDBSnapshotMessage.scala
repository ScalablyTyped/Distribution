package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBSnapshotMessage extends StObject {
  
  /**
    * The DB snapshot identifier. Constraints: Must be the name of an existing DB snapshot in the available state.
    */
  var DBSnapshotIdentifier: String = js.native
}
object DeleteDBSnapshotMessage {
  
  @scala.inline
  def apply(DBSnapshotIdentifier: String): DeleteDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSnapshotMessage]
  }
  
  @scala.inline
  implicit class DeleteDBSnapshotMessageMutableBuilder[Self <: DeleteDBSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
