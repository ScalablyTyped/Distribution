package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorErrorDetails extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[MonitorErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var message: js.UndefOr[MonitorErrorMessage] = js.undefined
}
object MonitorErrorDetails {
  
  inline def apply(): MonitorErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorErrorDetails]
  }
  
  extension [Self <: MonitorErrorDetails](x: Self) {
    
    inline def setCode(value: MonitorErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: MonitorErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
