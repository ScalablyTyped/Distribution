package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import typings.azureSb.mod.Azure.ServiceBus.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedBase
  extends StObject
     with Base {
  
  var AuthorizationRules: String
  
  var AutoDeleteOnIdle: String
  
  var DefaultMessageTimeToLive: String
  
  var DuplicateDetectionHistoryTimeWindow: Duration
  
  var EnableBatchedOperations: String
  
  var EnableExpress: String
  
  var EnablePartitioning: String
  
  var EntityAvailabilityStatus: String
  
  var IsAnonymousAccessible: String
  
  var MaxSizeInMegabytes: String
  
  var RequiresDuplicateDetection: String
  
  var SizeInBytes: String
  
  var Status: EntityStatus
  
  var UpdatedAt: DateString
}
object ExtendedBase {
  
  inline def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CreatedAt: DateString,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    MaxSizeInMegabytes: String,
    RequiresDuplicateDetection: String,
    SizeInBytes: String,
    Status: EntityStatus,
    UpdatedAt: DateString,
    _underscore: Author
  ): ExtendedBase = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedBase] (val x: Self) extends AnyVal {
    
    inline def setAuthorizationRules(value: String): Self = StObject.set(x, "AuthorizationRules", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteOnIdle(value: String): Self = StObject.set(x, "AutoDeleteOnIdle", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDuplicateDetectionHistoryTimeWindow(value: Duration): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setEnableBatchedOperations(value: String): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    inline def setEnableExpress(value: String): Self = StObject.set(x, "EnableExpress", value.asInstanceOf[js.Any])
    
    inline def setEnablePartitioning(value: String): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    inline def setEntityAvailabilityStatus(value: String): Self = StObject.set(x, "EntityAvailabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setIsAnonymousAccessible(value: String): Self = StObject.set(x, "IsAnonymousAccessible", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeInMegabytes(value: String): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setRequiresDuplicateDetection(value: String): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytes(value: String): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateString): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
