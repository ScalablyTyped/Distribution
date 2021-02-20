package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateHITTypeOfHITRequest extends StObject {
  
  /**
    * The HIT to update.
    */
  var HITId: EntityId = js.native
  
  /**
    * The ID of the new HIT type.
    */
  var HITTypeId: EntityId = js.native
}
object UpdateHITTypeOfHITRequest {
  
  @scala.inline
  def apply(HITId: EntityId, HITTypeId: EntityId): UpdateHITTypeOfHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], HITTypeId = HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITTypeOfHITRequest]
  }
  
  @scala.inline
  implicit class UpdateHITTypeOfHITRequestMutableBuilder[Self <: UpdateHITTypeOfHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
  }
}
