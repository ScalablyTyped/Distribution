package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainRequest extends StObject {
  
  /**
    * The identifier of the domain you want to delete.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
}
object DeleteDomainRequest {
  
  inline def apply(DomainId: DomainId): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
  }
}
