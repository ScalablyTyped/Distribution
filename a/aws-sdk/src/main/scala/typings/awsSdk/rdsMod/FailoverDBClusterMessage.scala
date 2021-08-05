package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverDBClusterMessage extends StObject {
  
  /**
    * A DB cluster identifier to force a failover for. This parameter isn't case-sensitive. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String
  
  /**
    * The name of the instance to promote to the primary instance. You must specify the instance identifier for an Aurora Replica in the DB cluster. For example, mydbcluster-replica1.
    */
  var TargetDBInstanceIdentifier: js.UndefOr[String] = js.undefined
}
object FailoverDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): FailoverDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverDBClusterMessage]
  }
  
  extension [Self <: FailoverDBClusterMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetDBInstanceIdentifier(value: String): Self = StObject.set(x, "TargetDBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetDBInstanceIdentifierUndefined: Self = StObject.set(x, "TargetDBInstanceIdentifier", js.undefined)
  }
}
