package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile you are requesting to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteInstanceProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceProfileRequest]
  }
}

