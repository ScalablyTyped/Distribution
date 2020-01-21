package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that has been attached.
    */
  var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object BatchAttachObjectResponse {
  @scala.inline
  def apply(attachedObjectIdentifier: ObjectIdentifier = null): BatchAttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (attachedObjectIdentifier != null) __obj.updateDynamic("attachedObjectIdentifier")(attachedObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachObjectResponse]
  }
}

