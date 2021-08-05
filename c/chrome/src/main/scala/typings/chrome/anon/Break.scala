package typings.chrome.anon

import typings.chrome.chromeStrings.break
import typings.chrome.chromeStrings.buffer_overflow
import typings.chrome.chromeStrings.device_lost
import typings.chrome.chromeStrings.disconnected
import typings.chrome.chromeStrings.frame_error
import typings.chrome.chromeStrings.overrun
import typings.chrome.chromeStrings.parity_error
import typings.chrome.chromeStrings.system_error
import typings.chrome.chromeStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Break extends StObject {
  
  /* The device detected a break condition. */
  var break: typings.chrome.chromeStrings.break
  
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: typings.chrome.chromeStrings.buffer_overflow
  
  /* The device was most likely disconnected from the host. */
  var device_lost: typings.chrome.chromeStrings.device_lost
  
  /* The connection was disconnected. */
  var disconnected: typings.chrome.chromeStrings.disconnected
  
  /* The device detected a framing error. */
  var frame_error: typings.chrome.chromeStrings.frame_error
  
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: typings.chrome.chromeStrings.overrun
  
  /* The device detected a parity error. */
  var parity_error: typings.chrome.chromeStrings.parity_error
  
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: typings.chrome.chromeStrings.system_error
  
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: typings.chrome.chromeStrings.timeout
}
object Break {
  
  inline def apply(): Break = {
    val __obj = js.Dynamic.literal(break = "break", buffer_overflow = "buffer_overflow", device_lost = "device_lost", disconnected = "disconnected", frame_error = "frame_error", overrun = "overrun", parity_error = "parity_error", system_error = "system_error", timeout = "timeout")
    __obj.asInstanceOf[Break]
  }
  
  extension [Self <: Break](x: Self) {
    
    inline def setBreak(value: break): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setBuffer_overflow(value: buffer_overflow): Self = StObject.set(x, "buffer_overflow", value.asInstanceOf[js.Any])
    
    inline def setDevice_lost(value: device_lost): Self = StObject.set(x, "device_lost", value.asInstanceOf[js.Any])
    
    inline def setDisconnected(value: disconnected): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    
    inline def setFrame_error(value: frame_error): Self = StObject.set(x, "frame_error", value.asInstanceOf[js.Any])
    
    inline def setOverrun(value: overrun): Self = StObject.set(x, "overrun", value.asInstanceOf[js.Any])
    
    inline def setParity_error(value: parity_error): Self = StObject.set(x, "parity_error", value.asInstanceOf[js.Any])
    
    inline def setSystem_error(value: system_error): Self = StObject.set(x, "system_error", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: timeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
