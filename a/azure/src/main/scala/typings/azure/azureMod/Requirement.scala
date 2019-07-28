package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requirement extends js.Object {
  var SettingName: String
  var SettingPredicate: js.Function
}

object Requirement {
  @scala.inline
  def apply(SettingName: String, SettingPredicate: js.Function): Requirement = {
    val __obj = js.Dynamic.literal(SettingName = SettingName, SettingPredicate = SettingPredicate)
  
    __obj.asInstanceOf[Requirement]
  }
}

