package typings.awsSdk.iotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThingShadowRequest extends StObject {
  
  /**
    * The name of the shadow.
    */
  var shadowName: js.UndefOr[ShadowName] = js.undefined
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}
object DeleteThingShadowRequest {
  
  inline def apply(thingName: ThingName): DeleteThingShadowRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingShadowRequest]
  }
  
  extension [Self <: DeleteThingShadowRequest](x: Self) {
    
    inline def setShadowName(value: ShadowName): Self = StObject.set(x, "shadowName", value.asInstanceOf[js.Any])
    
    inline def setShadowNameUndefined: Self = StObject.set(x, "shadowName", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
