package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventSourceMappingRequest extends js.Object {
  
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
  implicit class DeleteEventSourceMappingRequestOps[Self <: DeleteEventSourceMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUUID(value: String): Self = this.set("UUID", value.asInstanceOf[js.Any])
  }
}
