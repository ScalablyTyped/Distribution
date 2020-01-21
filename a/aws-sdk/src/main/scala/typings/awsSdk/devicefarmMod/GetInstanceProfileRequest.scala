package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an instance profile.
    */
  var arn: AmazonResourceName = js.native
}

object GetInstanceProfileRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceProfileRequest]
  }
}

