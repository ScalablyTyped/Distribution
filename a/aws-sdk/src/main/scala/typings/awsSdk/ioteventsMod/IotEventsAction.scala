package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotEventsAction extends StObject {
  
  /**
    * The name of the AWS IoT Events input where the data is sent.
    */
  var inputName: InputName
  
  /**
    * You can configure the action payload when you send a message to an AWS IoT Events input.
    */
  var payload: js.UndefOr[Payload] = js.undefined
}
object IotEventsAction {
  
  inline def apply(inputName: InputName): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsAction]
  }
  
  extension [Self <: IotEventsAction](x: Self) {
    
    inline def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
