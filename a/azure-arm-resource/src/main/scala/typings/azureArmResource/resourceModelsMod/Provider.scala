package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  /**
    * The provider ID.
    */
  val id: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace of the resource provider.
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * The registration state of the provider.
    */
  val registrationState: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of provider resource types.
    */
  val resourceTypes: js.UndefOr[js.Array[ProviderResourceType]] = js.undefined
}
object Provider {
  
  inline def apply(): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setRegistrationState(value: String): Self = StObject.set(x, "registrationState", value.asInstanceOf[js.Any])
    
    inline def setRegistrationStateUndefined: Self = StObject.set(x, "registrationState", js.undefined)
    
    inline def setResourceTypes(value: js.Array[ProviderResourceType]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ProviderResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
  }
}
