package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectCountByEncryptionType extends js.Object {
  /**
    * Reserved for future use.
    */
  var customerManaged: js.UndefOr[long] = js.native
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

object ObjectCountByEncryptionType {
  @scala.inline
  def apply(
    customerManaged: js.UndefOr[long] = js.undefined,
    kmsManaged: js.UndefOr[long] = js.undefined,
    s3Managed: js.UndefOr[long] = js.undefined,
    unencrypted: js.UndefOr[long] = js.undefined
  ): ObjectCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(customerManaged)) __obj.updateDynamic("customerManaged")(customerManaged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(kmsManaged)) __obj.updateDynamic("kmsManaged")(kmsManaged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3Managed)) __obj.updateDynamic("s3Managed")(s3Managed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unencrypted)) __obj.updateDynamic("unencrypted")(unencrypted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectCountByEncryptionType]
  }
}

