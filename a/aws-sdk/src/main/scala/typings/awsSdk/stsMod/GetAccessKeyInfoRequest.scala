package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessKeyInfoRequest extends js.Object {
  /**
    * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or lowercase letter or digit.
    */
  var AccessKeyId: accessKeyIdType = js.native
}

object GetAccessKeyInfoRequest {
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType): GetAccessKeyInfoRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessKeyInfoRequest]
  }
}

