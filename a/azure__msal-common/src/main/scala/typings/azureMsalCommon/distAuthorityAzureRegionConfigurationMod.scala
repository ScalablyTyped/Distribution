package typings.azureMsalCommon

import typings.azureMsalCommon.distAuthorityAzureRegionMod.AzureRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityAzureRegionConfigurationMod {
  
  trait AzureRegionConfiguration extends StObject {
    
    var azureRegion: js.UndefOr[AzureRegion] = js.undefined
    
    var environmentRegion: js.UndefOr[String] = js.undefined
  }
  object AzureRegionConfiguration {
    
    inline def apply(): AzureRegionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AzureRegionConfiguration]
    }
    
    extension [Self <: AzureRegionConfiguration](x: Self) {
      
      inline def setAzureRegion(value: AzureRegion): Self = StObject.set(x, "azureRegion", value.asInstanceOf[js.Any])
      
      inline def setAzureRegionUndefined: Self = StObject.set(x, "azureRegion", js.undefined)
      
      inline def setEnvironmentRegion(value: String): Self = StObject.set(x, "environmentRegion", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentRegionUndefined: Self = StObject.set(x, "environmentRegion", js.undefined)
    }
  }
}
