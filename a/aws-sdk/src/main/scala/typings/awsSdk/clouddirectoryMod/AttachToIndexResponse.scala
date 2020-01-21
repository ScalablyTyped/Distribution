package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachToIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object AttachToIndexResponse {
  @scala.inline
  def apply(AttachedObjectIdentifier: ObjectIdentifier = null): AttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (AttachedObjectIdentifier != null) __obj.updateDynamic("AttachedObjectIdentifier")(AttachedObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToIndexResponse]
  }
}

