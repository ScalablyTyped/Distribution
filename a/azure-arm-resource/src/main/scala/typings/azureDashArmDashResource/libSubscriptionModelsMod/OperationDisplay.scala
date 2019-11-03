package typings.azureDashArmDashResource.libSubscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDisplay extends js.Object {
  /**
    * Description of the operation.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Operation type: Read, write, delete, etc.
    */
  var operation: js.UndefOr[String] = js.undefined
  /**
    * Service provider: Microsoft.Resources
    */
  var provider: js.UndefOr[String] = js.undefined
  /**
    * Resource on which the operation is performed: Profile, endpoint, etc.
    */
  var resource: js.UndefOr[String] = js.undefined
}

object OperationDisplay {
  @scala.inline
  def apply(
    description: String = null,
    operation: String = null,
    provider: String = null,
    resource: String = null
  ): OperationDisplay = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[OperationDisplay]
  }
}

