package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlatformApplicationAttributesInput extends js.Object {
  /**
    * PlatformApplicationArn for GetPlatformApplicationAttributesInput.
    */
  var PlatformApplicationArn: String = js.native
}

object GetPlatformApplicationAttributesInput {
  @scala.inline
  def apply(PlatformApplicationArn: String): GetPlatformApplicationAttributesInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlatformApplicationAttributesInput]
  }
}

