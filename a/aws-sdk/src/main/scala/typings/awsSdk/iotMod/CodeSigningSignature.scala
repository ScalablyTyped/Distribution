package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigningSignature extends js.Object {
  /**
    * A base64 encoded binary representation of the code signing signature.
    */
  var inlineDocument: js.UndefOr[Signature] = js.native
}

object CodeSigningSignature {
  @scala.inline
  def apply(): CodeSigningSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningSignature]
  }
  @scala.inline
  implicit class CodeSigningSignatureOps[Self <: CodeSigningSignature] (val x: Self) extends AnyVal {
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
    def setInlineDocument(value: Signature): Self = this.set("inlineDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineDocument: Self = this.set("inlineDocument", js.undefined)
  }
  
}

