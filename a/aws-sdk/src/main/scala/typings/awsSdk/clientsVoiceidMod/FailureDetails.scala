package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureDetails extends StObject {
  
  /**
    * A description of the error that caused the batch job failure.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * An HTTP status code representing the nature of the error.
    */
  var StatusCode: js.UndefOr[Integer] = js.undefined
}
object FailureDetails {
  
  inline def apply(): FailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetails]
  }
  
  extension [Self <: FailureDetails](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatusCode(value: Integer): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
