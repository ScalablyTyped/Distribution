package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHITRequest extends StObject {
  
  /**
    * The ID of the HIT to be retrieved.
    */
  var HITId: EntityId = js.native
}
object GetHITRequest {
  
  @scala.inline
  def apply(HITId: EntityId): GetHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHITRequest]
  }
  
  @scala.inline
  implicit class GetHITRequestMutableBuilder[Self <: GetHITRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
  }
}
