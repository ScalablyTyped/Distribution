package typings.azureArmResource.managementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDisplay extends js.Object {
  val operation: js.UndefOr[String] = js.undefined
  val provider: js.UndefOr[String] = js.undefined
  val resource: js.UndefOr[String] = js.undefined
}

object OperationDisplay {
  @scala.inline
  def apply(operation: String = null, provider: String = null, resource: String = null): OperationDisplay = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDisplay]
  }
}

