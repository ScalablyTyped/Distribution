package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDestinationResponse extends js.Object {
  /**
    * The destination.
    */
  var destination: js.UndefOr[Destination] = js.native
}

object PutDestinationResponse {
  @scala.inline
  def apply(): PutDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDestinationResponse]
  }
  @scala.inline
  implicit class PutDestinationResponseOps[Self <: PutDestinationResponse] (val x: Self) extends AnyVal {
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
    def setDestination(value: Destination): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
  }
  
}

