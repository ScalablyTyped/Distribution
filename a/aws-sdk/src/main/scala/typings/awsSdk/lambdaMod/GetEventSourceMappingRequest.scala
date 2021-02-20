package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventSourceMappingRequest extends StObject {
  
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String = js.native
}
object GetEventSourceMappingRequest {
  
  @scala.inline
  def apply(UUID: String): GetEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventSourceMappingRequest]
  }
  
  @scala.inline
  implicit class GetEventSourceMappingRequestMutableBuilder[Self <: GetEventSourceMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
  }
}
