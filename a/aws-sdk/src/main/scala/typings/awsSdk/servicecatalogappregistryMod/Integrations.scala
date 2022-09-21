package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrations extends StObject {
  
  /**
    *  The information about the resource group integration.
    */
  var resourceGroup: js.UndefOr[ResourceGroup] = js.undefined
}
object Integrations {
  
  inline def apply(): Integrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrations]
  }
  
  extension [Self <: Integrations](x: Self) {
    
    inline def setResourceGroup(value: ResourceGroup): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupUndefined: Self = StObject.set(x, "resourceGroup", js.undefined)
  }
}
