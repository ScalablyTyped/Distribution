package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsRequest extends js.Object {
  /**
    * The Amazon Resource Names (ARNs) of the resources.
    */
  var resourceArns: ResourceArnList = js.native
}

object DescribeTagsRequest {
  @scala.inline
  def apply(resourceArns: ResourceArnList): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTagsRequest]
  }
}

