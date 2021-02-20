package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionModelsMod {
  
  @JSImport("azure-arm-resource/lib/subscription/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/subscription/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  @js.native
  trait Location extends StObject {
    
    /**
      * The display name of the location.
      */
    val displayName: js.UndefOr[String] = js.native
    
    /**
      * The fully qualified ID of the location. For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The latitude of the location.
      */
    val latitude: js.UndefOr[String] = js.native
    
    /**
      * The longitude of the location.
      */
    val longitude: js.UndefOr[String] = js.native
    
    /**
      * The location name.
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The subscription ID.
      */
    val subscriptionId: js.UndefOr[String] = js.native
  }
  object Location {
    
    @scala.inline
    def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    }
  }
  
  type LocationListResult = js.Array[Location]
  
  @js.native
  trait Operation extends StObject {
    
    /**
      * The object that represents the operation.
      */
    var display: js.UndefOr[OperationDisplay] = js.native
    
    /**
      * Operation name: {provider}/{resource}/{operation}
      */
    var name: js.UndefOr[String] = js.native
  }
  object Operation {
    
    @scala.inline
    def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait OperationDisplay extends StObject {
    
    /**
      * Description of the operation.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Operation type: Read, write, delete, etc.
      */
    var operation: js.UndefOr[String] = js.native
    
    /**
      * Service provider: Microsoft.Resources
      */
    var provider: js.UndefOr[String] = js.native
    
    /**
      * Resource on which the operation is performed: Profile, endpoint, etc.
      */
    var resource: js.UndefOr[String] = js.native
  }
  object OperationDisplay {
    
    @scala.inline
    def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    @scala.inline
    implicit class OperationDisplayMutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult extends Array[Operation] {
    
    /**
      * URL to get the next set of operation list results if there are any.
      */
    var nextLink: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Subscription extends StObject {
    
    /**
      * The authorization source of the request. Valid values are one or more combinations of Legacy,
      * RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
      */
    var authorizationSource: js.UndefOr[String] = js.native
    
    /**
      * The subscription display name.
      */
    val displayName: js.UndefOr[String] = js.native
    
    /**
      * The fully qualified ID for the subscription. For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted.
      * Possible values include: 'Enabled', 'Warned', 'PastDue', 'Disabled', 'Deleted'
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * The subscription ID.
      */
    val subscriptionId: js.UndefOr[String] = js.native
    
    /**
      * The subscription policies.
      */
    var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationSource(value: String): Self = StObject.set(x, "authorizationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationSourceUndefined: Self = StObject.set(x, "authorizationSource", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
      
      @scala.inline
      def setSubscriptionPolicies(value: SubscriptionPolicies): Self = StObject.set(x, "subscriptionPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionPoliciesUndefined: Self = StObject.set(x, "subscriptionPolicies", js.undefined)
    }
  }
  
  @js.native
  trait SubscriptionListResult extends Array[Subscription] {
    
    /**
      * The URL to get the next set of results.
      */
    var nextLink: String = js.native
  }
  
  @js.native
  trait SubscriptionPolicies extends StObject {
    
    /**
      * The subscription location placement ID. The ID indicates which regions are visible for a
      * subscription. For example, a subscription with a location placement Id of Public_2014-09-01
      * has access to Azure public regions.
      */
    val locationPlacementId: js.UndefOr[String] = js.native
    
    /**
      * The subscription quota ID.
      */
    val quotaId: js.UndefOr[String] = js.native
    
    /**
      * The subscription spending limit. Possible values include: 'On', 'Off', 'CurrentPeriodOff'
      */
    val spendingLimit: js.UndefOr[String] = js.native
  }
  object SubscriptionPolicies {
    
    @scala.inline
    def apply(): SubscriptionPolicies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionPolicies]
    }
    
    @scala.inline
    implicit class SubscriptionPoliciesMutableBuilder[Self <: SubscriptionPolicies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationPlacementId(value: String): Self = StObject.set(x, "locationPlacementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationPlacementIdUndefined: Self = StObject.set(x, "locationPlacementId", js.undefined)
      
      @scala.inline
      def setQuotaId(value: String): Self = StObject.set(x, "quotaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaIdUndefined: Self = StObject.set(x, "quotaId", js.undefined)
      
      @scala.inline
      def setSpendingLimit(value: String): Self = StObject.set(x, "spendingLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpendingLimitUndefined: Self = StObject.set(x, "spendingLimit", js.undefined)
    }
  }
  
  @js.native
  trait TenantIdDescription extends StObject {
    
    /**
      * The fully qualified ID of the tenant. For example,
      * /tenants/00000000-0000-0000-0000-000000000000.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
      */
    val tenantId: js.UndefOr[String] = js.native
  }
  object TenantIdDescription {
    
    @scala.inline
    def apply(): TenantIdDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TenantIdDescription]
    }
    
    @scala.inline
    implicit class TenantIdDescriptionMutableBuilder[Self <: TenantIdDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait TenantListResult extends Array[TenantIdDescription] {
    
    /**
      * The URL to use for getting the next set of results.
      */
    var nextLink: String = js.native
  }
}
