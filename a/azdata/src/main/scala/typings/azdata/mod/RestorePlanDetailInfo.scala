package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestorePlanDetailInfo extends js.Object {
  var currentValue: js.Any
  var defaultValue: js.Any
  var isReadOnly: Boolean
  var isVisible: Boolean
  var name: String
}

object RestorePlanDetailInfo {
  @scala.inline
  def apply(currentValue: js.Any, defaultValue: js.Any, isReadOnly: Boolean, isVisible: Boolean, name: String): RestorePlanDetailInfo = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestorePlanDetailInfo]
  }
}

