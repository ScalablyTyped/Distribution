package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThingResponse extends StObject {
  
  /**
    * The ARN of the new thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.undefined
  
  /**
    * The name of the new thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object CreateThingResponse {
  
  @scala.inline
  def apply(): CreateThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingResponse]
  }
  
  @scala.inline
  implicit class CreateThingResponseMutableBuilder[Self <: CreateThingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    @scala.inline
    def setThingId(value: ThingId): Self = StObject.set(x, "thingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingIdUndefined: Self = StObject.set(x, "thingId", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
