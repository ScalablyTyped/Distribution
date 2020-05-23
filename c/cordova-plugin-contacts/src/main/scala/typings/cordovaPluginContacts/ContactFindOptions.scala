package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Search options to filter navigator.contacts.  */
trait ContactFindOptions extends js.Object {
  /* Contact fields to be returned back. If specified, the resulting Contact object only features values for these fields. */
  var desiredFields: js.UndefOr[js.Array[ContactFieldType]] = js.undefined
  /** The search string used to find navigator.contacts. */
  var filter: js.UndefOr[String] = js.undefined
  /** Determines if the find operation returns multiple navigator.contacts. */
  var multiple: js.UndefOr[Boolean] = js.undefined
}

object ContactFindOptions {
  @scala.inline
  def apply(
    desiredFields: js.Array[ContactFieldType] = null,
    filter: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): ContactFindOptions = {
    val __obj = js.Dynamic.literal()
    if (desiredFields != null) __obj.updateDynamic("desiredFields")(desiredFields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactFindOptions]
  }
}

