package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubscriptionModelsMod {
  
  @JSImport("azure-arm-resource/lib/subscription/models", "BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/subscription/models", "CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  trait Location extends StObject {
    
    /**
      * The display name of the location.
      */
    val displayName: js.UndefOr[String] = js.undefined
    
    /**
      * The fully qualified ID of the location. For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The latitude of the location.
      */
    val latitude: js.UndefOr[String] = js.undefined
    
    /**
      * The longitude of the location.
      */
    val longitude: js.UndefOr[String] = js.undefined
    
    /**
      * The location name.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription ID.
      */
    val subscriptionId: js.UndefOr[String] = js.undefined
  }
  object Location {
    
    inline def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    }
  }
  
  type LocationListResult = js.Array[Location]
  
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
    
    extension [Self <: Operation](x: Self) {
      
      inline def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OperationDisplay extends StObject {
    
    /**
      * Description of the operation.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.undefined
    
    /**
      * Service provider: Microsoft.Resources
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
    
    extension [Self <: OperationDisplay](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
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
  
  trait Subscription extends StObject {
    
    /**
      * The authorization source of the request. Valid values are one or more combinations of Legacy,
      * RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
      */
    var authorizationSource: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription display name.
      */
    val displayName: js.UndefOr[String] = js.undefined
    
    /**
      * The fully qualified ID for the subscription. For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted.
      * Possible values include: 'Enabled', 'Warned', 'PastDue', 'Disabled', 'Deleted'
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription ID.
      */
    val subscriptionId: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription policies.
      */
    var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.undefined
  }
  object Subscription {
    
    inline def apply(): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setAuthorizationSource(value: String): Self = StObject.set(x, "authorizationSource", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationSourceUndefined: Self = StObject.set(x, "authorizationSource", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
      
      inline def setSubscriptionPolicies(value: SubscriptionPolicies): Self = StObject.set(x, "subscriptionPolicies", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionPoliciesUndefined: Self = StObject.set(x, "subscriptionPolicies", js.undefined)
    }
  }
  
  @js.native
  trait SubscriptionListResult
    extends StObject
       with Array[Subscription] {
    
    /**
      * The URL to get the next set of results.
      */
    var nextLink: String = js.native
  }
  
  trait SubscriptionPolicies extends StObject {
    
    /**
      * The subscription location placement ID. The ID indicates which regions are visible for a
      * subscription. For example, a subscription with a location placement Id of Public_2014-09-01
      * has access to Azure public regions.
      */
    val locationPlacementId: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription quota ID.
      */
    val quotaId: js.UndefOr[String] = js.undefined
    
    /**
      * The subscription spending limit. Possible values include: 'On', 'Off', 'CurrentPeriodOff'
      */
    val spendingLimit: js.UndefOr[String] = js.undefined
  }
  object SubscriptionPolicies {
    
    inline def apply(): SubscriptionPolicies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionPolicies]
    }
    
    extension [Self <: SubscriptionPolicies](x: Self) {
      
      inline def setLocationPlacementId(value: String): Self = StObject.set(x, "locationPlacementId", value.asInstanceOf[js.Any])
      
      inline def setLocationPlacementIdUndefined: Self = StObject.set(x, "locationPlacementId", js.undefined)
      
      inline def setQuotaId(value: String): Self = StObject.set(x, "quotaId", value.asInstanceOf[js.Any])
      
      inline def setQuotaIdUndefined: Self = StObject.set(x, "quotaId", js.undefined)
      
      inline def setSpendingLimit(value: String): Self = StObject.set(x, "spendingLimit", value.asInstanceOf[js.Any])
      
      inline def setSpendingLimitUndefined: Self = StObject.set(x, "spendingLimit", js.undefined)
    }
  }
  
  trait TenantIdDescription extends StObject {
    
    /**
      * The fully qualified ID of the tenant. For example,
      * /tenants/00000000-0000-0000-0000-000000000000.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
      */
    val tenantId: js.UndefOr[String] = js.undefined
  }
  object TenantIdDescription {
    
    inline def apply(): TenantIdDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TenantIdDescription]
    }
    
    extension [Self <: TenantIdDescription](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait TenantListResult
    extends StObject
       with Array[TenantIdDescription] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: String = js.native
  }
}
