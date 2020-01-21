package typings.awsSdkClientS3Node.typesTransitionMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  var Date: js.UndefOr[typings.std.Date | String | Double] = js.undefined
  /**
    * <p>Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.</p>
    */
  var Days: js.UndefOr[Double] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.undefined
}

object Transition {
  @scala.inline
  def apply(
    Date: Date | String | Double = null,
    Days: Int | Double = null,
    StorageClass: GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): Transition = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

