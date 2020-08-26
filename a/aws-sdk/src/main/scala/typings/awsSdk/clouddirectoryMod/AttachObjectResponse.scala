package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachObjectResponse extends js.Object {
  /**
    * The attached ObjectIdentifier, which is the child ObjectIdentifier.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object AttachObjectResponse {
  @scala.inline
  def apply(): AttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachObjectResponse]
  }
  @scala.inline
  implicit class AttachObjectResponseOps[Self <: AttachObjectResponse] (val x: Self) extends AnyVal {
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
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = this.set("AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedObjectIdentifier: Self = this.set("AttachedObjectIdentifier", js.undefined)
  }
  
}

