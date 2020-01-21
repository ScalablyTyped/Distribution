package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLunaClientResponse extends js.Object {
  /**
    * The certificate installed on the HSMs used by this client.
    */
  var Certificate: js.UndefOr[typings.awsSdk.cloudhsmMod.Certificate] = js.native
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typings.awsSdk.cloudhsmMod.CertificateFingerprint] = js.native
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsSdk.cloudhsmMod.ClientArn] = js.native
  /**
    * The label of the client.
    */
  var Label: js.UndefOr[typings.awsSdk.cloudhsmMod.Label] = js.native
  /**
    * The date and time the client was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
}

object DescribeLunaClientResponse {
  @scala.inline
  def apply(
    Certificate: Certificate = null,
    CertificateFingerprint: CertificateFingerprint = null,
    ClientArn: ClientArn = null,
    Label: Label = null,
    LastModifiedTimestamp: Timestamp = null
  ): DescribeLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (CertificateFingerprint != null) __obj.updateDynamic("CertificateFingerprint")(CertificateFingerprint.asInstanceOf[js.Any])
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLunaClientResponse]
  }
}

