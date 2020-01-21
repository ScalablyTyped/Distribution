package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobAttributeValue extends js.Object {
  var Value: js.UndefOr[_Blob] = js.native
}

object BlobAttributeValue {
  @scala.inline
  def apply(Value: _Blob = null): BlobAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobAttributeValue]
  }
}

