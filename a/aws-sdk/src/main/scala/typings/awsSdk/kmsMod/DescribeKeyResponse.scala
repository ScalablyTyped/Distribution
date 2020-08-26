package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyResponse extends js.Object {
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[typings.awsSdk.kmsMod.KeyMetadata] = js.native
}

object DescribeKeyResponse {
  @scala.inline
  def apply(): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyResponse]
  }
  @scala.inline
  implicit class DescribeKeyResponseOps[Self <: DescribeKeyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyMetadata(value: KeyMetadata): Self = this.set("KeyMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMetadata: Self = this.set("KeyMetadata", js.undefined)
  }
  
}

