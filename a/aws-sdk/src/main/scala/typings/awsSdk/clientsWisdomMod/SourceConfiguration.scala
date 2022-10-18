package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConfiguration extends StObject {
  
  /**
    * Configuration information for Amazon AppIntegrations to automatically ingest content.
    */
  var appIntegrations: js.UndefOr[AppIntegrationsConfiguration] = js.undefined
}
object SourceConfiguration {
  
  inline def apply(): SourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConfiguration]
  }
  
  extension [Self <: SourceConfiguration](x: Self) {
    
    inline def setAppIntegrations(value: AppIntegrationsConfiguration): Self = StObject.set(x, "appIntegrations", value.asInstanceOf[js.Any])
    
    inline def setAppIntegrationsUndefined: Self = StObject.set(x, "appIntegrations", js.undefined)
  }
}
