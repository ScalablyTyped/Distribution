package typings.azureDashArmDashResource.libResourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceGroupPatchable extends js.Object {
  /**
    * The ID of the resource that manages this resource group.
    */
  var managedBy: js.UndefOr[String] = js.undefined
  /**
    * The name of the resource group.
    */
  var name: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[ResourceGroupProperties] = js.undefined
  /**
    * The tags attached to the resource group.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
}

object ResourceGroupPatchable {
  @scala.inline
  def apply(
    managedBy: String = null,
    name: String = null,
    properties: ResourceGroupProperties = null,
    tags: StringDictionary[String] = null
  ): ResourceGroupPatchable = {
    val __obj = js.Dynamic.literal()
    if (managedBy != null) __obj.updateDynamic("managedBy")(managedBy)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ResourceGroupPatchable]
  }
}

