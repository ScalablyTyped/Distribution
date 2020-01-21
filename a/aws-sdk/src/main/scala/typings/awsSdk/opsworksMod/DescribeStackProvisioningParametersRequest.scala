package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackProvisioningParametersRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object DescribeStackProvisioningParametersRequest {
  @scala.inline
  def apply(StackId: String): DescribeStackProvisioningParametersRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStackProvisioningParametersRequest]
  }
}

