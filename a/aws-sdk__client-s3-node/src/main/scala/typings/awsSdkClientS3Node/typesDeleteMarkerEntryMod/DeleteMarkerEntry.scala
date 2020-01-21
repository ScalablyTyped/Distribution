package typings.awsSdkClientS3Node.typesDeleteMarkerEntryMod

import typings.awsSdkClientS3Node.typesOwnerMod.Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMarkerEntry extends js.Object {
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
    * <p>Version ID of an object.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object DeleteMarkerEntry {
  @scala.inline
  def apply(
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: Date | String | Double = null,
    Owner: Owner = null,
    VersionId: String = null
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

