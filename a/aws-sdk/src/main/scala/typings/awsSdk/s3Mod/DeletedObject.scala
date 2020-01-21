package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletedObject extends js.Object {
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker. In a simple DELETE, this header indicates whether (true) or not (false) a delete marker was created.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarker] = js.native
  /**
    * The version ID of the delete marker created as a result of the DELETE operation. If you delete a specific object version, the value returned by this header is the version ID of the object version deleted.
    */
  var DeleteMarkerVersionId: js.UndefOr[typings.awsSdk.s3Mod.DeleteMarkerVersionId] = js.native
  /**
    * The name of the deleted object.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * The version ID of the deleted object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeletedObject {
  @scala.inline
  def apply(
    DeleteMarker: js.UndefOr[Boolean] = js.undefined,
    DeleteMarkerVersionId: DeleteMarkerVersionId = null,
    Key: ObjectKey = null,
    VersionId: ObjectVersionId = null
  ): DeletedObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker.asInstanceOf[js.Any])
    if (DeleteMarkerVersionId != null) __obj.updateDynamic("DeleteMarkerVersionId")(DeleteMarkerVersionId.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedObject]
  }
}

