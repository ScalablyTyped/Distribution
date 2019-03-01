package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requirement extends js.Object {
  var SettingName: java.lang.String
  var SettingPredicate: js.Function
}

object Requirement {
  @scala.inline
  def apply(SettingName: java.lang.String, SettingPredicate: js.Function): Requirement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SettingName")(SettingName)
    __obj.updateDynamic("SettingPredicate")(SettingPredicate)
    __obj.asInstanceOf[Requirement]
  }
}

