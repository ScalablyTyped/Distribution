package typings.chayns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media Functions
  * Miscellaneous
  * chayns
  * interfaces
  */
// chayns.saveAppointment()
trait SaveAppointmentConfig extends StObject {
  
  var description: String
  
  var end: Date
  
  var location: String
  
  var name: String
  
  var start: Date
}
object SaveAppointmentConfig {
  
  @scala.inline
  def apply(description: String, end: Date, location: String, name: String, start: Date): SaveAppointmentConfig = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAppointmentConfig]
  }
  
  @scala.inline
  implicit class SaveAppointmentConfigMutableBuilder[Self <: SaveAppointmentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
