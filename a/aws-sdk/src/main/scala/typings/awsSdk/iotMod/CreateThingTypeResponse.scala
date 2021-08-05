package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThingTypeResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the thing type.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.undefined
  
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.undefined
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}
object CreateThingTypeResponse {
  
  inline def apply(): CreateThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingTypeResponse]
  }
  
  extension [Self <: CreateThingTypeResponse](x: Self) {
    
    inline def setThingTypeArn(value: ThingTypeArn): Self = StObject.set(x, "thingTypeArn", value.asInstanceOf[js.Any])
    
    inline def setThingTypeArnUndefined: Self = StObject.set(x, "thingTypeArn", js.undefined)
    
    inline def setThingTypeId(value: ThingTypeId): Self = StObject.set(x, "thingTypeId", value.asInstanceOf[js.Any])
    
    inline def setThingTypeIdUndefined: Self = StObject.set(x, "thingTypeId", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
