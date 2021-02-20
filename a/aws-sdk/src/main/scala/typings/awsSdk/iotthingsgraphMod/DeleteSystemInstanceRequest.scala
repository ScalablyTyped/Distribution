package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSystemInstanceRequest extends StObject {
  
  /**
    * The ID of the system instance to be deleted.
    */
  var id: js.UndefOr[Urn] = js.native
}
object DeleteSystemInstanceRequest {
  
  @scala.inline
  def apply(): DeleteSystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSystemInstanceRequest]
  }
  
  @scala.inline
  implicit class DeleteSystemInstanceRequestMutableBuilder[Self <: DeleteSystemInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
