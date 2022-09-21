package typings.awsSdk.iotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingShadowRequest extends StObject {
  
  /**
    * The state information, in JSON format.
    */
  var payload: JsonDocument
  
  /**
    * The name of the shadow.
    */
  var shadowName: js.UndefOr[ShadowName] = js.undefined
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}
object UpdateThingShadowRequest {
  
  inline def apply(payload: JsonDocument, thingName: ThingName): UpdateThingShadowRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingShadowRequest]
  }
  
  extension [Self <: UpdateThingShadowRequest](x: Self) {
    
    inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
    
    inline def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
