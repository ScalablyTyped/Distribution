package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCurrentDBClusterCapacityMessage extends StObject {
  
  /**
    * The DB cluster capacity. When you change the capacity of a paused Aurora Serverless DB cluster, it automatically resumes. Constraints:   For Aurora MySQL, valid capacity values are 1, 2, 4, 8, 16, 32, 64, 128, and 256.   For Aurora PostgreSQL, valid capacity values are 2, 4, 8, 16, 32, 64, 192, and 384.  
    */
  var Capacity: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The DB cluster identifier for the cluster being modified. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DB cluster.  
    */
  var DBClusterIdentifier: String
  
  /**
    * The amount of time, in seconds, that Aurora Serverless tries to find a scaling point to perform seamless scaling before enforcing the timeout action. The default is 300.   Value must be from 10 through 600.  
    */
  var SecondsBeforeTimeout: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The action to take when the timeout is reached, either ForceApplyCapacityChange or RollbackCapacityChange.  ForceApplyCapacityChange, the default, sets the capacity to the specified value as soon as possible.  RollbackCapacityChange ignores the capacity change if a scaling point isn't found in the timeout period.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}
object ModifyCurrentDBClusterCapacityMessage {
  
  inline def apply(DBClusterIdentifier: String): ModifyCurrentDBClusterCapacityMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCurrentDBClusterCapacityMessage]
  }
  
  extension [Self <: ModifyCurrentDBClusterCapacityMessage](x: Self) {
    
    inline def setCapacity(value: IntegerOptional): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSecondsBeforeTimeout(value: IntegerOptional): Self = StObject.set(x, "SecondsBeforeTimeout", value.asInstanceOf[js.Any])
    
    inline def setSecondsBeforeTimeoutUndefined: Self = StObject.set(x, "SecondsBeforeTimeout", js.undefined)
    
    inline def setTimeoutAction(value: String): Self = StObject.set(x, "TimeoutAction", value.asInstanceOf[js.Any])
    
    inline def setTimeoutActionUndefined: Self = StObject.set(x, "TimeoutAction", js.undefined)
  }
}
