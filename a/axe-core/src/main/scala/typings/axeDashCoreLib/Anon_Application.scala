package typings
package axeDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Application extends js.Object {
  var application: js.UndefOr[java.lang.String] = js.undefined
  var brand: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Application {
  @scala.inline
  def apply(application: java.lang.String = null, brand: java.lang.String = null): Anon_Application = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    __obj.asInstanceOf[Anon_Application]
  }
}

