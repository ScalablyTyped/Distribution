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

