package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.GLACIER
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledObject extends _Object {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified__UnmarshalledObject: js.UndefOr[Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner__UnmarshalledObject: js.UndefOr[_UnmarshalledOwner] = js.undefined
}

object _UnmarshalledObject {
  @scala.inline
  def apply(
    ETag: String = null,
    Key: String = null,
    LastModified: Date = null,
    Owner: _UnmarshalledOwner = null,
    Size: Int | Double = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): _UnmarshalledObject = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledObject]
  }
}

