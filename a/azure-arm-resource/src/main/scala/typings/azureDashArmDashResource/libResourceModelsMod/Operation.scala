package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * The object that represents the operation.
    */
  var display: js.UndefOr[OperationDisplay] = js.undefined
  /**
    * Operation name: {provider}/{resource}/{operation}
    */
  var name: js.UndefOr[String] = js.undefined
}

object Operation {
  @scala.inline
  def apply(display: OperationDisplay = null, name: String = null): Operation = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Operation]
  }
}

