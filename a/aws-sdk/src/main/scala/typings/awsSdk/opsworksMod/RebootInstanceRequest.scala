package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object RebootInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstanceRequest]
  }
}

