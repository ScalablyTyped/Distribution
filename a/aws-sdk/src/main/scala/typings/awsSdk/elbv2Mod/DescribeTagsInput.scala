package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var ResourceArns: typings.awsSdk.elbv2Mod.ResourceArns = js.native
}

object DescribeTagsInput {
  @scala.inline
  def apply(ResourceArns: ResourceArns): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTagsInput]
  }
}

