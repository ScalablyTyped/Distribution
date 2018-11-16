package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IssuerSubjectPattern extends js.Object {
  /** If set, the value against which to match the certificate subject's common name. */
  var CommonName: js.UndefOr[java.lang.String] = js.undefined
  /** If set, the value against which to match the certificate subject's common location. */
  var Locality: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If set, the value against which to match the certificate subject's organizations.
               * At least one organization should match the value.
               */
  var Organization: js.UndefOr[java.lang.String] = js.undefined
  /**
               * If set, the value against which to match the certificate subject's organizational units.
               * At least one organizational unit should match the value.
               */
  var OrganizationalUnit: js.UndefOr[java.lang.String] = js.undefined
}

