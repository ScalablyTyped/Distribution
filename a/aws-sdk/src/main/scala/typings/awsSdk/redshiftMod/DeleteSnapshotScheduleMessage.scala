package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotScheduleMessage extends StObject {
  
  /**
    * A unique identifier of the snapshot schedule to delete.
    */
  var ScheduleIdentifier: String
}
object DeleteSnapshotScheduleMessage {
  
  @scala.inline
  def apply(ScheduleIdentifier: String): DeleteSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotScheduleMessage]
  }
  
  @scala.inline
  implicit class DeleteSnapshotScheduleMessageMutableBuilder[Self <: DeleteSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleIdentifier(value: String): Self = StObject.set(x, "ScheduleIdentifier", value.asInstanceOf[js.Any])
  }
}
