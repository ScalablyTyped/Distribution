package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDestinationRequest extends js.Object {
  /**
    * The name of the destination.
    */
  var destinationName: DestinationName = js.native
}

object DeleteDestinationRequest {
  @scala.inline
  def apply(destinationName: DestinationName): DeleteDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationName = destinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDestinationRequest]
  }
  @scala.inline
  implicit class DeleteDestinationRequestOps[Self <: DeleteDestinationRequest] (val x: Self) extends AnyVal {
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
    def setDestinationName(value: DestinationName): Self = this.set("destinationName", value.asInstanceOf[js.Any])
  }
  
}

