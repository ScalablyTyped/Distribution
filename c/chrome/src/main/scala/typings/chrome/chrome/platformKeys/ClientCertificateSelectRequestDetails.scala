package typings.chrome.chrome.platformKeys

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificateSelectRequestDetails extends js.Object {
  /** List of distinguished names of certificate authorities allowed by the server. Each entry must be a DER-encoded X.509 DistinguishedName. */
  var certificateAuthorities: js.Array[ArrayBuffer]
  /** This field is a list of the types of certificates requested, sorted in order of the server's preference. Only certificates of a type contained in this list will be retrieved. If certificateTypes is the empty list, however, certificates of any type will be returned. */
  var certificateTypes: js.Array[String]
}

object ClientCertificateSelectRequestDetails {
  @scala.inline
  def apply(certificateAuthorities: js.Array[ArrayBuffer], certificateTypes: js.Array[String]): ClientCertificateSelectRequestDetails = {
    val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateSelectRequestDetails]
  }
}

