package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopMultiplexRequest extends js.Object {
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string = js.native
}

object StopMultiplexRequest {
  @scala.inline
  def apply(MultiplexId: string): StopMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMultiplexRequest]
  }
}

