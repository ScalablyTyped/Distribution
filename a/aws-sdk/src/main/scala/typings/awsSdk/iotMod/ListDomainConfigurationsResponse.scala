package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainConfigurationsResponse extends StObject {
  
  /**
    * A list of objects that contain summary information about the user's domain configurations.
    */
  var domainConfigurations: js.UndefOr[DomainConfigurations] = js.native
  
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}
object ListDomainConfigurationsResponse {
  
  @scala.inline
  def apply(): ListDomainConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListDomainConfigurationsResponseMutableBuilder[Self <: ListDomainConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainConfigurations(value: DomainConfigurations): Self = StObject.set(x, "domainConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationsUndefined: Self = StObject.set(x, "domainConfigurations", js.undefined)
    
    @scala.inline
    def setDomainConfigurationsVarargs(value: DomainConfigurationSummary*): Self = StObject.set(x, "domainConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
