package typings.awsSdkClientS3Browser.typesObjectVersionMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledObjectVersion extends ObjectVersion {
  /**
    * <p>Date and time the object was last modified.</p>
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledObjectVersion: js.UndefOr[Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledObjectVersion: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object UnmarshalledObjectVersion {
  @scala.inline
  def apply(
    ETag: String = null,
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: Date = null,
    Owner: UnmarshalledOwner = null,
    Size: js.UndefOr[Double] = js.undefined,
    StorageClass: STANDARD | String = null,
    VersionId: String = null
  ): UnmarshalledObjectVersion = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest.get.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledObjectVersion]
  }
}

