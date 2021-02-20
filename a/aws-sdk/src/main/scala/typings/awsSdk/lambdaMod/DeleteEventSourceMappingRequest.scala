package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventSourceMappingRequest extends StObject {
  
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String = js.native
}
object DeleteEventSourceMappingRequest {
  
  @scala.inline
  def apply(UUID: String): DeleteEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventSourceMappingRequest]
  }
  
  @scala.inline
  implicit class DeleteEventSourceMappingRequestMutableBuilder[Self <: DeleteEventSourceMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
  }
}
