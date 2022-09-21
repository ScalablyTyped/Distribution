package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationGroupPendingModifiedValues extends StObject {
  
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.undefined
  
  /**
    * Indicates the status of automatic failover for this Redis replication group.
    */
  var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.undefined
  
  /**
    * The log delivery configurations being modified 
    */
  var LogDeliveryConfigurations: js.UndefOr[PendingLogDeliveryConfigurationList] = js.undefined
  
  /**
    * The primary cluster ID that is applied immediately (if --apply-immediately was specified), or during the next maintenance window.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of an online resharding operation.
    */
  var Resharding: js.UndefOr[ReshardingStatus] = js.undefined
  
  /**
    * The user group being modified.
    */
  var UserGroups: js.UndefOr[UserGroupsUpdateStatus] = js.undefined
}
object ReplicationGroupPendingModifiedValues {
  
  inline def apply(): ReplicationGroupPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupPendingModifiedValues]
  }
  
  extension [Self <: ReplicationGroupPendingModifiedValues](x: Self) {
    
    inline def setAuthTokenStatus(value: AuthTokenUpdateStatus): Self = StObject.set(x, "AuthTokenStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenStatusUndefined: Self = StObject.set(x, "AuthTokenStatus", js.undefined)
    
    inline def setAutomaticFailoverStatus(value: PendingAutomaticFailoverStatus): Self = StObject.set(x, "AutomaticFailoverStatus", value.asInstanceOf[js.Any])
    
    inline def setAutomaticFailoverStatusUndefined: Self = StObject.set(x, "AutomaticFailoverStatus", js.undefined)
    
    inline def setLogDeliveryConfigurations(value: PendingLogDeliveryConfigurationList): Self = StObject.set(x, "LogDeliveryConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLogDeliveryConfigurationsUndefined: Self = StObject.set(x, "LogDeliveryConfigurations", js.undefined)
    
    inline def setLogDeliveryConfigurationsVarargs(value: PendingLogDeliveryConfiguration*): Self = StObject.set(x, "LogDeliveryConfigurations", js.Array(value*))
    
    inline def setPrimaryClusterId(value: String): Self = StObject.set(x, "PrimaryClusterId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryClusterIdUndefined: Self = StObject.set(x, "PrimaryClusterId", js.undefined)
    
    inline def setResharding(value: ReshardingStatus): Self = StObject.set(x, "Resharding", value.asInstanceOf[js.Any])
    
    inline def setReshardingUndefined: Self = StObject.set(x, "Resharding", js.undefined)
    
    inline def setUserGroups(value: UserGroupsUpdateStatus): Self = StObject.set(x, "UserGroups", value.asInstanceOf[js.Any])
    
    inline def setUserGroupsUndefined: Self = StObject.set(x, "UserGroups", js.undefined)
  }
}
