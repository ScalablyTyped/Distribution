package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) from which you want to remove the tags. For example:  arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger 
    */
  var ResourceArn: Arn = js.native
  /**
    * The list of tag keys that you want to remove.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: Arn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

