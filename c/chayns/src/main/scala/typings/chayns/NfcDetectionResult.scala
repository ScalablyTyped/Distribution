package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.startNfcDetection()
trait NfcDetectionResult extends StObject {
  
  var connected: Boolean
  
  var rfid: String
}
object NfcDetectionResult {
  
  inline def apply(connected: Boolean, rfid: String): NfcDetectionResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], rfid = rfid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfcDetectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NfcDetectionResult] (val x: Self) extends AnyVal {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setRfid(value: String): Self = StObject.set(x, "rfid", value.asInstanceOf[js.Any])
  }
}
