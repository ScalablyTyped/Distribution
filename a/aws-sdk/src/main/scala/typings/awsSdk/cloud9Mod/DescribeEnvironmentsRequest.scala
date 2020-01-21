package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentsRequest extends js.Object {
  /**
    * The IDs of individual environments to get information about.
    */
  var environmentIds: BoundedEnvironmentIdList = js.native
}

object DescribeEnvironmentsRequest {
  @scala.inline
  def apply(environmentIds: BoundedEnvironmentIdList): DescribeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal(environmentIds = environmentIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeEnvironmentsRequest]
  }
}

