package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the index, FAQ, or data source to get a list of tags for.
    */
  var ResourceARN: AmazonResourceName = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

