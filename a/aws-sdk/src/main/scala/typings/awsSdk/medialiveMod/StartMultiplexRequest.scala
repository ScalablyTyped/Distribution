package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMultiplexRequest extends js.Object {
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string = js.native
}

object StartMultiplexRequest {
  @scala.inline
  def apply(MultiplexId: string): StartMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMultiplexRequest]
  }
  @scala.inline
  implicit class StartMultiplexRequestOps[Self <: StartMultiplexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMultiplexId(value: string): Self = this.set("MultiplexId", value.asInstanceOf[js.Any])
  }
  
}

