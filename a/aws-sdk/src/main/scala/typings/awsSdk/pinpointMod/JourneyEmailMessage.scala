package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyEmailMessage extends StObject {
  
  /**
    * The verified email address to send the email message from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[string] = js.undefined
}
object JourneyEmailMessage {
  
  inline def apply(): JourneyEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyEmailMessage]
  }
  
  extension [Self <: JourneyEmailMessage](x: Self) {
    
    inline def setFromAddress(value: string): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
  }
}
