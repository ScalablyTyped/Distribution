package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveredResource extends StObject {
  
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
  implicit class DiscoveredResourceMutableBuilder[Self <: DiscoveredResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: ConfigurationId): Self = StObject.set(x, "ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DiscoveredResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
