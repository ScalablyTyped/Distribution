package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreDeleteMarkerEntryMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledDeleteMarkerEntry extends _DeleteMarkerEntry {
  /**
    * <p>Date and time the object was last modified.</p>
    */
  @JSName("LastModified")
  var LastModified__UnmarshalledDeleteMarkerEntry: js.UndefOr[Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner__UnmarshalledDeleteMarkerEntry: js.UndefOr[_UnmarshalledOwner] = js.undefined
}

object _UnmarshalledDeleteMarkerEntry {
  @scala.inline
  def apply(
    IsLatest: js.UndefOr[Boolean] = js.undefined,
    Key: String = null,
    LastModified: Date = null,
    Owner: _UnmarshalledOwner = null,
    VersionId: String = null
  ): _UnmarshalledDeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsLatest)) __obj.updateDynamic("IsLatest")(IsLatest)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[_UnmarshalledDeleteMarkerEntry]
  }
}

