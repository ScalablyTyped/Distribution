package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchCreateIndexResponse extends js.Object {
  /**
    * The ObjectIdentifier of the index created by this operation.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object BatchCreateIndexResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null): BatchCreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateIndexResponse]
  }
}

