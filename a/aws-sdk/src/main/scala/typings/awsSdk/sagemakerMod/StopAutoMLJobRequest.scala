package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAutoMLJobRequest extends js.Object {
  /**
    * The name of the object you are requesting.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
}

object StopAutoMLJobRequest {
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): StopAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutoMLJobRequest]
  }
}

