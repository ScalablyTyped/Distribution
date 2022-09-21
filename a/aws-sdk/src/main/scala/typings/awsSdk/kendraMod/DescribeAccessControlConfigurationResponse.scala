package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessControlConfigurationResponse extends StObject {
  
  /**
    * Information on principals (users and/or groups) and which documents they should have access to. This is useful for user context filtering, where search results are filtered based on the user or their group access to documents.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.undefined
  
  /**
    * The description for the access control configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.undefined
  
  /**
    * The error message containing details if there are issues processing the access control configuration.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.undefined
  
  /**
    * The list of principal lists that define the hierarchy for which documents users should have access to.
    */
  var HierarchicalAccessControlList: js.UndefOr[HierarchicalPrincipalList] = js.undefined
  
  /**
    * The name for the access control configuration.
    */
  var Name: AccessControlConfigurationName
}
object DescribeAccessControlConfigurationResponse {
  
  inline def apply(Name: AccessControlConfigurationName): DescribeAccessControlConfigurationResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessControlConfigurationResponse]
  }
  
  extension [Self <: DescribeAccessControlConfigurationResponse](x: Self) {
    
    inline def setAccessControlList(value: PrincipalList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    inline def setAccessControlListVarargs(value: Principal*): Self = StObject.set(x, "AccessControlList", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setHierarchicalAccessControlList(value: HierarchicalPrincipalList): Self = StObject.set(x, "HierarchicalAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalAccessControlListUndefined: Self = StObject.set(x, "HierarchicalAccessControlList", js.undefined)
    
    inline def setHierarchicalAccessControlListVarargs(value: HierarchicalPrincipal*): Self = StObject.set(x, "HierarchicalAccessControlList", js.Array(value*))
    
    inline def setName(value: AccessControlConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
