package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectVersion extends js.Object {
  /**
    * The entity tag is an MD5 hash of that version of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
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
    * Specifies the owner of the object.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  /**
    * Size in bytes of the object.
    */
  var Size: js.UndefOr[typings.awsSdk.s3Mod.Size] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.native
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object ObjectVersion {
  @scala.inline
  def apply(
    ETag: ETag = null,
    IsLatest: js.UndefOr[IsLatest] = js.undefined,
    Key: ObjectKey = null,
    LastModified: LastModified = null,
    Owner: Owner = null,
    Size: js.UndefOr[Size] = js.undefined,
    StorageClass: ObjectVersionStorageClass = null,
    VersionId: ObjectVersionId = null
  ): ObjectVersion = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest.get.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectVersion]
  }
}

