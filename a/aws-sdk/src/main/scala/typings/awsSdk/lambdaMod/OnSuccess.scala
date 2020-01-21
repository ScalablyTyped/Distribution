package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSuccess extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var Destination: js.UndefOr[DestinationArn] = js.native
}

object OnSuccess {
  @scala.inline
  def apply(Destination: DestinationArn = null): OnSuccess = {
    val __obj = js.Dynamic.literal()
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSuccess]
  }
}

