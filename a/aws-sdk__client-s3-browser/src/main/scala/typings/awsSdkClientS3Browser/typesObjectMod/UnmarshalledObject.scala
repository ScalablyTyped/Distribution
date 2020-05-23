package typings.awsSdkClientS3Browser.typesObjectMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GLACIER
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledObject extends Object {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledObject: js.UndefOr[Date] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledObject: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object UnmarshalledObject {
  @scala.inline
  def apply(
    ETag: String = null,
    Key: String = null,
    LastModified: Date = null,
    Owner: UnmarshalledOwner = null,
    Size: js.UndefOr[Double] = js.undefined,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): UnmarshalledObject = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledObject]
  }
}

