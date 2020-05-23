package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCountByEncryptionType extends js.Object {
  /**
    * Reserved for future use.
    */
  var kmsManaged: js.UndefOr[long] = js.native
  /**
    * Reserved for future use.
    */
  var s3Managed: js.UndefOr[long] = js.native
  /**
    * Reserved for future use.
    */
  var unencrypted: js.UndefOr[long] = js.native
}

object BucketCountByEncryptionType {
  @scala.inline
  def apply(
    kmsManaged: js.UndefOr[long] = js.undefined,
    s3Managed: js.UndefOr[long] = js.undefined,
    unencrypted: js.UndefOr[long] = js.undefined
  ): BucketCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(kmsManaged)) __obj.updateDynamic("kmsManaged")(kmsManaged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Managed)) __obj.updateDynamic("s3Managed")(s3Managed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unencrypted)) __obj.updateDynamic("unencrypted")(unencrypted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCountByEncryptionType]
  }
}

