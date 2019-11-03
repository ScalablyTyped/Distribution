package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesMoveInfo extends js.Object {
  /**
    * The IDs of the resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The target resource group.
    */
  var targetResourceGroup: js.UndefOr[String] = js.undefined
}

object ResourcesMoveInfo {
  @scala.inline
  def apply(resources: js.Array[String] = null, targetResourceGroup: String = null): ResourcesMoveInfo = {
    val __obj = js.Dynamic.literal()
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (targetResourceGroup != null) __obj.updateDynamic("targetResourceGroup")(targetResourceGroup)
    __obj.asInstanceOf[ResourcesMoveInfo]
  }
}

