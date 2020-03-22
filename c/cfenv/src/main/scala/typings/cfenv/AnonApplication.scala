package typings.cfenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApplication extends js.Object {
  var application: js.UndefOr[String] = js.undefined
  var services: js.UndefOr[String] = js.undefined
}

object AnonApplication {
  @scala.inline
  def apply(application: String = null, services: String = null): AnonApplication = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplication]
  }
}

