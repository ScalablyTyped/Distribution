package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachTypedLinkResponse extends js.Object {
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier] = js.native
}

object BatchAttachTypedLinkResponse {
  @scala.inline
  def apply(): BatchAttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachTypedLinkResponse]
  }
  @scala.inline
  implicit class BatchAttachTypedLinkResponseOps[Self <: BatchAttachTypedLinkResponse] (val x: Self) extends AnyVal {
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
    def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = this.set("TypedLinkSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypedLinkSpecifier: Self = this.set("TypedLinkSpecifier", js.undefined)
  }
  
}

