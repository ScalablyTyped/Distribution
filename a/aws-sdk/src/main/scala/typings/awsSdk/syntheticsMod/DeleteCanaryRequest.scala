package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCanaryRequest extends js.Object {
  /**
    * The name of the canary that you want to delete. To find the names of your canaries, use DescribeCanaries.
    */
  var Name: CanaryName = js.native
}

object DeleteCanaryRequest {
  @scala.inline
  def apply(Name: CanaryName): DeleteCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCanaryRequest]
  }
}

