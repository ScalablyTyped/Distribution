package typings.dav.mod

import typings.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCalendarObjectOptions extends StObject {
  
  /**
    * rfc 5545 VCALENDAR object.
    */
  var data: String
  
  /**
    * name for the calendar ics file.
    */
  var filename: String
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.undefined
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.undefined
}
object CreateCalendarObjectOptions {
  
  inline def apply(data: String, filename: String): CreateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCalendarObjectOptions]
  }
  
  extension [Self <: CreateCalendarObjectOptions](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
