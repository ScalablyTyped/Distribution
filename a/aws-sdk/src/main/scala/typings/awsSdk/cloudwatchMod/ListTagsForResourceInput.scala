package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The ARN of the CloudWatch resource that you want to view tags for. For more information on ARN format, see Example ARNs in the Amazon Web Services General Reference.
    */
  var ResourceARN: AmazonResourceName = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

