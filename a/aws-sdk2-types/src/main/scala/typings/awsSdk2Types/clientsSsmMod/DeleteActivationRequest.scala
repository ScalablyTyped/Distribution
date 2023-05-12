package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActivationRequest extends StObject {
  
  /**
    * The ID of the activation that you want to delete.
    */
  var ActivationId: typings.awsSdk2Types.clientsSsmMod.ActivationId
}
object DeleteActivationRequest {
  
  inline def apply(ActivationId: ActivationId): DeleteActivationRequest = {
    val __obj = js.Dynamic.literal(ActivationId = ActivationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActivationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteActivationRequest] (val x: Self) extends AnyVal {
    
    inline def setActivationId(value: ActivationId): Self = StObject.set(x, "ActivationId", value.asInstanceOf[js.Any])
  }
}
