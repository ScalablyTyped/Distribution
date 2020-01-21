package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCertificatesMessage extends js.Object {
  /**
    * The new default certificate identifier to override the current one with. To determine the valid values, use the describe-certificates AWS CLI command or the DescribeCertificates API operation.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to remove the override for the default certificate. If the override is removed, the default certificate is the system default.
    */
  var RemoveCustomerOverride: js.UndefOr[BooleanOptional] = js.native
}

object ModifyCertificatesMessage {
  @scala.inline
  def apply(
    CertificateIdentifier: String = null,
    RemoveCustomerOverride: js.UndefOr[scala.Boolean] = js.undefined
  ): ModifyCertificatesMessage = {
    val __obj = js.Dynamic.literal()
    if (CertificateIdentifier != null) __obj.updateDynamic("CertificateIdentifier")(CertificateIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(RemoveCustomerOverride)) __obj.updateDynamic("RemoveCustomerOverride")(RemoveCustomerOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCertificatesMessage]
  }
}

