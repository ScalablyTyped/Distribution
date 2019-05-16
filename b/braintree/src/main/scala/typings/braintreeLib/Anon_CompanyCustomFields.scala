package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompanyCustomFields extends js.Object {
  var company: js.UndefOr[java.lang.String] = js.undefined
  var customFields: js.UndefOr[js.Any] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var fax: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var phone: js.UndefOr[java.lang.String] = js.undefined
  var website: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CompanyCustomFields {
  @scala.inline
  def apply(
    id: java.lang.String,
    company: java.lang.String = null,
    customFields: js.Any = null,
    email: java.lang.String = null,
    fax: java.lang.String = null,
    firstName: java.lang.String = null,
    lastName: java.lang.String = null,
    phone: java.lang.String = null,
    website: java.lang.String = null
  ): Anon_CompanyCustomFields = {
    val __obj = js.Dynamic.literal(id = id)
    if (company != null) __obj.updateDynamic("company")(company)
    if (customFields != null) __obj.updateDynamic("customFields")(customFields)
    if (email != null) __obj.updateDynamic("email")(email)
    if (fax != null) __obj.updateDynamic("fax")(fax)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Anon_CompanyCustomFields]
  }
}

