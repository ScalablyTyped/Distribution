package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFailure extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var Destination: js.UndefOr[DestinationArn] = js.native
}

object OnFailure {
  @scala.inline
  def apply(): OnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFailure]
  }
  @scala.inline
  implicit class OnFailureOps[Self <: OnFailure] (val x: Self) extends AnyVal {
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
    def setDestination(value: DestinationArn): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("Destination", js.undefined)
  }
  
}

