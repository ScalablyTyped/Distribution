package typings.azureArmResource.resourceModelsMod

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
    if (managedBy != null) __obj.updateDynamic("managedBy")(managedBy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroupPatchable]
  }
}

