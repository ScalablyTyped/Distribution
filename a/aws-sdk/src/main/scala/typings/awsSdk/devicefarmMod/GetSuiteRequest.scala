package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuiteRequest extends js.Object {
  /**
    * The suite's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetSuiteRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetSuiteRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteRequest]
  }
}

