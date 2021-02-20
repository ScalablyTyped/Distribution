package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getBeaconHistory()
@js.native
trait BeaconHistory extends StObject {
  
  var id: Double = js.native
  
  var timestamp: Double = js.native
}
object BeaconHistory {
  
  @scala.inline
  def apply(id: Double, timestamp: Double): BeaconHistory = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeaconHistory]
  }
  
  @scala.inline
  implicit class BeaconHistoryMutableBuilder[Self <: BeaconHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
