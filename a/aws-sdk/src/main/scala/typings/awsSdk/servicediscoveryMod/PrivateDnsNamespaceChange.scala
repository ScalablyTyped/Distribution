package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsNamespaceChange extends StObject {
  
  /**
    * An updated description for the private DNS namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Properties to be updated in the private DNS namespace.
    */
  var Properties: js.UndefOr[PrivateDnsNamespacePropertiesChange] = js.undefined
}
object PrivateDnsNamespaceChange {
  
  inline def apply(): PrivateDnsNamespaceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateDnsNamespaceChange]
  }
  
  extension [Self <: PrivateDnsNamespaceChange](x: Self) {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProperties(value: PrivateDnsNamespacePropertiesChange): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
