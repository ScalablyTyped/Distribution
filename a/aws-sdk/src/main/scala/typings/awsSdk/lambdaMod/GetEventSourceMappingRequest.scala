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
}

