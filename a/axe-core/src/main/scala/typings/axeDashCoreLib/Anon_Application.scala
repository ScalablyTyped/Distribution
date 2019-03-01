package typings
package axeDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Application extends js.Object {
  var application: java.lang.String
  var brand: java.lang.String
}

object Anon_Application {
  @scala.inline
  def apply(application: java.lang.String, brand: java.lang.String): Anon_Application = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application")(application)
    __obj.updateDynamic("brand")(brand)
    __obj.asInstanceOf[Anon_Application]
  }
}

