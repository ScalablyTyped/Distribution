package typings.awsSdkClientS3Node.typesObjectVersionMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.typesOwnerMod.Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectVersion extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies whether the object is (true) or is not (false) the latest version of an object.</p>
    */
  var IsLatest: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The object key.</p>
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * <p>Date and time the object was last modified.</p>
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typings.awsSdkClientS3Node.typesOwnerMod.Owner] = js.undefined
  /**
    * <p>Size in bytes of the object.</p>
    */
  var Size: js.UndefOr[Double] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | String] = js.undefined
  /**
    * <p>Version ID of an object.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object ObjectVersion {
  @scala.inline
  def apply(
    ETag: String = null,
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: Date | String | Double = null,
    Owner: Owner = null,
    Size: js.UndefOr[Double] = js.undefined,
    StorageClass: STANDARD | String = null,
    VersionId: String = null
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

