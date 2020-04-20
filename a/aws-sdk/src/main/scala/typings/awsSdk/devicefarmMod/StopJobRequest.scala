package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopJobRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm job to stop.
    */
  var arn: AmazonResourceName = js.native
}

object StopJobRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): StopJobRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRequest]
  }
}

