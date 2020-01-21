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
  def apply(inlineDocument: Signature = null): CodeSigningSignature = {
    val __obj = js.Dynamic.literal()
    if (inlineDocument != null) __obj.updateDynamic("inlineDocument")(inlineDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSigningSignature]
  }
}

