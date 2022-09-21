package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedResource extends StObject {
  
  /**
    * The provisioned resource identifier.
    */
  var identifier: js.UndefOr[ProvisionedResourceIdentifier] = js.undefined
  
  /**
    * The provisioned resource name.
    */
  var name: js.UndefOr[ProvisionedResourceName] = js.undefined
  
  /**
    * The resource provisioning engine. At this time, CLOUDFORMATION can be used for Amazon Web Services-managed provisioning, and TERRAFORM can be used for self-managed provisioning. For more information, see Self-managed provisioning in the Proton Administrator Guide.
    */
  var provisioningEngine: js.UndefOr[ProvisionedResourceEngine] = js.undefined
}
object ProvisionedResource {
  
  inline def apply(): ProvisionedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedResource]
  }
  
  extension [Self <: ProvisionedResource](x: Self) {
    
    inline def setIdentifier(value: ProvisionedResourceIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setName(value: ProvisionedResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvisioningEngine(value: ProvisionedResourceEngine): Self = StObject.set(x, "provisioningEngine", value.asInstanceOf[js.Any])
    
    inline def setProvisioningEngineUndefined: Self = StObject.set(x, "provisioningEngine", js.undefined)
  }
}
