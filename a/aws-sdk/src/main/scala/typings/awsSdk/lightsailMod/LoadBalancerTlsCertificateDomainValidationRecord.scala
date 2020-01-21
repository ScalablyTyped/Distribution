package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateDomainValidationRecord extends js.Object {
  /**
    * The domain name against which your SSL/TLS certificate was validated.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    * A fully qualified domain name in the certificate. For example, example.com.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of validation record. For example, CNAME for domain validation.
    */
  var `type`: js.UndefOr[NonEmptyString] = js.native
  /**
    * The validation status. Valid values are listed below.
    */
  var validationStatus: js.UndefOr[LoadBalancerTlsCertificateDomainStatus] = js.native
  /**
    * The value for that type.
    */
  var value: js.UndefOr[NonEmptyString] = js.native
}

object LoadBalancerTlsCertificateDomainValidationRecord {
  @scala.inline
  def apply(
    domainName: DomainName = null,
    name: NonEmptyString = null,
    `type`: NonEmptyString = null,
    validationStatus: LoadBalancerTlsCertificateDomainStatus = null,
    value: NonEmptyString = null
  ): LoadBalancerTlsCertificateDomainValidationRecord = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerTlsCertificateDomainValidationRecord]
  }
}

