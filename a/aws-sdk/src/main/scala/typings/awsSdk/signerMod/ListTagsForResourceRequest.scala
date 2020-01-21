package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var resourceArn: String = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: String): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

