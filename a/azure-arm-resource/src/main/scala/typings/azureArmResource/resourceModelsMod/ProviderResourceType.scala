package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderResourceType extends js.Object {
  /**
    * The aliases that are supported by this resource type.
    */
  var aliases: js.UndefOr[js.Array[AliasType]] = js.native
  /**
    * The API version.
    */
  var apiVersions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The collection of locations where this resource type can be created.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The properties.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object ProviderResourceType {
  @scala.inline
  def apply(): ProviderResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderResourceType]
  }
  @scala.inline
  implicit class ProviderResourceTypeOps[Self <: ProviderResourceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasesVarargs(value: AliasType*): Self = this.set("aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[AliasType]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    @scala.inline
    def setApiVersionsVarargs(value: String*): Self = this.set("apiVersions", js.Array(value :_*))
    @scala.inline
    def setApiVersions(value: js.Array[String]): Self = this.set("apiVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersions: Self = this.set("apiVersions", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: String*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[String]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

