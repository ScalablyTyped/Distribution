package typings.azureDashArmDashResource.libResourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderResourceType extends js.Object {
  /**
    * The aliases that are supported by this resource type.
    */
  var aliases: js.UndefOr[js.Array[AliasType]] = js.undefined
  /**
    * The API version.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The collection of locations where this resource type can be created.
    */
  var locations: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The properties.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}

object ProviderResourceType {
  @scala.inline
  def apply(
    aliases: js.Array[AliasType] = null,
    apiVersions: js.Array[String] = null,
    locations: js.Array[String] = null,
    properties: StringDictionary[String] = null,
    resourceType: String = null
  ): ProviderResourceType = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (apiVersions != null) __obj.updateDynamic("apiVersions")(apiVersions)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[ProviderResourceType]
  }
}

