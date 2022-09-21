package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIntegrations extends StObject {
  
  /**
    * The information about the integration of Resource Groups.
    */
  var resourceGroup: js.UndefOr[ResourceGroup] = js.undefined
}
object ResourceIntegrations {
  
  inline def apply(): ResourceIntegrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIntegrations]
  }
  
  extension [Self <: ResourceIntegrations](x: Self) {
    
    inline def setResourceGroup(value: ResourceGroup): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
  }
}
