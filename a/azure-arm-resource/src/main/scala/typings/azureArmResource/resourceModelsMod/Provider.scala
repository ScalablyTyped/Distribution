package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends StObject {
  
  /**
    * The provider ID.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The namespace of the resource provider.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * The registration state of the provider.
    */
  val registrationState: js.UndefOr[String] = js.native
  
  /**
    * The collection of provider resource types.
    */
  val resourceTypes: js.UndefOr[js.Array[ProviderResourceType]] = js.native
}
object Provider {
  
  @scala.inline
  def apply(): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setRegistrationState(value: String): Self = StObject.set(x, "registrationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationStateUndefined: Self = StObject.set(x, "registrationState", js.undefined)
    
    @scala.inline
    def setResourceTypes(value: js.Array[ProviderResourceType]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ProviderResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
  }
}
