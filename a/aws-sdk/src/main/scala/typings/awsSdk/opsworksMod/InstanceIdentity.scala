package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceIdentity extends js.Object {
  /**
    * A JSON document that contains the metadata.
    */
  var Document: js.UndefOr[String] = js.native
  /**
    * A signature that can be used to verify the document's accuracy and authenticity.
    */
  var Signature: js.UndefOr[String] = js.native
}

object InstanceIdentity {
  @scala.inline
  def apply(): InstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIdentity]
  }
  @scala.inline
  implicit class InstanceIdentityOps[Self <: InstanceIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: String): Self = this.set("Document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("Document", js.undefined)
    @scala.inline
    def setSignature(value: String): Self = this.set("Signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
  }
  
}

