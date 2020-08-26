package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoveredResource extends js.Object {
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the on-premise resource.
    */
  var ConfigurationId: typings.awsSdk.migrationhubMod.ConfigurationId = js.native
  /**
    * A description that can be free-form text to record additional detail about the discovered resource for clarity or later reference.
    */
  var Description: js.UndefOr[DiscoveredResourceDescription] = js.native
}

object DiscoveredResource {
  @scala.inline
  def apply(ConfigurationId: ConfigurationId): DiscoveredResource = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveredResource]
  }
  @scala.inline
  implicit class DiscoveredResourceOps[Self <: DiscoveredResource] (val x: Self) extends AnyVal {
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
    def setConfigurationId(value: ConfigurationId): Self = this.set("ConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: DiscoveredResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

