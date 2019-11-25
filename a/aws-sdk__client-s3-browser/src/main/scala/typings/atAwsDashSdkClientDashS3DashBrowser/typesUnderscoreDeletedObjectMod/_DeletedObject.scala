package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreDeletedObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeletedObject extends js.Object {
  /**
    * _DeleteMarker shape
    */
  var DeleteMarker: js.UndefOr[Boolean] = js.undefined
  /**
    * _DeleteMarkerVersionId shape
    */
  var DeleteMarkerVersionId: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object _DeletedObject {
  @scala.inline
  def apply(
    DeleteMarker: js.UndefOr[Boolean] = js.undefined,
    DeleteMarkerVersionId: String = null,
    Key: String = null,
    VersionId: String = null
  ): _DeletedObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteMarker)) __obj.updateDynamic("DeleteMarker")(DeleteMarker.asInstanceOf[js.Any])
    if (DeleteMarkerVersionId != null) __obj.updateDynamic("DeleteMarkerVersionId")(DeleteMarkerVersionId.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeletedObject]
  }
}

