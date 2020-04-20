package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingGroupRequest extends js.Object {
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string = js.native
}

object DescribePackagingGroupRequest {
  @scala.inline
  def apply(Id: string): DescribePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingGroupRequest]
  }
}

