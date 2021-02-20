package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSlotTypeRequest extends StObject {
  
  /**
    * The name of the slot type. The name is case sensitive. 
    */
  var name: SlotTypeName = js.native
  
  /**
    * The version of the slot type. 
    */
  var version: Version = js.native
}
object GetSlotTypeRequest {
  
  @scala.inline
  def apply(name: SlotTypeName, version: Version): GetSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSlotTypeRequest]
  }
  
  @scala.inline
  implicit class GetSlotTypeRequestMutableBuilder[Self <: GetSlotTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
