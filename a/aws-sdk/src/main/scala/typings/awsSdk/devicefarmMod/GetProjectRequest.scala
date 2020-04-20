package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProjectRequest extends js.Object {
  /**
    * The project's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetProjectRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectRequest]
  }
}

