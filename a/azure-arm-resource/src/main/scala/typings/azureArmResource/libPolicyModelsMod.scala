package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPolicyModelsMod {
  
  @JSImport("azure-arm-resource/lib/policy/models", "BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/policy/models", "CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  trait ErrorResponse extends StObject {
    
    /**
      * Error code.
      */
    var errorCode: js.UndefOr[String] = js.undefined
    
    /**
      * Error message indicating why the operation failed.
      */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Http status code.
      */
    var httpStatus: js.UndefOr[String] = js.undefined
  }
  object ErrorResponse {
    
    inline def apply(): ErrorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setHttpStatus(value: String): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
      
      inline def setHttpStatusUndefined: Self = StObject.set(x, "httpStatus", js.undefined)
    }
  }
  
  trait Identity extends StObject {
    
    /**
      * The principal ID of the resource identity.
      */
    val principalId: js.UndefOr[String] = js.undefined
    
    /**
      * The tenant ID of the resource identity.
      */
    val tenantId: js.UndefOr[String] = js.undefined
    
    /**
      * The identity type. Possible values include: 'SystemAssigned', 'None'
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Identity {
    
    inline def apply(): Identity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
      
      inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PolicyAssignment
    extends typings.msRestAzure.mod.BaseResource {
    
    /**
      * This message will be part of response in case of policy violation.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The display name of the policy assignment.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * The ID of the policy assignment.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The managed identity associated with the policy assignment.
      */
    var identity: js.UndefOr[Identity] = js.native
    
    /**
      * The location of the policy assignment. Only required when utilizing managed identity.
      */
    var location: js.UndefOr[String] = js.native
    
    /**
      * The policy assignment metadata.
      */
    var metadata: js.UndefOr[Any] = js.native
    
    /**
      * The name of the policy assignment.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The policy's excluded scopes.
      */
    var notScopes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Required if a parameter is used in policy rule.
      */
    var parameters: js.UndefOr[Any] = js.native
    
    /**
      * The ID of the policy definition or policy set definition being assigned.
      */
    var policyDefinitionId: js.UndefOr[String] = js.native
    
    /**
      * The scope for the policy assignment.
      */
    var scope: js.UndefOr[String] = js.native
    
    /**
      * The policy sku. This property is optional, obsolete, and will be ignored.
      */
    var sku: js.UndefOr[PolicySku] = js.native
    
    /**
      * The type of the policy assignment.
      */
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait PolicyAssignmentListResult
    extends StObject
       with Array[PolicyAssignment] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait PolicyDefinition
    extends typings.msRestAzure.mod.BaseResource {
    
    /**
      * The policy definition description.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The display name of the policy definition.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * The ID of the policy definition.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The policy definition metadata.
      */
    var metadata: js.UndefOr[Any] = js.native
    
    /**
      * The policy definition mode. Possible values are NotSpecified, Indexed, and All. Possible
      * values include: 'NotSpecified', 'Indexed', 'All'
      */
    var mode: js.UndefOr[String] = js.native
    
    /**
      * The name of the policy definition.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Required if a parameter is used in policy rule.
      */
    var parameters: js.UndefOr[Any] = js.native
    
    /**
      * The policy rule.
      */
    var policyRule: js.UndefOr[Any] = js.native
    
    /**
      * The type of policy definition. Possible values are NotSpecified, BuiltIn, and Custom. Possible
      * values include: 'NotSpecified', 'BuiltIn', 'Custom'
      */
    var policyType: js.UndefOr[String] = js.native
    
    /**
      * The type of the resource (Microsoft.Authorization/policyDefinitions).
      */
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait PolicyDefinitionListResult
    extends StObject
       with Array[PolicyDefinition] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  trait PolicyDefinitionReference extends StObject {
    
    /**
      * Required if a parameter is used in policy rule.
      */
    var parameters: js.UndefOr[Any] = js.undefined
    
    /**
      * The ID of the policy definition or policy set definition.
      */
    var policyDefinitionId: js.UndefOr[String] = js.undefined
  }
  object PolicyDefinitionReference {
    
    inline def apply(): PolicyDefinitionReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyDefinitionReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolicyDefinitionReference] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPolicyDefinitionId(value: String): Self = StObject.set(x, "policyDefinitionId", value.asInstanceOf[js.Any])
      
      inline def setPolicyDefinitionIdUndefined: Self = StObject.set(x, "policyDefinitionId", js.undefined)
    }
  }
  
  @js.native
  trait PolicySetDefinition
    extends typings.msRestAzure.mod.BaseResource {
    
    /**
      * The policy set definition description.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The display name of the policy set definition.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * The ID of the policy set definition.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The policy set definition metadata.
      */
    var metadata: js.UndefOr[Any] = js.native
    
    /**
      * The name of the policy set definition.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The policy set definition parameters that can be used in policy definition references.
      */
    var parameters: js.UndefOr[Any] = js.native
    
    /**
      * An array of policy definition references.
      */
    var policyDefinitions: js.Array[PolicyDefinitionReference] = js.native
    
    /**
      * The type of policy definition. Possible values are NotSpecified, BuiltIn, and Custom. Possible
      * values include: 'NotSpecified', 'BuiltIn', 'Custom'
      */
    var policyType: js.UndefOr[String] = js.native
    
    /**
      * The type of the resource (Microsoft.Authorization/policySetDefinitions).
      */
    val `type`: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait PolicySetDefinitionListResult
    extends StObject
       with Array[PolicySetDefinition] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  trait PolicySku extends StObject {
    
    /**
      * The name of the policy sku. Possible values are A0 and A1.
      */
    var name: String
    
    /**
      * The policy sku tier. Possible values are Free and Standard.
      */
    var tier: js.UndefOr[String] = js.undefined
  }
  object PolicySku {
    
    inline def apply(name: String): PolicySku = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicySku]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolicySku] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    }
  }
}
