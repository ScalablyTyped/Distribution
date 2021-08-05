package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThingTypeRequest extends StObject {
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName
}
object DeleteThingTypeRequest {
  
  inline def apply(thingTypeName: ThingTypeName): DeleteThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingTypeRequest]
  }
  
  extension [Self <: DeleteThingTypeRequest](x: Self) {
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
  }
}
