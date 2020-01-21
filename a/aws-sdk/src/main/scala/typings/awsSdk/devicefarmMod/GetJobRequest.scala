package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRequest extends js.Object {
  /**
    * The job's ARN.
    */
  var arn: AmazonResourceName = js.native
}

object GetJobRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): GetJobRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

