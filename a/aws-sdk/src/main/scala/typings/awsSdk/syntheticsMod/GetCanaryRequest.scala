package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCanaryRequest extends js.Object {
  /**
    * The name of the canary that you want details for.
    */
  var Name: CanaryName = js.native
}

object GetCanaryRequest {
  @scala.inline
  def apply(Name: CanaryName): GetCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRequest]
  }
}

