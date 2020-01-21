package typings.azure.mod

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
    val __obj = js.Dynamic.literal(SettingName = SettingName.asInstanceOf[js.Any], SettingPredicate = SettingPredicate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Requirement]
  }
}

