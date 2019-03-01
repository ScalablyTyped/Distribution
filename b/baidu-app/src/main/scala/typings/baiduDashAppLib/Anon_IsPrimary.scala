package typings
package baiduDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsPrimary extends js.Object {
  var isPrimary: scala.Boolean
  var uuid: java.lang.String
}

object Anon_IsPrimary {
  @scala.inline
  def apply(isPrimary: scala.Boolean, uuid: java.lang.String): Anon_IsPrimary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[Anon_IsPrimary]
  }
}

