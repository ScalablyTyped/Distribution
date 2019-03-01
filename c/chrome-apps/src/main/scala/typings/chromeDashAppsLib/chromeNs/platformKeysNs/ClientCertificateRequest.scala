package typings
package chromeDashAppsLib.chromeNs.platformKeysNs

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
  var certificateAuthorities: js.Array[stdLib.ArrayBuffer]
  /**
    * This field is a list of the types of certificates requested, sorted in
    * order of the server's preference. Only certificates of a type contained
    * in this list will be retrieved. If *certificateTypes* is the
    * empty list, however, certificates of any type will be returned.
    * @see ClientCertificateType
    */
  var certificateTypes: js.Array[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ECDSASIGN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ECDSASIGN[keyof chrome-apps.Anon_ECDSASIGN] */ js.Any
      ]
    ]
  ]
}

object ClientCertificateRequest {
  @scala.inline
  def apply(
    certificateAuthorities: js.Array[stdLib.ArrayBuffer],
    certificateTypes: js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_ECDSASIGN, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_ECDSASIGN[keyof chrome-apps.Anon_ECDSASIGN] */ js.Any
        ]
      ]
    ]
  ): ClientCertificateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificateAuthorities")(certificateAuthorities)
    __obj.updateDynamic("certificateTypes")(certificateTypes)
    __obj.asInstanceOf[ClientCertificateRequest]
  }
}

