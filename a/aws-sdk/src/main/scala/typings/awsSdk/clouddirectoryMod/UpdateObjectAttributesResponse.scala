package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateObjectAttributesResponse extends js.Object {
  /**
    * The ObjectIdentifier of the updated object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object UpdateObjectAttributesResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): UpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObjectAttributesResponse]
  }
}

