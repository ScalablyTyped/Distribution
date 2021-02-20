package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHITTypeResponse extends StObject {
  
  /**
    *  The ID of the newly registered HIT type.
    */
  var HITTypeId: js.UndefOr[EntityId] = js.native
}
object CreateHITTypeResponse {
  
  @scala.inline
  def apply(): CreateHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHITTypeResponse]
  }
  
  @scala.inline
  implicit class CreateHITTypeResponseMutableBuilder[Self <: CreateHITTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITTypeIdUndefined: Self = StObject.set(x, "HITTypeId", js.undefined)
  }
}
