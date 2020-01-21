package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetResource extends js.Object {
  /**
    * The ID of the resource.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}

object TargetResource {
  @scala.inline
  def apply(id: String = null, resourceName: String = null, resourceType: String = null): TargetResource = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetResource]
  }
}

