package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEbsEncryptionByDefaultResult extends js.Object {
  /**
    * Indicates whether encryption by default is enabled.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.native
}

object GetEbsEncryptionByDefaultResult {
  @scala.inline
  def apply(EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined): GetEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EbsEncryptionByDefault)) __obj.updateDynamic("EbsEncryptionByDefault")(EbsEncryptionByDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEbsEncryptionByDefaultResult]
  }
}

