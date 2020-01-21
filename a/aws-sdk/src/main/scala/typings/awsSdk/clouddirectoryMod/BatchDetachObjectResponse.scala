package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier of the detached object.
    */
  var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object BatchDetachObjectResponse {
  @scala.inline
  def apply(detachedObjectIdentifier: ObjectIdentifier = null): BatchDetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (detachedObjectIdentifier != null) __obj.updateDynamic("detachedObjectIdentifier")(detachedObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachObjectResponse]
  }
}

