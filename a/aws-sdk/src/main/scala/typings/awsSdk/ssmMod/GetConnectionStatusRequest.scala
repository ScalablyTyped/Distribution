package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionStatusRequest extends js.Object {
  /**
    * The ID of the instance.
    */
  var Target: SessionTarget = js.native
}

object GetConnectionStatusRequest {
  @scala.inline
  def apply(Target: SessionTarget): GetConnectionStatusRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConnectionStatusRequest]
  }
}

