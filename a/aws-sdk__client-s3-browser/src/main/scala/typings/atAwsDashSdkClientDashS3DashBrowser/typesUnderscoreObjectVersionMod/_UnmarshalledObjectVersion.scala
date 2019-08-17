package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreObjectVersionMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledObjectVersion extends _ObjectVersion {
  /**
    * <p>Date and time the object was last modified.</p>
    */
  @JSName("LastModified")
  var LastModified__UnmarshalledObjectVersion: js.UndefOr[Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner__UnmarshalledObjectVersion: js.UndefOr[_UnmarshalledOwner] = js.undefined
}

object _UnmarshalledObjectVersion {
  @scala.inline
  def apply(
    ETag: String = null,
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: Date = null,
    Owner: _UnmarshalledOwner = null,
    Size: Int | Double = null,
    StorageClass: STANDARD | String = null,
    VersionId: String = null
  ): _UnmarshalledObjectVersion = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[_UnmarshalledObjectVersion]
  }
}

