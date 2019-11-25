package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreObjectMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.GLACIER
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ONEZONE_IA
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.REDUCED_REDUNDANCY
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.STANDARD_IA
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Object extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * _LastModified shape
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[_Owner] = js.undefined
  /**
    * _Size shape
    */
  var Size: js.UndefOr[Double] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.undefined
}

object _Object {
  @scala.inline
  def apply(
    ETag: String = null,
    Key: String = null,
    LastModified: Date | String | Double = null,
    Owner: _Owner = null,
    Size: Int | Double = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): _Object = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Object]
  }
}

