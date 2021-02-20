package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProtectionRequest extends StObject {
  
  /**
    * The unique identifier (ID) for the Protection object to be deleted.
    */
  var ProtectionId: typings.awsSdk.shieldMod.ProtectionId = js.native
}
object DeleteProtectionRequest {
  
  @scala.inline
  def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
    val __obj = js.Dynamic.literal(ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectionRequest]
  }
  
  @scala.inline
  implicit class DeleteProtectionRequestMutableBuilder[Self <: DeleteProtectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
  }
}
