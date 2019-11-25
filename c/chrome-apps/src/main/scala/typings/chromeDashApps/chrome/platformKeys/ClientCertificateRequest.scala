package typings.chromeDashApps.chrome.platformKeys

import typings.chromeDashApps.Anon_ECDSASIGN
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.ecdsaSign
import typings.chromeDashApps.chromeDashAppsStrings.rsaSign
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Analogous to TLS1.1's CertificateRequest.
  * @see{@link http://tools.ietf.org/html/rfc4346#section-7.4.4}
  */
trait ClientCertificateRequest extends js.Object {
  /**
    * List of distinguished names of certificate authorities allowed by the
    * server. Each entry must be a DER-encoded X.509 DistinguishedName.
    */
  var certificateAuthorities: js.Array[ArrayBuffer]
  /**
    * This field is a list of the types of certificates requested, sorted in
    * order of the server's preference. Only certificates of a type contained
    * in this list will be retrieved. If *certificateTypes* is the
    * empty list, however, certificates of any type will be returned.
    * @see ClientCertificateType
    */
  var certificateTypes: js.Array[ToStringLiteral[Anon_ECDSASIGN, String, Exclude[String, rsaSign | ecdsaSign]]]
}

object ClientCertificateRequest {
  @scala.inline
  def apply(
    certificateAuthorities: js.Array[ArrayBuffer],
    certificateTypes: js.Array[ToStringLiteral[Anon_ECDSASIGN, String, Exclude[String, rsaSign | ecdsaSign]]]
  ): ClientCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientCertificateRequest]
  }
}

