package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicDependency extends js.Object {
  /**
    * The ID of the dependency.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The dependency resource name.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  /**
    * The dependency resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}

object BasicDependency {
  @scala.inline
  def apply(id: String = null, resourceName: String = null, resourceType: String = null): BasicDependency = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[BasicDependency]
  }
}

