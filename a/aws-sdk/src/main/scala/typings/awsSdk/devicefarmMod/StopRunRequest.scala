package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRunRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm run to stop.
    */
  var arn: AmazonResourceName = js.native
}

object StopRunRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): StopRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRunRequest]
  }
}

