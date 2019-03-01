package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertPattern extends js.Object {
  /**
    * List of URIs to which the user can be directed in case
    * no certificates that match this pattern are found.
    */
  var EnrollmentURI: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If set, pattern against which X.509 issuer settings should be matched.
    */
  var Issuer: js.UndefOr[IssuerSubjectPattern] = js.undefined
  /**
    * List of certificate issuer CA certificates.
    * A certificate must be signed by one of them in order to match this pattern.
    */
  var IssuerCARef: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If set, pattern against which X.509 subject settings should be matched.
    */
  var IssuerSubjectPattern: js.UndefOr[IssuerSubjectPattern] = js.undefined
}

object CertPattern {
  @scala.inline
  def apply(
    EnrollmentURI: js.Array[java.lang.String] = null,
    Issuer: IssuerSubjectPattern = null,
    IssuerCARef: js.Array[java.lang.String] = null,
    IssuerSubjectPattern: IssuerSubjectPattern = null
  ): CertPattern = {
    val __obj = js.Dynamic.literal()
    if (EnrollmentURI != null) __obj.updateDynamic("EnrollmentURI")(EnrollmentURI)
    if (Issuer != null) __obj.updateDynamic("Issuer")(Issuer)
    if (IssuerCARef != null) __obj.updateDynamic("IssuerCARef")(IssuerCARef)
    if (IssuerSubjectPattern != null) __obj.updateDynamic("IssuerSubjectPattern")(IssuerSubjectPattern)
    __obj.asInstanceOf[CertPattern]
  }
}

