package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRunRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the run to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteRunRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRunRequest]
  }
}

