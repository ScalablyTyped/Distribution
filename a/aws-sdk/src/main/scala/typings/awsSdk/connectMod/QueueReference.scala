package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueReference extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the queue.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the queue.
    */
  var Id: js.UndefOr[QueueId] = js.native
}

object QueueReference {
  @scala.inline
  def apply(Arn: ARN = null, Id: QueueId = null): QueueReference = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueReference]
  }
}

