package typings.awsSdkClientS3Node.typesTransitionMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTransition extends Transition {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  @JSName("Date")
  var Date_UnmarshalledTransition: js.UndefOr[Date] = js.undefined
}

object UnmarshalledTransition {
  @scala.inline
  def apply(
    Date: Date = null,
    Days: js.UndefOr[Double] = js.undefined,
    StorageClass: GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): UnmarshalledTransition = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days.get.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTransition]
  }
}

