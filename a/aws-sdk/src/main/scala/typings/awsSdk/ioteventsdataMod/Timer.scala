package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timer extends StObject {
  
  /**
    * The name of the timer.
    */
  var name: TimerName = js.native
  
  /**
    * The number of seconds which have elapsed on the timer.
    */
  var timestamp: Timestamp = js.native
}
object Timer {
  
  @scala.inline
  def apply(name: TimerName, timestamp: Timestamp): Timer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: TimerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
