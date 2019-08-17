package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreObjectVersionMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ObjectVersion extends js.Object {
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
  var Owner: js.UndefOr[_Owner] = js.undefined
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

object _ObjectVersion {
  @scala.inline
  def apply(
    ETag: String = null,
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: Date | String | Double = null,
    Owner: _Owner = null,
    Size: Int | Double = null,
    StorageClass: STANDARD | String = null,
    VersionId: String = null
  ): _ObjectVersion = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[_ObjectVersion]
  }
}

