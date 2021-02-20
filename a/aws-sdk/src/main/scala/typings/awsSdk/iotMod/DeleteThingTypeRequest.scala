package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteThingTypeRequest extends StObject {
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName = js.native
}
object DeleteThingTypeRequest {
  
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DeleteThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingTypeRequest]
  }
  
  @scala.inline
  implicit class DeleteThingTypeRequestMutableBuilder[Self <: DeleteThingTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
  }
}
