package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCanaryRequest extends js.Object {
  /**
    * The name of the canary that you want to run. To find canary names, use DescribeCanaries.
    */
  var Name: CanaryName = js.native
}

object StartCanaryRequest {
  @scala.inline
  def apply(Name: CanaryName): StartCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCanaryRequest]
  }
}

