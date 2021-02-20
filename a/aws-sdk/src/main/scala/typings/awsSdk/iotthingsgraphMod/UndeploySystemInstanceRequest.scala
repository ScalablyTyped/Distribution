package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeploySystemInstanceRequest extends StObject {
  
  /**
    * The ID of the system instance to remove from its target.
    */
  var id: js.UndefOr[Urn] = js.native
}
object UndeploySystemInstanceRequest {
  
  @scala.inline
  def apply(): UndeploySystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeploySystemInstanceRequest]
  }
  
  @scala.inline
  implicit class UndeploySystemInstanceRequestMutableBuilder[Self <: UndeploySystemInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
