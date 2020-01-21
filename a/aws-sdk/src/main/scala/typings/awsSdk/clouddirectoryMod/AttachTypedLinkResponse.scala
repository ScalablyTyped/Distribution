package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachTypedLinkResponse extends js.Object {
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier] = js.native
}

object AttachTypedLinkResponse {
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier = null): AttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (TypedLinkSpecifier != null) __obj.updateDynamic("TypedLinkSpecifier")(TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachTypedLinkResponse]
  }
}

