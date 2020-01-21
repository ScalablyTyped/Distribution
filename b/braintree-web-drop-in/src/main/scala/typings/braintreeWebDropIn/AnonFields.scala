package typings.braintreeWebDropIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
}

object AnonFields {
  @scala.inline
  def apply(fields: js.Object = null, styles: js.Object = null): AnonFields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

