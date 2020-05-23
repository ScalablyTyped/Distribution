package typings.cfenv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var application: js.UndefOr[String] = js.undefined
  var services: js.UndefOr[String] = js.undefined
}

object Application {
  @scala.inline
  def apply(application: String = null, services: String = null): Application = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

