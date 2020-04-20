package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

