package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHITTypeOfHITRequest extends StObject {
  
  /**
    * The HIT to update.
    */
  var HITId: EntityId
  
  /**
    * The ID of the new HIT type.
    */
  var HITTypeId: EntityId
}
object UpdateHITTypeOfHITRequest {
  
  inline def apply(HITId: EntityId, HITTypeId: EntityId): UpdateHITTypeOfHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], HITTypeId = HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITTypeOfHITRequest]
  }
  
  extension [Self <: UpdateHITTypeOfHITRequest](x: Self) {
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
    
    inline def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
  }
}
