package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSecurityConfigurationsOutput extends StObject {
  
  /**
    * A pagination token that indicates the next set of results to retrieve. Include the marker in the next ListSecurityConfiguration call to retrieve the next page of results, if required.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.undefined
  
  /**
    * The creation date and time, and name, of each security configuration.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
}
object ListSecurityConfigurationsOutput {
  
  @scala.inline
  def apply(): ListSecurityConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListSecurityConfigurationsOutputMutableBuilder[Self <: ListSecurityConfigurationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setSecurityConfigurations(value: SecurityConfigurationList): Self = StObject.set(x, "SecurityConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationsUndefined: Self = StObject.set(x, "SecurityConfigurations", js.undefined)
    
    @scala.inline
    def setSecurityConfigurationsVarargs(value: SecurityConfigurationSummary*): Self = StObject.set(x, "SecurityConfigurations", js.Array(value :_*))
  }
}
