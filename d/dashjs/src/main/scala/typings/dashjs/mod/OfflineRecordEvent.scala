package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_offlineRecordFinished
import typings.dashjs.dashjsStrings.public_offlineRecordStarted
import typings.dashjs.dashjsStrings.public_offlineRecordStopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineRecordEvent
  extends StObject
     with Event {
  
  var id: String
  
  @JSName("type")
  var type_OfflineRecordEvent: public_offlineRecordFinished | public_offlineRecordStarted | public_offlineRecordStopped
}
object OfflineRecordEvent {
  
  inline def apply(
    id: String,
    `type`: public_offlineRecordFinished | public_offlineRecordStarted | public_offlineRecordStopped
  ): OfflineRecordEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineRecordEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfflineRecordEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: public_offlineRecordFinished | public_offlineRecordStarted | public_offlineRecordStopped): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
