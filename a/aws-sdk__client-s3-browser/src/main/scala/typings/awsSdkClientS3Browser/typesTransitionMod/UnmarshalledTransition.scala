package typings.awsSdkClientS3Browser.typesTransitionMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GLACIER
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
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
    Days: Int | Double = null,
    StorageClass: GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): UnmarshalledTransition = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (Days != null) __obj.updateDynamic("Days")(Days.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTransition]
  }
}

