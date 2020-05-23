package typings.awsSdkClientS3Browser.typesLifecycleExpirationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleExpiration extends js.Object {
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  var Date: js.UndefOr[typings.std.Date | String | Double] = js.undefined
  /**
    * <p>Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.</p>
    */
  var Days: js.UndefOr[Double] = js.undefined
  /**
    * <p>Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.</p>
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
}

object LifecycleExpiration {
  @scala.inline
  def apply(
    Date: Date | String | Double = null,
    Days: js.UndefOr[Double] = js.undefined,
    ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  ): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date.asInstanceOf[js.Any])
    if (!js.isUndefined(Days)) __obj.updateDynamic("Days")(Days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ExpiredObjectDeleteMarker)) __obj.updateDynamic("ExpiredObjectDeleteMarker")(ExpiredObjectDeleteMarker.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleExpiration]
  }
}

