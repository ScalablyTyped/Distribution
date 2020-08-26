package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateByteMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: ResourceName = js.native
}

object CreateByteMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateByteMatchSetRequest]
  }
  @scala.inline
  implicit class CreateByteMatchSetRequestOps[Self <: CreateByteMatchSetRequest] (val x: Self) extends AnyVal {
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

