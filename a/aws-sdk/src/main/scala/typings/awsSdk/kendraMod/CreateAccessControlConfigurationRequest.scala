package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessControlConfigurationRequest extends StObject {
  
  /**
    * Information on principals (users and/or groups) and which documents they should have access to. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.undefined
  
  /**
    * A token that you provide to identify the request to create an access control configuration. Multiple calls to the CreateAccessControlConfiguration API with the same client token will create only one access control configuration.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description for the access control configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The list of principal lists that define the hierarchy for which documents users should have access to.
    */
  var HierarchicalAccessControlList: js.UndefOr[HierarchicalPrincipalList] = js.undefined
  
  /**
    * The identifier of the index to create an access control configuration for your documents.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
  
  /**
    * A name for the access control configuration.
    */
  var Name: AccessControlConfigurationName
}
object CreateAccessControlConfigurationRequest {
  
  inline def apply(IndexId: IndexId, Name: AccessControlConfigurationName): CreateAccessControlConfigurationRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessControlConfigurationRequest]
  }
  
  extension [Self <: CreateAccessControlConfigurationRequest](x: Self) {
    
    inline def setAccessControlList(value: PrincipalList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setAccessControlListVarargs(value: Principal*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHierarchicalAccessControlList(value: HierarchicalPrincipalList): Self = StObject.set(x, "HierarchicalAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalAccessControlListUndefined: Self = StObject.set(x, "HierarchicalAccessControlList", js.undefined)
    
    inline def setHierarchicalAccessControlListVarargs(value: HierarchicalPrincipal*): Self = StObject.set(x, "HierarchicalAccessControlList", js.Array(value*))
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessControlConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
