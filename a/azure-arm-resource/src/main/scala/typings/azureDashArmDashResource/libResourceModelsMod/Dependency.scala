package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  /**
    * The list of dependencies.
    */
  var dependsOn: js.UndefOr[js.Array[BasicDependency]] = js.undefined
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

object Dependency {
  @scala.inline
  def apply(
    dependsOn: js.Array[BasicDependency] = null,
    id: String = null,
    resourceName: String = null,
    resourceType: String = null
  ): Dependency = {
    val __obj = js.Dynamic.literal()
    if (dependsOn != null) __obj.updateDynamic("dependsOn")(dependsOn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
}

