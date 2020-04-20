package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are querying. 
    */
  var ResourceArn: ComprehendArn = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: ComprehendArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

