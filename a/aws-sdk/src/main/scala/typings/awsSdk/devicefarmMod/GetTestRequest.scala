package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestRequest extends js.Object {
  /**
    * The test's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetTestRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetTestRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestRequest]
  }
}

