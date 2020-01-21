package typings.azureArmResource.managementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  var display: js.UndefOr[OperationDisplay] = js.undefined
  val name: js.UndefOr[String] = js.undefined
}

object Operation {
  @scala.inline
  def apply(display: OperationDisplay = null, name: String = null): Operation = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

