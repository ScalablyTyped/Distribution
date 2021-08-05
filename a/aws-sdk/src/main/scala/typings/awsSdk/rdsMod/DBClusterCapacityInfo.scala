package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterCapacityInfo extends StObject {
  
  /**
    * The current capacity of the DB cluster.
    */
  var CurrentCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster. 
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies the capacity that the DB cluster scales to next.
    */
  var PendingCapacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of seconds before a call to ModifyCurrentDBClusterCapacity times out.
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}
object DBClusterCapacityInfo {
  
  inline def apply(): DBClusterCapacityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterCapacityInfo]
  }
  
  extension [Self <: DBClusterCapacityInfo](x: Self) {
    
    inline def setCurrentCapacity(value: IntegerOptional): Self = StObject.set(x, "CurrentCapacity", value.asInstanceOf[js.Any])
    
    inline def setCurrentCapacityUndefined: Self = StObject.set(x, "CurrentCapacity", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setPendingCapacity(value: IntegerOptional): Self = StObject.set(x, "PendingCapacity", value.asInstanceOf[js.Any])
    
    inline def setPendingCapacityUndefined: Self = StObject.set(x, "PendingCapacity", js.undefined)
    
    inline def setSecondsBeforeTimeout(value: IntegerOptional): Self = StObject.set(x, "SecondsBeforeTimeout", value.asInstanceOf[js.Any])
    
    inline def setSecondsBeforeTimeoutUndefined: Self = StObject.set(x, "SecondsBeforeTimeout", js.undefined)
    
    inline def setTimeoutAction(value: String): Self = StObject.set(x, "TimeoutAction", value.asInstanceOf[js.Any])
    
    inline def setTimeoutActionUndefined: Self = StObject.set(x, "TimeoutAction", js.undefined)
  }
}
