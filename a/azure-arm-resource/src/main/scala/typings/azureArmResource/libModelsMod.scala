package typings.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsMod {
  
  @JSImport("azure-arm-resource/lib/models", "BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/models", "CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait Appliance extends GenericResource {
    
    /**
      * The fully qualified path of appliance definition Id.
      */
    var applianceDefinitionId: js.UndefOr[String] = js.native
    
    /**
      * The kind of the appliance. Allowed values are MarketPlace and ServiceCatalog.
      */
    var kind: js.UndefOr[String] = js.native
    
    /**
      * The managed resource group Id.
      */
    var managedResourceGroupId: String = js.native
    
    /**
      * Name and value pairs that define the appliance outputs.
      */
    val outputs: js.UndefOr[Any] = js.native
    
    /**
      * Name and value pairs that define the appliance parameters. It can be a JObject or a well
      * formed JSON string.
      */
    var parameters: js.UndefOr[Any] = js.native
    
    /**
      * The plan information.
      */
    var plan: js.UndefOr[Plan] = js.native
    
    /**
      * The appliance provisioning state. Possible values include: 'Accepted', 'Running', 'Ready',
      * 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'
      */
    val provisioningState: js.UndefOr[String] = js.native
    
    /**
      * The blob URI where the UI definition file is located.
      */
    var uiDefinitionUri: js.UndefOr[String] = js.native
  }
  
  trait ApplianceArtifact extends StObject {
    
    /**
      * The appliance artifact name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The the appliance artifact type. Possible values include: 'Template', 'Custom'
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * The appliance artifact blob uri.
      */
    var uri: js.UndefOr[String] = js.undefined
  }
  object ApplianceArtifact {
    
    inline def apply(): ApplianceArtifact = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplianceArtifact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplianceArtifact] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  @js.native
  trait ApplianceDefinition extends GenericResource {
    
    /**
      * The collection of appliance artifacts. The portal will use the files specified as artifacts to
      * construct the user experience of creating an appliance from an appliance definition.
      */
    var artifacts: js.UndefOr[js.Array[ApplianceArtifact]] = js.native
    
    /**
      * The appliance provider authorizations.
      */
    var authorizations: js.Array[ApplianceProviderAuthorization] = js.native
    
    /**
      * The appliance definition description.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The appliance definition display name.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * The appliance lock level. Possible values include: 'CanNotDelete', 'ReadOnly', 'None'
      */
    var lockLevel: String = js.native
    
    /**
      * The appliance definition package file Uri.
      */
    var packageFileUri: String = js.native
  }
  
  @js.native
  trait ApplianceDefinitionListResult
    extends StObject
       with Array[ApplianceDefinition] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ApplianceListResult
    extends StObject
       with Array[Appliance] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait AppliancePatchable extends GenericResource {
    
    /**
      * The fully qualified path of appliance definition Id.
      */
    var applianceDefinitionId: js.UndefOr[String] = js.native
    
    /**
      * The kind of the appliance. Allowed values are MarketPlace and ServiceCatalog.
      */
    var kind: js.UndefOr[String] = js.native
    
    /**
      * The managed resource group Id.
      */
    var managedResourceGroupId: js.UndefOr[String] = js.native
    
    /**
      * Name and value pairs that define the appliance outputs.
      */
    val outputs: js.UndefOr[Any] = js.native
    
    /**
      * Name and value pairs that define the appliance parameters. It can be a JObject or a well
      * formed JSON string.
      */
    var parameters: js.UndefOr[Any] = js.native
    
    /**
      * The plan information.
      */
    var plan: js.UndefOr[PlanPatchable] = js.native
    
    /**
      * The appliance provisioning state. Possible values include: 'Accepted', 'Running', 'Ready',
      * 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'
      */
    val provisioningState: js.UndefOr[String] = js.native
    
    /**
      * The blob URI where the UI definition file is located.
      */
    var uiDefinitionUri: js.UndefOr[String] = js.native
  }
  
  trait ApplianceProviderAuthorization extends StObject {
    
    /**
      * The provider's principal identifier. This is the identity that the provider will use to call
      * ARM to manage the appliance resources.
      */
    var principalId: String
    
    /**
      * The provider's role definition identifier. This role will define all the permissions that the
      * provider must have on the appliance's container resource group. This role definition cannot
      * have permission to delete the resource group.
      */
    var roleDefinitionId: String
  }
  object ApplianceProviderAuthorization {
    
    inline def apply(principalId: String, roleDefinitionId: String): ApplianceProviderAuthorization = {
      val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any], roleDefinitionId = roleDefinitionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplianceProviderAuthorization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplianceProviderAuthorization] (val x: Self) extends AnyVal {
      
      inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
      
      inline def setRoleDefinitionId(value: String): Self = StObject.set(x, "roleDefinitionId", value.asInstanceOf[js.Any])
    }
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
  
  @js.native
  trait GenericResource extends Resource {
    
    /**
      * The identity of the resource.
      */
    var identity: js.UndefOr[Identity] = js.native
    
    /**
      * ID of the resource that manages this resource.
      */
    var managedBy: js.UndefOr[String] = js.native
    
    /**
      * The SKU of the resource.
      */
    var sku: js.UndefOr[Sku] = js.native
  }
  
  trait Identity extends StObject {
    
    /**
      * The principal ID of resource identity.
      */
    val principalId: js.UndefOr[String] = js.undefined
    
    /**
      * The tenant ID of resource.
      */
    val tenantId: js.UndefOr[String] = js.undefined
    
    /**
      * The identity type. Possible values include: 'SystemAssigned'
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
  
  trait Operation extends StObject {
    
    /**
      * The object that represents the operation.
      */
    var display: js.UndefOr[OperationDisplay] = js.undefined
    
    /**
      * Operation name: {provider}/{resource}/{operation}
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object Operation {
    
    inline def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      inline def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OperationDisplay extends StObject {
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.undefined
    
    /**
      * Service provider: Microsoft.Solutions
      */
    var provider: js.UndefOr[String] = js.undefined
    
    /**
      * Resource on which the operation is performed: Profile, endpoint, etc.
      */
    var resource: js.UndefOr[String] = js.undefined
  }
  object OperationDisplay {
    
    inline def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
      
      inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult
    extends StObject
       with Array[Operation] {
    
    /**
      * URL to get the next set of operation list results if there are any.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  trait Plan extends StObject {
    
    /**
      * The plan name.
      */
    var name: String
    
    /**
      * The product code.
      */
    var product: String
    
    /**
      * The promotion code.
      */
    var promotionCode: js.UndefOr[String] = js.undefined
    
    /**
      * The publisher ID.
      */
    var publisher: String
    
    /**
      * The plan's version.
      */
    var version: String
  }
  object Plan {
    
    inline def apply(name: String, product: String, publisher: String, version: String): Plan = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setPromotionCode(value: String): Self = StObject.set(x, "promotionCode", value.asInstanceOf[js.Any])
      
      inline def setPromotionCodeUndefined: Self = StObject.set(x, "promotionCode", js.undefined)
      
      inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlanPatchable extends StObject {
    
    /**
      * The plan name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The product code.
      */
    var product: js.UndefOr[String] = js.undefined
    
    /**
      * The promotion code.
      */
    var promotionCode: js.UndefOr[String] = js.undefined
    
    /**
      * The publisher ID.
      */
    var publisher: js.UndefOr[String] = js.undefined
    
    /**
      * The plan's version.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object PlanPatchable {
    
    inline def apply(): PlanPatchable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlanPatchable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlanPatchable] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setPromotionCode(value: String): Self = StObject.set(x, "promotionCode", value.asInstanceOf[js.Any])
      
      inline def setPromotionCodeUndefined: Self = StObject.set(x, "promotionCode", js.undefined)
      
      inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Resource
    extends typings.msRestAzure.mod.BaseResource {
    
    /**
      * Resource ID
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Resource location
      */
    var location: js.UndefOr[String] = js.native
    
    /**
      * Resource name
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * Resource tags
      */
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Resource type
      */
    val `type`: js.UndefOr[String] = js.native
  }
  
  trait Sku extends StObject {
    
    /**
      * The SKU capacity.
      */
    var capacity: js.UndefOr[Double] = js.undefined
    
    /**
      * The SKU family.
      */
    var family: js.UndefOr[String] = js.undefined
    
    /**
      * The SKU model.
      */
    var model: js.UndefOr[String] = js.undefined
    
    /**
      * The SKU name.
      */
    var name: String
    
    /**
      * The SKU size.
      */
    var size: js.UndefOr[String] = js.undefined
    
    /**
      * The SKU tier.
      */
    var tier: js.UndefOr[String] = js.undefined
  }
  object Sku {
    
    inline def apply(name: String): Sku = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sku]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sku] (val x: Self) extends AnyVal {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
      
      inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    }
  }
}
