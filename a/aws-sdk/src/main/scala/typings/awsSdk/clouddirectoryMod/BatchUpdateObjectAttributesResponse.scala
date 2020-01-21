package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateObjectAttributesResponse extends js.Object {
  /**
    * ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object BatchUpdateObjectAttributesResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): BatchUpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateObjectAttributesResponse]
  }
}

