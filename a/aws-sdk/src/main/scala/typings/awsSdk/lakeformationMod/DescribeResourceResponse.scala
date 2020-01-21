package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceResponse extends js.Object {
  /**
    * A structure containing information about an AWS Lake Formation resource.
    */
  var ResourceInfo: js.UndefOr[typings.awsSdk.lakeformationMod.ResourceInfo] = js.native
}

object DescribeResourceResponse {
  @scala.inline
  def apply(ResourceInfo: ResourceInfo = null): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceInfo != null) __obj.updateDynamic("ResourceInfo")(ResourceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceResponse]
  }
}

