package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventSourceMappingRequest extends js.Object {
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
  implicit class GetEventSourceMappingRequestOps[Self <: GetEventSourceMappingRequest] (val x: Self) extends AnyVal {
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

