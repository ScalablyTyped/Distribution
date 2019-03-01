package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getUacGroups()
trait UacGroup extends js.Object {
  var id: scala.Double
  var name: java.lang.String
  var showName: java.lang.String
}

object UacGroup {
  @scala.inline
  def apply(id: scala.Double, name: java.lang.String, showName: java.lang.String): UacGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("showName")(showName)
    __obj.asInstanceOf[UacGroup]
  }
}

