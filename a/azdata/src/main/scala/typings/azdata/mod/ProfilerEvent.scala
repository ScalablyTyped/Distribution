package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerEvent extends StObject {
  
  /**
    * Event class name
    */
  var name: String
  
  /**
    * Event timestamp
    */
  var timestamp: String
}
object ProfilerEvent {
  
  @scala.inline
  def apply(name: String, timestamp: String): ProfilerEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerEvent]
  }
  
  @scala.inline
  implicit class ProfilerEventMutableBuilder[Self <: ProfilerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
