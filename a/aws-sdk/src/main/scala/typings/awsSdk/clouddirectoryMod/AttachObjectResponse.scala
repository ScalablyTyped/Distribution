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
  def apply(AttachedObjectIdentifier: ObjectIdentifier = null): AttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedObjectIdentifier != null) __obj.updateDynamic("AttachedObjectIdentifier")(AttachedObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachObjectResponse]
  }
}

