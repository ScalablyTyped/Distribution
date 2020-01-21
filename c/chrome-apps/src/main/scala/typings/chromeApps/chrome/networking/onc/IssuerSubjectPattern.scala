package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerSubjectPattern extends js.Object {
  /** If set, the value against which to match the certificate subject's common name. */
  var CommonName: js.UndefOr[String] = js.undefined
  /** If set, the value against which to match the certificate subject's common location. */
  var Locality: js.UndefOr[String] = js.undefined
  /**
    * If set, the value against which to match the certificate subject's organizations.
    * At least one organization should match the value.
    */
  var Organization: js.UndefOr[String] = js.undefined
  /**
    * If set, the value against which to match the certificate subject's organizational units.
    * At least one organizational unit should match the value.
    */
  var OrganizationalUnit: js.UndefOr[String] = js.undefined
}

object IssuerSubjectPattern {
  @scala.inline
  def apply(
    CommonName: String = null,
    Locality: String = null,
    Organization: String = null,
    OrganizationalUnit: String = null
  ): IssuerSubjectPattern = {
    val __obj = js.Dynamic.literal()
    if (CommonName != null) __obj.updateDynamic("CommonName")(CommonName.asInstanceOf[js.Any])
    if (Locality != null) __obj.updateDynamic("Locality")(Locality.asInstanceOf[js.Any])
    if (Organization != null) __obj.updateDynamic("Organization")(Organization.asInstanceOf[js.Any])
    if (OrganizationalUnit != null) __obj.updateDynamic("OrganizationalUnit")(OrganizationalUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerSubjectPattern]
  }
}

