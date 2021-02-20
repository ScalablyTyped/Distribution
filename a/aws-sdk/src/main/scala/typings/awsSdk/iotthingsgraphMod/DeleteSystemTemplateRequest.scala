package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSystemTemplateRequest extends StObject {
  
  /**
    * The ID of the system to be deleted. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:system:SYSTEMNAME 
    */
  var id: Urn = js.native
}
object DeleteSystemTemplateRequest {
  
  @scala.inline
  def apply(id: Urn): DeleteSystemTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSystemTemplateRequest]
  }
  
  @scala.inline
  implicit class DeleteSystemTemplateRequestMutableBuilder[Self <: DeleteSystemTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
