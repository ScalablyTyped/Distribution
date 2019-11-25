package typings.axeDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Application extends js.Object {
  var application: js.UndefOr[String] = js.undefined
  var brand: js.UndefOr[String] = js.undefined
}

object Anon_Application {
  @scala.inline
  def apply(application: String = null, brand: String = null): Anon_Application = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Application]
  }
}

