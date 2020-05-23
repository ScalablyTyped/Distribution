package typings.awsSdkClientS3Node.typesLifecycleExpirationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledLifecycleExpiration extends LifecycleExpiration {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  @JSName("Date")
  var Date_UnmarshalledLifecycleExpiration: js.UndefOr[Date] = js.undefined
}

object UnmarshalledLifecycleExpiration {
  @scala.inline
  def apply(
    Date: Date = null,
    Days: js.UndefOr[Double] = js.undefined,
    ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  ): UnmarshalledLifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpiredObjectDeleteMarker)) __obj.updateDynamic("ExpiredObjectDeleteMarker")(ExpiredObjectDeleteMarker.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleExpiration]
  }
}

