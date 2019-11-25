package typings.braintreeDashWebDashDropDashIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: js.UndefOr[js.Object] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(fields: js.Object = null, styles: js.Object = null): Anon_Fields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fields]
  }
}

