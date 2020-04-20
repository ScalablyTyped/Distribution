package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the signing profile.
    */
  var resourceArn: String = js.native
  /**
    * A list of tag keys to be removed from the signing profile.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

