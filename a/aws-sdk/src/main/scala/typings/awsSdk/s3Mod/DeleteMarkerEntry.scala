package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerEntry extends js.Object {
  /**
    * Specifies whether the object is (true) or is not (false) the latest version of an object.
    */
  var IsLatest: js.UndefOr[typings.awsSdk.s3Mod.IsLatest] = js.native
  /**
    * The object key.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * Date and time the object was last modified.
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.native
  /**
    * The account that created the delete marker.&gt;
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object DeleteMarkerEntry {
  @scala.inline
  def apply(
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: ObjectKey = null,
    LastModified: LastModified = null,
    Owner: Owner = null,
    VersionId: ObjectVersionId = null
  ): DeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMarkerEntry]
  }
}

